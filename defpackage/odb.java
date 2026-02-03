package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class odb implements eora {
    final /* synthetic */ odd a;

    public odb(odd oddVar) {
        this.a = oddVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final mau mauVar;
        odd oddVar = this.a;
        final Bitmap bitmap = (Bitmap) obj;
        oddVar.d = 50;
        mat matVar = new mat();
        matVar.u = bitmap.getHeight();
        matVar.t = bitmap.getWidth();
        matVar.c("image/raw");
        matVar.C = mag.b;
        mau mauVar2 = new mau(matVar);
        if (oddVar.b && Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
            mat matVar2 = new mat(mauVar2);
            matVar2.c("image/jpeg_r");
            mauVar = new mau(matVar2);
        } else {
            mauVar = mauVar2;
        }
        try {
            oddVar.a.d(mauVar2, 2);
            oddVar.c.submit(new Runnable() { // from class: oda
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.a(bitmap, mauVar);
                }
            });
        } catch (RuntimeException e) {
            odd oddVar2 = this.a;
            oddVar2.a.b(new ocp("Asset loader error", e, 1000));
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.a.b(new ocp("Asset loader error", th, 2000));
    }
}
