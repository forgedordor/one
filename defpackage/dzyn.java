package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyn {
    public static Context a;
    private static volatile dzyn j;
    private static volatile dzyn k;
    public final eacb c = new each();
    public final Context d;
    public final ejxr e;
    public final eafm f;
    public final ejxr g;
    public final eaec h;
    private final ejxr l;
    private final ejxr m;
    private final ejxr n;
    private static final Object i = new Object();
    public static final ejxr b = ejxx.a(new ejxr() { // from class: dzyd
        @Override // defpackage.ejxr
        public final Object get() {
            Context context = dzyn.a;
            return eosj.b(Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: dzyh
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Context context2 = dzyn.a;
                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                }
            }));
        }
    });

    /* compiled from: PG */
    public interface a {
        ejwi eF();
    }

    public dzyn(Context context, ejxr ejxrVar, ejxr ejxrVar2, final ejxr ejxrVar3, ejxr ejxrVar4, ejxr ejxrVar5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ejxrVar.getClass();
        ejxrVar2.getClass();
        ejxrVar3.getClass();
        ejxrVar4.getClass();
        ejxrVar5.getClass();
        ejxr ejxrVarA = ejxx.a(ejxrVar);
        ejxr ejxrVarA2 = ejxx.a(ejxrVar2);
        ejxr ejxrVarA3 = ejxx.a(new ejxr() { // from class: dzyi
            @Override // defpackage.ejxr
            public final Object get() {
                Context context2 = dzyn.a;
                return (eaep) ((ejwi) ejxrVar3.get()).f();
            }
        });
        ejxr ejxrVarA4 = ejxx.a(ejxrVar4);
        ejxr ejxrVarA5 = ejxx.a(ejxrVar5);
        this.d = applicationContext;
        this.l = ejxrVarA;
        this.m = ejxrVarA2;
        this.e = ejxrVarA3;
        this.n = ejxrVarA4;
        this.f = new eafm(applicationContext, ejxrVarA, ejxrVarA4, ejxrVarA2);
        this.g = ejxrVarA5;
        this.h = new eaec(applicationContext, ejxrVarA, ejxrVarA3, ejxrVarA2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dzyn a(Context context) {
        boolean z;
        dzyn dzynVar = j;
        if (dzynVar != null) {
            return dzynVar;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
        } catch (IllegalStateException unused) {
            z = false;
        }
        try {
            return (dzyn) ((ejwt) ((a) ehli.a(applicationContext, a.class)).eF()).a;
        } catch (IllegalStateException unused2) {
            z = true;
            synchronized (i) {
                if (j != null) {
                    return j;
                }
                ejwi ejwiVarEF = ejud.a;
                boolean z2 = applicationContext instanceof a;
                if (z2) {
                    ejwiVarEF = ((a) applicationContext).eF();
                }
                dzyn dzynVar2 = (dzyn) ejwiVarEF.d(new ejxr() { // from class: dzye
                    @Override // defpackage.ejxr
                    public final Object get() {
                        Context context2 = dzyn.a;
                        dzym dzymVar = new dzym();
                        dzymVar.a = applicationContext;
                        return dzymVar.a();
                    }
                });
                j = dzynVar2;
                if (!z && !z2) {
                    dzzk.b(Level.CONFIG, dzynVar2.e(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                }
                return dzynVar2;
            }
        }
    }

    public static ejxr d(final Context context) {
        return ejxx.a(new ejxr() { // from class: dzyf
            @Override // defpackage.ejxr
            public final Object get() {
                Context context2 = dzyn.a;
                dcfe dcfeVar = ddys.a;
                return new eaaf(new ddzn(context));
            }
        });
    }

    public static void f(Context context) {
        synchronized (i) {
            if (a != null) {
                return;
            }
            try {
                a = context.getApplicationContext();
            } catch (NullPointerException unused) {
                g();
                dzzk.b(Level.WARNING, (Executor) b.get(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            }
        }
    }

    public static void g() {
        dzyp.a();
        if (a == null && dzyp.a == null) {
            dzyp.a = new dzyo();
        }
    }

    public final eaaa b() {
        return (eaaa) this.m.get();
    }

    public final ecev c() {
        return (ecev) this.n.get();
    }

    public final eosd e() {
        return (eosd) this.l.get();
    }
}
