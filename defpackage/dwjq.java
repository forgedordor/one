package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjq {
    public static ejwi a(JSONObject jSONObject) {
        if (!jSONObject.has("TEXT") || !jSONObject.has("MESSAGE_CALLBACK_PAYLOAD")) {
            dvhv.c("Action", "failed to convert JSONObject to ReplyActionPayload, missing necessary properties");
            return ejud.a;
        }
        dwmj dwmjVar = new dwmj();
        try {
            dwmjVar.c((String) jSONObject.get("TEXT"));
            dwmjVar.b((String) jSONObject.get("MESSAGE_CALLBACK_PAYLOAD"));
            return ejwi.j(dwmjVar.a());
        } catch (JSONException unused) {
            dvhv.c("Action", "failed to convert JSONObject to ReplyActionPayload");
            return ejud.a;
        }
    }

    public final ejwi b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TEXT", d());
            jSONObject.put("MESSAGE_CALLBACK_PAYLOAD", c());
            return ejwi.j(jSONObject);
        } catch (JSONException unused) {
            dvhv.c("Action", "failed to convert ReplyActionPayload to JSONObject");
            return ejud.a;
        }
    }

    public abstract String c();

    public abstract String d();
}
