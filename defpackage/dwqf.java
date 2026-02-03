package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwqf {
    private static final String a = "dwqf";

    public static dwqe f() {
        dwnj dwnjVar = new dwnj();
        dwnjVar.f(0);
        dwnjVar.c(0);
        dwnjVar.e("");
        return dwnjVar;
    }

    public static dwqf g() {
        dwqe dwqeVarF = f();
        dwqeVarF.d(new byte[0]);
        dwqeVarF.c(0);
        dwqeVarF.f(0);
        dwqeVarF.e("");
        return dwqeVarF.a();
    }

    public static ejwi h(JSONObject jSONObject) {
        dwqe dwqeVarF = f();
        try {
            dwqeVarF.c(jSONObject.getInt("ICON_HEIGHT"));
            dwqeVarF.f(jSONObject.getInt("ICON_WIDTH"));
            dwqeVarF.d(dvhy.k(jSONObject.getString("ICON")));
            dwqeVarF.e(jSONObject.getString("TALK_BACK_DESCRIPTION"));
            if (jSONObject.has("ICON_COLOR")) {
                dwqeVarF.b(jSONObject.getInt("ICON_COLOR"));
            }
            return ejwi.j(dwqeVarF.a());
        } catch (NullPointerException | JSONException unused) {
            return ejud.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract ejwi c();

    public abstract String d();

    public abstract byte[] e();

    public final ejwi i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ICON", dvhy.f(e()));
            jSONObject.put("ICON_WIDTH", b());
            jSONObject.put("ICON_HEIGHT", a());
            jSONObject.put("TALK_BACK_DESCRIPTION", d());
            if (c().g()) {
                jSONObject.put("ICON_COLOR", c().c());
            }
            return ejwi.j(jSONObject);
        } catch (JSONException unused) {
            dvhv.c(a, "failed to convert LighterIcon to JSONObject");
            return ejud.a;
        }
    }
}
