package com.onjmini;

import java.util.*;

public class SemanticAnalyzer extends ObjMiniBaseVisitor<Void> {
	
	//Stores class metadata and Vtable structure [cite: 86, 87]
	public static class ClassInfo {
		String name;
		String parent;
		List<String> vTable = new ArrayList<>(); //Deliverable 3 [cite: 86]
		Map<String, String> fields = new HashMap<>();
	}
	
	private Map<String, Classinfo> classTable = new HashMap<>();
	
	public Map<String, ClassInfo> getClassTable() {
		return classTable; }
	
	@Override
	public Void visitClassDeclaration(ObjMiniParser.ClassDeclContext ctx) {
		String className = ctx.ID(0).getText(); // [cite: 138]
		String parentName = (ctx.ID().size() > 1) ? ctx.ID(1).getText() : null; // [cite: 138]
		
		ClassInfo info = new ClassInfo();
		info.name = className;
		info.parent = parentName;
		
		// Implement Single Inheritance [cite: 77, 85]
		if (parentName != null) {
			if (!classTable.containskey(parentName)) {
				throw new RuntimeException("Error: Parent class " + parentName + "not found!");
			}
			// Copy parent's VTable entries [cite: 86]
			info.vTable.addAll(classTable.get(parentName).vTable);
		}
		
		classTable.put(className, info);
		return visitChildren(ctx);
		
	}
	
	@Override
	public Void visitMethodDeclaration(ObjMiniParser.MethodDeclContext ctx) {
		//Navigate up to find the conrtaining class [cite: 141]
		ObjMiniParser.ClassDeclContext classCtx = (ObjMiniParser.ClassDeclContext) ctx.getParent().getParent();
		String className = classCtx.ID(0).getText();
		String methodName = classTable.get(className);
		
		String methodName = ctx.ID().getText();
		
		// Deliverable 3: Dynamic Dispatch / Overiding logic [cite: 81, 86]
		if (!info.vTable.contains(methodName)) {
			info.vTable.add(methodName); // New method
		}
		//If it already exists, it is an override and keeps its original index [cite: 81]
		
		return null;
	}
	
	public void printClassReports() {
		for (ClassInfo info : classTable.values()) {
			System.out.println("Class: " + info.name + (info.parent != null ? " extends " + info.parent : ""));
			System.out.println(" VTable Layout:" + info.vTable);
		}
	}

}
