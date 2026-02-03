package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zwp extends fdbo implements fdav {
    public zwp(Object obj) {
        super(4, obj, zww.class, "onLayoutRectUpdated", "onLayoutRectUpdated(IIII)V", 0);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        xvd xvdVar = ((zww) this.g).v;
        xve xveVar = xve.a;
        xveVar.getClass();
        xvc xvcVar = new xvc(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        Map map = xvdVar.a;
        if (map.containsKey(xveVar)) {
            fduf fdufVar = (fduf) map.get(xveVar);
            if (fdufVar != null) {
                fdufVar.f(xvcVar);
            }
        } else {
            map.put(xveVar, fdvf.a(xvcVar));
        }
        return fctx.a;
    }
}
