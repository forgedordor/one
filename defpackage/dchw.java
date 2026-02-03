package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchw implements Runnable {
    final /* synthetic */ dcht a;
    final /* synthetic */ String b = "ConnectionlessLifecycleHelper";
    final /* synthetic */ dchx c;

    public dchw(dchx dchxVar, dcht dchtVar) {
        this.a = dchtVar;
        this.c = dchxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dchx dchxVar = this.c;
        if (dchxVar.a > 0) {
            dcht dchtVar = this.a;
            Bundle bundle = dchxVar.b;
            dchtVar.d(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (dchxVar.a >= 2) {
            this.a.i();
        }
        if (dchxVar.a >= 3) {
            ((dchc) this.a).k();
        }
        if (dchxVar.a >= 4) {
            this.a.j();
        }
    }
}
