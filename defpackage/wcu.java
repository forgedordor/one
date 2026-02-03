package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcu {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter");
    public final fcsu b;
    public final dnhl c;
    public final fdap d = new fdap() { // from class: wcs
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            ((Context) obj).getClass();
            return Integer.valueOf((int) (dpgx.c(r5).y * 0.75d));
        }
    };

    public wcu(fcsu fcsuVar, dnhl dnhlVar) {
        this.b = fcsuVar;
        this.c = dnhlVar;
    }

    public static final djdk a(dpzi dpziVar) {
        if (dpziVar instanceof dpzd) {
            return djdj.a;
        }
        if (dpziVar instanceof dpzb) {
            return djdi.e;
        }
        if (dpziVar instanceof dpzf) {
            return b(((dpzf) dpziVar).a.a);
        }
        if (dpziVar instanceof dpzh) {
            return b(((dpzh) dpziVar).b);
        }
        throw new fctg();
    }

    private static final djdi b(dpxe dpxeVar) {
        int iOrdinal = dpxeVar.ordinal();
        if (iOrdinal == 0) {
            return djdi.c;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 4) {
                return djdi.e;
            }
            if (iOrdinal != 5) {
                if (iOrdinal == 6) {
                    return djdi.f;
                }
                if (iOrdinal != 8) {
                    return null;
                }
            }
        }
        return djdi.d;
    }
}
