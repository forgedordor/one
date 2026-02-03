package defpackage;

import android.os.StrictMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmq {
    private static final ekrg a = ekrg.c("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    public static dqmr a(File file) {
        dqmr dqmrVarA;
        if (file.isDirectory()) {
            return dqmr.d;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    dqmrVarA = dqms.a(bArr, elec.d(fileInputStream, bArr, 62));
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (IOException | ParseException e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java")).t("Failed to read SchedStat for thread %s", file.getName());
            dqmrVarA = dqmr.d;
        }
        return dqmrVarA;
    }

    public static List b(List list) {
        dqmr dqmrVarA;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList arrayList = new ArrayList(list.size());
        byte[] bArr = new byte[62];
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File("/proc/self/task/" + ((Integer) it.next()).intValue() + "/schedstat"));
                    try {
                        dqmrVarA = dqms.a(bArr, elec.d(fileInputStream, bArr, 62));
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | ParseException unused) {
                    dqmrVarA = dqmr.d;
                }
                arrayList.add(dqmrVarA);
            }
            return arrayList;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
