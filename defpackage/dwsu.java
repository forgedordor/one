package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwsu {
    public static ejwi c(JSONObject jSONObject) {
        try {
            dwsq dwsqVar = new dwsq();
            dwsqVar.b(jSONObject.getString("RESOURCE_ID"));
            dwsqVar.c(jSONObject.getInt("RESOURCE_REGION"));
            return ejwi.j(dwsqVar.a());
        } catch (Exception e) {
            dvhv.d("LighterMediaId", "failed to convert JSON to LighterMediaId", e);
            return ejud.a;
        }
    }

    public abstract int a();

    public abstract String b();

    public final ejwi d() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("RESOURCE_ID", b());
            jSONObject.put("RESOURCE_REGION", a());
            return ejwi.j(jSONObject);
        } catch (JSONException e) {
            dvhv.d("LighterMediaId", "failed to convert LighterMediaId to JSONObject", e);
            return ejud.a;
        }
    }
}
