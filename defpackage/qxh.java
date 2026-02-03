package defpackage;

import android.graphics.RectF;
import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxh implements Runnable {
    final /* synthetic */ PhotoView a;

    public qxh(PhotoView photoView) {
        this.a = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PhotoView photoView = this.a;
        float fA = photoView.a();
        if (fA > 0.0f) {
            int width = photoView.getWidth() / 2;
            int height = photoView.getHeight() / 2;
            RectF rectF = photoView.c;
            float f = 1.0f / (1.0f - (0.0f / fA));
            float f2 = 1.0f - f;
            float f3 = rectF.left * f2;
            float f4 = rectF.top * f2;
            float width2 = photoView.getWidth();
            float f5 = rectF.right * f2;
            float height2 = photoView.getHeight();
            float f6 = rectF.bottom * f2;
            float f7 = (width2 * f) + f5;
            float fMin = f7 > f3 ? (f7 + f3) / 2.0f : Math.min(Math.max(f7, width), f3);
            float f8 = (height2 * f) + f6;
            float fMin2 = f8 > f4 ? (f8 + f4) / 2.0f : Math.min(Math.max(f8, height), f4);
            qxi qxiVar = photoView.b;
            if (qxiVar.i) {
                return;
            }
            qxiVar.b = fMin;
            qxiVar.c = fMin2;
            qxiVar.e = 0.0f;
            qxiVar.h = System.currentTimeMillis();
            qxiVar.f = fA;
            float f9 = qxiVar.e;
            qxiVar.d = fA < 0.0f;
            qxiVar.g = (-fA) / 200.0f;
            qxiVar.i = true;
            qxiVar.j = false;
            qxiVar.a.post(qxiVar);
        }
    }
}
