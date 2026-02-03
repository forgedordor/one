package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrf implements eora {
    final /* synthetic */ exne a;
    final /* synthetic */ ecsc b;
    final /* synthetic */ ecrh c;

    public ecrf(ecrh ecrhVar, exne exneVar, ecsc ecscVar) {
        this.a = exneVar;
        this.b = ecscVar;
        this.c = ecrhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        exng exngVar;
        faes faesVar = (faes) obj;
        this.c.d();
        try {
            exngVar = (exng) evsn.parseFrom(exng.a, faesVar.toByteString(), evrr.a());
        } catch (evtj e) {
            Log.e("NetworkCallerGrpc", "Failed to convert feedback1p survey trigger response to scone.", e);
            exngVar = null;
        }
        this.c.h(this.a, exngVar, this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to fetch survey.", th);
        ecrh ecrhVar = this.c;
        ecrhVar.i(2);
        ecrhVar.d();
    }
}
