# V Lang Lexer & Parser

Parser and symbol table generator implementation for CENG444 Term Project #1 - V Language (by Cem Bozşahin).

## Usage 

* V Grammar is implemented in `V.g4`.
* Example test programs are under `tests/`.
* Pre-built parse trees for test programs are under `parse_trees/`.
* Pre-built symbol tables for test programs are under `symbol_tables/`.

**Note**: The test files and V Lang Test Suite can also be found at https://github.com/ozansz/v-lang-tester.

One who wants to re-generate symbol tables or generate symbol tables for **custom V programs** can run the commands below,

```bash
javac *.java
java VSymTabGenerator <v-file>  # To generate symbol table
```

Also, to test correctness of the grammar, the below usage of `compile.sh` tests if the test programs can be parsed correctly,

```bash
chmod +x *.sh
./compile.sh
```

## Extras

### Multi-dimensional vectors

Example:

```
var x: int[5][2];

int func main()
    x[0][2] := 4;
endfunc
```

The test program `ext_1_matrix_transpose.v` tests functionality of this extension.

### Function call statements

Example:

```
var x: real;

real func dummy(i: int)
    x := i * 1E-3;
    return -45.3;
endfunc

int func main()
    var q: real;

    q := dummy(4);      % This was possible.

    dummy(4);           % This is also possible now.
endfunc
```

### Inline RISC-V assembly

RISC-V assembly is supported inside `_asm` and `_endasm` keywords. Local variables can also be used in LOAD and STORE instructions through the grammar `assembly_redirect: '<' ID '>';`.

Example:

```
int func bindSock(sockfd: int)
    var ret: int;

    _asm
        lw a0, <sockfd>;
        li a1, 2;           % AF_INET = 2
        li a2, 0xd60b;      % port = 3030 (0xbd6 in hex)
        li a3, 0;           % INADDR_ANY = 0
        li a7, 200;         % __NR_bind = 200

        ecall;

        sw a0, <ret>;
    _endasm;

    return ret;
endfunc
```

The test program `ext_2_socket.v` tests functionality of this extension by implementing a very basic socket server.