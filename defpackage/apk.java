package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apk {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.hardware.camera2.CaptureRequest a(defpackage.bjl r4, android.hardware.camera2.CameraDevice r5, java.util.Map r6, boolean r7, defpackage.axs r8) throws android.hardware.camera2.CameraAccessException {
        /*
            if (r5 != 0) goto L4
            goto Ld2
        L4:
            java.util.List r0 = r4.e()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            bjz r2 = (defpackage.bjz) r2
            java.lang.Object r2 = r6.get(r2)
            android.view.Surface r2 = (android.view.Surface) r2
            if (r2 == 0) goto L29
            r1.add(r2)
            goto L11
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "DeferrableSurface not in configuredSurfaceMap"
            r4.<init>(r5)
            throw r4
        L31:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto Ld2
            bib r6 = r4.k
            int r0 = r4.f
            java.lang.String r2 = "Camera2CaptureRequestBuilder"
            r3 = 5
            if (r0 != r3) goto L5b
            if (r6 == 0) goto L5a
            android.hardware.camera2.CaptureResult r0 = r6.b()
            boolean r0 = r0 instanceof android.hardware.camera2.TotalCaptureResult
            if (r0 == 0) goto L5a
            java.lang.String r7 = "createReprocessCaptureRequest"
            defpackage.bbs.a(r2, r7)
            android.hardware.camera2.CaptureResult r6 = r6.b()
            android.hardware.camera2.TotalCaptureResult r6 = (android.hardware.camera2.TotalCaptureResult) r6
            android.hardware.camera2.CaptureRequest$Builder r5 = r5.createReprocessCaptureRequest(r6)
            goto L70
        L5a:
            r0 = r3
        L5b:
            java.lang.String r6 = "createCaptureRequest"
            defpackage.bbs.a(r2, r6)
            if (r0 != r3) goto L6b
            r6 = 1
            if (r6 == r7) goto L66
            r6 = 2
        L66:
            android.hardware.camera2.CaptureRequest$Builder r5 = r5.createCaptureRequest(r6)
            goto L6f
        L6b:
            android.hardware.camera2.CaptureRequest$Builder r5 = r5.createCaptureRequest(r0)
        L6f:
            r3 = r0
        L70:
            e(r5, r3, r8)
            c(r4, r5)
            java.lang.Integer r6 = b(r4)
            if (r6 == 0) goto L81
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r5.set(r7, r6)
        L81:
            bjq r6 = r4.e
            bjo r7 = defpackage.bjl.a
            boolean r8 = r6.t(r7)
            if (r8 == 0) goto L96
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            java.lang.Object r7 = r6.m(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r5.set(r8, r7)
        L96:
            bjo r7 = defpackage.bjl.b
            boolean r8 = r6.t(r7)
            if (r8 == 0) goto Lb1
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            java.lang.Object r7 = r6.m(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            byte r7 = r7.byteValue()
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            r5.set(r8, r7)
        Lb1:
            d(r5, r6)
            java.util.Iterator r6 = r1.iterator()
        Lb8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc8
            java.lang.Object r7 = r6.next()
            android.view.Surface r7 = (android.view.Surface) r7
            r5.addTarget(r7)
            goto Lb8
        Lc8:
            bmx r4 = r4.j
            r5.setTag(r4)
            android.hardware.camera2.CaptureRequest r4 = r5.build()
            return r4
        Ld2:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.a(bjl, android.hardware.camera2.CameraDevice, java.util.Map, boolean, axs):android.hardware.camera2.CaptureRequest");
    }

    static Integer b(bjl bjlVar) {
        if (bjlVar.b() == 1 || bjlVar.c() == 1) {
            return 0;
        }
        if (bjlVar.b() == 2) {
            return 2;
        }
        return bjlVar.c() == 2 ? 1 : null;
    }

    public static void c(bjl bjlVar, CaptureRequest.Builder builder) {
        if (bjlVar.d().equals(bms.h)) {
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, bjlVar.d());
    }

    public static void d(CaptureRequest.Builder builder, bjq bjqVar) {
        ayh ayhVarB = ayg.a(bjqVar).b();
        for (bjo bjoVar : blz.f(ayhVarB)) {
            Object objB = bjoVar.b();
            try {
                builder.set((CaptureRequest.Key) objB, blz.b(ayhVarB, bjoVar));
            } catch (IllegalArgumentException unused) {
                Objects.toString(objB);
                bbs.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: ".concat(String.valueOf(objB)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(android.hardware.camera2.CaptureRequest.Builder r1, int r2, defpackage.axs r3) {
        /*
            r0 = 3
            if (r2 != r0) goto L1b
            boolean r2 = r3.a
            if (r2 == 0) goto L36
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            java.util.Map r2 = j$.util.DesugarCollections.unmodifiableMap(r2)
            goto L38
        L1b:
            r0 = 4
            if (r2 != r0) goto L36
            boolean r2 = r3.b
            if (r2 == 0) goto L36
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_CAPTURE_INTENT
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r3, r0)
            java.util.Map r2 = j$.util.DesugarCollections.unmodifiableMap(r2)
            goto L38
        L36:
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
        L38:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            android.hardware.camera2.CaptureRequest$Key r0 = (android.hardware.camera2.CaptureRequest.Key) r0
            java.lang.Object r3 = r3.getValue()
            r1.set(r0, r3)
            goto L40
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apk.e(android.hardware.camera2.CaptureRequest$Builder, int, axs):void");
    }
}
