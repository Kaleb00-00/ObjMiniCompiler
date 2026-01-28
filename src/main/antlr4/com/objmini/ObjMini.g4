grammar ObjMini;

@header {
    package com.objmini;
}

// Entry point
program: classDeclaration+ EOF;

classDeclaration
    : 'class' ID ('extends' ID)? '{' member* '}'
    ;

member
    : fieldDeclaration
    | methodDeclaration
    ;

fieldDeclaration
    : ('public' | 'private') type ID ';'
    ;

methodDeclaration
    : ('public' | 'private') type ID '(' paramList? ')' '{' statement* '}'
    ;

type: 'int' | 'boolean' | ID ;

paramList: type ID (',' type ID)* ;

statement
    : ID '=' expression ';'                           
    | 'return' expression ';'                         
    | expression ';'                                  
    ;

expression
    : 'new' ID '(' ')'                       
    | expression '.' ID '(' ')'              
    | 'this'                                          
    | ID                                              
    | INT                                             
    ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;
INT: [0-9]+ ;
WS: [ \t\r\n]+ -> skip ;