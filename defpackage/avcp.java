package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avcp extends fcyz implements fdat {
    int a;
    final /* synthetic */ avcq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avcp(avcq avcqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avcqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avcp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            avco avcoVar = (avco) this.b.b.b();
            this.a = 1;
            if (avcoVar.a(true, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avcp(this.b, fcxyVar);
    }
}
