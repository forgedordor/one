package defpackage;

import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.camera.view.PreviewView;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cim implements bcg {
    final /* synthetic */ PreviewView a;

    public cim(PreviewView previewView) {
        this.a = previewView;
    }

    @Override // defpackage.bcg
    public final void a(final bdp bdpVar) {
        if (!box.d()) {
            kxj.e(this.a.getContext()).execute(new Runnable() { // from class: cij
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.j.a(bdpVar);
                }
            });
            return;
        }
        bbs.a("PreviewView", "Surface requested by Preview.");
        final biu biuVar = bdpVar.f;
        PreviewView previewView = this.a;
        previewView.i = biuVar.f();
        cis cisVar = previewView.h;
        Rect rectE = biuVar.f().e();
        cisVar.a = new Rational(rectE.width(), rectE.height());
        synchronized (cisVar) {
            cisVar.d = rectE;
        }
        PreviewView previewView2 = this.a;
        bdpVar.c(kxj.e(previewView2.getContext()), new bdo() { // from class: cik
            @Override // defpackage.bdo
            public final void a(bdn bdnVar) {
                cir cirVar;
                Objects.toString(bdnVar);
                bbs.a("PreviewView", "Preview transformation info updated. ".concat(bdnVar.toString()));
                int iA = biuVar.f().a();
                Integer.valueOf(iA).getClass();
                StringBuilder sb = new StringBuilder("Transformation info set: ");
                sb.append(bdnVar);
                sb.append(" ");
                Size size = bdpVar.c;
                sb.append(size);
                sb.append(" ");
                boolean z = true;
                boolean z2 = iA == 0;
                sb.append(z2);
                bbs.a("PreviewTransform", sb.toString());
                ayu ayuVar = (ayu) bdnVar;
                Rect rect = ayuVar.a;
                PreviewView previewView3 = this.a.a;
                cig cigVar = previewView3.c;
                cigVar.b = rect;
                cigVar.c = ayuVar.b;
                int i = ayuVar.c;
                cigVar.e = i;
                cigVar.a = size;
                cigVar.f = z2;
                cigVar.g = ayuVar.d;
                cigVar.d = ayuVar.e;
                if (i != -1 && ((cirVar = previewView3.a) == null || !(cirVar instanceof cjg))) {
                    z = false;
                }
                previewView3.d = z;
                previewView3.c();
            }
        });
        boolean z = previewView2.a instanceof cjg;
        int i = previewView2.k;
        if (!z || PreviewView.e(bdpVar, i)) {
            previewView2.a = PreviewView.e(bdpVar, previewView2.k) ? new cjp(previewView2, previewView2.c) : new cjg(previewView2, previewView2.c);
        }
        cif cifVar = new cif(biuVar.f(), previewView2.e, previewView2.a);
        previewView2.f.set(cifVar);
        biuVar.g().c(kxj.e(previewView2.getContext()), cifVar);
        previewView2.a.h(bdpVar, new cil(this, cifVar, biuVar));
        cja cjaVar = previewView2.b;
        if (previewView2.indexOfChild(cjaVar) == -1) {
            previewView2.addView(cjaVar);
        }
    }
}
