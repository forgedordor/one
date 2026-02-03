package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clht {
    public static final clnz a(dbek dbekVar) {
        clnx clnxVar = (clnx) clnz.a.createBuilder();
        clnxVar.getClass();
        dbej dbejVarB = dbej.b(dbekVar.b);
        if (dbejVarB == null) {
            dbejVarB = dbej.UNRECOGNIZED;
        }
        int iOrdinal = dbejVarB.ordinal();
        int i = 2;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i = 3;
            } else if (iOrdinal == 2) {
                i = 4;
            } else {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(dbejVarB))));
                }
                i = 1;
            }
        }
        cloa.b(i, clnxVar);
        return cloa.a(clnxVar);
    }
}
