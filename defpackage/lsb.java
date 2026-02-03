package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsb {
    public static final /* synthetic */ int a = 0;
    private static final lsa b = lsa.a;

    public static final void a(ea eaVar, String str) {
        eaVar.getClass();
        lrx lrxVar = new lrx(eaVar, str);
        d(lrxVar);
        lsa lsaVarB = b(eaVar);
        if (lsaVarB.b.contains(lrz.c) && e(lsaVarB, eaVar.getClass(), lrxVar.getClass())) {
            c(lsaVarB, lrxVar);
        }
    }

    public static final lsa b(ea eaVar) {
        while (eaVar != null) {
            if (eaVar.aF()) {
                eaVar.J();
            }
            eaVar = eaVar.E;
        }
        return b;
    }

    public static final void c(lsa lsaVar, final lsl lslVar) {
        ea eaVar = lslVar.a;
        final String name = eaVar.getClass().getName();
        Set set = lsaVar.b;
        if (set.contains(lrz.a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(String.valueOf(name)), lslVar);
        }
        if (set.contains(lrz.b)) {
            Runnable runnable = new Runnable() { // from class: lry
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lsb.a;
                    String strConcat = "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(name));
                    lsl lslVar2 = lslVar;
                    Log.e("FragmentStrictMode", strConcat, lslVar2);
                    throw lslVar2;
                }
            };
            if (!eaVar.aF()) {
                runnable.run();
                return;
            }
            Handler handler = eaVar.J().o.d;
            if (fdbq.f(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static final void d(lsl lslVar) {
        if (fr.ad(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(String.valueOf(lslVar.a.getClass().getName())), lslVar);
        }
    }

    public static final boolean e(lsa lsaVar, Class cls, Class cls2) {
        Set set = (Set) lsaVar.c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (fdbq.f(cls2.getSuperclass(), lsl.class) || !fcva.az(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
