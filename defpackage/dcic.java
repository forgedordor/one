package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcic {
    public static dchz a(Object obj, String str) {
        dclh.n(obj, "Listener must not be null");
        dclh.n(str, "Listener type must not be null");
        dclh.l(str, "Listener type must not be empty");
        return new dchz(obj, str);
    }

    public static dcib b(Object obj, Looper looper, String str) {
        dclh.n(obj, "Listener must not be null");
        dclh.n(looper, "Looper must not be null");
        dclh.n(str, "Listener type must not be null");
        return new dcib(looper, obj, str);
    }

    public static dcib c(Object obj, Executor executor, String str) {
        dclh.n(obj, "Listener must not be null");
        dclh.n(executor, "Executor must not be null");
        dclh.n(str, "Listener type must not be null");
        return new dcib(executor, obj, str);
    }
}
