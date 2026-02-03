package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dozs extends fcyz implements fdap {
    int a;
    final /* synthetic */ dpao b;
    final /* synthetic */ dobg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dozs(dpao dpaoVar, dobg dobgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = dpaoVar;
        this.c = dobgVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        dpao dpaoVar = this.b;
        dobg dobgVar = this.c;
        this.a = 1;
        doas doasVar = dobgVar.c;
        if (doasVar instanceof doar) {
            objA = dpaoVar.bm().c(dobgVar.b, this);
            if (objA != fcylVar) {
                objA = (doyt) objA;
            }
        } else {
            if (!(doasVar instanceof doys)) {
                Objects.toString(doasVar);
                throw new IllegalArgumentException("Unrecognized GIF/sticker media source ".concat(doasVar.toString()));
            }
            objA = dpaoVar.bn().a(dobgVar.b, this);
            if (objA != fcylVar) {
                objA = (doyt) objA;
            }
        }
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dozs(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
