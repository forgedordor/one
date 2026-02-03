package com.google.android.apps.messaging.ui.ditto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.WindowManager;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cynp;
import defpackage.dcjp;
import defpackage.dekh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CameraSourcePreview extends ViewGroup {
    public static final cczi a = cdag.e(cdag.b, "start_camera_max_retry", 3);
    private static final String g = "CameraSourcePreview";
    public dekh b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    private final SurfaceView h;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.c = false;
        this.e = false;
        SurfaceView surfaceView = new SurfaceView(context);
        this.h = surfaceView;
        surfaceView.getHolder().addCallback(new cynp(this));
        addView(surfaceView);
    }

    private final boolean b() {
        return ((360 - (((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation() * 90)) % 360) % 180 == 0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:162|14|155|2c|110|111|164|112|(0)(0)|(0)|118|(0)(0)|122) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ce, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02eb, code lost:
    
        android.util.Log.e(com.google.android.apps.messaging.ui.ditto.CameraSourcePreview.g, "Could not start the camera source.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f7, code lost:
    
        android.util.Log.e(com.google.android.apps.messaging.ui.ditto.CameraSourcePreview.g, "Could not start camera source.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02fe, code lost:
    
        r3 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0304, code lost:
    
        android.util.Log.e(com.google.android.apps.messaging.ui.ditto.CameraSourcePreview.g, "Do not have permission to start the camera", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r18 = r3;
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0227 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:39:0x0099, B:41:0x00aa, B:47:0x00c4, B:49:0x00d1, B:50:0x00dc, B:52:0x00e2, B:53:0x00f1, B:54:0x00fa, B:56:0x0100, B:63:0x0123, B:64:0x0139, B:66:0x013f, B:73:0x0160, B:75:0x0169, B:76:0x0170, B:84:0x01a6, B:89:0x01bd, B:91:0x01ca, B:93:0x01dc, B:95:0x01ea, B:97:0x01f6, B:98:0x01ff, B:99:0x0213, B:101:0x0217, B:103:0x021b, B:105:0x0227, B:106:0x0231, B:107:0x0238, B:109:0x0286, B:110:0x0289, B:92:0x01d4), top: B:153:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:39:0x0099, B:41:0x00aa, B:47:0x00c4, B:49:0x00d1, B:50:0x00dc, B:52:0x00e2, B:53:0x00f1, B:54:0x00fa, B:56:0x0100, B:63:0x0123, B:64:0x0139, B:66:0x013f, B:73:0x0160, B:75:0x0169, B:76:0x0170, B:84:0x01a6, B:89:0x01bd, B:91:0x01ca, B:93:0x01dc, B:95:0x01ea, B:97:0x01f6, B:98:0x01ff, B:99:0x0213, B:101:0x0217, B:103:0x021b, B:105:0x0227, B:106:0x0231, B:107:0x0238, B:109:0x0286, B:110:0x0289, B:92:0x01d4), top: B:153:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0286 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:39:0x0099, B:41:0x00aa, B:47:0x00c4, B:49:0x00d1, B:50:0x00dc, B:52:0x00e2, B:53:0x00f1, B:54:0x00fa, B:56:0x0100, B:63:0x0123, B:64:0x0139, B:66:0x013f, B:73:0x0160, B:75:0x0169, B:76:0x0170, B:84:0x01a6, B:89:0x01bd, B:91:0x01ca, B:93:0x01dc, B:95:0x01ea, B:97:0x01f6, B:98:0x01ff, B:99:0x0213, B:101:0x0217, B:103:0x021b, B:105:0x0227, B:106:0x0231, B:107:0x0238, B:109:0x0286, B:110:0x0289, B:92:0x01d4), top: B:153:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b9 A[Catch: RuntimeException -> 0x02ca, IOException -> 0x02cc, SecurityException -> 0x02ce, TryCatch #8 {IOException -> 0x02cc, SecurityException -> 0x02ce, RuntimeException -> 0x02ca, blocks: (B:112:0x028c, B:118:0x02a6, B:120:0x02b9, B:122:0x02be, B:121:0x02bc, B:138:0x02e4), top: B:164:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bc A[Catch: RuntimeException -> 0x02ca, IOException -> 0x02cc, SecurityException -> 0x02ce, TryCatch #8 {IOException -> 0x02cc, SecurityException -> 0x02ce, RuntimeException -> 0x02ca, blocks: (B:112:0x028c, B:118:0x02a6, B:120:0x02b9, B:122:0x02be, B:121:0x02bc, B:138:0x02e4), top: B:164:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:39:0x0099, B:41:0x00aa, B:47:0x00c4, B:49:0x00d1, B:50:0x00dc, B:52:0x00e2, B:53:0x00f1, B:54:0x00fa, B:56:0x0100, B:63:0x0123, B:64:0x0139, B:66:0x013f, B:73:0x0160, B:75:0x0169, B:76:0x0170, B:84:0x01a6, B:89:0x01bd, B:91:0x01ca, B:93:0x01dc, B:95:0x01ea, B:97:0x01f6, B:98:0x01ff, B:99:0x0213, B:101:0x0217, B:103:0x021b, B:105:0x0227, B:106:0x0231, B:107:0x0238, B:109:0x0286, B:110:0x0289, B:92:0x01d4), top: B:153:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d4 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:39:0x0099, B:41:0x00aa, B:47:0x00c4, B:49:0x00d1, B:50:0x00dc, B:52:0x00e2, B:53:0x00f1, B:54:0x00fa, B:56:0x0100, B:63:0x0123, B:64:0x0139, B:66:0x013f, B:73:0x0160, B:75:0x0169, B:76:0x0170, B:84:0x01a6, B:89:0x01bd, B:91:0x01ca, B:93:0x01dc, B:95:0x01ea, B:97:0x01f6, B:98:0x01ff, B:99:0x0213, B:101:0x0217, B:103:0x021b, B:105:0x0227, B:106:0x0231, B:107:0x0238, B:109:0x0286, B:110:0x0289, B:92:0x01d4), top: B:153:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:39:0x0099, B:41:0x00aa, B:47:0x00c4, B:49:0x00d1, B:50:0x00dc, B:52:0x00e2, B:53:0x00f1, B:54:0x00fa, B:56:0x0100, B:63:0x0123, B:64:0x0139, B:66:0x013f, B:73:0x0160, B:75:0x0169, B:76:0x0170, B:84:0x01a6, B:89:0x01bd, B:91:0x01ca, B:93:0x01dc, B:95:0x01ea, B:97:0x01f6, B:98:0x01ff, B:99:0x0213, B:101:0x0217, B:103:0x021b, B:105:0x0227, B:106:0x0231, B:107:0x0238, B:109:0x0286, B:110:0x0289, B:92:0x01d4), top: B:153:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.ditto.CameraSourcePreview.a():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        dcjp dcjpVar;
        dekh dekhVar = this.b;
        int i7 = 320;
        int i8 = 240;
        if (dekhVar != null && (dcjpVar = dekhVar.e) != null) {
            i7 = dcjpVar.a;
            i8 = dcjpVar.b;
        }
        boolean zB = b();
        int i9 = true != zB ? i8 : i7;
        if (true == zB) {
            i7 = i8;
        }
        int i10 = i3 - i;
        int i11 = i4 - i2;
        float f = i9;
        float f2 = i7;
        float f3 = i10 / f2;
        float f4 = i11 / f;
        if (f3 > f4) {
            int i12 = (int) (f * f3);
            int i13 = (i12 - i11) / 2;
            i11 = i12;
            i6 = i13;
            i5 = 0;
        } else {
            int i14 = (int) (f2 * f4);
            i5 = (i14 - i10) / 2;
            i10 = i14;
            i6 = 0;
        }
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            getChildAt(i15).layout(-i5, -i6, i10 - i5, i11 - i6);
        }
        a();
    }
}
