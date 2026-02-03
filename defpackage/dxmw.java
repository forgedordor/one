package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxmw implements rti {
    final /* synthetic */ ImageView a;

    public dxmw(ImageView imageView) {
        this.a = imageView;
    }

    @Override // defpackage.rti
    public final boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        this.a.setVisibility(8);
        ((eksl) ((eksl) ((eksl) dxmx.a.i()).g(rhsVar)).h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl$1", "onLoadFailed", (char) 158, "GlideMediaFetcherImpl.java")).q("Failed to load image");
        return false;
    }

    @Override // defpackage.rti
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        ((eksl) dxmx.a.o().h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl$1", "onResourceReady", 169, "GlideMediaFetcherImpl.java")).t("Resource taken from %s", rebVar);
        return false;
    }
}
