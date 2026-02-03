package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aohl implements ejxr {
    final /* synthetic */ axcm a;

    public aohl(axcm axcmVar) {
        this.a = axcmVar;
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        buao buaoVarA = buat.a();
        buaoVarA.A("SelfProfileRowFactory#getOrCreateSelfProfileRow");
        buas buasVar = new buas();
        buasVar.aq((buas) new Function[]{new aohk(this.a)}[0].apply(new buas()));
        buaoVarA.k(new buar(buasVar));
        ekgb ekgbVarZ = buaoVarA.b().z();
        ekgbVarZ.getClass();
        return new aogl((btzd) fcva.P(ekgbVarZ), false);
    }
}
