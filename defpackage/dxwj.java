package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxwj extends fcyz implements fdat {
    int a;
    final /* synthetic */ dxwk b;
    final /* synthetic */ evjz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxwj(dxwk dxwkVar, evjz evjzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dxwkVar;
        this.c = evjzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxwj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                dxwk dxwkVar = this.b;
                dxwkVar.d.a(dxwkVar.c);
                if (!dxwkVar.e && !((Boolean) dxwkVar.f.b()).booleanValue()) {
                    dxwk.a.o().q("Application does not use push-flow so we return early.");
                    return new dxfx(fctx.a);
                }
                ((SharedPreferences) dxwkVar.g.a.b()).edit().putInt("last_used_registration_api", 2).apply();
                dxnl dxnlVar = dxwkVar.b;
                evjz evjzVar = this.c;
                dxha dxhaVarA = dxpg.a(dxwkVar.f);
                this.a = 1;
                obj = dxnlVar.c(evjzVar, dxhaVarA, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            dxft dxftVar = (dxft) obj;
            if (dxftVar.g()) {
                ((eksl) ((eksl) dxwk.a.j()).g(dxftVar.f())).q("Failed scheduling registration.");
            }
            return dxftVar;
        } catch (Exception e) {
            ((eksl) ((eksl) dxwk.a.i()).g(e)).q("Failed scheduling registration.");
            return new dxfp(e, 29);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxwj(this.b, this.c, fcxyVar);
    }
}
