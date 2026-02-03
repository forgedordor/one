package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtjt {
    private static final dtjp a = new dtjp();

    public static final String a(kca kcaVar, Context context) {
        kii.a(context);
        return fcva.aF(kcaVar.a, null, null, null, new fdap() { // from class: dtjs
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                kbz kbzVar = (kbz) obj;
                kbzVar.getClass();
                return "'" + kbzVar.a + "' " + kbzVar.b;
            }
        }, 31);
    }

    public static /* synthetic */ kbj b(kbj kbjVar, kca kcaVar) {
        kbjVar.getClass();
        kcaVar.getClass();
        return Build.VERSION.SDK_INT >= 29 ? kbk.a(new dtju(a, kcc.a, new dtjr(kcaVar), new dtjq(kcc.e))) : kbjVar;
    }
}
