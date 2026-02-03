package defpackage;

import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztj {
    private static volatile ejwi a;
    private static volatile ejwi b;

    public static ejwi a() {
        ejwi ejwiVarJ;
        ejwi ejwiVarJ2;
        ejwi ejwiVarJ3;
        FileInputStream fileInputStream;
        ejwi ejwiVar = a;
        if (ejwiVar != null) {
            return ejwiVar;
        }
        long jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        long j = 0;
        ejwi ejwiVarJ4 = jSysconf > 0 ? ejwi.j(Long.valueOf(jSysconf)) : ejud.a;
        if (ejwiVarJ4.g()) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            boolean z = false;
            try {
                try {
                    fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                } catch (IOException unused) {
                    ejud ejudVar = ejud.a;
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    ejwiVarJ = ejudVar;
                }
                try {
                    int i = fileInputStream.read(bArr);
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    ejwiVarJ = ejwi.j(ByteBuffer.wrap(bArr, 0, i));
                    if (ejwiVarJ.g()) {
                        Object objC = ejwiVarJ.c();
                        long jLongValue = ((Long) ejwiVarJ4.c()).longValue();
                        while (true) {
                            ByteBuffer byteBuffer = (ByteBuffer) objC;
                            if (byteBuffer.remaining() <= 17) {
                                break;
                            }
                            if (byteBuffer.get() == 40) {
                                int i2 = 16;
                                while (true) {
                                    if (i2 < 0) {
                                        break;
                                    }
                                    if (byteBuffer.get(byteBuffer.position() + i2) == 41) {
                                        byteBuffer.position(byteBuffer.position() + i2 + 1);
                                        if (byteBuffer.get() == 32 && b(byteBuffer, 1) && b(byteBuffer, 18)) {
                                            while (true) {
                                                if (!byteBuffer.hasRemaining()) {
                                                    break;
                                                }
                                                byte b2 = byteBuffer.get();
                                                if (b2 == 32) {
                                                    if (z) {
                                                        ejwiVarJ2 = ejwi.j(Long.valueOf(j));
                                                    }
                                                } else {
                                                    if (b2 < 48 || b2 > 57 || j > 922337203685477580L) {
                                                        break;
                                                    }
                                                    j = (j * 10) + (b2 - 48);
                                                    z = true;
                                                }
                                            }
                                            ejwiVarJ2 = ejud.a;
                                        }
                                    } else {
                                        i2--;
                                    }
                                }
                            }
                        }
                        ejwiVarJ2 = ejud.a;
                        ejwiVarJ3 = !ejwiVarJ2.g() ? ejud.a : ejwi.j(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) ejwiVarJ2.c()).longValue()) / jLongValue));
                    } else {
                        ejwiVarJ3 = ejud.a;
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        } else {
            ejwiVarJ3 = ejud.a;
        }
        a = ejwiVarJ3;
        return ejwiVarJ3;
    }

    private static boolean b(ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i <= 0) {
                return true;
            }
            if (byteBuffer.get() == 32) {
                i--;
            }
        }
        return i == 0;
    }
}
