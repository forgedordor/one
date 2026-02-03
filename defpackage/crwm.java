package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crwm extends fcyz implements fdat {
    final /* synthetic */ crwr a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crwm(crwr crwrVar, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crwrVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crwm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crwm(this.a, this.b, fcxyVar);
    }
}
