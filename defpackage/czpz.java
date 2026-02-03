package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.LegacyPlayerView;
import androidx.media3.ui.SubtitleView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.eyhq;
import j$.util.Objects;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpz extends czpy implements ehlg, eyhx, ehlc, ehnw, eifl {
    private czqd a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public czpz() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czqd.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View viewInflate = layoutInflater.inflate(R.layout.video_fragment, viewGroup, false);
            eidc.q();
            return viewInflate;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.czpy, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            be();
            H().f.d();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        Uri uri;
        String str;
        this.c.k();
        try {
            bn(view, bundle);
            final czqd czqdVarH = H();
            czpz czpzVar = czqdVarH.a;
            eg egVarG = czpzVar.G();
            Guideline guideline = (Guideline) view.findViewById(R.id.screen_start_guideline);
            guideline.getClass();
            Guideline guideline2 = (Guideline) view.findViewById(R.id.screen_top_guideline);
            guideline2.getClass();
            Guideline guideline3 = (Guideline) view.findViewById(R.id.screen_end_guideline);
            guideline3.getClass();
            Guideline guideline4 = (Guideline) view.findViewById(R.id.screen_bottom_guideline);
            guideline4.getClass();
            czqdVarH.g = new czpx(egVarG, guideline, guideline2, guideline3, guideline4);
            czqdVarH.g.a();
            final LegacyPlayerView legacyPlayerView = (LegacyPlayerView) view.findViewById(R.id.exo_player);
            czqc czqcVar = new czqc(czqdVarH, czqdVarH.f);
            mee.c(Looper.myLooper() == Looper.getMainLooper());
            mee.a(czqcVar.D() == Looper.getMainLooper());
            mcg mcgVar = legacyPlayerView.g;
            if (mcgVar != czqcVar) {
                if (mcgVar != null) {
                    mcgVar.P(legacyPlayerView.a);
                    if (mcgVar.m(27)) {
                        View view2 = legacyPlayerView.d;
                        if (view2 instanceof TextureView) {
                            TextureView textureView = (TextureView) view2;
                            mcg mcgVar2 = ((maw) mcgVar).a;
                            ((mrn) mcgVar2).ap();
                            if (textureView != null && textureView == ((mrn) mcgVar2).v) {
                                ((mrn) mcgVar2).af();
                            }
                        } else if (view2 instanceof SurfaceView) {
                            ((maw) mcgVar).a.N((SurfaceView) view2);
                        }
                    }
                }
                SubtitleView subtitleView = legacyPlayerView.e;
                if (subtitleView != null) {
                    subtitleView.a(null);
                }
                legacyPlayerView.g = czqcVar;
                if (legacyPlayerView.l()) {
                    ofn ofnVar = legacyPlayerView.f;
                    mee.c(Looper.myLooper() == Looper.getMainLooper());
                    mee.a(czqcVar.D() == Looper.getMainLooper());
                    mcg mcgVar3 = ofnVar.o;
                    if (mcgVar3 != czqcVar) {
                        if (mcgVar3 != null) {
                            mcgVar3.P(ofnVar.a);
                        }
                        ofnVar.o = czqcVar;
                        czqcVar.M(ofnVar.a);
                        ofnVar.f();
                    }
                }
                legacyPlayerView.f();
                legacyPlayerView.i();
                legacyPlayerView.j(true);
                if (czqcVar.m(27)) {
                    View view3 = legacyPlayerView.d;
                    if (view3 instanceof TextureView) {
                        czqcVar.V((TextureView) view3);
                    } else if (view3 instanceof SurfaceView) {
                        czqcVar.a.U((SurfaceView) view3);
                    }
                    legacyPlayerView.e();
                }
                if (subtitleView != null && czqcVar.m(28)) {
                    subtitleView.a(czqcVar.a.L().b);
                }
                czqcVar.M(legacyPlayerView.a);
                legacyPlayerView.b(false);
            }
            ofm ofmVar = new ofm() { // from class: czqa
                @Override // defpackage.ofm
                public final void E(int i) {
                    czqdVarH.h.b(i != 0);
                    LegacyPlayerView legacyPlayerView2 = legacyPlayerView;
                    legacyPlayerView2.findViewById(R.id.exo_play).setVisibility(0);
                    legacyPlayerView2.c(5000);
                }
            };
            ofn ofnVar2 = legacyPlayerView.f;
            mee.g(ofnVar2);
            ofm ofmVar2 = legacyPlayerView.i;
            if (ofmVar2 != ofmVar) {
                if (ofmVar2 != null) {
                    ofnVar2.b.remove(ofmVar2);
                }
                legacyPlayerView.i = ofmVar;
                ofnVar2.a(ofmVar);
            }
            Bundle bundle2 = czpzVar.m;
            if (bundle2 != null && (uri = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) != null) {
                Context contextZ = czpzVar.z();
                Context contextZ2 = czpzVar.z();
                String str2 = mgb.a;
                try {
                    str = contextZ2.getPackageManager().getPackageInfo(contextZ2.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException unused) {
                    str = "?";
                }
                nfu nfuVarA = new nft(new mhw(contextZ, "Messages Video Player/" + str + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.6.1"), new nnn()).b(mbo.a(uri));
                ExoPlayer exoPlayer = czqdVarH.f;
                long j = bundle2.getLong("video_start_ts", -9223372036854775807L);
                ((mrn) exoPlayer).ap();
                ((mrn) exoPlayer).aq(Collections.singletonList(nfuVarA), j);
                if (bundle2.getBoolean("start_playing_video", false)) {
                    czqcVar.Q(true);
                }
                czqdVarH.f.O();
            }
            czqdVarH.c.b(czqdVarH.m(), czqdVarH.l());
            czqdVarH.f.Z(czqdVarH);
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.czpy
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final czqd H() {
        czqd czqdVar = this.a;
        if (czqdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czqdVar;
    }

    @Override // defpackage.czpy, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/videoplayer/VideoFragment", 86, czpz.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/videoplayer/VideoFragment", 91, czpz.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof czpz)) {
                                throw new IllegalStateException(a.M(eaVar, czqd.class));
                            }
                            czpz czpzVar = (czpz) eaVar;
                            ahkn ahknVar = ((ahib) objBb).a;
                            ahnh ahnhVar = ahknVar.a;
                            this.a = new czqd(czpzVar, new aiwl(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), ahnhVar.an(), new aiwo(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), ahnhVar.pb);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            czqd czqdVarH = H();
            czpz czpzVar = czqdVarH.a;
            czqdVarH.f = new mpz(czpzVar.z()).a();
            final mac macVarA = mab.a(3, 1);
            ExoPlayer exoPlayer = czqdVarH.f;
            ((mrn) exoPlayer).ap();
            if (!((mrn) exoPlayer).z) {
                if (!Objects.equals(((mrn) exoPlayer).w, macVarA)) {
                    ((mrn) exoPlayer).w = macVarA;
                    ((mrn) exoPlayer).ai(1, 3, macVarA);
                    ((mrn) exoPlayer).h.d(20, new mez() { // from class: mqq
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                            int i = mrn.F;
                            ((mce) obj).a(macVarA);
                        }
                    });
                }
                ((mrn) exoPlayer).g.e(((mrn) exoPlayer).w, true);
                ((mrn) exoPlayer).h.c();
            }
            ExoPlayer exoPlayer2 = czqdVarH.f;
            if (exoPlayer2 != null) {
                exoPlayer2.Z(new czqb(czqdVarH));
            }
            eg egVarG = czpzVar.G();
            if (egVarG != null) {
                czqdVarH.h = (cyqr) new lxo(egVarG).a(cyqr.class);
                egVarG.getWindow().addFlags(128);
            }
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            H().f.aa();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bl();
            czqd czqdVarH = H();
            czqdVarH.i = 0L;
            czqdVarH.j = 0L;
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bm();
            czqd czqdVarH = H();
            aiwo aiwoVar = czqdVarH.d;
            final emza emzaVarM = czqdVarH.m();
            final emyn emynVarL = czqdVarH.l();
            final long seconds = TimeUnit.MILLISECONDS.toSeconds(czqdVarH.i);
            final long j = czqdVarH.j();
            aiwoVar.k(new Supplier() { // from class: aiwn
                @Override // java.util.function.Supplier
                public final Object get() {
                    emzg emzgVar = (emzg) emzh.a.createBuilder();
                    emzgVar.copyOnWrite();
                    emzh emzhVar = (emzh) emzgVar.instance;
                    emza emzaVar = emzaVarM;
                    emzaVar.getClass();
                    emzhVar.c = emzaVar;
                    emzhVar.b |= 1;
                    emzgVar.copyOnWrite();
                    emzh emzhVar2 = (emzh) emzgVar.instance;
                    emyn emynVar = emynVarL;
                    emynVar.getClass();
                    emzhVar2.d = emynVar;
                    emzhVar2.b |= 2;
                    emzgVar.copyOnWrite();
                    emzh emzhVar3 = (emzh) emzgVar.instance;
                    emzhVar3.b |= 4;
                    emzhVar3.e = (((int) seconds) / 10) * 10;
                    emzgVar.copyOnWrite();
                    emzh emzhVar4 = (emzh) emzgVar.instance;
                    emzhVar4.b |= 8;
                    emzhVar4.f = (((int) j) / 10) * 10;
                    return (emzh) emzgVar.build();
                }
            });
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        czpx czpxVar = H().g;
        if (czpxVar != null) {
            czpxVar.a();
        }
    }

    @Override // defpackage.czpy, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
