package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class addn extends fcyz implements fdat {
    final /* synthetic */ addo a;
    final /* synthetic */ ea b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addn(addo addoVar, ea eaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = addoVar;
        this.b = eaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((addn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.a(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new addn(this.a, this.b, fcxyVar);
    }
}
