package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshp {
    private File a;
    private final erzj b;

    public eshp(erzj erzjVar) {
        this.b = erzjVar;
    }

    private final File c() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    erzj erzjVar = this.b;
                    this.a = new File(erzjVar.a().getFilesDir(), "PersistedInstallation." + erzjVar.h() + ".json");
                }
            }
        }
        return this.a;
    }

    public final eshr a() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        eshq eshqVarI = eshr.i();
        eshm eshmVar = (eshm) eshqVarI;
        eshmVar.a = strOptString;
        eshqVarI.c(new int[]{1, 2, 3, 4, 5}[iOptInt]);
        eshmVar.b = strOptString2;
        eshmVar.c = strOptString3;
        eshqVarI.d(jOptLong);
        eshqVarI.b(jOptLong2);
        eshmVar.d = strOptString4;
        return eshqVarI.a();
    }

    public final void b(eshr eshrVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ((eshn) eshrVar).a);
            int i = ((eshn) eshrVar).g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", ((eshn) eshrVar).b);
            jSONObject.put("RefreshToken", ((eshn) eshrVar).c);
            jSONObject.put("TokenCreationEpochInSecs", ((eshn) eshrVar).e);
            jSONObject.put("ExpiresInSecs", ((eshn) eshrVar).d);
            jSONObject.put("FisError", ((eshn) eshrVar).f);
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(c())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }
}
