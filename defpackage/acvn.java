package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acvn extends fcyz implements fdat {
    final /* synthetic */ acvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acvn(acvp acvpVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = acvpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acvn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        acve acveVar = (acve) fdct.b(this.a.a);
        if (acveVar == null) {
            return null;
        }
        acveVar.b(2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new acvn(this.a, fcxyVar);
    }
}
