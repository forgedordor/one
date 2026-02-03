package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwvz {
    private static final String a = "dwvz";
    public static final /* synthetic */ int c = 0;

    public static ejwi c(JSONObject jSONObject) throws JSONException {
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        try {
            dwuw dwuwVar = new dwuw();
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            JSONArray jSONArray = jSONObject.getJSONArray("COMPONENTS");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                try {
                } catch (JSONException e) {
                    dvhv.d("UI_COMPONENT", "Failed to get UiComponent from JSONObject", e);
                }
                if (jSONObject2.has("UI_ELEMENT")) {
                    ejwi ejwiVarI = dwwm.i(jSONObject2.getJSONObject("UI_ELEMENT"));
                    if (ejwiVarI.g()) {
                        ejwiVarJ = ejwi.j(new dwtz((dwwm) ejwiVarI.c()));
                    } else {
                        dvhv.c("UI_COMPONENT", "Failed to get UiElement from JSON when decoding UiComponent.");
                        ejwiVarJ = ejud.a;
                    }
                } else if (jSONObject2.has("STACK_COMPONENT")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("STACK_COMPONENT");
                    dwvc dwvcVar = new dwvc();
                    ekfw ekfwVar2 = new ekfw();
                    try {
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("UI_ELEMENTS");
                        int i3 = 0;
                        while (true) {
                            if (i3 >= jSONArray2.length()) {
                                dwvcVar.b(ekfwVar2.g());
                                ejwiVarJ2 = ejwi.j(dwvcVar.a());
                                break;
                            }
                            ejwi ejwiVarI2 = dwwm.i(jSONArray2.getJSONObject(i3));
                            if (!ejwiVarI2.g()) {
                                dvhv.c("UI_COMPONENT", "Failed to get UiElement from JSON when decoding StackComponent.");
                                ejwiVarJ2 = ejud.a;
                                break;
                            }
                            ekfwVar2.h(ejwiVarI2.c());
                            i3++;
                        }
                    } catch (JSONException e2) {
                        dvhv.d("UI_COMPONENT", "Failed to get LineStyle from JSONObject.", e2);
                        ejwiVarJ2 = ejud.a;
                    }
                    if (ejwiVarJ2.g()) {
                        ejwiVarJ = ejwi.j(new dwty((dwwg) ejwiVarJ2.c()));
                    } else {
                        dvhv.c("UI_COMPONENT", "Failed to get StackComponent from JSON when decoding UiComponent.");
                        ejwiVarJ = ejud.a;
                    }
                } else {
                    ejwiVarJ = ejud.a;
                }
                if (!ejwiVarJ.g()) {
                    dvhv.c(a, "Failed to convert JSONObject to StackCard.");
                    return ejud.a;
                }
                ekfwVar.h(ejwiVarJ.c());
            }
            dwuwVar.b(ekfwVar.g());
            if (jSONObject.has("PREFERRED_MAX_WIDTH")) {
                dwuwVar.c(jSONObject.getInt("PREFERRED_MAX_WIDTH"));
            }
            return ejwi.j(dwuwVar.a());
        } catch (JSONException e3) {
            dvhv.d(a, "Failed to convert JSONObject to StackCard.", e3);
            return ejud.a;
        }
    }

    public abstract ejwi a();

    public abstract ekgb b();

    /* JADX WARN: Multi-variable type inference failed */
    public final ejwi d() throws JSONException {
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            ekqh ekqhVarF = b().iterator();
            while (ekqhVarF.hasNext()) {
                dwwh dwwhVar = (dwwh) ekqhVarF.next();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    int iOrdinal = dwwhVar.a().ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            ejwi ejwiVarJ3 = dwwhVar.c().j();
                            if (ejwiVarJ3.g()) {
                                jSONObject2.put("UI_ELEMENT", ejwiVarJ3.c());
                            } else {
                                dvhv.c("UI_COMPONENT", "Failed to convert UiElement to JSON when encoding UiComponent.");
                                ejwiVarJ = ejud.a;
                            }
                        }
                        ejwiVarJ = ejwi.j(jSONObject2);
                    } else {
                        dwwg dwwgVarB = dwwhVar.b();
                        JSONObject jSONObject3 = new JSONObject();
                        JSONArray jSONArray2 = new JSONArray();
                        try {
                            ekqh ekqhVarF2 = ((dwvd) dwwgVarB).a.iterator();
                            while (true) {
                                if (!ekqhVarF2.hasNext()) {
                                    jSONObject3.put("UI_ELEMENTS", jSONArray2);
                                    ejwiVarJ2 = ejwi.j(jSONObject3);
                                    break;
                                }
                                ejwi ejwiVarJ4 = ((dwwm) ekqhVarF2.next()).j();
                                if (!ejwiVarJ4.g()) {
                                    dvhv.c("UI_COMPONENT", "Failed to convert UiElement to JSON when encoding StackComponent.");
                                    ejwiVarJ2 = ejud.a;
                                    break;
                                }
                                jSONArray2.put(ejwiVarJ4.c());
                            }
                        } catch (JSONException e) {
                            dvhv.d("UI_COMPONENT", "Failed to convert StackComponent to JSONObject", e);
                            ejwiVarJ2 = ejud.a;
                        }
                        if (ejwiVarJ2.g()) {
                            jSONObject2.put("STACK_COMPONENT", ejwiVarJ2.c());
                            ejwiVarJ = ejwi.j(jSONObject2);
                        } else {
                            dvhv.c("UI_COMPONENT", "Failed to convert stackComponent to JSON when encoding UiComponent.");
                            ejwiVarJ = ejud.a;
                        }
                    }
                } catch (JSONException e2) {
                    dvhv.d("UI_COMPONENT", "Failed to convert UiComponent to JSONObject", e2);
                    ejwiVarJ = ejud.a;
                }
                if (!ejwiVarJ.g()) {
                    dvhv.c(a, "Failed to convert StackCard to JSONObject.");
                    return ejud.a;
                }
                jSONArray.put(ejwiVarJ.c());
            }
            jSONObject.put("COMPONENTS", jSONArray);
            if (a().g()) {
                jSONObject.put("PREFERRED_MAX_WIDTH", a().c());
            }
            return ejwi.j(jSONObject);
        } catch (JSONException e3) {
            dvhv.d(a, "Failed to convert StackCard to JSONObject.", e3);
            return ejud.a;
        }
    }
}
