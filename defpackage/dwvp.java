package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwvp {
    public static dwvo g() {
        return new dwus().f(new byte[0]);
    }

    public static ejwi h(JSONObject jSONObject) {
        try {
            dwvo dwvoVarG = g();
            ejwi ejwiVarC = dwsu.c(jSONObject.getJSONObject("MEDIA_ID"));
            if (!ejwiVarC.g()) {
                return ejud.a;
            }
            ((dwus) dwvoVarG).a = (dwsu) ejwiVarC.c();
            if (jSONObject.has("LOCAL_URI")) {
                ((dwus) dwvoVarG).b = jSONObject.getString("LOCAL_URI");
            }
            if (jSONObject.has("THUMBNAIL")) {
                dwvoVarG.f(dvhy.k(jSONObject.getString("THUMBNAIL")));
            }
            dwvoVarG.e(jSONObject.getInt("WIDTH"));
            dwvoVarG.c(jSONObject.getInt("HEIGHT"));
            dwvoVarG.d(jSONObject.getString("IMAGE_DESCRIPTION"));
            return ejwi.j(dwvoVarG.b());
        } catch (JSONException e) {
            dvhv.d("ImageElement", "Failed to convert ImageElement from JSONObject.", e);
            return ejud.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract dwsu c();

    public abstract evqs d();

    public abstract String e();

    public abstract String f();

    public final ejwi i() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            ejwi ejwiVarD = c().d();
            if (!ejwiVarD.g()) {
                dvhv.c("ImageElement", "failed to convert ImageElement to JSONObject.");
                return ejud.a;
            }
            jSONObject.put("MEDIA_ID", ejwiVarD.c());
            if (f() != null) {
                jSONObject.put("LOCAL_URI", f());
            }
            if (d().d() > 0) {
                jSONObject.put("THUMBNAIL", dvhy.f(d().I()));
            }
            jSONObject.put("WIDTH", b());
            jSONObject.put("HEIGHT", a());
            jSONObject.put("IMAGE_DESCRIPTION", e());
            return ejwi.j(jSONObject);
        } catch (JSONException e) {
            dvhv.d("ImageElement", "Failed to convert ImageElement to JSONObject.", e);
            return ejud.a;
        }
    }
}
