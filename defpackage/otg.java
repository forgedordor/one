package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class otg extends fcyz implements fdat {
    int a;
    final /* synthetic */ ots b;
    final /* synthetic */ owr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otg(ots otsVar, owr owrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = otsVar;
        this.c = owrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((otg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpf fdpfVar = new fdpf(this.b.g);
            otf otfVar = new otf(this.c);
            this.a = 1;
            if (fdpfVar.a(otfVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new otg(this.b, this.c, fcxyVar);
    }
}
