package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpsc implements mce {
    final /* synthetic */ dpsf a;
    final /* synthetic */ ExoPlayer b;

    public dpsc(dpsf dpsfVar, ExoPlayer exoPlayer) {
        this.a = dpsfVar;
        this.b = exoPlayer;
    }

    @Override // defpackage.mce
    public final void g(boolean z) {
        ekrd ekrdVar = (ekrd) dpsf.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayerIfNecessary$1$1", "onIsPlayingChanged", 84, "HugoVideoPlayer.kt");
        Boolean boolValueOf = Boolean.valueOf(z);
        ekrdVar.t("HugoVideoPlayer::onIsPlayingChanged: %b", boolValueOf);
        dpsf dpsfVar = this.a;
        dpsfVar.c.f(boolValueOf);
        if (!z) {
            dpsfVar.f();
            return;
        }
        fdlr fdlrVar = dpsfVar.g;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        dpsfVar.g = fdil.d(dpsfVar.b, null, null, new dpse(dpsfVar, null), 3);
    }

    @Override // defpackage.mce
    public final void n(int i) {
        ((ekrd) dpsf.a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayerIfNecessary$1$1", "onPlaybackStateChanged", 95, "HugoVideoPlayer.kt")).r("HugoVideoPlayer::onPlaybackStateChanged: %d", i);
        if (i == 3) {
            dpsf dpsfVar = this.a;
            dpsfVar.d = this.b.z();
            dpsfVar.f = true;
        }
    }

    @Override // defpackage.mce
    public final void p(mbz mbzVar) {
        mbzVar.getClass();
        ((ekrd) dpsf.a.j().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayerIfNecessary$1$1", "onPlayerError", 103, "HugoVideoPlayer.kt")).t("HugoVideoPlayer::onPlayerError: %s", mbzVar);
    }

    @Override // defpackage.mce
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void A(mcq mcqVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void B(mcs mcsVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void C(mde mdeVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void D(mcd mcdVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void a(mac macVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void b(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void c(mcc mccVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void d(mdw mdwVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void e(List list) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void f(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void h(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void j(mbr mbrVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void k(mbt mbtVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void m(mca mcaVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void o(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void q(mbz mbzVar) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void s(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void v(int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void w(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void x(boolean z) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void i(mbo mboVar, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void l(boolean z, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void r(boolean z, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void y(int i, int i2) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void z(mcl mclVar, int i) {
    }

    @Override // defpackage.mce
    public final /* synthetic */ void t(mcf mcfVar, mcf mcfVar2, int i) {
    }
}
