package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddet {
    final SharedPreferences a;
    final Context b;
    private final ddee c;
    private final Map d;

    public ddet(Context context) {
        ddee ddeeVar = new ddee();
        this.d = new csq();
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        this.c = ddeeVar;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        ddlm ddlmVar = ddlk.a;
        File file = new File(ddll.a(noBackupFilesDir, "com.google.android.gms.appid-no-backup"));
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || sharedPreferences.getAll().isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            ddeb.a(context, this);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID/Store", 3)) {
                Log.d("InstanceID/Store", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static String c(String str, String str2) {
        return a.q(str2, str, "|S|");
    }

    private static final String i(String str) {
        return String.valueOf(str).concat("|T|496232013492|GCM");
    }

    private static final String j(String str) {
        return String.valueOf(str).concat("|T-timestamp|496232013492|GCM");
    }

    public final synchronized ddec a(String str) {
        ddec ddecVarA;
        ddec ddecVar = (ddec) this.d.get(str);
        if (ddecVar != null) {
            return ddecVar;
        }
        try {
            ddee ddeeVar = this.c;
            Context context = this.b;
            ddecVarA = ddeeVar.b(context, str);
            if (ddecVarA == null) {
                ddecVarA = ddeeVar.a(context, str);
            }
        } catch (dded unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            Context context2 = this.b;
            ddeb.a(context2, this);
            ddecVarA = this.c.a(context2, str);
        }
        this.d.put(str, ddecVarA);
        return ddecVarA;
    }

    public final synchronized void d() {
        this.d.clear();
        File[] fileArrListFiles = ddee.c(this.b).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.getName().startsWith("com.google.InstanceId")) {
                    file.delete();
                }
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized String e() {
        return this.a.getString("appVersion", null);
    }

    public final synchronized String f(String str) {
        return this.a.getString(i(str), null);
    }

    public final synchronized long g(String str) {
        return this.a.getLong(j(str), -1L);
    }

    public final synchronized void h(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(i(str), str2);
        editorEdit.putLong(j(str), System.currentTimeMillis());
        editorEdit.putString("appVersion", str3);
        editorEdit.commit();
    }
}
