package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsz extends fcyz implements fdat {
    final /* synthetic */ wta a;
    final /* synthetic */ vvv b;
    final /* synthetic */ bpbj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsz(fcxy fcxyVar, wta wtaVar, vvv vvvVar, bpbj bpbjVar) {
        super(2, fcxyVar);
        this.a = wtaVar;
        this.b = vvvVar;
        this.c = bpbjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wsz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        wta wtaVar = this.a;
        wtaVar.a.a(this.b, wtaVar.b.invoke(this.c));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wsz wszVar = new wsz(fcxyVar, this.a, this.b, this.c);
        wszVar.d = obj;
        return wszVar;
    }
}
