package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxlb implements eora {
    final /* synthetic */ ejwy a;
    final /* synthetic */ ejwy b;

    public dxlb(ejwy ejwyVar, ejwy ejwyVar2) {
        this.a = ejwyVar;
        this.b = ejwyVar2;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        ejwy ejwyVar = this.a;
        if (ejwyVar != null) {
            ejwyVar.a(obj);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ejwy ejwyVar = this.b;
        if (ejwyVar != null) {
            ejwyVar.a(th);
        }
    }
}
