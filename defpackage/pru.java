package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pru {
    private final pst a;

    public pru(pst pstVar) {
        this.a = pstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:9:0x0023, B:11:0x002c, B:13:0x0032, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:23:0x0068, B:25:0x0078, B:28:0x0080, B:29:0x0095, B:21:0x005f, B:22:0x0064), top: B:42:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:9:0x0023, B:11:0x002c, B:13:0x0032, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:23:0x0068, B:25:0x0078, B:28:0x0080, B:29:0x0095, B:21:0x005f, B:22:0x0064), top: B:42:0x0023, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:9:0x0023, B:11:0x002c, B:13:0x0032, B:15:0x003a, B:17:0x0040, B:19:0x0048, B:23:0x0068, B:25:0x0078, B:28:0x0080, B:29:0x0095, B:21:0x005f, B:22:0x0064), top: B:42:0x0023, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, pst] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pru a(android.content.Context r10) {
        /*
            java.lang.String r0 = "EmbeddingBackend"
            r10.getClass()
            fdap r1 = defpackage.pss.a
            pto r2 = defpackage.pto.a
            if (r2 != 0) goto Lc2
            java.util.concurrent.locks.ReentrantLock r2 = defpackage.pto.b
            r2.lock()
            pto r3 = defpackage.pto.a     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto Lb9
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Lbd
            r10.getClass()     // Catch: java.lang.Throwable -> Lbd
            prh r3 = new prh     // Catch: java.lang.Throwable -> Lbd
            r3.<init>()     // Catch: java.lang.Throwable -> Lbd
            int r3 = r3.a     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9a
            r5.getClass()     // Catch: java.lang.Throwable -> L9a
            if (r3 <= 0) goto Lab
            boolean r5 = defpackage.ptf.b()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto Lab
            java.lang.Class<pst> r5 = defpackage.pst.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto Lab
            boolean r6 = defpackage.ptf.b()     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L64
            java.lang.Class<ptg> r6 = defpackage.ptg.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L5f
            pvz r7 = new pvz     // Catch: java.lang.Throwable -> L9a
            prm r8 = new prm     // Catch: java.lang.Throwable -> L9a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L9a
            androidx.window.extensions.WindowExtensions r9 = defpackage.prn$$ExternalSyntheticApiModelOutline0.m()     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            r7.<init>(r6, r8, r9)     // Catch: java.lang.Throwable -> L9a
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = r7.a()     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L68
        L5f:
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = defpackage.ptf.a()     // Catch: java.lang.Throwable -> L9a
            goto L68
        L64:
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = defpackage.ptf.a()     // Catch: java.lang.Throwable -> L9a
        L68:
            psk r7 = new psk     // Catch: java.lang.Throwable -> L9a
            r7.<init>()     // Catch: java.lang.Throwable -> L9a
            ptg r8 = new ptg     // Catch: java.lang.Throwable -> L9a
            prm r9 = new prm     // Catch: java.lang.Throwable -> L9a
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L9a
            r5 = 8
            if (r3 < r5) goto L7d
            ptu r5 = new ptu     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L9a
        L7d:
            r5 = 6
            if (r3 < r5) goto L95
            r6.getClass()     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            android.util.ArrayMap r3 = new android.util.ArrayMap     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            prh r3 = new prh     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            r3.a(r5)     // Catch: java.lang.Throwable -> L9a
        L95:
            r8.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L9a
            r4 = r8
            goto Lab
        L9a:
            r3 = move-exception
            java.lang.String r5 = "Failed to load embedding extension: "
            r3.toString()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r5.concat(r3)     // Catch: java.lang.Throwable -> Lbd
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Lbd
        Lab:
            if (r4 != 0) goto Lb2
            java.lang.String r3 = "No supported embedding extension found"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Lbd
        Lb2:
            pto r0 = new pto     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r10, r4)     // Catch: java.lang.Throwable -> Lbd
            defpackage.pto.a = r0     // Catch: java.lang.Throwable -> Lbd
        Lb9:
            r2.unlock()
            goto Lc2
        Lbd:
            r10 = move-exception
            r2.unlock()
            throw r10
        Lc2:
            pto r10 = defpackage.pto.a
            r10.getClass()
            java.lang.Object r10 = r1.invoke(r10)
            pru r0 = new pru
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pru.a(android.content.Context):pru");
    }

    public final boolean b(Activity activity) {
        activity.getClass();
        return this.a.a(activity);
    }
}
