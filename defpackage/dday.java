package defpackage;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dday {
    private etzn a = null;
    private final File b;
    private final File c;

    public dday(File file) {
        this.b = file;
        this.c = new File(file, "gmscompliance.pb");
    }

    public final synchronized ejwi a() {
        ejwi ejwiVar;
        DataInputStream dataInputStream;
        ejwi ejwiVarJ;
        if (this.a == null) {
            File file = this.c;
            if (!file.exists()) {
                Log.w("CacheStorage", "cache doesn't exist");
                ejwiVar = ejud.a;
            } else if (!file.isFile() || file.length() < 4) {
                Log.e("CacheStorage", "cache is corrupted");
                file.delete();
                ejwiVar = ejud.a;
            } else {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                } catch (IOException e) {
                    Log.e("CacheStorage", "error reading cache: ".concat(e.toString()));
                }
                try {
                    int i = dataInputStream.readInt();
                    if (i != 1) {
                        Log.e("CacheStorage", a.g(i, "invalid cache version: "));
                        dataInputStream.close();
                        file.delete();
                        ejwiVar = ejud.a;
                    } else {
                        int i2 = dataInputStream.readInt();
                        if (i2 <= 0) {
                            Log.e("CacheStorage", a.g(i2, "invalid length: "));
                            ejwiVarJ = ejud.a;
                        } else {
                            byte[] bArr = new byte[i2];
                            dataInputStream.readFully(bArr);
                            ddlw ddlwVar = (ddlw) evsn.parseFrom(ddlw.a, bArr, evrr.a());
                            if ((1 & ddlwVar.b) != 0) {
                                etzn etznVar = ddlwVar.c;
                                if (etznVar == null) {
                                    etznVar = etzn.a;
                                }
                                ejwiVarJ = ejwi.j(etznVar);
                            } else {
                                Log.e("CacheStorage", "message wrapper is empty");
                                ejwiVarJ = ejud.a;
                            }
                        }
                        dataInputStream.close();
                        ejwiVar = ejwiVarJ;
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            this.a = (etzn) ejwiVar.f();
        }
        return ejwi.i(this.a);
    }

    final synchronized void b(etzn etznVar) {
        this.a = null;
        File file = this.b;
        if (!file.exists() && !file.mkdirs()) {
            Log.e("CacheStorage", "failed to create cache dir");
            return;
        }
        File file2 = this.c;
        if (file2.exists() && file2.isDirectory() && !file2.delete()) {
            Log.e("CacheStorage", "failed to delete cache dir collision");
            return;
        }
        ddlv ddlvVar = (ddlv) ddlw.a.createBuilder();
        ddlvVar.copyOnWrite();
        ddlw ddlwVar = (ddlw) ddlvVar.instance;
        etznVar.getClass();
        ddlwVar.c = etznVar;
        ddlwVar.b |= 1;
        byte[] byteArray = ((ddlw) ddlvVar.build()).toByteArray();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(byteArray.length);
                dataOutputStream.write(byteArray);
                dataOutputStream.close();
                this.a = etznVar;
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("CacheStorage", "failed to write cache: ".concat(e.toString()));
        }
    }
}
