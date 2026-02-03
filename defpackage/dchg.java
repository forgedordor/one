package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchg implements dcgn {
    final /* synthetic */ dchp a;

    public dchg(dchp dchpVar) {
        this.a = dchpVar;
    }

    @Override // defpackage.dcgn
    public final void a(boolean z) {
        Handler handler = this.a.o;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
