package AnalisadorLexicoSintatico;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES =
    {
            0,
            57,
            57,
            58,
            249,
            441,
            441,
            441,
            441,
            441,
            441,
            441,
            441,
            441,
            452,
            452,
            452,
            453,
            453,
            456,
            519,
            520,
            520,
            520,
            520,
            521,
            531,
            531,
            531,
            594,
            604,
            795,
            805,
            815,
            1007,
            1007
    };

    int[][] SCANNER_TABLE =
    {
            {9, 1},
            {10, 1},
            {32, 1},
            {33, 2},
            {34, 3},
            {35, 4},
            {38, 5},
            {40, 6},
            {41, 7},
            {42, 8},
            {43, 9},
            {44, 10},
            {45, 11},
            {47, 12},
            {48, 13},
            {49, 13},
            {50, 13},
            {51, 13},
            {52, 13},
            {53, 13},
            {54, 13},
            {55, 13},
            {56, 13},
            {57, 13},
            {59, 14},
            {60, 15},
            {61, 16},
            {62, 17},
            {92, 18},
            {97, 19},
            {98, 19},
            {99, 19},
            {100, 19},
            {101, 19},
            {102, 19},
            {103, 19},
            {104, 19},
            {105, 19},
            {106, 19},
            {107, 19},
            {108, 19},
            {109, 19},
            {110, 19},
            {111, 19},
            {112, 19},
            {113, 19},
            {114, 19},
            {115, 19},
            {116, 19},
            {117, 19},
            {118, 19},
            {119, 19},
            {120, 19},
            {121, 19},
            {122, 19},
            {123, 20},
            {124, 21},
            {61, 22},
            {9, 3},
            {13, 3},
            {32, 3},
            {33, 3},
            {34, 23},
            {35, 3},
            {36, 3},
            {37, 24},
            {38, 3},
            {39, 3},
            {40, 3},
            {41, 3},
            {42, 3},
            {43, 3},
            {44, 3},
            {45, 3},
            {46, 3},
            {47, 3},
            {48, 3},
            {49, 3},
            {50, 3},
            {51, 3},
            {52, 3},
            {53, 3},
            {54, 3},
            {55, 3},
            {56, 3},
            {57, 3},
            {58, 3},
            {59, 3},
            {60, 3},
            {61, 3},
            {62, 3},
            {63, 3},
            {64, 3},
            {65, 3},
            {66, 3},
            {67, 3},
            {68, 3},
            {69, 3},
            {70, 3},
            {71, 3},
            {72, 3},
            {73, 3},
            {74, 3},
            {75, 3},
            {76, 3},
            {77, 3},
            {78, 3},
            {79, 3},
            {80, 3},
            {81, 3},
            {82, 3},
            {83, 3},
            {84, 3},
            {85, 3},
            {86, 3},
            {87, 3},
            {88, 3},
            {89, 3},
            {90, 3},
            {91, 3},
            {93, 3},
            {94, 3},
            {95, 3},
            {96, 3},
            {97, 3},
            {98, 3},
            {99, 3},
            {100, 3},
            {101, 3},
            {102, 3},
            {103, 3},
            {104, 3},
            {105, 3},
            {106, 3},
            {107, 3},
            {108, 3},
            {109, 3},
            {110, 3},
            {111, 3},
            {112, 3},
            {113, 3},
            {114, 3},
            {115, 3},
            {116, 3},
            {117, 3},
            {118, 3},
            {119, 3},
            {120, 3},
            {121, 3},
            {122, 3},
            {123, 3},
            {124, 3},
            {125, 3},
            {126, 3},
            {161, 3},
            {162, 3},
            {163, 3},
            {164, 3},
            {165, 3},
            {166, 3},
            {167, 3},
            {168, 3},
            {169, 3},
            {170, 3},
            {171, 3},
            {172, 3},
            {173, 3},
            {174, 3},
            {175, 3},
            {176, 3},
            {177, 3},
            {178, 3},
            {179, 3},
            {180, 3},
            {181, 3},
            {182, 3},
            {183, 3},
            {184, 3},
            {185, 3},
            {186, 3},
            {187, 3},
            {188, 3},
            {189, 3},
            {190, 3},
            {191, 3},
            {192, 3},
            {193, 3},
            {194, 3},
            {195, 3},
            {196, 3},
            {197, 3},
            {198, 3},
            {199, 3},
            {200, 3},
            {201, 3},
            {202, 3},
            {203, 3},
            {204, 3},
            {205, 3},
            {206, 3},
            {207, 3},
            {208, 3},
            {209, 3},
            {210, 3},
            {211, 3},
            {212, 3},
            {213, 3},
            {214, 3},
            {215, 3},
            {216, 3},
            {217, 3},
            {218, 3},
            {219, 3},
            {220, 3},
            {221, 3},
            {222, 3},
            {223, 3},
            {224, 3},
            {225, 3},
            {226, 3},
            {227, 3},
            {228, 3},
            {229, 3},
            {230, 3},
            {231, 3},
            {232, 3},
            {233, 3},
            {234, 3},
            {235, 3},
            {236, 3},
            {237, 3},
            {238, 3},
            {239, 3},
            {240, 3},
            {241, 3},
            {242, 3},
            {243, 3},
            {244, 3},
            {245, 3},
            {246, 3},
            {247, 3},
            {248, 3},
            {249, 3},
            {250, 3},
            {251, 3},
            {252, 3},
            {253, 3},
            {254, 3},
            {255, 3},
            {9, 4},
            {13, 4},
            {32, 4},
            {33, 4},
            {34, 4},
            {35, 4},
            {36, 4},
            {37, 4},
            {38, 4},
            {39, 4},
            {40, 4},
            {41, 4},
            {42, 4},
            {43, 4},
            {44, 4},
            {45, 4},
            {46, 4},
            {47, 4},
            {48, 4},
            {49, 4},
            {50, 4},
            {51, 4},
            {52, 4},
            {53, 4},
            {54, 4},
            {55, 4},
            {56, 4},
            {57, 4},
            {58, 4},
            {59, 4},
            {60, 4},
            {61, 4},
            {62, 4},
            {63, 4},
            {64, 4},
            {65, 4},
            {66, 4},
            {67, 4},
            {68, 4},
            {69, 4},
            {70, 4},
            {71, 4},
            {72, 4},
            {73, 4},
            {74, 4},
            {75, 4},
            {76, 4},
            {77, 4},
            {78, 4},
            {79, 4},
            {80, 4},
            {81, 4},
            {82, 4},
            {83, 4},
            {84, 4},
            {85, 4},
            {86, 4},
            {87, 4},
            {88, 4},
            {89, 4},
            {90, 4},
            {91, 4},
            {92, 4},
            {93, 4},
            {94, 4},
            {95, 4},
            {96, 4},
            {97, 4},
            {98, 4},
            {99, 4},
            {100, 4},
            {101, 4},
            {102, 4},
            {103, 4},
            {104, 4},
            {105, 4},
            {106, 4},
            {107, 4},
            {108, 4},
            {109, 4},
            {110, 4},
            {111, 4},
            {112, 4},
            {113, 4},
            {114, 4},
            {115, 4},
            {116, 4},
            {117, 4},
            {118, 4},
            {119, 4},
            {120, 4},
            {121, 4},
            {122, 4},
            {123, 4},
            {124, 4},
            {125, 4},
            {126, 4},
            {161, 4},
            {162, 4},
            {163, 4},
            {164, 4},
            {165, 4},
            {166, 4},
            {167, 4},
            {168, 4},
            {169, 4},
            {170, 4},
            {171, 4},
            {172, 4},
            {173, 4},
            {174, 4},
            {175, 4},
            {176, 4},
            {177, 4},
            {178, 4},
            {179, 4},
            {180, 4},
            {181, 4},
            {182, 4},
            {183, 4},
            {184, 4},
            {185, 4},
            {186, 4},
            {187, 4},
            {188, 4},
            {189, 4},
            {190, 4},
            {191, 4},
            {192, 4},
            {193, 4},
            {194, 4},
            {195, 4},
            {196, 4},
            {197, 4},
            {198, 4},
            {199, 4},
            {200, 4},
            {201, 4},
            {202, 4},
            {203, 4},
            {204, 4},
            {205, 4},
            {206, 4},
            {207, 4},
            {208, 4},
            {209, 4},
            {210, 4},
            {211, 4},
            {212, 4},
            {213, 4},
            {214, 4},
            {215, 4},
            {216, 4},
            {217, 4},
            {218, 4},
            {219, 4},
            {220, 4},
            {221, 4},
            {222, 4},
            {223, 4},
            {224, 4},
            {225, 4},
            {226, 4},
            {227, 4},
            {228, 4},
            {229, 4},
            {230, 4},
            {231, 4},
            {232, 4},
            {233, 4},
            {234, 4},
            {235, 4},
            {236, 4},
            {237, 4},
            {238, 4},
            {239, 4},
            {240, 4},
            {241, 4},
            {242, 4},
            {243, 4},
            {244, 4},
            {245, 4},
            {246, 4},
            {247, 4},
            {248, 4},
            {249, 4},
            {250, 4},
            {251, 4},
            {252, 4},
            {253, 4},
            {254, 4},
            {255, 4},
            {46, 25},
            {48, 13},
            {49, 13},
            {50, 13},
            {51, 13},
            {52, 13},
            {53, 13},
            {54, 13},
            {55, 13},
            {56, 13},
            {57, 13},
            {61, 26},
            {110, 27},
            {115, 27},
            {116, 27},
            {48, 19},
            {49, 19},
            {50, 19},
            {51, 19},
            {52, 19},
            {53, 19},
            {54, 19},
            {55, 19},
            {56, 19},
            {57, 19},
            {65, 28},
            {66, 28},
            {67, 28},
            {68, 28},
            {69, 28},
            {70, 28},
            {71, 28},
            {72, 28},
            {73, 28},
            {74, 28},
            {75, 28},
            {76, 28},
            {77, 28},
            {78, 28},
            {79, 28},
            {80, 28},
            {81, 28},
            {82, 28},
            {83, 28},
            {84, 28},
            {85, 28},
            {86, 28},
            {87, 28},
            {88, 28},
            {89, 28},
            {90, 28},
            {95, 29},
            {97, 19},
            {98, 19},
            {99, 19},
            {100, 19},
            {101, 19},
            {102, 19},
            {103, 19},
            {104, 19},
            {105, 19},
            {106, 19},
            {107, 19},
            {108, 19},
            {109, 19},
            {110, 19},
            {111, 19},
            {112, 19},
            {113, 19},
            {114, 19},
            {115, 19},
            {116, 19},
            {117, 19},
            {118, 19},
            {119, 19},
            {120, 19},
            {121, 19},
            {122, 19},
            {10, 30},
            {120, 3},
            {48, 31},
            {49, 31},
            {50, 31},
            {51, 31},
            {52, 31},
            {53, 31},
            {54, 31},
            {55, 31},
            {56, 31},
            {57, 31},
            {48, 28},
            {49, 28},
            {50, 28},
            {51, 28},
            {52, 28},
            {53, 28},
            {54, 28},
            {55, 28},
            {56, 28},
            {57, 28},
            {65, 28},
            {66, 28},
            {67, 28},
            {68, 28},
            {69, 28},
            {70, 28},
            {71, 28},
            {72, 28},
            {73, 28},
            {74, 28},
            {75, 28},
            {76, 28},
            {77, 28},
            {78, 28},
            {79, 28},
            {80, 28},
            {81, 28},
            {82, 28},
            {83, 28},
            {84, 28},
            {85, 28},
            {86, 28},
            {87, 28},
            {88, 28},
            {89, 28},
            {90, 28},
            {95, 32},
            {97, 28},
            {98, 28},
            {99, 28},
            {100, 28},
            {101, 28},
            {102, 28},
            {103, 28},
            {104, 28},
            {105, 28},
            {106, 28},
            {107, 28},
            {108, 28},
            {109, 28},
            {110, 28},
            {111, 28},
            {112, 28},
            {113, 28},
            {114, 28},
            {115, 28},
            {116, 28},
            {117, 28},
            {118, 28},
            {119, 28},
            {120, 28},
            {121, 28},
            {122, 28},
            {48, 19},
            {49, 19},
            {50, 19},
            {51, 19},
            {52, 19},
            {53, 19},
            {54, 19},
            {55, 19},
            {56, 19},
            {57, 19},
            {9, 30},
            {10, 33},
            {13, 30},
            {32, 30},
            {33, 30},
            {34, 30},
            {35, 30},
            {36, 30},
            {37, 30},
            {38, 30},
            {39, 30},
            {40, 30},
            {41, 30},
            {42, 30},
            {43, 30},
            {44, 30},
            {45, 30},
            {46, 30},
            {47, 30},
            {48, 30},
            {49, 30},
            {50, 30},
            {51, 30},
            {52, 30},
            {53, 30},
            {54, 30},
            {55, 30},
            {56, 30},
            {57, 30},
            {58, 30},
            {59, 30},
            {60, 30},
            {61, 30},
            {62, 30},
            {63, 30},
            {64, 30},
            {65, 30},
            {66, 30},
            {67, 30},
            {68, 30},
            {69, 30},
            {70, 30},
            {71, 30},
            {72, 30},
            {73, 30},
            {74, 30},
            {75, 30},
            {76, 30},
            {77, 30},
            {78, 30},
            {79, 30},
            {80, 30},
            {81, 30},
            {82, 30},
            {83, 30},
            {84, 30},
            {85, 30},
            {86, 30},
            {87, 30},
            {88, 30},
            {89, 30},
            {90, 30},
            {91, 30},
            {92, 30},
            {93, 30},
            {94, 30},
            {95, 30},
            {96, 30},
            {97, 30},
            {98, 30},
            {99, 30},
            {100, 30},
            {101, 30},
            {102, 30},
            {103, 30},
            {104, 30},
            {105, 30},
            {106, 30},
            {107, 30},
            {108, 30},
            {109, 30},
            {110, 30},
            {111, 30},
            {112, 30},
            {113, 30},
            {114, 30},
            {115, 30},
            {116, 30},
            {117, 30},
            {118, 30},
            {119, 30},
            {120, 30},
            {121, 30},
            {122, 30},
            {124, 30},
            {126, 30},
            {161, 30},
            {162, 30},
            {163, 30},
            {164, 30},
            {165, 30},
            {166, 30},
            {167, 30},
            {168, 30},
            {169, 30},
            {170, 30},
            {171, 30},
            {172, 30},
            {173, 30},
            {174, 30},
            {175, 30},
            {176, 30},
            {177, 30},
            {178, 30},
            {179, 30},
            {180, 30},
            {181, 30},
            {182, 30},
            {183, 30},
            {184, 30},
            {185, 30},
            {186, 30},
            {187, 30},
            {188, 30},
            {189, 30},
            {190, 30},
            {191, 30},
            {192, 30},
            {193, 30},
            {194, 30},
            {195, 30},
            {196, 30},
            {197, 30},
            {198, 30},
            {199, 30},
            {200, 30},
            {201, 30},
            {202, 30},
            {203, 30},
            {204, 30},
            {205, 30},
            {206, 30},
            {207, 30},
            {208, 30},
            {209, 30},
            {210, 30},
            {211, 30},
            {212, 30},
            {213, 30},
            {214, 30},
            {215, 30},
            {216, 30},
            {217, 30},
            {218, 30},
            {219, 30},
            {220, 30},
            {221, 30},
            {222, 30},
            {223, 30},
            {224, 30},
            {225, 30},
            {226, 30},
            {227, 30},
            {228, 30},
            {229, 30},
            {230, 30},
            {231, 30},
            {232, 30},
            {233, 30},
            {234, 30},
            {235, 30},
            {236, 30},
            {237, 30},
            {238, 30},
            {239, 30},
            {240, 30},
            {241, 30},
            {242, 30},
            {243, 30},
            {244, 30},
            {245, 30},
            {246, 30},
            {247, 30},
            {248, 30},
            {249, 30},
            {250, 30},
            {251, 30},
            {252, 30},
            {253, 30},
            {254, 30},
            {255, 30},
            {48, 31},
            {49, 31},
            {50, 31},
            {51, 31},
            {52, 31},
            {53, 31},
            {54, 31},
            {55, 31},
            {56, 31},
            {57, 31},
            {48, 28},
            {49, 28},
            {50, 28},
            {51, 28},
            {52, 28},
            {53, 28},
            {54, 28},
            {55, 28},
            {56, 28},
            {57, 28},
            {9, 30},
            {10, 33},
            {13, 30},
            {32, 30},
            {33, 30},
            {34, 30},
            {35, 30},
            {36, 30},
            {37, 30},
            {38, 30},
            {39, 30},
            {40, 30},
            {41, 30},
            {42, 30},
            {43, 30},
            {44, 30},
            {45, 30},
            {46, 30},
            {47, 30},
            {48, 30},
            {49, 30},
            {50, 30},
            {51, 30},
            {52, 30},
            {53, 30},
            {54, 30},
            {55, 30},
            {56, 30},
            {57, 30},
            {58, 30},
            {59, 30},
            {60, 30},
            {61, 30},
            {62, 30},
            {63, 30},
            {64, 30},
            {65, 30},
            {66, 30},
            {67, 30},
            {68, 30},
            {69, 30},
            {70, 30},
            {71, 30},
            {72, 30},
            {73, 30},
            {74, 30},
            {75, 30},
            {76, 30},
            {77, 30},
            {78, 30},
            {79, 30},
            {80, 30},
            {81, 30},
            {82, 30},
            {83, 30},
            {84, 30},
            {85, 30},
            {86, 30},
            {87, 30},
            {88, 30},
            {89, 30},
            {90, 30},
            {91, 30},
            {92, 30},
            {93, 30},
            {94, 30},
            {95, 30},
            {96, 30},
            {97, 30},
            {98, 30},
            {99, 30},
            {100, 30},
            {101, 30},
            {102, 30},
            {103, 30},
            {104, 30},
            {105, 30},
            {106, 30},
            {107, 30},
            {108, 30},
            {109, 30},
            {110, 30},
            {111, 30},
            {112, 30},
            {113, 30},
            {114, 30},
            {115, 30},
            {116, 30},
            {117, 30},
            {118, 30},
            {119, 30},
            {120, 30},
            {121, 30},
            {122, 30},
            {124, 30},
            {125, 34},
            {126, 30},
            {161, 30},
            {162, 30},
            {163, 30},
            {164, 30},
            {165, 30},
            {166, 30},
            {167, 30},
            {168, 30},
            {169, 30},
            {170, 30},
            {171, 30},
            {172, 30},
            {173, 30},
            {174, 30},
            {175, 30},
            {176, 30},
            {177, 30},
            {178, 30},
            {179, 30},
            {180, 30},
            {181, 30},
            {182, 30},
            {183, 30},
            {184, 30},
            {185, 30},
            {186, 30},
            {187, 30},
            {188, 30},
            {189, 30},
            {190, 30},
            {191, 30},
            {192, 30},
            {193, 30},
            {194, 30},
            {195, 30},
            {196, 30},
            {197, 30},
            {198, 30},
            {199, 30},
            {200, 30},
            {201, 30},
            {202, 30},
            {203, 30},
            {204, 30},
            {205, 30},
            {206, 30},
            {207, 30},
            {208, 30},
            {209, 30},
            {210, 30},
            {211, 30},
            {212, 30},
            {213, 30},
            {214, 30},
            {215, 30},
            {216, 30},
            {217, 30},
            {218, 30},
            {219, 30},
            {220, 30},
            {221, 30},
            {222, 30},
            {223, 30},
            {224, 30},
            {225, 30},
            {226, 30},
            {227, 30},
            {228, 30},
            {229, 30},
            {230, 30},
            {231, 30},
            {232, 30},
            {233, 30},
            {234, 30},
            {235, 30},
            {236, 30},
            {237, 30},
            {238, 30},
            {239, 30},
            {240, 30},
            {241, 30},
            {242, 30},
            {243, 30},
            {244, 30},
            {245, 30},
            {246, 30},
            {247, 30},
            {248, 30},
            {249, 30},
            {250, 30},
            {251, 30},
            {252, 30},
            {253, 30},
            {254, 30},
            {255, 30}
    };

    int[] TOKEN_STATE = {-2,  0, 39, -1,  0, 36, 37, 38, 30, 28, 34, 29, 31,  3, 35, 26, 24, 27, -1,  2, -2, 32, 33,  6, -1, -1, 25,  5,  2, -1, -2,  4, -1, -2,  0 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17 };

    String[] SPECIAL_CASES_KEYS =
        {  "bool", "case", "char", "do", "echo", "end", "false", "float", "int", "local", "module", "request", "string", "switch", "true", "until", "while" };

    int[] SPECIAL_CASES_VALUES =
        {  10, 14, 22, 15, 12, 8, 19, 21, 20, 9, 7, 11, 23, 13, 18, 17, 16 };

    static int SPECIAL_CASE = 2;

    static final String INVALID_RESERVED_WORD = "palavra reservada inválida";
    static final String INVALID_COMMENT_BLOCK = "comentário de bloco inválido ou não finalizado";
    static final String INVALID_FLOAT = "constante_float inválida";
    static final String INVALID_IDENTIFIER = "identificador inválido";
    static final String INVALID_STRING = "constante_string inválida";
    static final String INVALID_SYMBOL = "caractere não esperado";
    static final String INVALID_AND = "& símbolo inválido";
    static final String INVALID_OR = "| símbolo inválido";

    String[] SCANNER_ERROR = {
            INVALID_SYMBOL,
            "",
            "",
            INVALID_STRING,
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "Erro identificando constante_char",
            "",
            "Erro identificando <ignorar>",
            "",
            "",
            "",
            INVALID_STRING,
            INVALID_FLOAT,
            "",
            "",
            "",
            "Erro identificando identificador",
            "Erro identificando <ignorar>",
            "",
            "Erro identificando identificador",
            "Erro identificando <ignorar>",
            ""
    };

}
