package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dptg extends fcyz implements fdat {
    final /* synthetic */ SurfaceView a;
    final /* synthetic */ dptq b;
    final /* synthetic */ hox c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dptg(SurfaceView surfaceView, dptq dptqVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = surfaceView;
        this.b = dptqVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dptg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final hox hoxVar = this.c;
        final fdae fdaeVar = new fdae() { // from class: dptf
            @Override // defpackage.fdae
            public final Object invoke() {
                dpti.e(hoxVar, true);
                return fctx.a;
            }
        };
        dptq dptqVar = this.b;
        SurfaceView surfaceView = this.a;
        int width = surfaceView.getWidth();
        int height = surfaceView.getHeight();
        if (dptqVar.a == null) {
            dptqVar.b = (4294967295L & height) | (width << 32);
            dptqVar.b(Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888));
        } else {
            long j = dptqVar.b;
            if (width > ((int) (j >> 32)) || height > ((int) (j & 4294967295L))) {
                dptqVar.b = (4294967295L & height) | (width << 32);
                dptqVar.b(Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888));
            } else if (width != dptqVar.a().getWidth() || height != dptqVar.a().getHeight()) {
                dptqVar.a().reconfigure(width, height, Bitmap.Config.ARGB_8888);
            }
        }
        PixelCopy$OnPixelCopyFinishedListener pixelCopy$OnPixelCopyFinishedListener = new PixelCopy$OnPixelCopyFinishedListener() { // from class: dpsh
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    fdaeVar.invoke();
                }
            }
        };
        if (surfaceView.getHolder().getSurface().isValid()) {
            PixelCopy.request(surfaceView, (Rect) null, dptqVar.a(), pixelCopy$OnPixelCopyFinishedListener, surfaceView.getHandler());
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dptg(this.a, this.b, this.c, fcxyVar);
    }
}
