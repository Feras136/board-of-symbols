// BoS1.cpp : Definiert den Einstiegspunkt fuer die Konsolenanwendung.
//

#include "stdafx.h"

void dame();

void test1() {
    farbe( 12, RED );
}

void test2() {
    int i;
    loeschen();
    for( i=0; i<60; i++ ) {
        farbe( i, BLUE );
#if __WIN32__
        Sleep( 100 );
#endif
    }
}

void test2a() {
    int i, anzahl;
    loeschen();
    printf("Wie viele Felder? ");
#if __WIN32__
    scanf_s("%d", &anzahl );
#else
    scanf("%d", &anzahl );
#endif
    for( i=0; i<anzahl; i++ ) {
        farbe( i, BLUE );
#if __WIN32__
        Sleep( 100 );
#endif
    }
}

void test3() {
    for(;;) {
        char *a = abfragen();
        if( strlen( a ) > 0 ) {
            printf( "Nachricht: %s\n", a );
        } else {
#if __WIN32__
            Sleep( 100 );
#endif
        }
    }
}

void test4() {
    int feld;
    for(;;) {
        char *a = abfragen();
        if( strlen( a ) > 0 ) {
            printf( "Nachricht: %s\n", a );
            if( a[0] == '#' ) {
#if __WIN32__
                sscanf_s( a, "# %d", &feld );
#else
                sscanf( a, "# %d", &feld );

#endif
                farbe( feld, 0xff00 );
            }
        } else {
#if __WIN32__
            Sleep( 100 );
#endif
        }
    }
}


#if __WIN32__
int _tmain(int argc, _TCHAR* argv[])
{
    //	test2a();
    dame();
    
    return 0;
}
#else
int main(int argc, char* argv[])
{
    //test1();
    //test2();
    //test2a();
    //test3();
    //test4();
    
    dame();
    
    return 0;
}
#endif