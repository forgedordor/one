package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezw extends eezo {
    final /* synthetic */ eezx a;

    public eezw(eezx eezxVar) {
        this.a = eezxVar;
    }

    @Override // defpackage.eezo
    public final void a() {
        eezy eezyVar = this.a.a;
        eezyVar.b.d("unlinkToDeath", new Object[0]);
        eezyVar.n.asBinder().unlinkToDeath(eezyVar.k, 0);
        eezyVar.n = null;
        eezyVar.g = false;
    }
}
