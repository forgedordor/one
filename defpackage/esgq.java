package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgq {
    final SharedPreferences a;
    final Context b;
    private final Map c = new csq();

    public esgq(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            b();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    static String f(String str) {
        return str.concat("|S|cre");
    }

    private static final String h(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    public final synchronized esgp a(String str, String str2, String str3) {
        esgp esgpVar;
        SharedPreferences sharedPreferences = this.a;
        String strH = h(str, str2, str3);
        esgpVar = null;
        String string = sharedPreferences.getString(strH, null);
        long j = esgp.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    esgpVar = new esgp(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseInstanceId", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                esgpVar = new esgp(string, null, 0L);
            }
        }
        return esgpVar;
    }

    public final synchronized void b() {
        this.c.clear();
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = this.a;
        String strH = h(str, str2, str3);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.remove(strH);
        editorEdit.commit();
    }

    public final synchronized void d(String str, String str2, String str3, String str4, String str5) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = esgp.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str4);
            jSONObject.put("appVersion", str5);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseInstanceId", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(h(str, str2, str3), string);
        editorEdit.commit();
    }

    public final synchronized boolean e() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized void g(String str) throws NumberFormatException {
        SharedPreferences sharedPreferences = this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.contains(f(str))) {
            String string = sharedPreferences.getString(f(str), null);
            jCurrentTimeMillis = 0;
            if (string != null) {
                try {
                    jCurrentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            SharedPreferences sharedPreferences2 = this.a;
            String strF = f(str);
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            editorEdit.putString(strF, String.valueOf(jCurrentTimeMillis));
            editorEdit.commit();
        }
        this.c.put(str, Long.valueOf(jCurrentTimeMillis));
    }
}
