package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecre implements eora {
    final /* synthetic */ exne a;
    final /* synthetic */ ecsc b;
    final /* synthetic */ ecrh c;

    public ecre(ecrh ecrhVar, exne exneVar, ecsc ecscVar) {
        this.a = exneVar;
        this.b = ecscVar;
        this.c = ecrhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ecrh ecrhVar = this.c;
        ecrhVar.d();
        ecrhVar.h(this.a, (exng) obj, this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        ecrh ecrhVar = this.c;
        ecrhVar.i(2);
        ecrhVar.d();
    }
}
