package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxdo {
    private static final dxdk f = new dxdk() { // from class: dxdl
        @Override // defpackage.dxdk
        public final void a() {
        }
    };
    public final OverlayView a;
    public final dwxl b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Runnable d = new dxdn(this);
    public dxdk e = f;

    public dxdo(OverlayView overlayView, dwxl dwxlVar) {
        this.b = dwxlVar;
        this.a = overlayView;
    }

    public final void a() {
        this.a.setVisibility(8);
        this.e.a();
    }
}
