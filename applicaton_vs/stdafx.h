// stdafx.h : Includedatei fuer Standardsystem-Includedateien
// oder haeufig verwendete projektspezifische Includedateien,
// die nur in unregelmässigen Abstaenden geaendert werden.
//

#pragma once



#include <stdio.h>

#if  WIN32
#define __WIN32__ 1 
#else
// re-defines for non MS
#define scanf_s scanf
#define sscanf_s sscanf
#define sprintf_s sprintf
#define strcat_s strcat
#endif

#if __WIN32__
#include "targetver.h"
#include <tchar.h>
#include <ws2tcpip.h> // WinSocket
#elif __APPLE__
#include <unistd.h> // for sleep() Function
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#else
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#endif


// TODO: Hier auf zus‰tzliche Header, die das Programm erfordert, verweisen.
#include <string.h> // for String functions
#include <stdlib.h>

#include "jclient.h"
#include "colors.h"
