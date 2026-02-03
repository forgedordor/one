package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnxx extends fcyz implements fdap {
    final /* synthetic */ dnvg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnxx(dnvg dnvgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = dnvgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dnxx(this.a, (fcxy) obj).b(fctx.a);
    }
}
