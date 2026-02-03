package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdp extends fcyz implements fdat {
    final /* synthetic */ cwhe a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdp(cwhe cwheVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cwheVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwdp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.b.b(Boolean.valueOf(this.a == cwhe.c));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwdp(this.a, this.b, fcxyVar);
    }
}
