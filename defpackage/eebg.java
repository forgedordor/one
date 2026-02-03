package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebg {
    public static final eebh a(Context context, Map map) {
        List listAo = fcva.ao(map.entrySet());
        ArrayList arrayList = new ArrayList(fcva.p(listAo, 10));
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        int[] iArrAC = fcva.aC(arrayList);
        fdci fdciVar = new fdci();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArrAC);
        try {
            ArrayList arrayList2 = new ArrayList(fcva.p(listAo, 10));
            int i = 0;
            for (Object obj : listAo) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                arrayList2.add(new fcti((String) ((Map.Entry) obj).getKey(), Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i, -16777216))));
                i = i2;
            }
            fdciVar.a = fcwa.k(arrayList2);
            typedArrayObtainStyledAttributes.recycle();
            return new eebh((Map) fdciVar.a);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final eebh b(Context context, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((dtci) entry.getValue()).a(context)));
        }
        return new eebh(linkedHashMap);
    }

    public static final eebh c(Context context) {
        context.getClass();
        return a(context, eebf.a()).a(b(context, eebf.b()));
    }
}
