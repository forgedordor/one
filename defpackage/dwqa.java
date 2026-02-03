package defpackage;

import com.android.vcard.VCardConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwqa {
    public static ejwi c(JSONObject jSONObject) {
        dwnf dwnfVar = new dwnf();
        try {
            dwnfVar.b(jSONObject.getString(VCardConstants.PROPERTY_URL));
            ejwi ejwiVarL = dwqs.l(jSONObject.getJSONObject("WEB_VIEW_HEADER"));
            if (!ejwiVarL.g()) {
                return ejud.a;
            }
            dwnfVar.a = (dwqs) ejwiVarL.c();
            return ejwi.j(dwnfVar.a());
        } catch (JSONException e) {
            dvhv.d("CustomizedWebView", " Fail to convert customized web view from json object.", e);
            return ejud.a;
        }
    }

    public static ejwi d(dwqa dwqaVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            ejwi ejwiVarM = dwqaVar.a().m();
            if (!ejwiVarM.g()) {
                return ejud.a;
            }
            jSONObject.put(VCardConstants.PROPERTY_URL, dwqaVar.b());
            jSONObject.put("WEB_VIEW_HEADER", ejwiVarM.c());
            return ejwi.j(jSONObject);
        } catch (JSONException e) {
            dvhv.d("CustomizedWebView", " Fail to convert customized web view to json object.", e);
            return ejud.a;
        }
    }

    public abstract dwqs a();

    public abstract String b();
}
