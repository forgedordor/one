package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjo {
    public static ejwi c(dwjo dwjoVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (dwjoVar.b().g()) {
                ejwi ejwiVarD = dwqa.d((dwqa) dwjoVar.b().c());
                if (!ejwiVarD.g()) {
                    return ejud.a;
                }
                jSONObject.put("STACKED_REACTION_WEB_VIEW", ejwiVarD.c());
            }
            if (dwjoVar.a().g()) {
                ejwi ejwiVarM = ((dwqs) dwjoVar.a().c()).m();
                if (!ejwiVarM.g()) {
                    return ejud.a;
                }
                jSONObject.put("REACTION_OVERLAY_HEADER", ejwiVarM.c());
            }
            return ejwi.j(jSONObject);
        } catch (JSONException unused) {
            dvhv.c("Action", "failed to convert OverlayActionPayload to JSONObject.");
            return ejud.a;
        }
    }

    public abstract ejwi a();

    public abstract ejwi b();
}
