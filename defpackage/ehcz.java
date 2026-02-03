package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcz implements ebcg {
    public final Context a;
    public final fcsu b;
    private final eosc c;
    private final egoc d;

    public ehcz(Context context, eosc eoscVar, egoc egocVar, fcsu fcsuVar) {
        this.a = context;
        this.c = eoscVar;
        this.d = egocVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.ebcg
    public final void a() {
        this.d.f(this.c.submit(eiid.k(new Runnable() { // from class: ehcy
            @Override // java.lang.Runnable
            public final void run() {
                ehcz ehczVar = this.a;
                ecae ecaeVarD = ecaf.d();
                Context context = ehczVar.a;
                if (ecaeVarD != null) {
                    ecaeVarD.a(context);
                }
                ecaf.e((ecac) ehczVar.b.b());
                ecaf.e(new ecan(context));
            }
        })), 30L, TimeUnit.SECONDS);
    }
}
