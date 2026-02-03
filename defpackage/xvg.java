package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvg implements fdaw {
    public static final xvg a = new xvg();

    @Override // defpackage.fdaw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dplu dpluVar = (dplu) obj;
        ics icsVar = (ics) obj2;
        xvx xvxVar = (xvx) obj3;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        dpluVar.getClass();
        icsVar.getClass();
        xvxVar.getClass();
        xwn xwnVar = (xwn) Map.EL.getOrDefault(xvxVar.b, (String) hro.a(xvxVar.a, hmlVar).a(), null);
        if (xwnVar != null) {
            xwq.a(dpluVar, icsVar, xwnVar, hmlVar, iIntValue & 126);
        }
        return fctx.a;
    }
}
