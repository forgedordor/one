package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrd implements eora {
    final /* synthetic */ exna a;
    final /* synthetic */ ecsc b;
    final /* synthetic */ ecrh c;

    public ecrd(ecrh ecrhVar, exna exnaVar, ecsc ecscVar) {
        this.a = exnaVar;
        this.b = ecscVar;
        this.c = ecrhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        faeo faeoVar = (faeo) obj;
        this.c.d();
        try {
        } catch (evtj e) {
            Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey record event response to scone.", e);
        }
        this.c.f(this.a, this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to record event.", th);
        this.c.d();
    }
}
