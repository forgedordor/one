package defpackage;

import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rzm {
    private static String a;
    private static boolean b;

    public static synchronized String a() {
        if (!b) {
            b = true;
            try {
                byte[] bArr = new byte[64];
                FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
                boolean z = false;
                try {
                    int i = fileInputStream.read(bArr);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 64) {
                            i2 = -1;
                            break;
                        }
                        try {
                            if (bArr[i2] == 0) {
                                break;
                            }
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            rzn.a(fileInputStream, true ^ z);
                            throw th;
                        }
                    }
                    if (i2 > 0) {
                        i = i2;
                    }
                    String str = new String(bArr, 0, i);
                    rzn.a(fileInputStream, false);
                    a = str;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused) {
            }
        }
        return a;
    }
}
