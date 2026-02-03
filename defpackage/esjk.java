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
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjk {
    public final erzj a;
    private final esjp b;
    private final dcdb c;
    private final esgu d;
    private final esgu e;
    private final eshc f;

    public esjk(erzj erzjVar, esjp esjpVar, dcdb dcdbVar, esgu esguVar, esgu esguVar2, eshc eshcVar) {
        this.a = erzjVar;
        this.b = esjpVar;
        this.c = dcdbVar;
        this.d = esguVar;
        this.e = esguVar2;
        this.f = eshcVar;
    }

    public static final defn b(defn defnVar) {
        return defnVar.c(new Executor() { // from class: esji
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new deeq() { // from class: esjj
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
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle.toString()), new Throwable());
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

    public final defn a(String str, String str2, Bundle bundle) {
        int iB;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.e().b);
            esjp esjpVar = this.b;
            bundle.putString("gmsv", Integer.toString(esjpVar.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", esjpVar.c());
            bundle.putString("app_ver_name", esjpVar.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String strC = ((eshh) degc.f(this.f.j())).c();
                if (TextUtils.isEmpty(strC)) {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", strC);
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) degc.f(this.f.a()));
            bundle.putString("cliv", "fcm-23.3.2_1p");
            esft esftVar = (esft) this.e.a();
            esli esliVar = (esli) this.d.a();
            if (esftVar != null && esliVar != null && (iB = esftVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(esfs.a(iB)));
                bundle.putString("Firebase-Client", esliVar.a());
            }
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return degc.b(e2);
        }
    }
}
