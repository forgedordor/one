package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcnj {
    private static String a;
    private static int b;
    private static Boolean c;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int iMyPid = b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String strE = a.e(iMyPid, "/proc/", "/cmdline");
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(strE));
                            try {
                                String line = bufferedReader.readLine();
                                dclh.m(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                dcnf.a(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    dcnf.a(bufferedReader);
                }
                a = strTrim;
            }
        }
        return a;
    }

    public static boolean b() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (dcni.a()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = ddnb.a(Process.class, "isIsolated", new ddna[0]);
                    ejyb.e(objA);
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = false;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
