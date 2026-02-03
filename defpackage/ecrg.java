package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrg implements eora {
    final /* synthetic */ ecrh a;
    final /* synthetic */ ecqe b;

    public ecrg(ecrh ecrhVar, ecqe ecqeVar) {
        this.b = ecqeVar;
        this.a = ecrhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ecqc ecqcVar = ecqc.a;
        faeu faeuVar = ((faek) obj).b;
        if (faeuVar == null) {
            faeuVar = faeu.a;
        }
        ecqcVar.b = faeuVar.b;
        ecrh ecrhVar = this.a;
        ecrhVar.d();
        ecrhVar.k(this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("NetworkCallerGrpc", "Failed to get survey startup config.", th);
        ecqc.a.b = false;
        ecrh ecrhVar = this.a;
        ecrhVar.d();
        ecrhVar.k(this.b);
    }
}
