package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnp implements rfa {
    public static final rew a = new rew("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, rew.a);
    public static final rew b = new rew("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, rew.a);
    private final rig c;

    @Deprecated
    public rnp() {
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // defpackage.red
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object r9, java.io.File r10, defpackage.rex r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            rhy r9 = (defpackage.rhy) r9
            java.lang.Object r9 = r9.c()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            rew r2 = defpackage.rnp.b
            java.lang.Object r2 = r11.b(r2)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 != 0) goto L21
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1f
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L21
        L1f:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L21:
            r9.getWidth()
            r9.getHeight()
            int r3 = defpackage.rvd.a
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            rew r5 = defpackage.rnp.a
            java.lang.Object r5 = r11.b(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            rig r10 = r8.c     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            if (r10 == 0) goto L49
            rfe r6 = new rfe     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            goto L4a
        L49:
            r6 = r7
        L4a:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r6.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            r10 = 1
            r6.close()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> Lc7
            goto L70
        L55:
            r9 = move-exception
            goto Lc1
        L57:
            r10 = move-exception
            goto L5e
        L59:
            r9 = move-exception
            r6 = r7
            goto Lc1
        L5c:
            r10 = move-exception
            r6 = r7
        L5e:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L6a
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L55
        L6a:
            r10 = 0
            if (r6 == 0) goto L70
            r6.close()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> Lc7
        L70:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lc0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = defpackage.rvk.a(r9)
            double r3 = defpackage.rvd.a(r3)
            rew r6 = defpackage.rnp.b
            java.lang.Object r11 = r11.b(r6)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            boolean r9 = r9.hasAlpha()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            r6.append(r2)
            java.lang.String r1 = " of size "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = " in "
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = ", options format: "
            r6.append(r1)
            r6.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r6.append(r11)
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            android.util.Log.v(r0, r9)
        Lc0:
            return r10
        Lc1:
            if (r6 == 0) goto Lc9
            r6.close()     // Catch: java.lang.Throwable -> Lc7 java.io.IOException -> Lc9
            goto Lc9
        Lc7:
            r9 = move-exception
            throw r9
        Lc9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnp.a(java.lang.Object, java.io.File, rex):boolean");
    }

    @Override // defpackage.rfa
    public final int b() {
        return 2;
    }

    public rnp(rig rigVar) {
        this.c = rigVar;
    }
}
