package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwjr {
    public static dwjk f() {
        dwmf dwmfVar = new dwmf();
        dwmfVar.c(0L);
        dwmfVar.s();
        return dwmfVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0257 A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:7:0x002e, B:9:0x0041, B:10:0x0048, B:12:0x004e, B:13:0x0055, B:15:0x005b, B:16:0x0062, B:18:0x0068, B:33:0x00ca, B:35:0x00d0, B:32:0x00c3, B:36:0x00d9, B:40:0x00ec, B:44:0x0122, B:46:0x0128, B:48:0x0130, B:43:0x0119, B:49:0x013b, B:52:0x0147, B:78:0x01e1, B:80:0x01e7, B:82:0x01ea, B:76:0x01d4, B:77:0x01da, B:83:0x01f5, B:99:0x0251, B:101:0x0257, B:103:0x025a, B:96:0x0240, B:98:0x024a, B:104:0x0265, B:105:0x026e, B:106:0x0277, B:107:0x027b, B:109:0x0289, B:111:0x028c, B:112:0x02a2, B:113:0x02aa, B:114:0x02b2, B:116:0x02c0, B:117:0x02ca, B:119:0x02d8, B:120:0x02e2, B:122:0x02ea, B:126:0x02ff, B:128:0x0307, B:129:0x0310, B:19:0x006c, B:23:0x007d, B:25:0x008b, B:29:0x00b9, B:26:0x009b, B:28:0x00a9, B:30:0x00bc, B:84:0x01fe, B:86:0x0204, B:88:0x0212, B:89:0x0215, B:90:0x021e, B:92:0x0226, B:94:0x0234, B:95:0x0237, B:41:0x00f2), top: B:146:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:7:0x002e, B:9:0x0041, B:10:0x0048, B:12:0x004e, B:13:0x0055, B:15:0x005b, B:16:0x0062, B:18:0x0068, B:33:0x00ca, B:35:0x00d0, B:32:0x00c3, B:36:0x00d9, B:40:0x00ec, B:44:0x0122, B:46:0x0128, B:48:0x0130, B:43:0x0119, B:49:0x013b, B:52:0x0147, B:78:0x01e1, B:80:0x01e7, B:82:0x01ea, B:76:0x01d4, B:77:0x01da, B:83:0x01f5, B:99:0x0251, B:101:0x0257, B:103:0x025a, B:96:0x0240, B:98:0x024a, B:104:0x0265, B:105:0x026e, B:106:0x0277, B:107:0x027b, B:109:0x0289, B:111:0x028c, B:112:0x02a2, B:113:0x02aa, B:114:0x02b2, B:116:0x02c0, B:117:0x02ca, B:119:0x02d8, B:120:0x02e2, B:122:0x02ea, B:126:0x02ff, B:128:0x0307, B:129:0x0310, B:19:0x006c, B:23:0x007d, B:25:0x008b, B:29:0x00b9, B:26:0x009b, B:28:0x00a9, B:30:0x00bc, B:84:0x01fe, B:86:0x0204, B:88:0x0212, B:89:0x0215, B:90:0x021e, B:92:0x0226, B:94:0x0234, B:95:0x0237, B:41:0x00f2), top: B:146:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9 A[Catch: JSONException -> 0x00c3, TryCatch #2 {JSONException -> 0x00c3, blocks: (B:19:0x006c, B:23:0x007d, B:25:0x008b, B:29:0x00b9, B:26:0x009b, B:28:0x00a9, B:30:0x00bc), top: B:140:0x006c, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7 A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:7:0x002e, B:9:0x0041, B:10:0x0048, B:12:0x004e, B:13:0x0055, B:15:0x005b, B:16:0x0062, B:18:0x0068, B:33:0x00ca, B:35:0x00d0, B:32:0x00c3, B:36:0x00d9, B:40:0x00ec, B:44:0x0122, B:46:0x0128, B:48:0x0130, B:43:0x0119, B:49:0x013b, B:52:0x0147, B:78:0x01e1, B:80:0x01e7, B:82:0x01ea, B:76:0x01d4, B:77:0x01da, B:83:0x01f5, B:99:0x0251, B:101:0x0257, B:103:0x025a, B:96:0x0240, B:98:0x024a, B:104:0x0265, B:105:0x026e, B:106:0x0277, B:107:0x027b, B:109:0x0289, B:111:0x028c, B:112:0x02a2, B:113:0x02aa, B:114:0x02b2, B:116:0x02c0, B:117:0x02ca, B:119:0x02d8, B:120:0x02e2, B:122:0x02ea, B:126:0x02ff, B:128:0x0307, B:129:0x0310, B:19:0x006c, B:23:0x007d, B:25:0x008b, B:29:0x00b9, B:26:0x009b, B:28:0x00a9, B:30:0x00bc, B:84:0x01fe, B:86:0x0204, B:88:0x0212, B:89:0x0215, B:90:0x021e, B:92:0x0226, B:94:0x0234, B:95:0x0237, B:41:0x00f2), top: B:146:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ea A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:7:0x002e, B:9:0x0041, B:10:0x0048, B:12:0x004e, B:13:0x0055, B:15:0x005b, B:16:0x0062, B:18:0x0068, B:33:0x00ca, B:35:0x00d0, B:32:0x00c3, B:36:0x00d9, B:40:0x00ec, B:44:0x0122, B:46:0x0128, B:48:0x0130, B:43:0x0119, B:49:0x013b, B:52:0x0147, B:78:0x01e1, B:80:0x01e7, B:82:0x01ea, B:76:0x01d4, B:77:0x01da, B:83:0x01f5, B:99:0x0251, B:101:0x0257, B:103:0x025a, B:96:0x0240, B:98:0x024a, B:104:0x0265, B:105:0x026e, B:106:0x0277, B:107:0x027b, B:109:0x0289, B:111:0x028c, B:112:0x02a2, B:113:0x02aa, B:114:0x02b2, B:116:0x02c0, B:117:0x02ca, B:119:0x02d8, B:120:0x02e2, B:122:0x02ea, B:126:0x02ff, B:128:0x0307, B:129:0x0310, B:19:0x006c, B:23:0x007d, B:25:0x008b, B:29:0x00b9, B:26:0x009b, B:28:0x00a9, B:30:0x00bc, B:84:0x01fe, B:86:0x0204, B:88:0x0212, B:89:0x0215, B:90:0x021e, B:92:0x0226, B:94:0x0234, B:95:0x0237, B:41:0x00f2), top: B:146:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0226 A[Catch: JSONException -> 0x0249, TryCatch #4 {JSONException -> 0x0249, blocks: (B:84:0x01fe, B:86:0x0204, B:88:0x0212, B:89:0x0215, B:90:0x021e, B:92:0x0226, B:94:0x0234, B:95:0x0237), top: B:143:0x01fe, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240 A[Catch: JSONException -> 0x0319, TRY_ENTER, TryCatch #6 {JSONException -> 0x0319, blocks: (B:7:0x002e, B:9:0x0041, B:10:0x0048, B:12:0x004e, B:13:0x0055, B:15:0x005b, B:16:0x0062, B:18:0x0068, B:33:0x00ca, B:35:0x00d0, B:32:0x00c3, B:36:0x00d9, B:40:0x00ec, B:44:0x0122, B:46:0x0128, B:48:0x0130, B:43:0x0119, B:49:0x013b, B:52:0x0147, B:78:0x01e1, B:80:0x01e7, B:82:0x01ea, B:76:0x01d4, B:77:0x01da, B:83:0x01f5, B:99:0x0251, B:101:0x0257, B:103:0x025a, B:96:0x0240, B:98:0x024a, B:104:0x0265, B:105:0x026e, B:106:0x0277, B:107:0x027b, B:109:0x0289, B:111:0x028c, B:112:0x02a2, B:113:0x02aa, B:114:0x02b2, B:116:0x02c0, B:117:0x02ca, B:119:0x02d8, B:120:0x02e2, B:122:0x02ea, B:126:0x02ff, B:128:0x0307, B:129:0x0310, B:19:0x006c, B:23:0x007d, B:25:0x008b, B:29:0x00b9, B:26:0x009b, B:28:0x00a9, B:30:0x00bc, B:84:0x01fe, B:86:0x0204, B:88:0x0212, B:89:0x0215, B:90:0x021e, B:92:0x0226, B:94:0x0234, B:95:0x0237, B:41:0x00f2), top: B:146:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ejwi i(org.json.JSONObject r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwjr.i(org.json.JSONObject):ejwi");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean m(JSONObject jSONObject, String str, dwji dwjiVar) throws JSONException {
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        ejwi ejwiVarJ3;
        switch (dwjiVar.a().ordinal()) {
            case 0:
                dvhv.c("Action", "failed to convert Action to JSONObject due to Unknown action type");
                break;
            case 1:
                ejwi ejwiVarB = dwjiVar.d().b();
                if (ejwiVarB.g()) {
                    jSONObject.put(str, ejwiVarB.c());
                    break;
                }
                break;
            case 2:
                ejwi ejwiVarB2 = dwjiVar.c().b();
                if (ejwiVarB2.g()) {
                    jSONObject.put(str, ejwiVarB2.c());
                    break;
                }
                break;
            case 3:
                jSONObject.put(str, dwjiVar.i());
                break;
            case 4:
                jSONObject.put(str, dwjiVar.k());
                break;
            case 5:
                jSONObject.put("ACTION_TYPE", dwjj.COMPOSED_OVERLAY_ACTION);
                dwmh dwmhVar = new dwmh();
                dwmhVar.b(dwjiVar.f());
                ejwi ejwiVarC = dwjo.c(dwmhVar.a());
                if (ejwiVarC.g()) {
                    jSONObject.put(str, ejwiVarC.c());
                    break;
                }
                break;
            case 7:
                jSONObject.put(str, dwjiVar.h());
                break;
            case 8:
                jSONObject.put(str, dwjiVar.j());
                break;
            case 9:
                jSONObject.put("ACTION_TYPE", dwjj.COMPOSED_OVERLAY_ACTION);
                ejwi ejwiVarC2 = dwjo.c(dwjiVar.b());
                if (ejwiVarC2.g()) {
                    jSONObject.put(str, ejwiVarC2.c());
                    break;
                }
                break;
            case 10:
                dwsk dwskVarG = dwjiVar.g();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    ekqh it = dwskVarG.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            dwsj dwsjVar = (dwsj) it.next();
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("PATTERN", dwsjVar.b());
                                jSONObject3.put("SUBSTITUTE", dwsjVar.a());
                                ejwiVarJ2 = ejwi.j(jSONObject3);
                            } catch (JSONException unused) {
                                dvhv.c("UrlAction", "failed to convert UrlContentReplacement to JSONObject");
                                ejwiVarJ2 = ejud.a;
                            }
                            if (ejwiVarJ2.g()) {
                                jSONArray.put(ejwiVarJ2.c());
                            } else {
                                ejwiVarJ = ejud.a;
                            }
                        } else {
                            jSONObject2.put("REPLACEMENTS", jSONArray);
                            jSONObject2.put(VCardConstants.PROPERTY_URL, dwskVarG.c());
                            ejwiVarJ = ejwi.j(jSONObject2);
                        }
                    }
                } catch (JSONException unused2) {
                    dvhv.c("UrlAction", "failed to convert ReplyActionPayload to JSONObject");
                    ejwiVarJ = ejud.a;
                }
                if (!ejwiVarJ.g()) {
                    dvhv.c("Action", "failed to convert UrlAction payload to json.");
                    break;
                } else {
                    jSONObject.put(str, ejwiVarJ.c());
                    break;
                }
            case 11:
                dwqc dwqcVarE = dwjiVar.e();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("DECORATION_IDS_TO_ADD", new JSONArray((Collection) dwqcVarE.a()));
                    jSONObject4.put("DECORATION_IDS_TO_REMOVE", new JSONArray((Collection) dwqcVarE.b()));
                    ejwiVarJ3 = ejwi.j(jSONObject4);
                } catch (JSONException unused3) {
                    dvhv.c(dwqc.a, "Failed to convert the decoration id lists to JSON.");
                    ejwiVarJ3 = ejud.a;
                }
                if (!ejwiVarJ3.g()) {
                    dvhv.c("Action", "Failed to convert decoration transition action to json.");
                    break;
                } else {
                    jSONObject.put(str, ejwiVarJ3.c());
                    break;
                }
        }
        return false;
    }

    public abstract long a();

    public abstract dwji b();

    public abstract dwji c();

    public final dwjj d() {
        return b().a();
    }

    public final dwjj e() {
        return c().a();
    }

    public abstract ejwi g();

    public abstract ejwi h();

    public abstract ejwi j();

    /* JADX WARN: Removed duplicated region for block: B:27:0x00af A[Catch: JSONException -> 0x0119, TryCatch #1 {JSONException -> 0x0119, blocks: (B:3:0x0009, B:5:0x0013, B:6:0x0020, B:8:0x0033, B:25:0x00a9, B:27:0x00af, B:24:0x00a2, B:28:0x00b6, B:30:0x00c0, B:31:0x00cd, B:33:0x00d7, B:34:0x00e4, B:36:0x00f9, B:38:0x00fc, B:40:0x0111, B:42:0x0114, B:9:0x0040, B:21:0x0095, B:14:0x005e, B:16:0x006e, B:17:0x0076, B:18:0x007e, B:20:0x008e, B:22:0x009a), top: B:47:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ejwi k() throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwjr.k():ejwi");
    }

    public abstract ejwi l();
}
