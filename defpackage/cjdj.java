package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdj {
    public static cjgr a(aubq aubqVar, String str) {
        cjgo cjgoVar = (cjgo) cjgr.a.createBuilder();
        cjju cjjuVarB = cjel.b(aubqVar);
        cjgoVar.copyOnWrite();
        cjgr cjgrVar = (cjgr) cjgoVar.instance;
        cjjuVarB.getClass();
        cjgrVar.d = cjjuVarB;
        int i = 2;
        cjgrVar.b |= 2;
        cjjq cjjqVar = (cjjq) cjjr.a.createBuilder();
        cjjqVar.copyOnWrite();
        cjjr cjjrVar = (cjjr) cjjqVar.instance;
        str.getClass();
        cjjrVar.b |= 1;
        cjjrVar.c = str;
        cjgoVar.copyOnWrite();
        cjgr cjgrVar2 = (cjgr) cjgoVar.instance;
        cjjr cjjrVar2 = (cjjr) cjjqVar.build();
        cjjrVar2.getClass();
        cjgrVar2.e = cjjrVar2;
        cjgrVar2.b |= 4;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        int iOrdinal = aubpVarB.ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i = 3;
            } else if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    throw new UnsupportedOperationException("ConversationType cannot be converted from an EMERGENCY ChatEndpoint type.");
                }
                i = 1;
            } else {
                i = 4;
            }
        }
        cjgoVar.copyOnWrite();
        cjgr cjgrVar3 = (cjgr) cjgoVar.instance;
        cjgrVar3.c = i - 1;
        cjgrVar3.b |= 1;
        return (cjgr) cjgoVar.build();
    }
}
