package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aodt extends fcyz implements fdat {
    int a;
    final /* synthetic */ aodw b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aodt(aodw aodwVar, boolean z, boolean z2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aodwVar;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aodt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aodw aodwVar = this.b;
            aokn aoknVar = (aokn) aodwVar.e.b();
            this.a = 1;
            obj = aoknVar.b(aodwVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ((aokc) this.b.f.b()).a(this.c ? ajlj.GROUP : ajlj.ONE_ON_ONE, this.d, (aokm) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aodt(this.b, this.c, this.d, fcxyVar);
    }
}
