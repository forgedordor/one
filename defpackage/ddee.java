package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddee {
    public static File c(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static File d(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                str2 = "com.google.InstanceId_" + ddet.b(str.getBytes("UTF-8")) + ".properties";
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        ddlm ddlmVar = ddlk.a;
        return new File(ddll.a(c(context), str2));
    }

    private static final KeyPair e(String str, String str2) throws dded, NoSuchAlgorithmException {
        try {
            byte[] bArrDecode = Base64.decode(str, 8);
            byte[] bArrDecode2 = Base64.decode(str2, 8);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrDecode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("InstanceID", "Invalid key stored ".concat(e.toString()));
                throw new dded(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new dded(e2);
        }
    }

    private static final void f(Context context, String str, ddec ddecVar) throws IOException {
        try {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Writing key to properties file");
            }
            File fileD = d(context, str);
            fileD.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", ddecVar.b());
            properties.setProperty("pri", ddecVar.a());
            properties.setProperty("cre", String.valueOf(ddecVar.b));
            FileOutputStream fileOutputStream = new FileOutputStream(fileD);
            try {
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            Log.w("InstanceID", "Failed to write key: ".concat(e.toString()));
        }
    }

    private static final ddec g(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null && property2 != null) {
                KeyPair keyPairE = e(property, property2);
                try {
                    String property3 = properties.getProperty("cre");
                    if (property3 == null) {
                        throw new dded(new NullPointerException("cre"));
                    }
                    ddec ddecVar = new ddec(keyPairE, Long.parseLong(property3));
                    fileInputStream.close();
                    return ddecVar;
                } catch (NumberFormatException e) {
                    throw new dded(e);
                }
            }
            fileInputStream.close();
            return null;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static final ddec h(SharedPreferences sharedPreferences, String str) throws dded, NoSuchAlgorithmException, NumberFormatException {
        String string = sharedPreferences.getString(ddet.c(str, "|P|"), null);
        String string2 = sharedPreferences.getString(ddet.c(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair keyPairE = e(string, string2);
        String string3 = sharedPreferences.getString(ddet.c(str, "cre"), null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException unused) {
            }
        }
        return new ddec(keyPairE, j);
    }

    private static final void i(Context context, String str, ddec ddecVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (ddecVar.equals(h(sharedPreferences, str))) {
                return;
            }
        } catch (dded unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Writing key to shared preferences");
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(ddet.c(str, "|P|"), ddecVar.b());
        editorEdit.putString(ddet.c(str, "|K|"), ddecVar.a());
        editorEdit.putString(ddet.c(str, "cre"), String.valueOf(ddecVar.b));
        editorEdit.commit();
    }

    final ddec a(Context context, String str) throws NoSuchAlgorithmException, NumberFormatException, IOException {
        ddec ddecVar = new ddec(dddy.a(), System.currentTimeMillis());
        try {
            ddec ddecVarB = b(context, str);
            if (ddecVarB != null) {
                if (Log.isLoggable("InstanceID", 3)) {
                    Log.d("InstanceID", "Loaded key after generating new one, using loaded one");
                }
                return ddecVarB;
            }
        } catch (dded unused) {
        }
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Generated new key");
        }
        f(context, str, ddecVar);
        i(context, str, ddecVar);
        return ddecVar;
    }

    public final ddec b(Context context, String str) throws dded, NoSuchAlgorithmException, NumberFormatException, IOException {
        ddec ddecVarG;
        try {
            File fileD = d(context, str);
            if (fileD.exists()) {
                try {
                    ddecVarG = g(fileD);
                } catch (IOException e) {
                    if (Log.isLoggable("InstanceID", 3)) {
                        Log.d("InstanceID", "Failed to read key from file, retrying: ".concat(e.toString()));
                    }
                    try {
                        ddecVarG = g(fileD);
                    } catch (IOException e2) {
                        Log.w("InstanceID", "IID file exists, but failed to read from it: ".concat(e2.toString()));
                        throw new dded(e2);
                    }
                }
            } else {
                ddecVarG = null;
            }
        } catch (dded e3) {
            e = e3;
        }
        if (ddecVarG != null) {
            i(context, str, ddecVarG);
            return ddecVarG;
        }
        e = null;
        try {
            ddec ddecVarH = h(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
            if (ddecVarH != null) {
                f(context, str, ddecVarH);
                return ddecVarH;
            }
        } catch (dded e4) {
            e = e4;
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}
