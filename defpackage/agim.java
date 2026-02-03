package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agim extends fcyz implements fdat {
    final /* synthetic */ agiu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agim(agiu agiuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agiuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agim) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        agiu agiuVar = this.a;
        if (agiuVar.i == 2) {
            ((aghz) agiuVar.f.b()).d(2);
        }
        ((ajln) agiuVar.d.b()).t(agiuVar.b, cgrc.b, cgra.e);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agim(this.a, fcxyVar);
    }
}
