package defpackage;

import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnpy extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnpz b;
    final /* synthetic */ TabLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnpy(dnpz dnpzVar, TabLayout tabLayout, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnpzVar;
        this.c = tabLayout;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnpy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnpz dnpzVar = this.b;
            dnph dnphVar = dnpzVar.aq;
            if (dnphVar == null) {
                fdbq.c("views");
                dnphVar = null;
            }
            fdpl fdplVarD = dphw.d(dnphVar.a);
            dnpx dnpxVar = new dnpx(this.c, dnpzVar);
            this.a = 1;
            if (fdplVarD.a(dnpxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnpy(this.b, this.c, fcxyVar);
    }
}
