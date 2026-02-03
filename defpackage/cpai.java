package defpackage;

import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpai implements bxgq {
    private WeakReference a;

    public cpai(AsyncImageView asyncImageView) {
        this.a = new WeakReference(asyncImageView);
    }

    private final AsyncImageView d() {
        WeakReference weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return (AsyncImageView) weakReference.get();
    }

    public final void c() {
        this.a = null;
    }

    @Override // defpackage.bxgq
    public final void fU(bxgk bxgkVar) {
        AsyncImageView asyncImageViewD = d();
        if (asyncImageViewD == null) {
            return;
        }
        asyncImageViewD.e();
        asyncImageViewD.f();
    }

    @Override // defpackage.bxgq
    public final /* bridge */ /* synthetic */ void fV(bxgk bxgkVar, bxgz bxgzVar, boolean z) {
        bxgh bxghVar = (bxgh) bxgzVar;
        AsyncImageView asyncImageViewD = d();
        if (asyncImageViewD == null || asyncImageViewD.b == bxghVar) {
            return;
        }
        asyncImageViewD.c(bxghVar, z);
    }
}
