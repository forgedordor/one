package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwqs {
    public static dwqr k() {
        dwnu dwnuVar = new dwnu();
        dwnuVar.g(false);
        dwnuVar.c(false);
        dwnuVar.h(false);
        return dwnuVar;
    }

    public static ejwi l(JSONObject jSONObject) {
        dwqr dwqrVarK = k();
        try {
            dwqrVarK.j(jSONObject.getInt("OVERLAY_STYLE"));
            dwqrVarK.k(jSONObject.getInt("time_to_live_sec"));
            if (jSONObject.has("dismiss_action")) {
                ejwi ejwiVarI = dwjr.i(jSONObject.getJSONObject("dismiss_action"));
                if (!ejwiVarI.g()) {
                    dvhv.c("Message", "Failed to get dismiss action from JSONObject in Overlay.");
                    return ejud.a;
                }
                dwqrVarK.b((dwjr) ejwiVarI.c());
            }
            if (jSONObject.has("overlay_lighter_icon")) {
                ejwi ejwiVarH = dwqf.h(jSONObject.getJSONObject("overlay_lighter_icon"));
                if (!ejwiVarH.g()) {
                    dvhv.c("Message", "Failed to get lighter icon from JSONObject in Overlay.");
                    return ejud.a;
                }
                dwqrVarK.i((dwqf) ejwiVarH.c());
            }
            if (jSONObject.has("display_text")) {
                dwqrVarK.e(jSONObject.getString("display_text"));
            }
            if (jSONObject.has("OVERLAY_EXPIRETIME_STAMP")) {
                dwqrVarK.f(jSONObject.getInt("OVERLAY_EXPIRETIME_STAMP"));
            }
            if (jSONObject.has("display_icon")) {
                dwqrVarK.d(dvhy.c(jSONObject.optString("display_icon")));
            }
            if (jSONObject.has("hide_snippet_in_conversation_list")) {
                dwqrVarK.h(jSONObject.optBoolean("hide_snippet_in_conversation_list"));
            }
            if (jSONObject.has("hide_dismiss_button")) {
                dwqrVarK.g(jSONObject.optBoolean("hide_dismiss_button"));
            }
            if (jSONObject.has("dismissible_by_tapping_outside")) {
                dwqrVarK.c(jSONObject.optBoolean("dismissible_by_tapping_outside"));
            }
            return ejwi.j(dwqrVarK.a());
        } catch (JSONException e) {
            dvhv.d("Message", "Failed to decode Overlay", e);
            return ejud.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract ejwi c();

    @Deprecated
    public abstract ejwi d();

    public abstract ejwi e();

    public abstract ejwi f();

    public abstract ejwi g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public final ejwi m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (c().g()) {
                ejwi ejwiVarK = ((dwjr) c().c()).k();
                if (!ejwiVarK.g()) {
                    dvhv.c("Message", "Failed to convert dismiss action to JSONObject in Overlay.");
                    return ejud.a;
                }
                jSONObject.put("dismiss_action", ejwiVarK.c());
            }
            if (g().g()) {
                ejwi ejwiVarI = ((dwqf) g().c()).i();
                if (!ejwiVarI.g()) {
                    dvhv.c("Message", "Failed to convert lighter icon to JSONObject in Overlay.");
                    return ejud.a;
                }
                jSONObject.put("overlay_lighter_icon", ejwiVarI.c());
            }
            if (e().g()) {
                jSONObject.put("display_text", e().c());
            }
            jSONObject.put("time_to_live_sec", b());
            if (f().g()) {
                jSONObject.put("OVERLAY_EXPIRETIME_STAMP", f().c());
            }
            jSONObject.put("OVERLAY_STYLE", a());
            if (d().g()) {
                jSONObject.putOpt("display_icon", dvhy.e((evqs) d().c()));
            }
            jSONObject.putOpt("hide_snippet_in_conversation_list", Boolean.valueOf(j()));
            jSONObject.putOpt("hide_dismiss_button", Boolean.valueOf(i()));
            jSONObject.putOpt("dismissible_by_tapping_outside", Boolean.valueOf(h()));
            return ejwi.j(jSONObject);
        } catch (JSONException e) {
            dvhv.d("Message", "Failed to encode Overlay", e);
            return ejud.a;
        }
    }
}
