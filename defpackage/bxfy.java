package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxfy implements bxgk {
    final /* synthetic */ bxfz a;
    private final bxgk b;

    public bxfy(bxfz bxfzVar, bxgk bxgkVar) {
        this.a = bxfzVar;
        this.b = bxgkVar;
        bxfzVar.p();
    }

    @Override // defpackage.bxgk
    public final int a() {
        return 0;
    }

    @Override // defpackage.bxgk
    public final int b() {
        return 1;
    }

    @Override // defpackage.bxgk
    public final bxgi c() {
        return this.b.c();
    }

    @Override // defpackage.bxgk
    public final bxgl d() {
        return this.b.d();
    }

    @Override // defpackage.bxgk
    public final /* bridge */ /* synthetic */ bxgz e(List list) {
        bxgz bxgcVar;
        int i;
        int i2;
        cqaz.h();
        bxfz bxfzVar = this.a;
        bxfzVar.o();
        Bitmap bitmap = null;
        try {
            try {
                Bitmap bitmapD = bxfzVar.d();
                bitmapD.getClass();
                cqaz.f(bitmapD.hasAlpha());
                int width = bitmapD.getWidth();
                int height = bitmapD.getHeight();
                if (width > 0 && height > 0) {
                    bxgf bxgfVar = ((bxge) this.b).b;
                    float f = width;
                    float f2 = height;
                    float fMax = Math.max(bxgfVar.b / f, bxgfVar.c / f2);
                    float f3 = f * fMax;
                    float f4 = f2 * fMax;
                    if (fMax < 1.0f && (i = (int) f3) > 0 && (i2 = (int) f4) > 0 && i != width && i2 != height) {
                        bitmapD = Bitmap.createScaledBitmap(bitmapD, i, i2, false);
                        bitmap = bitmapD;
                    }
                }
                cqsu cqsuVar = bxfzVar.c;
                byte[] bArrM = cqsuVar.m(bitmapD, 50);
                String strF = f();
                bArrM.getClass();
                bxgcVar = new bxgc(strF, bArrM, bxfzVar.d, bxfzVar.i, cqsuVar);
            } catch (Exception e) {
                bxfz.a.o("Error compressing bitmap.", e);
                bxgcVar = this.a;
            }
            if (bitmap != null && bitmap != this.a.d()) {
                bitmap.recycle();
            }
            bxfz bxfzVar2 = this.a;
            bxfzVar2.r();
            bxfzVar2.q();
            return bxgcVar;
        } catch (Throwable th) {
            if (bitmap != null && bitmap != this.a.d()) {
                bitmap.recycle();
            }
            bxfz bxfzVar3 = this.a;
            bxfzVar3.r();
            bxfzVar3.q();
            throw th;
        }
    }

    @Override // defpackage.bxgk
    public final String f() {
        return this.a.e;
    }
}
