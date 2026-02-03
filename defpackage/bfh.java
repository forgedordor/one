package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfh {
    static File a() throws bbg {
        try {
            return File.createTempFile("CameraX", ".tmp");
        } catch (IOException e) {
            throw new bbg("Failed to create temp file.", e);
        }
    }

    static void b(File file, bbb bbbVar) {
        try {
            try {
                OutputStream outputStream = bbbVar.a;
                if (outputStream != null) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, i);
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } finally {
                file.delete();
            }
        } catch (IOException unused) {
            throw new bbg("Failed to write to OutputStream.", null);
        }
    }
}
