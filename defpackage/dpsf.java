package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpsf implements dptt {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer");
    public final fdjx b;
    public long d;
    public boolean f;
    public fdlr g;
    public ExoPlayer h;
    private final doju i;
    private final dpuk j;
    public final fduf c = fdvf.a(false);
    public final fduf e = fdvf.a(0L);

    public dpsf(dpuk dpukVar, fdjx fdjxVar, doju dojuVar) {
        this.j = dpukVar;
        this.b = fdjxVar;
        this.i = dojuVar;
        this.d = dojuVar.g.toMillis();
    }

    public final void a() {
        if (this.h != null) {
            return;
        }
        dpuk dpukVar = this.j;
        final mpz mpzVar = new mpz(dpukVar.a);
        final fdap fdapVar = new fdap() { // from class: dpui
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpuh dpuhVar = (dpuh) obj;
                dpuhVar.getClass();
                mpg mpgVar = new mpg();
                mpgVar.b(dpuhVar.a, dpuhVar.b, dpuhVar.c, dpuhVar.d);
                mpzVar.b(mpgVar.a());
                return fctx.a;
            }
        };
        dpukVar.b.ifPresent(new Consumer() { // from class: dpuj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ExoPlayer exoPlayerA = mpzVar.a();
        exoPlayerA.M(new dpsc(this, exoPlayerA));
        this.h = exoPlayerA;
    }

    @Override // defpackage.dptt
    public final void b() {
        if (this.f) {
            ((ekrd) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "pause", 121, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::pause media player pausing");
            ExoPlayer exoPlayer = this.h;
            if (exoPlayer != null) {
                exoPlayer.d();
            }
        }
    }

    @Override // defpackage.dptt
    public final void c() throws CloneNotSupportedException {
        a();
        if (!this.f) {
            ((ekrd) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 62, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play preparing media player");
            d(true);
            return;
        }
        ExoPlayer exoPlayer = this.h;
        exoPlayer.getClass();
        if (exoPlayer.t() == 4) {
            ((ekrd) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 66, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play seeking to the beginning");
            mcg mcgVar = this.h;
            mcgVar.getClass();
            ((mae) mcgVar).s(0L);
        }
        ((ekrd) a.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "play", 69, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::play playing media player");
        ExoPlayer exoPlayer2 = this.h;
        exoPlayer2.getClass();
        exoPlayer2.e();
    }

    public final void d(boolean z) throws CloneNotSupportedException {
        Uri uri = Uri.parse(this.i.b);
        ExoPlayer exoPlayer = this.h;
        if (exoPlayer != null) {
            ekgb ekgbVarR = ekgb.r(mbo.a(uri));
            mrn mrnVar = (mrn) exoPlayer;
            mrnVar.ap();
            mrnVar.aq(mrnVar.ae(ekgbVarR), 0L);
        }
        ExoPlayer exoPlayer2 = this.h;
        if (exoPlayer2 != null) {
            exoPlayer2.O();
        }
        ExoPlayer exoPlayer3 = this.h;
        if (exoPlayer3 != null) {
            exoPlayer3.Q(z);
        }
    }

    @Override // defpackage.dptt
    public final void e() {
        ekrg ekrgVar = a;
        ((ekrd) ekrgVar.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "release", 140, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::release releasing");
        f();
        ExoPlayer exoPlayer = this.h;
        if (exoPlayer != null) {
            exoPlayer.aa();
        }
        this.f = false;
        this.c.f(false);
        this.h = null;
        this.e.f(0L);
        ((ekrd) ekrgVar.h().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer", "release", 149, "HugoVideoPlayer.kt")).q("HugoVideoPlayer::release released");
    }

    public final void f() {
        fdlr fdlrVar = this.g;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.g = null;
    }
}
