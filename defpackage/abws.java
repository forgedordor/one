package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abws extends cmwg {
    public static final cqce a = cqce.g("BugleNetwork", "FirebaseRegistrationStartupTask");
    static final AtomicBoolean b = new AtomicBoolean();
    final Context c;
    final eosc d;

    public abws(Context context, fcsu fcsuVar, eosc eoscVar) {
        this.c = context;
        fcsuVar.getClass();
        this.d = eoscVar;
    }

    @Override // defpackage.cohg
    public eieu a() {
        throw null;
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        return eijx.f(new Runnable() { // from class: abwr
            @Override // java.lang.Runnable
            public final void run() {
                if (!abws.b.compareAndSet(false, true)) {
                    throw new AssertionError("FirebaseRegistrationStartupTask is provided more than once");
                }
                abws abwsVar = this.a;
                abws.a.p("Enabling Firebase component");
                abwsVar.d();
            }
        }, this.d);
    }

    @Override // defpackage.cmwz
    public boolean c() {
        throw null;
    }

    protected void d() {
        throw null;
    }
}
