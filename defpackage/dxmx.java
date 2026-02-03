package defpackage;

import android.widget.ImageView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmx implements dxmt {
    public static final eksp a = eksp.c("GnpSdk");
    static final rtj b = (rtj) new rtj().D(rha.b);
    private final eosc c;

    public dxmx(eosc eoscVar) {
        this.c = eoscVar;
    }

    private static final int c(int i) {
        if (i == -1) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    private static final rlh d() {
        return new rlf().a();
    }

    @Override // defpackage.dxmt
    public final ListenableFuture a(dxxe dxxeVar, dxvd dxvdVar) throws drji, evop {
        String strH = dxvdVar.h();
        rlc rlcVar = new rlc(strH, d());
        ((eksl) a.o().h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl", "saveMedia", 94, "GlideMediaFetcherImpl.java")).t("Saving media from url: %s", strH);
        dxvc dxvcVar = (dxvc) dxvdVar;
        return eooq.f(rdo.a((rbr) ((rbr) dxxeVar.a.b().k(rlcVar).Q(c(dxvcVar.a), c(dxvcVar.b))).E()), new ejvr() { // from class: dxmv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = dxmx.a;
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.dxmt
    public final void b(dxxe dxxeVar, ImageView imageView, dxvd dxvdVar) throws drji, evop {
        String strH = dxvdVar.h();
        rlc rlcVar = new rlc(strH, d());
        ((eksl) a.o().h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl", "loadMediaToView", 139, "GlideMediaFetcherImpl.java")).t("Loading media to view from url: %s", strH);
        dxvc dxvcVar = (dxvc) dxvdVar;
        int i = dxvcVar.b;
        int iC = c(dxvcVar.a);
        int iC2 = c(i);
        try {
            imageView.setVisibility(0);
            ((rbr) ((rbr) dxxeVar.a.g().h(rlcVar).q(b).f(new dxmw(imageView)).Q(iC, iC2)).E()).v(imageView);
        } catch (RuntimeException e) {
            imageView.setVisibility(8);
            ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl", "loadMediaToView", (char) 180, "GlideMediaFetcherImpl.java")).q("Failed to load image");
        }
    }
}
