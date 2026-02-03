package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egqd implements eora {
    final /* synthetic */ egqg a;

    public egqd(egqg egqgVar) {
        this.a = egqgVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        egqg egqgVar = this.a;
        egqgVar.e = obj;
        egqgVar.b = true;
        egqgVar.a();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.b(th);
    }
}
