package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtq {
    public static Object a(dvtm dvtmVar, Callable callable) {
        dvia.b();
        try {
            try {
                dvtmVar.d();
                Object objCall = callable.call();
                dvtmVar.f();
                if (dvtmVar.g()) {
                    dvtmVar.e();
                }
                return objCall;
            } catch (Exception e) {
                throw new dvtn(e);
            }
        } catch (Throwable th) {
            if (dvtmVar.g()) {
                dvtmVar.e();
            }
            throw th;
        }
    }

    public static void b(dvtm dvtmVar, final Runnable runnable) {
        a(dvtmVar, new Callable() { // from class: dvto
            @Override // java.util.concurrent.Callable
            public final Object call() {
                runnable.run();
                return null;
            }
        });
    }
}
