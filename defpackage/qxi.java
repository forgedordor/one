package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxi implements Runnable {
    public final PhotoView a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public float f;
    public float g;
    public long h;
    public boolean i;
    public boolean j;

    public qxi(PhotoView photoView) {
        this.a = photoView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            boolean r0 = r6.j
            if (r0 == 0) goto L5
            goto L3e
        L5:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.h
            long r0 = r0 - r2
            float r2 = r6.f
            float r3 = r6.g
            float r0 = (float) r0
            float r3 = r3 * r0
            float r2 = r2 + r3
            com.android.ex.photo.views.PhotoView r0 = r6.a
            float r1 = r6.b
            float r3 = r6.c
            r0.c(r2, r1, r3)
            r1 = 0
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2c
            boolean r5 = r6.d
            if (r2 > 0) goto L29
            r2 = r4
            goto L2a
        L29:
            r2 = r3
        L2a:
            if (r5 != r2) goto L37
        L2c:
            float r2 = r6.b
            float r5 = r6.c
            r0.c(r1, r2, r5)
            r6.i = r4
            r6.j = r3
        L37:
            boolean r1 = r6.j
            if (r1 != 0) goto L3e
            r0.post(r6)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxi.run():void");
    }
}
