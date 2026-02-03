package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedi {
    private static final Object a;
    private static Method b;
    private static boolean c;

    static {
        int i = dcdu.c;
        a = new Object();
        b = null;
        c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x00a5, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0012, B:7:0x0017, B:12:0x0039, B:13:0x003e, B:15:0x0040, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x0049, B:20:0x004e, B:23:0x007d, B:10:0x0023), top: B:38:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x00a5, TryCatch #2 {, blocks: (B:4:0x0012, B:7:0x0017, B:12:0x0039, B:13:0x003e, B:15:0x0040, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x0049, B:20:0x004e, B:23:0x007d, B:10:0x0023), top: B:38:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x00a5, TryCatch #2 {, blocks: (B:4:0x0012, B:7:0x0017, B:12:0x0039, B:13:0x003e, B:15:0x0040, B:26:0x008f, B:27:0x0094, B:29:0x0096, B:30:0x00a4, B:18:0x0049, B:20:0x004e, B:23:0x007d, B:10:0x0023), top: B:38:0x0012, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11) throws defpackage.dcen, defpackage.dceo {
        /*
            java.lang.String r0 = "Context must not be null"
            defpackage.dclh.n(r11, r0)
            r0 = 11925000(0xb5f608, float:1.6710484E-38)
            defpackage.dceq.d(r11, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r2 = defpackage.dedi.a
            monitor-enter(r2)
            boolean r3 = defpackage.dedi.c     // Catch: java.lang.Throwable -> La5
            r4 = 0
            if (r3 != 0) goto L40
            dcvy r3 = com.google.android.gms.dynamite.DynamiteModule.b     // Catch: defpackage.dcvv -> L22 java.lang.Throwable -> La5
            java.lang.String r5 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r3 = com.google.android.gms.dynamite.DynamiteModule.d(r11, r3, r5)     // Catch: defpackage.dcvv -> L22 java.lang.Throwable -> La5
            android.content.Context r3 = r3.c     // Catch: defpackage.dcvv -> L22 java.lang.Throwable -> La5
            goto L37
        L22:
            r3 = move-exception
            java.lang.String r5 = "ProviderInstaller"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> La5
            java.lang.String r6 = "Failed to load providerinstaller module: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> La5
            android.util.Log.w(r5, r3)     // Catch: java.lang.Throwable -> La5
            r3 = r4
        L37:
            if (r3 == 0) goto L40
            java.lang.String r11 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            b(r3, r11)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            goto L95
        L40:
            boolean r3 = defpackage.dedi.c     // Catch: java.lang.Throwable -> La5
            android.content.Context r5 = defpackage.dceq.c(r11)     // Catch: java.lang.Throwable -> La5
            if (r5 != 0) goto L49
            goto L8d
        L49:
            r4 = 1
            defpackage.dedi.c = r4     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L8c
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            java.lang.ClassLoader r3 = r5.getClassLoader()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r8 = 3
            ddna[] r8 = new defpackage.ddna[r8]     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            ddna r10 = new ddna     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r10.<init>(r9, r11)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r11 = 0
            r8[r11] = r10     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            ddmz r11 = defpackage.ddmz.a(r0)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r8[r4] = r11     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            ddmz r11 = defpackage.ddmz.a(r6)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            r0 = 2
            r8[r0] = r11     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            java.lang.String r11 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r0 = "reportRequestStats2"
            java.lang.Class r11 = r3.loadClass(r11)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            defpackage.ddnb.a(r11, r0, r8)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La5
            goto L8c
        L7c:
            r11 = move-exception
            java.lang.String r0 = "ProviderInstaller"
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> La5
            java.lang.String r1 = "Failed to report request stats: "
            java.lang.String r11 = r1.concat(r11)     // Catch: java.lang.Throwable -> La5
            android.util.Log.w(r0, r11)     // Catch: java.lang.Throwable -> La5
        L8c:
            r4 = r5
        L8d:
            if (r4 == 0) goto L96
            java.lang.String r11 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            b(r4, r11)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
        L95:
            return
        L96:
            java.lang.String r11 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r11, r0)     // Catch: java.lang.Throwable -> La5
            dcen r11 = new dcen     // Catch: java.lang.Throwable -> La5
            r0 = 8
            r11.<init>(r0)     // Catch: java.lang.Throwable -> La5
            throw r11     // Catch: java.lang.Throwable -> La5
        La5:
            r11 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dedi.a(android.content.Context):void");
    }

    private static void b(Context context, String str) throws IllegalAccessException, dcen, IllegalArgumentException, InvocationTargetException {
        try {
            if (b == null) {
                b = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            b.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new dcen(8);
        }
    }
}
