package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cymr extends fcyz implements fdap {
    final /* synthetic */ cymy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cymr(cymy cymyVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cymyVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cymk cymkVar = (cymk) this.a.b.b();
        return fdud.a(cymkVar.d, cymkVar.c, cymkVar.e, new cylr(null));
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cymr(this.a, (fcxy) obj).b(fctx.a);
    }
}
