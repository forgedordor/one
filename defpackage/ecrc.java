package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrc implements eora {
    final /* synthetic */ exna a;
    final /* synthetic */ ecsc b;
    final /* synthetic */ ecrh c;

    public ecrc(ecrh ecrhVar, exna exnaVar, ecsc ecscVar) {
        this.a = exnaVar;
        this.b = ecscVar;
        this.c = ecrhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ecrh ecrhVar = this.c;
        ecrhVar.d();
        ecrhVar.f(this.a, this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to record event.", th);
        this.c.d();
    }
}
