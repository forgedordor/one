package defpackage;

import android.os.Parcelable;
import com.android.vcard.VCardConstants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwpx implements Parcelable, Serializable {
    public abstract dwpk a();

    public abstract dwpw b();

    public final dwpk c() {
        return b().c();
    }

    public final dwpr d() {
        return b().a();
    }

    public final dwpu e() {
        return b().b();
    }

    public final ejwi f() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            ejwi ejwiVarG = a().g();
            if (!ejwiVarG.g()) {
                return ejud.a;
            }
            jSONObject.put("OWNER", ejwiVarG.c());
            jSONObject.put(VCardConstants.PARAM_TYPE, e().c);
            int iOrdinal = e().ordinal();
            if (iOrdinal == 0) {
                ejwi ejwiVarG2 = c().g();
                if (!ejwiVarG2.g()) {
                    return ejud.a;
                }
                jSONObject.put("OTHER_PARTICIPANT", ejwiVarG2.c());
            } else if (iOrdinal == 1) {
                ejwi ejwiVarD = d().d();
                if (!ejwiVarD.g()) {
                    return ejud.a;
                }
                jSONObject.put("GROUP", ejwiVarD.c());
            }
            return ejwi.j(jSONObject);
        } catch (JSONException unused) {
            dvhv.c("ConversationId", "failed to convert ConversationId to JSONObject");
            return ejud.a;
        }
    }
}
