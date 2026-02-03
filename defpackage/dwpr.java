package defpackage;

import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwpr implements Parcelable, Serializable {
    private static final long serialVersionUID = 0;

    public static ejwi c(JSONObject jSONObject) {
        try {
            dwit dwitVar = new dwit();
            dwitVar.c(jSONObject.getString("ID"));
            dwitVar.b(jSONObject.getString("APP_NAME"));
            return ejwi.j(dwitVar.a());
        } catch (JSONException unused) {
            dvhv.c("ConversationId", "failed to convert JSONObject to GroupId");
            return ejud.a;
        }
    }

    public abstract String a();

    public abstract String b();

    public final ejwi d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ID", b());
            jSONObject.put("APP_NAME", a());
            return ejwi.j(jSONObject);
        } catch (JSONException unused) {
            dvhv.c("ConversationId", "failed to convert GroupId to JSONObject");
            return ejud.a;
        }
    }
}
