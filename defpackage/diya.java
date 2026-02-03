package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diya extends fcyz implements fdat {
    final /* synthetic */ iqa a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diya(iqa iqaVar, fdap fdapVar, hsf hsfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = iqaVar;
        this.b = fdapVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((diya) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (diyj.d(this.c)) {
            this.a.a(0);
            this.b.invoke(false);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new diya(this.a, this.b, this.c, fcxyVar);
    }
}
