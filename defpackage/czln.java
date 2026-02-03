package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.CenterFitVideoView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czln extends czli implements ehlg, eyhx, ehlc, ehnw, eifl {
    public final lvn a = new lvn(this);
    private boolean ag;
    private czly d;
    private Context e;

    @Deprecated
    public czln() {
        ecem.c();
    }

    static czln f() {
        czln czlnVar = new czln();
        eyhj.e(czlnVar);
        return czlnVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czly.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            H();
            View viewInflate = layoutInflater.inflate(R.layout.media_fragment, viewGroup, false);
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
        return this.a;
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

    @Override // defpackage.czli, defpackage.ecdo, defpackage.ea
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
    public final void ai() {
        eifp eifpVarB = this.c.b();
        try {
            aY();
            czly czlyVarH = H();
            czlyVarH.b = false;
            CenterFitVideoView centerFitVideoView = czlyVarH.c;
            if (centerFitVideoView != null) {
                centerFitVideoView.stopPlayback();
            }
            czlyVarH.b();
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void am() {
        this.c.k();
        try {
            be();
            H().b();
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
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            czly czlyVarH = H();
            if (czlyVarH.g.aF()) {
                czlyVarH.c();
            }
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            bn(view, bundle);
            final czly czlyVarH = H();
            czlyVarH.d = (ZoomableImageView) view.findViewById(R.id.zoomable_image_view);
            czlyVarH.d.setImportantForAccessibility(2);
            czlyVarH.c = (CenterFitVideoView) view.findViewById(R.id.media_viewer_video_preview);
            czln czlnVar = czlyVarH.g;
            Bundle bundle2 = czlnVar.m;
            if (bundle2 != null) {
                Uri uri = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                String string = bundle2.getString("content_type");
                char c = bundle2.getInt("starting_view_state", 0) != 1 ? (char) 1 : (char) 2;
                boolean z = le.z(string);
                int i = 8;
                czlyVarH.d.setVisibility(true != z ? 0 : 8);
                CenterFitVideoView centerFitVideoView = czlyVarH.c;
                if (true == z) {
                    i = 0;
                }
                centerFitVideoView.setVisibility(i);
                czlw czlwVar = czlyVarH.i;
                if (czlwVar != null) {
                    ((czmx) czlwVar).B.setVisibility(i);
                }
                czlyVarH.b = z;
                if (!z) {
                    czlyVarH.d.j = new czls(czlyVarH);
                    rbr rbrVar = (rbr) raw.d(czlnVar).f(uri).J();
                    if (((Boolean) ((cczi) czns.h.get()).e()).booleanValue() && uri != null && cqmz.s(uri)) {
                        rbrVar = (rbr) rbrVar.D(rha.c);
                    }
                    rbrVar.f(new czlv(czlyVarH)).v(czlyVarH.d);
                    if (!bundle2.getBoolean("show_direct_send_viewer", false)) {
                        czlyVarH.d.f = new View.OnClickListener() { // from class: czlt
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                czlyVarH.a.c();
                            }
                        };
                    }
                    if (c == 2) {
                        czlyVarH.d();
                    }
                } else {
                    if (uri == null) {
                        throw new IllegalStateException("MediaFragmentPeer: Video uri cannot be null.");
                    }
                    czlyVarH.c.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: czlo
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
                            czly czlyVar = czlyVarH;
                            if (czlyVar.b) {
                                mediaPlayer.seekTo(0);
                                mediaPlayer.start();
                                czlyVar.e();
                            }
                            czlyVar.f.set(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
                            czlyVar.f();
                        }
                    });
                    czlyVarH.c.setVideoURI(uri);
                    czlyVarH.c.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: czlp
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
                            mediaPlayer.seekTo(0);
                            mediaPlayer.start();
                        }
                    });
                    czlyVarH.c.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: czlq
                        @Override // android.media.MediaPlayer.OnInfoListener
                        public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
                            if (i2 != 3) {
                                return false;
                            }
                            czly czlyVar = czlyVarH;
                            czlyVar.e = 0L;
                            czlyVar.c();
                            return false;
                        }
                    });
                    czlyVarH.c.setOnClickListener(new View.OnClickListener() { // from class: czlr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            czlyVarH.a.c();
                        }
                    });
                }
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

    @Override // defpackage.czli
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
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

    @Override // defpackage.czli, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/MediaFragment", 86, czln.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/MediaFragment", 91, czln.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof czln)) {
                                throw new IllegalStateException(a.M(eaVar, czly.class));
                            }
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.d = new czly((czln) eaVar, ahknVar.a.pb);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.a));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarG.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } catch (Throwable th3) {
            try {
                eidc.q();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
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
            czly czlyVarH = H();
            czln czlnVar = czlyVarH.g;
            if (czlnVar.G() != null) {
                czlyVarH.a = (cyqr) new lxo(czlnVar.G()).a(cyqr.class);
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

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final czly czlyVarH = H();
        View view = czlyVarH.g.Q;
        view.getClass();
        dair.a(view, new Runnable() { // from class: czlu
            @Override // java.lang.Runnable
            public final void run() {
                czlyVarH.f();
            }
        });
    }

    @Override // defpackage.ehlg
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final czly H() {
        czly czlyVar = this.d;
        if (czlyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czlyVar;
    }

    @Override // defpackage.czli, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
