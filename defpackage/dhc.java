package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhc {
    final /* synthetic */ dhk a;
    private final hox b = new hpl(null, hsi.a);
    private final dib c;

    public dhc(dhk dhkVar, dib dibVar) {
        this.a = dhkVar;
        this.c = dibVar;
    }

    public final dhb a() {
        return (dhb) this.b.a();
    }

    public final hsf b(fdap fdapVar, fdap fdapVar2) {
        dhb dhbVarA = a();
        if (dhbVarA == null) {
            dhk dhkVar = this.a;
            Object objInvoke = fdapVar2.invoke(dhkVar.e());
            dib dibVar = this.c;
            dhb dhbVar = new dhb(this, new dhg(dhkVar, objInvoke, dec.a(dibVar, fdapVar2.invoke(dhkVar.e())), dibVar), fdapVar, fdapVar2);
            this.b.b(dhbVar);
            dhkVar.u(dhbVar.a);
            dhbVarA = dhbVar;
        }
        dhk dhkVar2 = this.a;
        dhbVarA.c = fdapVar2;
        dhbVarA.b = fdapVar;
        dhbVarA.b(dhkVar2.d());
        return dhbVarA;
    }
}
