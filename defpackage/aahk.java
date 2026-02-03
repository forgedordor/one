package defpackage;

import java.util.Collection;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aahk extends fdbo implements fdap {
    public aahk(Object obj) {
        super(1, obj, aahl.class, "onHeightComputed", "onHeightComputed(I)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        yil yilVar = ((aahl) this.g).e;
        if (!yilVar.c.contains("top_content_inset")) {
            HashMap map = yilVar.a;
            map.put("top_content_inset", Integer.valueOf(fddu.f(iIntValue, 0)));
            fduf fdufVar = yilVar.d;
            Collection collectionValues = map.values();
            collectionValues.getClass();
            fdufVar.f(Integer.valueOf(fcva.H(collectionValues)));
        }
        return fctx.a;
    }
}
