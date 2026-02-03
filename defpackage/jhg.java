package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jhg extends fdbo implements fdae {
    public jhg(Object obj) {
        super(0, obj, jjd.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ContentCaptureSession contentCaptureSession;
        int i = Build.VERSION.SDK_INT;
        View view = (View) this.g;
        if (i >= 30) {
            view.setImportantForContentCapture(1);
        }
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSession = view.getContentCaptureSession()) == null) {
            return null;
        }
        return new jqf(contentCaptureSession, view);
    }
}
