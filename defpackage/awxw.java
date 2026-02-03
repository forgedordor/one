package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awxw extends fcyz implements fdat {
    int a;
    final /* synthetic */ awyb b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awxw(awyb awybVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awybVar;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awxw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.a = 1;
            if (fctx.a == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awxw(this.b, this.c, fcxyVar);
    }
}
