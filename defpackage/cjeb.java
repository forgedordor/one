package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjeb extends cjcq {
    @Override // defpackage.cjcq
    public final void b(aubl aublVar, cjji cjjiVar) {
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        int iOrdinal = aubkVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cjkg cjkgVar = cjkg.RESPONSE_STATUS_OK;
                cjjiVar.copyOnWrite();
                cjjj cjjjVar = (cjjj) cjjiVar.instance;
                cjjj cjjjVar2 = cjjj.a;
                cjjjVar.c = cjkgVar.d;
                cjjjVar.b |= 1;
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    cjkg cjkgVar2 = cjkg.RESPONSE_STATUS_FAILED;
                    cjjiVar.copyOnWrite();
                    cjjj cjjjVar3 = (cjjj) cjjiVar.instance;
                    cjjj cjjjVar4 = cjjj.a;
                    cjjjVar3.c = cjkgVar2.d;
                    cjjjVar3.b |= 1;
                    return;
                }
                return;
            }
        }
        cjkg cjkgVar3 = cjkg.RESPONSE_STATUS_UNKNOWN;
        cjjiVar.copyOnWrite();
        cjjj cjjjVar5 = (cjjj) cjjiVar.instance;
        cjjj cjjjVar6 = cjjj.a;
        cjjjVar5.c = cjkgVar3.d;
        cjjjVar5.b |= 1;
    }
}
