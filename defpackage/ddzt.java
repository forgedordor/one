package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.phenotype.Configurations;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ddzt {
    protected final ddzn a;
    protected final String b;
    protected final AtomicBoolean c = new AtomicBoolean(false);

    public ddzt(ddzn ddznVar, String str) {
        this.a = ddznVar;
        this.b = str;
    }

    private final boolean h(String str, int i) {
        return e(str, i - 1);
    }

    @Deprecated
    protected void a(Configurations configurations) {
        throw new IllegalStateException("Requires implementation");
    }

    protected void b(Configurations configurations) {
        a(configurations);
    }

    public final void c(Executor executor, ddzs ddzsVar) {
        d(executor, ddzsVar, 3, 0L);
    }

    public final void d(final Executor executor, final ddzs ddzsVar, final int i, final long j) {
        this.a.o(this.b, "").o(executor, new defb() { // from class: ddzp
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                final ddzt ddztVar = this.a;
                final ddzs ddzsVar2 = ddzsVar;
                final int i2 = i;
                final Executor executor2 = executor;
                final long j2 = j;
                if (defnVar.m()) {
                    ddztVar.b((Configurations) defnVar.i());
                    String str = ((Configurations) defnVar.i()).a;
                    if (str == null || str.isEmpty()) {
                        ddzsVar2.a(true);
                        return;
                    } else {
                        ddztVar.a.b(str).o(executor2, new defb() { // from class: ddzq
                            @Override // defpackage.defb
                            public final void a(defn defnVar2) {
                                int i3;
                                boolean zM = defnVar2.m();
                                if (!zM) {
                                    defnVar2.h();
                                }
                                ddzs ddzsVar3 = ddzsVar2;
                                if (zM || (i3 = i2) <= 1) {
                                    ddzsVar3.a(zM);
                                    return;
                                }
                                long j3 = j2;
                                Executor executor3 = executor2;
                                ddzt ddztVar2 = ddztVar;
                                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + ddztVar2.b + " failed, retrying");
                                ddztVar2.g(executor3, ddzsVar3, i3, j3);
                            }
                        });
                        return;
                    }
                }
                boolean z = ddztVar.c.get() && i2 > 1;
                defnVar.h();
                if (z) {
                    Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + ddztVar.b + " failed, retrying");
                    ddztVar.g(executor2, ddzsVar2, i2, j2);
                    return;
                }
                Log.e("PhenotypeFlagCommitter", "Retrieving snapshot for " + ddztVar.b + " failed");
                ddzsVar2.a(false);
            }
        });
    }

    public final boolean e(String str, int i) {
        if (i <= 0) {
            Log.w("PhenotypeFlagCommitter", "No more attempts remaining, giving up for ".concat(String.valueOf(this.b)));
            return false;
        }
        boolean z = this.c.get() && i > 1;
        String str2 = this.b;
        Configurations configurationsF = f(str2, str);
        if (configurationsF == null) {
            if (z) {
                return h(str, i);
            }
            return false;
        }
        b(configurationsF);
        String str3 = configurationsF.a;
        if (str3 != null && !str3.isEmpty()) {
            try {
                degc.g(this.a.b(str3), 2000L, TimeUnit.MILLISECONDS);
                Uri uriA = dzyc.a(str2);
                Map map = dzxr.a;
                synchronized (dzxr.class) {
                    dzxr dzxrVar = (dzxr) dzxr.a.get(uriA);
                    if (dzxrVar != null) {
                        dzxrVar.c();
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.w("PhenotypeFlagCommitter", "Committing snapshot for " + this.b + " failed, retrying", e);
                return h(str, i);
            }
        }
        return true;
    }

    protected final Configurations f(String str, String str2) {
        try {
            return (Configurations) degc.g(this.a.o(str, str2), 2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.e("PhenotypeFlagCommitter", a.a(str, "Retrieving snapshot for ", " failed"), e);
            return null;
        }
    }

    public final void g(final Executor executor, final ddzs ddzsVar, final int i, final long j) {
        if (j > 0) {
            new ddmy(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ddzr
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(executor, ddzsVar, i - 1, j);
                }
            }, 0L);
        } else {
            d(executor, ddzsVar, i - 1, 0L);
        }
    }
}
