package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhh implements rhn, rji, rhp {
    public static final boolean a = Log.isLoggable("Engine", 2);
    public final rhu b;
    public final rjj c;
    public final rhe d;
    public final ric e;
    public final rhf f;
    public final rhc g;
    public final rgh h;

    public rhh(rjj rjjVar, rjd rjdVar, rju rjuVar, rju rjuVar2, rju rjuVar3, rju rjuVar4) throws Throwable {
        this.c = rjjVar;
        rhf rhfVar = new rhf(rjdVar);
        this.f = rhfVar;
        rgh rghVar = new rgh();
        this.h = rghVar;
        synchronized (this) {
            try {
                try {
                    synchronized (rghVar) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new rhu();
                    this.d = new rhe(rjuVar, rjuVar2, rjuVar4, this, this);
                    this.g = new rhc(rhfVar);
                    this.e = new ric();
                    ((rjh) rjjVar).a = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void a(String str, long j, res resVar) {
        Log.v("Engine", str + " in " + rvd.a(j) + "ms, key: " + resVar.toString());
    }

    @Override // defpackage.rhn
    public final synchronized void b(rhm rhmVar, res resVar) {
        this.b.a(resVar, rhmVar);
    }

    @Override // defpackage.rhn
    public final synchronized void c(rhm rhmVar, res resVar, rhq rhqVar) {
        if (rhqVar != null) {
            if (rhqVar.a) {
                this.h.b(resVar, rhqVar);
            }
            this.b.a(resVar, rhmVar);
        } else {
            this.b.a(resVar, rhmVar);
        }
    }
}
