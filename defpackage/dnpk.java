package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnpk implements eeva {
    final /* synthetic */ dnpz a;

    public dnpk(dnpz dnpzVar) {
        this.a = dnpzVar;
    }

    @Override // defpackage.eeuz
    public final void a(eeve eeveVar) {
        if (eeveVar != null) {
            this.a.aY(eeveVar.e);
        }
    }

    @Override // defpackage.eeuz
    public final void b(eeve eeveVar) {
        dnpz dnpzVar = this.a;
        int i = dnpzVar.ao;
        int i2 = eeveVar.e;
        if (i != i2) {
            dnpzVar.ao = i2;
            dnpzVar.aY(i2);
        }
    }

    @Override // defpackage.eeuz
    public final void c() {
    }
}
