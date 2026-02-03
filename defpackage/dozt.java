package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozt extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dpao c;
    final /* synthetic */ doyu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozt(dpao dpaoVar, doyu doyuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dpaoVar;
        this.d = doyuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dozt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        dpav dpavVar = null;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dpao dpaoVar = this.c;
            if (dpao.bo(dpaoVar).d) {
                dpaoVar.bc();
            }
            dpav dpavVar2 = dpaoVar.e;
            if (dpavVar2 == null) {
                fdbq.c("stickerPackAdapter");
                dpavVar2 = null;
            }
            doyo doyoVarBn = dpaoVar.bn();
            doyu doyuVar = this.d;
            this.a = dpavVar2;
            this.b = 1;
            obj = doyoVarBn.b(doyuVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = dpavVar2;
        }
        doyu doyuVar2 = (doyu) obj;
        doyuVar2.getClass();
        ((dpav) obj2).f = doyuVar2;
        dpao dpaoVar2 = this.c;
        GridLayoutManager gridLayoutManager = dpaoVar2.d;
        if (gridLayoutManager == null) {
            fdbq.c("stickerPackLayoutManager");
            gridLayoutManager = null;
        }
        dpav dpavVar3 = dpaoVar2.e;
        if (dpavVar3 == null) {
            fdbq.c("stickerPackAdapter");
        } else {
            dpavVar = dpavVar3;
        }
        dpaoVar2.bi(gridLayoutManager, dpavVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dozt(this.c, this.d, fcxyVar);
    }
}
