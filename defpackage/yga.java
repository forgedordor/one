package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yga extends fcyz implements fdat {
    final /* synthetic */ yen a;
    final /* synthetic */ yis b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yga(yen yenVar, yis yisVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yenVar;
        this.b = yisVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yga) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.q.invoke(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yga(this.a, this.b, fcxyVar);
    }
}
