package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agre {
    public static final Exception a(ejde ejdeVar) {
        int iC = ejdeVar.c();
        int i = iC - 1;
        if (iC == 0) {
            throw null;
        }
        if (i == 1 || i == 2) {
            int iC2 = ejdeVar.c();
            String strA = ejdc.a(iC2);
            if (iC2 != 0) {
                return new agrm(strA, ejdeVar);
            }
            throw null;
        }
        if (i == 5) {
            return new agrf(((ejda) ejdeVar).a);
        }
        switch (i) {
            case 8:
                int iC3 = ejdeVar.c();
                String strA2 = ejdc.a(iC3);
                if (iC3 != 0) {
                    return new agra(strA2, ejdeVar);
                }
                throw null;
            case 9:
                return new agrc(ejdeVar);
            case 10:
                int iC4 = ejdeVar.c();
                String strA3 = ejdc.a(iC4);
                if (iC4 != 0) {
                    return new agrm(strA3, ejdeVar);
                }
                throw null;
            default:
                return new agrt(ejdeVar);
        }
    }
}
