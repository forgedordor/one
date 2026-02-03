package defpackage;

import com.android.vcard.VCardConstants;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwvr {
    private static final String a = "dwvr";

    public static dwvq g() {
        return new dwuu().f(new byte[0]);
    }

    public static ejwi h(JSONObject jSONObject) throws JSONException {
        ejwi ejwiVarJ;
        dwvt dwvtVar;
        try {
            dwvq dwvqVarG = g();
            JSONObject jSONObject2 = jSONObject.getJSONObject("MEDIA_SOURCE");
            String str = dwvu.a;
            try {
                final int i = jSONObject2.getInt(VCardConstants.PARAM_TYPE);
                dwvtVar = (dwvt) ekeh.e(dwvt.values()).a(new ejwm() { // from class: dwvs
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj) {
                        return ((dwvt) obj).c == i;
                    }
                }).f();
            } catch (JSONException e) {
                dvhv.d(dwvu.a, "Failed to convert JSONObject to MediaSource.", e);
                ejwiVarJ = ejud.a;
            }
            if (dwvtVar == null) {
                throw new InvalidParameterException("Invalid SourceType.");
            }
            int iOrdinal = dwvtVar.ordinal();
            if (iOrdinal == 0) {
                ejwi ejwiVarC = dwsu.c(jSONObject2.getJSONObject("MEDIA_ID"));
                if (ejwiVarC.g()) {
                    ejwiVarJ = ejwi.j(new dwtq((dwsu) ejwiVarC.c()));
                } else {
                    dvhv.c(dwvu.a, "Failed to convert JSONObject to MediaSource.");
                    ejwiVarJ = ejud.a;
                }
            } else if (iOrdinal != 1) {
                dvhv.c(dwvu.a, "Failed to convert JSONObject to MediaSource, unsupported type: " + dwvtVar.toString());
                ejwiVarJ = ejud.a;
            } else {
                String string = jSONObject2.getString(VCardConstants.PROPERTY_URL);
                if (string == null) {
                    dvhv.c(dwvu.a, "Failed to convert JSONObject to MediaSource.");
                    ejwiVarJ = ejud.a;
                } else {
                    ejwiVarJ = ejwi.j(dwtt.a(string));
                }
            }
            if (!ejwiVarJ.g()) {
                dvhv.c(a, "Failed to convert MediaElement from JSONObject.");
                return ejud.a;
            }
            ((dwuu) dwvqVarG).a = (dwvu) ejwiVarJ.c();
            if (jSONObject.has("LOCAL_URI")) {
                ((dwuu) dwvqVarG).b = jSONObject.getString("LOCAL_URI");
            }
            if (jSONObject.has("THUMBNAIL")) {
                dwvqVarG.f(dvhy.k(jSONObject.getString("THUMBNAIL")));
            }
            dwvqVarG.e(jSONObject.getInt("WIDTH"));
            dwvqVarG.c(jSONObject.getInt("HEIGHT"));
            dwvqVarG.d(jSONObject.getString("MEDIA_DESCRIPTION"));
            return ejwi.j(dwvqVarG.b());
        } catch (JSONException e2) {
            dvhv.d(a, "Failed to convert MediaElement from JSONObject.", e2);
            return ejud.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract dwvu c();

    public abstract evqs d();

    public abstract String e();

    public abstract String f();

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: JSONException -> 0x00c7, TryCatch #0 {JSONException -> 0x00c7, blocks: (B:2:0x0000, B:17:0x0064, B:19:0x006a, B:21:0x0079, B:22:0x0082, B:24:0x008c, B:25:0x009d, B:27:0x00bd, B:16:0x005b, B:3:0x0009, B:13:0x0055, B:8:0x0027, B:9:0x0034, B:11:0x0042, B:12:0x004c), top: B:32:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: JSONException -> 0x00c7, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00c7, blocks: (B:2:0x0000, B:17:0x0064, B:19:0x006a, B:21:0x0079, B:22:0x0082, B:24:0x008c, B:25:0x009d, B:27:0x00bd, B:16:0x005b, B:3:0x0009, B:13:0x0055, B:8:0x0027, B:9:0x0034, B:11:0x0042, B:12:0x004c), top: B:32:0x0000, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ejwi i() throws org.json.JSONException {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc7
            r0.<init>()     // Catch: org.json.JSONException -> Lc7
            dwvu r1 = r5.c()     // Catch: org.json.JSONException -> Lc7
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5a
            r2.<init>()     // Catch: org.json.JSONException -> L5a
            java.lang.String r3 = "TYPE"
            dwvt r4 = r1.b()     // Catch: org.json.JSONException -> L5a
            int r4 = r4.c     // Catch: org.json.JSONException -> L5a
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L5a
            dwvt r3 = r1.b()     // Catch: org.json.JSONException -> L5a
            int r3 = r3.ordinal()     // Catch: org.json.JSONException -> L5a
            if (r3 == 0) goto L34
            r4 = 1
            if (r3 == r4) goto L27
            goto L55
        L27:
            r1.c()     // Catch: org.json.JSONException -> L5a
            java.lang.String r3 = "URL"
            java.lang.String r1 = r1.c()     // Catch: org.json.JSONException -> L5a
            r2.put(r3, r1)     // Catch: org.json.JSONException -> L5a
            goto L55
        L34:
            dwsu r1 = r1.a()     // Catch: org.json.JSONException -> L5a
            ejwi r1 = r1.d()     // Catch: org.json.JSONException -> L5a
            boolean r3 = r1.g()     // Catch: org.json.JSONException -> L5a
            if (r3 != 0) goto L4c
            java.lang.String r1 = defpackage.dwvu.a     // Catch: org.json.JSONException -> L5a
            java.lang.String r2 = "Failed to convert MediaId to JSONObject."
            defpackage.dvhv.c(r1, r2)     // Catch: org.json.JSONException -> L5a
            ejud r1 = defpackage.ejud.a     // Catch: org.json.JSONException -> L5a
            goto L64
        L4c:
            java.lang.String r3 = "MEDIA_ID"
            java.lang.Object r1 = r1.c()     // Catch: org.json.JSONException -> L5a
            r2.put(r3, r1)     // Catch: org.json.JSONException -> L5a
        L55:
            ejwi r1 = defpackage.ejwi.j(r2)     // Catch: org.json.JSONException -> L5a
            goto L64
        L5a:
            r1 = move-exception
            java.lang.String r2 = defpackage.dwvu.a     // Catch: org.json.JSONException -> Lc7
            java.lang.String r3 = "Failed to convert MediaSource to JSONObject."
            defpackage.dvhv.d(r2, r3, r1)     // Catch: org.json.JSONException -> Lc7
            ejud r1 = defpackage.ejud.a     // Catch: org.json.JSONException -> Lc7
        L64:
            boolean r2 = r1.g()     // Catch: org.json.JSONException -> Lc7
            if (r2 == 0) goto Lbd
            java.lang.String r2 = "MEDIA_SOURCE"
            java.lang.Object r1 = r1.c()     // Catch: org.json.JSONException -> Lc7
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = r5.e()     // Catch: org.json.JSONException -> Lc7
            if (r1 == 0) goto L82
            java.lang.String r1 = "LOCAL_URI"
            java.lang.String r2 = r5.e()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
        L82:
            evqs r1 = r5.d()     // Catch: org.json.JSONException -> Lc7
            int r1 = r1.d()     // Catch: org.json.JSONException -> Lc7
            if (r1 <= 0) goto L9d
            java.lang.String r1 = "THUMBNAIL"
            evqs r2 = r5.d()     // Catch: org.json.JSONException -> Lc7
            byte[] r2 = r2.I()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = defpackage.dvhy.f(r2)     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
        L9d:
            java.lang.String r1 = "WIDTH"
            int r2 = r5.b()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "HEIGHT"
            int r2 = r5.a()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "MEDIA_DESCRIPTION"
            java.lang.String r2 = r5.f()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            ejwi r0 = defpackage.ejwi.j(r0)     // Catch: org.json.JSONException -> Lc7
            return r0
        Lbd:
            java.lang.String r0 = defpackage.dwvr.a     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "failed to convert MediaElement to JSONObject."
            defpackage.dvhv.c(r0, r1)     // Catch: org.json.JSONException -> Lc7
            ejud r0 = defpackage.ejud.a     // Catch: org.json.JSONException -> Lc7
            return r0
        Lc7:
            r0 = move-exception
            java.lang.String r1 = defpackage.dwvr.a
            java.lang.String r2 = "Failed to convert MediaElement to JSONObject."
            defpackage.dvhv.d(r1, r2, r0)
            ejud r0 = defpackage.ejud.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwvr.i():ejwi");
    }
}
