package defpackage;

import androidx.camera.view.PreviewView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cii {
    public final /* synthetic */ PreviewView a;

    public /* synthetic */ cii(PreviewView previewView) {
        this.a = previewView;
    }

    public final void a(cjt cjtVar) {
        chu chuVar;
        float f;
        if (!(cjtVar instanceof cjs) || (chuVar = this.a.g) == null) {
            return;
        }
        float f2 = ((cjs) cjtVar).a;
        if (!chuVar.r()) {
            bbs.f("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!chuVar.r) {
            bbs.a("CameraController", "Pinch to zoom disabled.");
            return;
        }
        bbs.a("CameraController", "Pinch to zoom with scale: " + f2);
        bdv bdvVar = (bdv) chuVar.f().a();
        if (bdvVar == null) {
            return;
        }
        float fC = bdvVar.c();
        if (f2 > 1.0f) {
            float f3 = f2 - 1.0f;
            f = f3 + f3 + 1.0f;
        } else {
            float f4 = 1.0f - f2;
            f = 1.0f - (f4 + f4);
        }
        chuVar.g(Math.min(Math.max(fC * f, bdvVar.b()), bdvVar.a()));
    }
}
