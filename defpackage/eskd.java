package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eskd {
    final SharedPreferences a;

    public eskd(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || d()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            b();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    private static final String e(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized eskc a(String str, String str2) {
        eskc eskcVar;
        SharedPreferences sharedPreferences = this.a;
        String strE = e(str, str2);
        eskcVar = null;
        String string = sharedPreferences.getString(strE, null);
        long j = eskc.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    eskcVar = new eskc(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                eskcVar = new eskc(string, null, 0L);
            }
        }
        return eskcVar;
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = eskc.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(e(str, str2), string);
        editorEdit.commit();
    }

    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }
}
