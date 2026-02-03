package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfod extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfof b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfod(cfof cfofVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfofVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfod) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                ekrw ekrwVarE = cfof.a.e();
                ekrwVarE.X(eksq.a, "BugleDittoRcs");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate$handleRequestInternal$2", "invokeSuspend", 50, "UnlinkIdentityDelegate.kt")).q("Unlink RCS from Gaia account.");
                cfof cfofVar = this.b;
                this.a = 1;
                obj = cfofVar.d(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (epfk) obj;
        } catch (fbtf e) {
            ekrw ekrwVarJ = cfof.a.j();
            ekrwVarJ.X(eksq.a, "BugleDittoRcs");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/net/handler/ditto/UnlinkIdentityDelegate$handleRequestInternal$2", "invokeSuspend", 55, "UnlinkIdentityDelegate.kt")).q("Cannot unlink RCS from Gaia account.");
            epfh epfhVar = (epfh) epfk.a.createBuilder();
            epfhVar.getClass();
            return epfl.a(epfhVar);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfod(this.b, fcxyVar);
    }
}
