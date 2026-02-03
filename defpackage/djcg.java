package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djcg extends fcyz implements fdat {
    int a;
    final /* synthetic */ djcq b;
    final /* synthetic */ dpn c;
    final /* synthetic */ hri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djcg(djcq djcqVar, dpn dpnVar, hri hriVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = djcqVar;
        this.c = dpnVar;
        this.d = hriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            if (this.d.c() < this.b.a.size()) {
                dpn dpnVar = this.c;
                this.a = 1;
                if (dpnVar.d(Alert.DURATION_SHOW_INDEFINITELY, new dgi(null, 7), this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        this.d.i(this.b.a.size());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new djcg(this.b, this.c, this.d, fcxyVar);
    }
}
