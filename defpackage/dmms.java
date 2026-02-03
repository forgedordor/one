package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmms extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmng b;
    final /* synthetic */ dmrl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmms(dmng dmngVar, dmrl dmrlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmngVar;
        this.c = dmrlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmms) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmng dmngVar = this.b;
            dmrt dmrtVar = dmngVar.l;
            if (dmrtVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dmrtVar.k != null) {
                dmrtVar.g.f(false);
                exls exlsVar = null;
                dmrtVar.f.f(null);
                dmrtVar.h.f(new LinkedHashSet());
                dmrtVar.d.f();
                exls exlsVar2 = dmrtVar.k;
                if (exlsVar2 == null) {
                    fdbq.c("xenoEffect");
                } else {
                    exlsVar = exlsVar2;
                }
                exlsVar.d.d.d();
            }
            fdue fdueVar = dmngVar.k;
            dmlt dmltVar = new dmlt(this.c);
            this.a = 1;
            if (fdueVar.fO(dmltVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmms(this.b, this.c, fcxyVar);
    }
}
