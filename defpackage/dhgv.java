package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhgv extends Thread {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ dhgy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhgv(dhgy dhgyVar, Context context, String str) {
        super("PersistentStorage-load");
        this.a = context;
        this.b = str;
        this.c = dhgyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:4:0x002b, B:36:0x00bf, B:7:0x0031, B:9:0x0039, B:10:0x0045, B:12:0x004d, B:14:0x0055, B:15:0x0071, B:20:0x0093, B:27:0x00a4, B:29:0x00a9, B:30:0x00ac, B:31:0x00ad, B:33:0x00b2, B:35:0x00bc, B:34:0x00b5, B:26:0x009d), top: B:41:0x002b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5 A[Catch: all -> 0x00c1, TryCatch #0 {, blocks: (B:4:0x002b, B:36:0x00bf, B:7:0x0031, B:9:0x0039, B:10:0x0045, B:12:0x004d, B:14:0x0055, B:15:0x0071, B:20:0x0093, B:27:0x00a4, B:29:0x00a9, B:30:0x00ac, B:31:0x00ad, B:33:0x00b2, B:35:0x00bc, B:34:0x00b5, B:26:0x009d), top: B:41:0x002b, inners: #1 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "Attempt to read file "
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r6.a
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r3 = r6.b
            r1.<init>(r2, r3)
            dhgy r2 = r6.c
            r2.b = r1
            java.io.File r1 = r2.b
            java.io.File r3 = new java.io.File
            java.lang.String r1 = r1.getPath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = ".bak"
            java.lang.String r1 = r1.concat(r4)
            r3.<init>(r1)
            r2.c = r3
            monitor-enter(r2)
            boolean r1 = r2.f     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L31
            goto Lbf
        L31:
            java.io.File r1 = r2.c     // Catch: java.lang.Throwable -> Lc1
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L45
            java.io.File r1 = r2.b     // Catch: java.lang.Throwable -> Lc1
            r1.delete()     // Catch: java.lang.Throwable -> Lc1
            java.io.File r1 = r2.c     // Catch: java.lang.Throwable -> Lc1
            java.io.File r3 = r2.b     // Catch: java.lang.Throwable -> Lc1
            r1.renameTo(r3)     // Catch: java.lang.Throwable -> Lc1
        L45:
            java.io.File r1 = r2.b     // Catch: java.lang.Throwable -> Lc1
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L71
            java.io.File r1 = r2.b     // Catch: java.lang.Throwable -> Lc1
            boolean r1 = r1.canRead()     // Catch: java.lang.Throwable -> Lc1
            if (r1 != 0) goto L71
            java.lang.String r1 = "RcsClientLib"
            java.io.File r3 = r2.b     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc1
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            r4.append(r3)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = " without permission"
            r4.append(r0)     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lc1
            defpackage.cqca.n(r1, r0)     // Catch: java.lang.Throwable -> Lc1
        L71:
            java.io.File r0 = r2.b     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = r0.canRead()     // Catch: java.lang.Throwable -> Lc1
            r1 = 0
            if (r0 == 0) goto Lad
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L9a
            java.io.File r4 = r2.b     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            r4 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9a
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L98
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.Object r3 = r3.readObject()     // Catch: java.lang.Throwable -> L98
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L98
            defpackage.dhgy.e(r0)     // Catch: java.lang.Throwable -> Lc1
            r1 = r3
            goto Lad
        L98:
            r3 = move-exception
            goto L9d
        L9a:
            r0 = move-exception
            r3 = r0
            r0 = r1
        L9d:
            java.lang.String r4 = "RcsClientLib"
            java.lang.String r5 = "loadFromDiskLocked"
            defpackage.cqca.p(r4, r3, r5)     // Catch: java.lang.Throwable -> La8
            defpackage.dhgy.e(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lad
        La8:
            r1 = move-exception
            defpackage.dhgy.e(r0)     // Catch: java.lang.Throwable -> Lc1
            throw r1     // Catch: java.lang.Throwable -> Lc1
        Lad:
            r0 = 1
            r2.f = r0     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto Lb5
            r2.d = r1     // Catch: java.lang.Throwable -> Lc1
            goto Lbc
        Lb5:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lc1
            r0.<init>()     // Catch: java.lang.Throwable -> Lc1
            r2.d = r0     // Catch: java.lang.Throwable -> Lc1
        Lbc:
            r2.notifyAll()     // Catch: java.lang.Throwable -> Lc1
        Lbf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc1
            return
        Lc1:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhgv.run():void");
    }
}
