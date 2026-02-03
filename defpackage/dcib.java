package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcib<L> {
    public volatile Object a;
    public volatile dchz b;
    private final Executor c;

    public dcib(Looper looper, Object obj, String str) {
        this.c = new dcnp(looper);
        dclh.n(obj, "Listener must not be null");
        this.a = obj;
        dclh.k(str);
        this.b = new dchz(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(final dcia dciaVar) {
        this.c.execute(new Runnable() { // from class: dchy
            @Override // java.lang.Runnable
            public final void run() {
                dcia dciaVar2 = dciaVar;
                Object obj = this.a.a;
                if (obj == null) {
                    dciaVar2.b();
                    return;
                }
                try {
                    dciaVar2.a(obj);
                } catch (RuntimeException e) {
                    dciaVar2.b();
                    throw e;
                }
            }
        });
    }

    public dcib(Executor executor, Object obj, String str) {
        dclh.n(executor, "Executor must not be null");
        this.c = executor;
        dclh.n(obj, "Listener must not be null");
        this.a = obj;
        dclh.k(str);
        this.b = new dchz(obj, str);
    }
}
