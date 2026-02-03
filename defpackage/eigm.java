package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigm implements fl {
    eieh a = null;
    boolean b = false;
    final /* synthetic */ eigp c;

    public eigm(eigp eigpVar) {
        this.c = eigpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fl
    public final void c(ea eaVar, boolean z) {
        if (z && this.a == null && !eidc.v()) {
            boolean zW = eidc.w();
            this.b = zW;
            if (!zW) {
                this.a = this.c.c("FragmentTransaction Popped", "com/google/apps/tiktok/tracing/TraceCreation$1", "onBackStackChangeStarted", 154);
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && z && (eaVar instanceof eifl)) {
            ((eifl) eaVar).bi(eiik.b());
        }
    }

    @Override // defpackage.fl
    public final void d() {
        if (this.b) {
            this.b = false;
            eidc.q();
            return;
        }
        eieh eiehVar = this.a;
        if (eiehVar != null) {
            eiehVar.close();
            this.a = null;
        }
    }

    @Override // defpackage.fl
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.fl
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.fl
    public final /* synthetic */ void b(ea eaVar, boolean z) {
    }
}
