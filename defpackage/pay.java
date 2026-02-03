package defpackage;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pay {
    private static final String c = "/data/misc/profiles/cur/" + pbe.a();
    public static final pax a = new pav();
    static final pax b = new paw();

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void b(Executor executor, final pax paxVar, final int i, final Object obj) {
        executor.execute(new Runnable() { // from class: pat
            @Override // java.lang.Runnable
            public final void run() {
                pax paxVar2 = pay.a;
                paxVar.a(i, obj);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:630|324|325)|322|620) */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0753, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0754, code lost:
    
        r23 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v38, types: [int] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v36 */
    /* JADX WARN: Type inference failed for: r23v37 */
    /* JADX WARN: Type inference failed for: r23v38 */
    /* JADX WARN: Type inference failed for: r23v40 */
    /* JADX WARN: Type inference failed for: r23v41 */
    /* JADX WARN: Type inference failed for: r23v42 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [byte[], pao[]] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [int] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r31, java.util.concurrent.Executor r32, defpackage.pax r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pay.c(android.content.Context, java.util.concurrent.Executor, pax, boolean):void");
    }
}
