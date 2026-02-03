package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auxc extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ fdci e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxc(fdap fdapVar, Object obj, long j, fdci fdciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdapVar;
        this.c = obj;
        this.d = j;
        this.e = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auxc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            this.b.invoke(this.c);
            long j = this.d;
            this.a = 1;
            if (fdkj.c(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.e.a = null;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auxc(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
