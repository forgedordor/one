package defpackage;

import com.google.android.apps.messaging.shared.ui.AsyncImageView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpah implements Runnable {
    final /* synthetic */ AsyncImageView a;

    public cpah(AsyncImageView asyncImageView) {
        this.a = asyncImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AsyncImageView asyncImageView = this.a;
        babw babwVar = asyncImageView.a;
        if (babwVar.g()) {
            asyncImageView.c = (bxgf) ((bxfw) babwVar.a()).d();
        }
        asyncImageView.e();
        asyncImageView.b();
        cpai cpaiVar = asyncImageView.d;
        if (cpaiVar != null) {
            cpaiVar.c();
            asyncImageView.d = null;
        }
    }
}
