package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbj extends egxm {
    final /* synthetic */ egzh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czbj(eigp eigpVar, Executor executor, egzh egzhVar) {
        super(eigpVar, "GalleryAsyncContentObserver", executor);
        this.a = egzhVar;
    }

    @Override // defpackage.egxm
    public final void a(Uri uri) {
        this.a.a(eork.i(null), "gallery_content_key");
    }
}
