package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjek extends cjcs {
    @Override // defpackage.cjcs
    public final void b(aubl aublVar, cjjm cjjmVar) {
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        int iOrdinal = aubkVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                cjkg cjkgVar = cjkg.RESPONSE_STATUS_OK;
                cjjmVar.copyOnWrite();
                cjjn cjjnVar = (cjjn) cjjmVar.instance;
                cjjn cjjnVar2 = cjjn.a;
                cjjnVar.c = cjkgVar.d;
                cjjnVar.b |= 1;
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    cjkg cjkgVar2 = cjkg.RESPONSE_STATUS_FAILED;
                    cjjmVar.copyOnWrite();
                    cjjn cjjnVar3 = (cjjn) cjjmVar.instance;
                    cjjn cjjnVar4 = cjjn.a;
                    cjjnVar3.c = cjkgVar2.d;
                    cjjnVar3.b |= 1;
                    return;
                }
                return;
            }
        }
        cjkg cjkgVar3 = cjkg.RESPONSE_STATUS_UNKNOWN;
        cjjmVar.copyOnWrite();
        cjjn cjjnVar5 = (cjjn) cjjmVar.instance;
        cjjn cjjnVar6 = cjjn.a;
        cjjnVar5.c = cjkgVar3.d;
        cjjnVar5.b |= 1;
    }
}
