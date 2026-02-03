package defpackage;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dekh {
    public Context a;
    public Camera c;
    public int d;
    public dcjp e;
    public String g;
    public Thread h;
    public dekf i;
    public final Object b = new Object();
    public boolean f = false;
    public final IdentityHashMap j = new IdentityHashMap();

    public final void a() {
        synchronized (this.b) {
            b();
            dekf dekfVar = this.i;
            dekk dekkVar = dekfVar.a;
            if (dekkVar != null) {
                synchronized (dekkVar.c) {
                    if (dekkVar.d != null) {
                        dekkVar.d = null;
                    }
                }
                dekfVar.a = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x000e, B:10:0x0019, B:11:0x001b, B:13:0x001f, B:14:0x0027, B:18:0x003e, B:17:0x0033, B:19:0x0048, B:20:0x004d, B:9:0x0012), top: B:29:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[Catch: all -> 0x004f, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x000e, B:10:0x0019, B:11:0x001b, B:13:0x001f, B:14:0x0027, B:18:0x003e, B:17:0x0033, B:19:0x0048, B:20:0x004d, B:9:0x0012), top: B:29:0x0003, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            monitor-enter(r0)
            dekf r1 = r5.i     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            r1.a(r2)     // Catch: java.lang.Throwable -> L4f
            java.lang.Thread r1 = r5.h     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            if (r1 == 0) goto L1b
            r1.join()     // Catch: java.lang.InterruptedException -> L12 java.lang.Throwable -> L4f
            goto L19
        L12:
            java.lang.String r1 = "CameraSource"
            java.lang.String r3 = "Frame processing thread interrupted on release."
            android.util.Log.d(r1, r3)     // Catch: java.lang.Throwable -> L4f
        L19:
            r5.h = r2     // Catch: java.lang.Throwable -> L4f
        L1b:
            android.hardware.Camera r1 = r5.c     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L48
            r1.stopPreview()     // Catch: java.lang.Throwable -> L4f
            android.hardware.Camera r1 = r5.c     // Catch: java.lang.Throwable -> L4f
            r1.setPreviewCallbackWithBuffer(r2)     // Catch: java.lang.Throwable -> L4f
            android.hardware.Camera r1 = r5.c     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L4f
            r1.setPreviewTexture(r2)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L4f
            android.hardware.Camera r1 = r5.c     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L4f
            r1.setPreviewDisplay(r2)     // Catch: java.lang.Exception -> L32 java.lang.Throwable -> L4f
            goto L3e
        L32:
            r1 = move-exception
            java.lang.String r3 = "CameraSource"
            java.lang.String r4 = "Failed to clear camera preview: "
            java.lang.String r1 = defpackage.a.J(r1, r4)     // Catch: java.lang.Throwable -> L4f
            android.util.Log.e(r3, r1)     // Catch: java.lang.Throwable -> L4f
        L3e:
            android.hardware.Camera r1 = r5.c     // Catch: java.lang.Throwable -> L4f
            defpackage.dclh.m(r1)     // Catch: java.lang.Throwable -> L4f
            r1.release()     // Catch: java.lang.Throwable -> L4f
            r5.c = r2     // Catch: java.lang.Throwable -> L4f
        L48:
            java.util.IdentityHashMap r1 = r5.j     // Catch: java.lang.Throwable -> L4f
            r1.clear()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dekh.b():void");
    }

    public final byte[] c(dcjp dcjpVar) {
        byte[] bArr = new byte[((int) Math.ceil(((dcjpVar.b * dcjpVar.a) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (!byteBufferWrap.hasArray() || byteBufferWrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.j.put(bArr, byteBufferWrap);
        return bArr;
    }
}
