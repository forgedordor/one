package defpackage;

import j$.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ycv extends fdbo implements fdat {
    public ycv(Object obj) {
        super(2, obj, ych.class, "generate", "generate(ILcom/google/android/apps/messaging/conversation2/messagelist/message/BugleMessageUiDataWrapper;)Ljava/lang/String;", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        yit yitVar = (yit) obj2;
        ych ychVar = (ych) this.g;
        if (yitVar == null) {
            return a.D(iIntValue, "-no_id");
        }
        String strA = ych.a(yitVar.a());
        HashMap map = ychVar.a;
        fcvo fcvoVar = fcvo.a;
        Iterable iterable = (Iterable) Map.EL.getOrDefault(map, strA, fcvoVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable) {
            if (((Number) obj3).intValue() != iIntValue) {
                arrayList.add(obj3);
            }
        }
        while (!arrayList.isEmpty()) {
            strA = strA.concat("~");
            Iterable iterable2 = (Iterable) Map.EL.getOrDefault(map, strA, fcvoVar);
            arrayList = new ArrayList();
            for (Object obj4 : iterable2) {
                if (((Number) obj4).intValue() != iIntValue) {
                    arrayList.add(obj4);
                }
            }
        }
        HashMap map2 = ychVar.b;
        Integer numValueOf = Integer.valueOf(iIntValue);
        map.remove(map2.get(numValueOf));
        List listAq = fcva.aq(arrayList);
        listAq.add(numValueOf);
        map.put(strA, listAq);
        map2.put(numValueOf, strA);
        return strA;
    }
}
