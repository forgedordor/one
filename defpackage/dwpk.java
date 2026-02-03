package defpackage;

import android.os.Parcelable;
import com.android.vcard.VCardConstants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwpk implements Parcelable, Serializable {
    private dwpk a;

    public static ejwi f(JSONObject jSONObject) {
        try {
            dwip dwipVar = new dwip();
            dwipVar.c(jSONObject.getString("ID"));
            dwipVar.d(jSONObject.getString("TACHYON_APP_NAME"));
            dwipVar.e(dwpj.a(jSONObject.getInt(VCardConstants.PARAM_TYPE)));
            if (jSONObject.has("HANDLER_ID")) {
                dwipVar.b(jSONObject.getString("HANDLER_ID"));
            }
            return ejwi.j(dwipVar.a());
        } catch (JSONException unused) {
            dvhv.c("ContactId", "failed to convert JSONObject to ContactId");
            return ejud.a;
        }
    }

    private static dwpk h(dwpk dwpkVar) {
        if (dwpkVar.b() != dwpj.EMAIL) {
            return dwpkVar;
        }
        dwpg dwpgVarA = dwpkVar.a();
        dwpgVarA.c(dvhq.a(dwpkVar.d()));
        return dwpgVarA.a();
    }

    public abstract dwpg a();

    public abstract dwpj b();

    public abstract ejwi c();

    public abstract String d();

    public abstract String e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwpk)) {
            return false;
        }
        dwpk dwpkVar = (dwpk) obj;
        if (this.a == null) {
            this.a = h(this);
        }
        if (dwpkVar.a == null) {
            dwpkVar.a = h(dwpkVar);
        }
        return this.a.d().equals(dwpkVar.a.d()) && this.a.e().equals(dwpkVar.a.e()) && this.a.b().equals(dwpkVar.a.b()) && this.a.c().equals(dwpkVar.a.c());
    }

    public final ejwi g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ID", d());
            jSONObject.put("TACHYON_APP_NAME", e());
            jSONObject.put(VCardConstants.PARAM_TYPE, b().f);
            ejwi ejwiVarC = c();
            if (ejwiVarC.g()) {
                jSONObject.put("HANDLER_ID", ejwiVarC.c());
            }
            return ejwi.j(jSONObject);
        } catch (JSONException unused) {
            dvhv.c("ContactId", "failed to convert ContactId to JSONObject");
            return ejud.a;
        }
    }

    public final int hashCode() {
        if (this.a == null) {
            this.a = h(this);
        }
        return ((((((this.a.d().hashCode() + 527) * 31) + this.a.e().hashCode()) * 31) + this.a.b().hashCode()) * 31) + this.a.c().hashCode();
    }
}
