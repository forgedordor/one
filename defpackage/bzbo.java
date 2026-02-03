package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzbo extends fcyz implements fdat {
    int a;
    final /* synthetic */ bzbx b;
    final /* synthetic */ String c;
    final /* synthetic */ bzbz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzbo(bzbx bzbxVar, String str, bzbz bzbzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bzbxVar;
        this.c = str;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzbo) c((ainv) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objB = ((fctk) obj).a;
        } else {
            bzbx bzbxVar = this.b;
            String str = this.c;
            bzbz bzbzVar = this.d;
            this.a = 1;
            objB = bzbxVar.f.b(str, bzbzVar, this);
            if (objB == fcylVar) {
                return fcylVar;
            }
        }
        fctk fctkVar = new fctk(objB);
        bzbx bzbxVar2 = this.b;
        bzbz bzbzVar2 = this.d;
        Object obj2 = fctkVar.a;
        bzbzVar2.getClass();
        bzhe bzheVar = bzbxVar2.i;
        Object objB2 = bzheVar.b(obj2, avbk.CMS_EVENT_TYPE_DELETE_TRIGGERED, bzbzVar2, Optional.empty());
        bzheVar.g(objB2, bzhh.b);
        bzheVar.e(objB2, bzbzVar2);
        bzheVar.d(objB2, bzbzVar2);
        if (fctk.d(objB2)) {
            bzcb bzcbVar = (bzcb) objB2;
            if (bzcbVar.b) {
                ((eksl) bzhe.a.j()).D("Unnecessary deletion; %s row %s was already absent from CMS", bzheVar.e, bzcbVar.a);
            } else {
                ((eksl) bzhe.a.h()).D("Deleted %s row %s from CMS", bzheVar.e, bzcbVar.a);
            }
        }
        Throwable thC = fctk.c(objB2);
        if (thC != null) {
            ((eksl) ((eksl) bzhe.a.j()).g(thC)).t("Could not delete %s row", bzheVar.e);
        }
        return fctkVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bzbo(this.b, this.c, this.d, fcxyVar);
    }
}
