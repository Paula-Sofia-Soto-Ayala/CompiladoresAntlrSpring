grammar inventory;

// Reglas de inicio
program : statement+ EOF;

// Reglas de declaraciones
statement
    : ADD IDENTIFIER ASSIGN NUMBER DESCRIPTION IDENTIFIER CATEGORY IDENTIFIER SEMICOLON
    | REMOVE IDENTIFIER SEMICOLON
    | UPDATE IDENTIFIER ASSIGN NUMBER SEMICOLON
    | UPDATE IDENTIFIER DESCRIPTION IDENTIFIER SEMICOLON
    | UPDATE IDENTIFIER CATEGORY IDENTIFIER SEMICOLON
    | SHOW SEMICOLON
    | SAVE IDENTIFIER SEMICOLON
    | LOAD IDENTIFIER SEMICOLON
    | SEARCH CATEGORY IDENTIFIER SEMICOLON
    | SEARCH DESCRIPTION IDENTIFIER SEMICOLON
    | SEARCH NAME IDENTIFIER SEMICOLON
    | SHOW HISTORY SEMICOLON
    | SORT BY NAME SEMICOLON
    | HELP SEMICOLON
    ;

// Tokens
ADD         : 'add';
REMOVE      : 'remove';
UPDATE      : 'update';
SHOW        : 'show';
SAVE        : 'save';
LOAD        : 'load';
SEARCH      : 'search';
HISTORY     : 'history';
SORT        : 'sort';
BY          : 'by';
NAME        : 'name';
CATEGORY    : 'category';
DESCRIPTION : 'description';
HELP        : 'help';
ASSIGN      : '=';
SEMICOLON   : ';';

// Tokens para identificadores y números
IDENTIFIER  : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER      : [0-9]+;

// Ignorar espacios en blanco
WS          : [ \t\r\n]+ -> skip;

// Errores
ERROR       : . ;
