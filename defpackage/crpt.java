package defpackage;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crpt {
    public static final cqce a = cqce.g("Bugle", "PlaceWebServiceApiImpl");
    private final eosc b;
    private final crqn c;

    public crpt(eosc eoscVar, crqn crqnVar) {
        this.b = eoscVar;
        this.c = crqnVar;
    }

    public final eiju a(LatLng latLng) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("maps.googleapis.com").appendPath("maps").appendPath("api").appendPath("geocode").appendPath("json").appendQueryParameter("latlng", latLng.a + "," + latLng.b).appendQueryParameter("key", "AIzaSyCVl7z2EZZ1S1mbhW_beZ1cELoLreBMECM");
        return eiju.g(this.c.a(builder.build().toString())).h(new ejvr() { // from class: crps
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws JSONException {
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) obj).optJSONArray("results");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(0);
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        JSONArray jSONArray = jSONObject.getJSONArray("types");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            ekfwVar.h(jSONArray.getString(i2));
                        }
                        eatc eatcVarAx = eatj.ax();
                        ((eaox) eatcVarAx).n = jSONObject.getString("place_id");
                        ((eaox) eatcVarAx).B = ekfwVar.g();
                        ((eaox) eatcVarAx).b = jSONObject.optString("formatted_address");
                        ((eaox) eatcVarAx).r = jSONObject.optString("name");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("geometry").getJSONObject("location");
                        ((eaox) eatcVarAx).p = new LatLng(jSONObject2.getDouble(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT), jSONObject2.getDouble("lng"));
                        return Optional.of(eatcVarAx.G());
                    }
                } catch (JSONException e) {
                    crpt.a.o("Failed to parse place from response", e);
                }
                return Optional.empty();
            }
        }, this.b);
    }
}
