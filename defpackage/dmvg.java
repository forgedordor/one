package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmvg extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdap c;
    final /* synthetic */ dojv d;
    final /* synthetic */ dmvc e;
    final /* synthetic */ dnhn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmvg(boolean z, fdap fdapVar, dojv dojvVar, dmvc dmvcVar, dnhn dnhnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = fdapVar;
        this.d = dojvVar;
        this.e = dmvcVar;
        this.f = dnhnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmvg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (this.b) {
                this.c.invoke(this.d);
            } else {
                dmvc dmvcVar = this.e;
                dojv dojvVar = this.d;
                dnhn dnhnVar = this.f;
                this.a = 1;
                if (dmvcVar.a(dojvVar, dnhnVar, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmvg(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
