package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class xfz extends fdbo implements fdae {
    public xfz(Object obj) {
        super(0, obj, xgb.class, "outputSize", "outputSize()I", 0);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        xgb xgbVar = (xgb) this.g;
        Object objP = fcva.P(xgbVar.a.d());
        wab wabVar = objP instanceof wab ? (wab) objP : null;
        Long lValueOf = wabVar != null ? Long.valueOf(wabVar.e()) : null;
        return Integer.valueOf((lValueOf == null || !fddu.s(new fddq(0, 307200), lValueOf.longValue())) ? (lValueOf == null || !fddu.s(new fddq(307200, 1048576), lValueOf.longValue())) ? (int) ((Number) xgbVar.b.b()).longValue() : BasePaymentResult.ERROR_REQUEST_FAILED : 100);
    }
}
