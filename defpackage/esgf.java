package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgf {
    private final erzj a;
    private final esgh b;
    private final dcdb c;
    private final esgu d;
    private final esgu e;
    private final eshc f;

    public esgf(erzj erzjVar, esgh esghVar, dcdb dcdbVar, esgu esguVar, esgu esguVar2, eshc eshcVar) {
        this.a = erzjVar;
        this.b = esghVar;
        this.c = dcdbVar;
        this.d = esguVar;
        this.e = esguVar2;
        this.f = eshcVar;
    }

    public static final defn b(defn defnVar) {
        return defnVar.c(esfx.a, new deeq() { // from class: esge
            @Override // defpackage.deeq
            public final Object a(defn defnVar2) throws IOException {
                Bundle bundle = (Bundle) defnVar2.j(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null) {
                    return string;
                }
                String string2 = bundle.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                String string3 = bundle.getString("error");
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseInstanceId", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final defn a(String str, String str2, String str3, Bundle bundle) {
        int iB;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.e().b);
        esgh esghVar = this.b;
        bundle.putString("gmsv", Integer.toString(esghVar.a()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", esghVar.c());
        bundle.putString("app_ver_name", esghVar.d());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String strC = ((eshh) degc.f(this.f.j())).c();
            if (TextUtils.isEmpty(strC)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strC);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
        }
        bundle.putString("cliv", "fiid-21.1.1");
        esft esftVar = (esft) this.e.a();
        esli esliVar = (esli) this.d.a();
        if (esftVar != null && esliVar != null && (iB = esftVar.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(esfs.a(iB)));
            bundle.putString("Firebase-Client", esliVar.a());
        }
        return this.c.b(bundle);
    }
}
