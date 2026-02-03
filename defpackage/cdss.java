package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.net.URL;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdss implements cdse {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/linkpreview/extractors/SchemaOrgExtractor");

    private static final String d(JSONObject jSONObject, String... strArr) {
        for (int i = 0; i < 2; i++) {
            String strOptString = jSONObject.optString(strArr[i]);
            strOptString.getClass();
            if (strOptString.length() > 0) {
                return strOptString;
            }
        }
        return "";
    }

    private static final String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof JSONObject ? d((JSONObject) obj, "contentUrl", "url") : "";
    }

    @Override // defpackage.cdse
    public final int a() {
        return 2;
    }

    @Override // defpackage.cdse
    public final /* synthetic */ boolean b(URL url) {
        url.getClass();
        return true;
    }

    @Override // defpackage.cdse
    public final Object c(cdsi cdsiVar) {
        JSONObject jSONObject;
        String strD;
        String strE;
        Iterator it = fguz.a("script[type=application/ld+json]", cdsiVar.a()).iterator();
        it.getClass();
        while (it.hasNext()) {
            try {
                String strM = ((fgrs) it.next()).m();
                strM.getClass();
                jSONObject = new JSONObject(new JSONTokener(strM));
                strD = d(jSONObject, "headline", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
            } catch (JSONException e) {
                ekrw ekrwVarG = a.g();
                ekrwVarG.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarG).g(e).h("com/google/android/apps/messaging/shared/linkpreview/extractors/SchemaOrgExtractor", "extract", 44, "SchemaOrgExtractor.kt")).q("extractor failed on script element");
            }
            if (strD.length() > 0) {
                String strD2 = d(jSONObject, "abstract", "description");
                String[] strArr = {"thumbnailUrl", "thumbnail", "image"};
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        strE = "";
                        break;
                    }
                    Object objOpt = jSONObject.opt(strArr[i]);
                    if (objOpt instanceof JSONArray) {
                        strE = e(((JSONArray) objOpt).opt(0));
                        break;
                    }
                    String strE2 = e(objOpt);
                    if (strE2.length() > 0) {
                        strE = strE2;
                        break;
                    }
                    i++;
                }
                return new cdsd(strD, strD2, strE);
            }
            continue;
        }
        return new cdsd(null, null, null, 7);
    }
}
