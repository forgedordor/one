package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctml implements fdpm {
    final /* synthetic */ ctmn a;
    final /* synthetic */ List b;

    public ctml(ctmn ctmnVar, List list) {
        this.a = ctmnVar;
        this.b = list;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        if (!((Boolean) obj).booleanValue()) {
            return fctx.a;
        }
        ctmn ctmnVar = this.a;
        ekgb ekgbVarA = ekfv.a(this.b);
        Object objB = ctmnVar.e.b();
        objB.getClass();
        Object objA = anov.a(ctmnVar.d.a(ekgbVarA, evxd.c((evrj) objB))).a(new ctmk(ctmnVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
