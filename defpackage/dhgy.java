package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgy {
    public static final ExecutorService a = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: dhgu
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ExecutorService executorService = dhgy.a;
            return new Thread(runnable, "PrivateDataStorageThread");
        }
    });
    public File b;
    public File c;
    public Map d;
    public volatile boolean f;
    public int e = 0;
    public final Object g = new Object();

    public dhgy(Context context, String str) {
        synchronized (this) {
            this.f = false;
        }
        new dhgv(this, context, str).start();
    }

    public static void e(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final long a(String str, long j) {
        synchronized (this) {
            d();
            Long l = (Long) this.d.get(str);
            if (l != null) {
                j = l.longValue();
            }
        }
        return j;
    }

    public final dhgw b() {
        synchronized (this) {
            d();
        }
        return new dhgw(this);
    }

    public final String c(String str, String str2) {
        synchronized (this) {
            d();
            String str3 = (String) this.d.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    public final void d() throws InterruptedException {
        while (!this.f) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final synchronized void f(String str) {
        dhgw dhgwVarB = b();
        synchronized (dhgwVarB) {
            dhgwVarB.a.put(str, dhgwVarB);
        }
        dhgwVarB.a();
    }

    public final synchronized void g(String str, boolean z) {
        dhgw dhgwVarB = b();
        synchronized (dhgwVarB) {
            dhgwVarB.a.put(str, Boolean.valueOf(z));
        }
        dhgwVarB.a();
    }

    public final synchronized void h(String str, long j) {
        dhgw dhgwVarB = b();
        synchronized (dhgwVarB) {
            dhgwVarB.a.put(str, Long.valueOf(j));
        }
        dhgwVarB.a();
    }

    public final synchronized void i(String str, Serializable serializable) {
        dhgw dhgwVarB = b();
        synchronized (dhgwVarB) {
            dhgwVarB.a.put(str, serializable);
        }
        dhgwVarB.a();
    }

    public final synchronized void j(String str, String str2) {
        dhgw dhgwVarB = b();
        synchronized (dhgwVarB) {
            dhgwVarB.a.put(str, str2);
        }
        dhgwVarB.a();
    }

    public final boolean k(String str) {
        boolean zContainsKey;
        synchronized (this) {
            d();
            zContainsKey = this.d.containsKey(str);
        }
        return zContainsKey;
    }

    public final boolean l(String str) {
        boolean zBooleanValue;
        synchronized (this) {
            d();
            Boolean bool = (Boolean) this.d.get(str);
            zBooleanValue = bool != null ? bool.booleanValue() : false;
        }
        return zBooleanValue;
    }
}
