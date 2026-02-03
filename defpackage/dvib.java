package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvib {
    private static final String a = "dvib";

    private dvib() {
    }

    public static ekgb a(JSONArray jSONArray) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                ekfwVar.h(jSONArray.getString(i2));
            } catch (JSONException unused) {
                dvhv.c(a, "JSON string somehow failed to be converted to String.");
                return ekoe.a;
            }
        }
        return ekfwVar.g();
    }

    public static ekgb b(Collection collection, ejvr ejvrVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ejwi ejwiVar = (ejwi) ejvrVar.apply(it.next());
            if (ejwiVar.g()) {
                ekfwVar.h(ejwiVar.c());
            }
        }
        return ekfwVar.g();
    }

    public static ekgb c(Collection collection, ejvr ejvrVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ekfwVar.h(ejvrVar.apply(it.next()));
        }
        return ekfwVar.g();
    }

    public static ArrayList d(Collection collection, ejvr ejvrVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(ejvrVar.apply(it.next()));
        }
        return arrayList;
    }
}
