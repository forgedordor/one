package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.button.MaterialButton;
import defpackage.eyhq;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmk extends czll implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    public final lvn a = new lvn(this);
    private final eino ag = new eino();
    private boolean ah;
    private czmx d;
    private Context e;

    @Deprecated
    public czmk() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czmx.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            czmx czmxVarH = H();
            czmxVarH.J.isPresent();
            czmxVarH.P = true;
            czmk czmkVar = czmxVarH.H;
            Bundle bundle2 = czmkVar.m;
            if (bundle2 != null) {
                czmxVarH.aa = bundle2.getBoolean("show_direct_send_viewer");
                czmxVarH.ab = czmkVar.m.getBoolean("show_direct_send_button");
            }
            View viewInflate = czmxVarH.aa ? layoutInflater.inflate(R.layout.direct_send_viewer_fragment, viewGroup, false) : layoutInflater.inflate(R.layout.media_viewer_fragment, viewGroup, false);
            if (viewInflate == null) {
                cznp.a(this, H());
            }
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

    @Override // defpackage.czll, defpackage.ecdo, defpackage.ea
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
    public final void ap(View view, Bundle bundle) {
        czln czlnVarH;
        this.c.k();
        try {
            einc.b(this).b = view;
            H();
            cznp.a(this, H());
            bn(view, bundle);
            final czmx czmxVarH = H();
            czmk czmkVar = czmxVarH.H;
            eg egVarG = czmkVar.G();
            Guideline guideline = (Guideline) view.findViewById(R.id.screen_start_guideline);
            guideline.getClass();
            Guideline guideline2 = (Guideline) view.findViewById(R.id.screen_top_guideline);
            guideline2.getClass();
            Guideline guideline3 = (Guideline) view.findViewById(R.id.screen_end_guideline);
            guideline3.getClass();
            Guideline guideline4 = (Guideline) view.findViewById(R.id.screen_bottom_guideline);
            guideline4.getClass();
            czmxVarH.u = new czpx(egVarG, guideline, guideline2, guideline3, guideline4);
            czmxVarH.u.a();
            czmxVarH.v = (ViewGroup) view.findViewById(R.id.media_viewer_root);
            czmxVarH.w = (TextView) view.findViewById(R.id.media_viewer_title);
            czmxVarH.x = (TextView) view.findViewById(R.id.media_viewer_subtitle);
            czmxVarH.y = (TextView) view.findViewById(R.id.primary_button);
            czmxVarH.z = (LinearLayout) view.findViewById(R.id.secondary_button_container);
            czmxVarH.A = (ImageView) view.findViewById(R.id.media_viewer_close_button);
            czmxVarH.B = (TextView) view.findViewById(R.id.media_viewer_duration_text);
            czmxVarH.C = czmxVarH.c().findViewById(R.id.media_edit_button);
            cyqq cyqqVar = czmxVarH.c;
            cyqqVar.h(czmxVarH);
            if (czmxVarH.aa) {
                czmxVarH.F = (TextView) view.findViewById(R.id.media_viewer_caption);
                czmxVarH.G = (MaterialButton) view.findViewById(R.id.primary_button);
                view.findViewById(R.id.direct_send_done_button).setOnClickListener(new View.OnClickListener() { // from class: czmw
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        czmx czmxVar = czmxVarH;
                        daoe daoeVar = czmxVar.S;
                        czmk czmkVar2 = czmxVar.H;
                        daoeVar.e(czmkVar2.z(), czmkVar2.N());
                    }
                });
            }
            Bundle bundle2 = czmkVar.m;
            if (bundle2 != null) {
                Uri uri = (Uri) bundle2.getParcelable("photos");
                String string = bundle2.getString("content_type");
                czmxVarH.M = (Uri) bundle2.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                czmxVarH.V = bundle2.getInt("media_editor_type");
                int iZ = czmx.z(bundle2);
                czmxVarH.Y = new cznq(iZ);
                Uri uri2 = czmxVarH.M;
                if (uri2 == null || uri2.equals(Uri.EMPTY) || uri != null) {
                    czmxVarH.E = new czlz(czmkVar.I(), czmxVarH.J);
                    czmxVarH.D = new cpdw(czmxVarH.v, R.id.media_viewer_pager_stub, R.id.media_viewer_pager, new cpdv() { // from class: czmu
                        @Override // defpackage.cpdv
                        public final void a(Object obj) throws Resources.NotFoundException {
                            MediaViewPager mediaViewPager = (MediaViewPager) obj;
                            czmx czmxVar = czmxVarH;
                            mediaViewPager.d(new czmy(czmxVar));
                            mediaViewPager.j(czmxVar.E);
                        }
                    });
                    czmxVarH.W = true;
                    ((MediaViewPager) czmxVarH.D.b()).setAlpha(0.0f);
                    ((MediaViewPager) czmxVarH.D.b()).animate().alpha(1.0f).setDuration(czmkVar.B().getInteger(android.R.integer.config_longAnimTime));
                    boolean z = le.z(string);
                    czmxVarH.X = czmxVarH.k.f().toEpochMilli();
                    if (uri != null) {
                        czmxVarH.d.a(new czof(czmxVarH.am, uri), czmxVarH.af);
                    } else if (bundle2.containsKey("media_viewer_items")) {
                        czmxVarH.K = bundle2.getInt("media_viewer_position");
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("media_viewer_items");
                        ehac ehacVar = czmxVarH.d;
                        cogw cogwVar = (cogw) czmxVarH.ak.a.b();
                        cogwVar.getClass();
                        parcelableArrayList.getClass();
                        ehacVar.a(new auvy(cogwVar, parcelableArrayList), czmxVarH.af);
                    } else {
                        String string2 = bundle2.getString("conversation_id");
                        String string3 = bundle2.getString("participant_look_up_id");
                        czmxVarH.K = bundle2.getInt("media_viewer_position");
                        czmxVarH.L = bundle2.getBoolean("has_star_filter");
                        czmxVarH.d.a(new czon(czmxVarH.am.e, z, barn.b(string2), string3, czmxVarH.L), czmxVarH.af);
                    }
                } else {
                    czmxVarH.Z = new cznr(0, 0, 1);
                    cznv cznvVar = new cznv();
                    cznvVar.c(czmxVarH.M);
                    cznvVar.b(string);
                    czmxVarH.N = cznvVar.a();
                    if (czmxVarH.P && le.z(string)) {
                        Uri uri3 = czmxVarH.M;
                        int i = bundle2.getInt("opening_source");
                        long j = bundle2.getLong("video_start_ts");
                        boolean z2 = bundle2.getBoolean("start_playing_video");
                        cg cgVar = new cg(czmkVar.I());
                        czmxVarH.J.get();
                        cgVar.D(R.id.media_container, czqd.k(uri3, i, 1, 0, j, z2));
                        cgVar.c();
                    } else {
                        boolean zD = czmxVarH.D(iZ, string);
                        boolean z3 = zD && bundle2.getBoolean("open_in_editor") && !czmxVarH.aa;
                        czmxVarH.Q = z3;
                        Uri uri4 = czmxVarH.M;
                        boolean z4 = czmxVarH.aa;
                        int i2 = true != z3 ? 1 : 2;
                        if (z4) {
                            ejwl.l(true);
                            czlnVarH = czln.f();
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri4);
                            bundle3.putString("content_type", string);
                            bundle3.putInt("starting_view_state", i2 - 1);
                            bundle3.putBoolean("show_direct_send_viewer", true);
                            czlnVarH.at(bundle3);
                        } else {
                            czlnVarH = czly.h(uri4, string, i2);
                        }
                        czlnVarH.a.c(new czmz(czmxVarH, czlnVarH));
                        cg cgVar2 = new cg(czmkVar.I());
                        cgVar2.D(R.id.media_container, czlnVarH);
                        cgVar2.c();
                        czmxVarH.O = czlnVarH;
                        if (zD) {
                            if (czmxVarH.Q) {
                                czmxVarH.C.setVisibility(8);
                                czmxVarH.c().setVisibility(8);
                                cyqqVar.h(czmxVarH);
                                czmkVar.Q.setSystemUiVisibility(1);
                                czmxVarH.d.a(czmxVarH.am.a(), new cznb(czmxVarH));
                                czmxVarH.q = czmxVarH.d();
                                czmxVarH.r = czmxVarH.f();
                            } else {
                                czmxVarH.r();
                            }
                        }
                    }
                    czmxVarH.Y.a();
                    czmxVarH.h(0);
                }
                czmxVarH.w.setText(czmxVarH.n.d(bundle2.getString("media_viewer_title")));
                czmxVarH.x.setText(bundle2.getString("media_viewer_subtitle"));
                czmxVarH.o = (MediaViewerButton) bundle2.getParcelable("primary_button");
                czmxVarH.p = bundle2.getParcelableArrayList("secondary_button_list");
                czmxVarH.s = (MediaViewerButton) bundle2.getParcelable("close_button");
                if (czmxVarH.aa && czmxVarH.F != null) {
                    czmxVarH.R = bundle2.getString("text_caption");
                    czmxVarH.F.setText(czmxVarH.R);
                    czmxVarH.ac = bundle2.getBoolean("use_encrypted_icon");
                }
            }
            czmxVarH.s(czmxVarH.o);
            if (czmxVarH.aa) {
                ejwl.l(true);
                MaterialButton materialButton = (MaterialButton) czmkVar.N().findViewById(R.id.primary_button_icon);
                materialButton.e(czmx.b(czmxVarH.ab, czmxVarH.ac));
                materialButton.setContentDescription(czmkVar.Y(czmx.a(czmxVarH.ab, czmxVarH.ac)));
                if (czmxVarH.ab) {
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: czmr
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            czmxVarH.m();
                        }
                    });
                } else {
                    materialButton.setOnClickListener(new View.OnClickListener() { // from class: czms
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            czmxVarH.j();
                        }
                    });
                }
            }
            czmxVarH.t(czmxVarH.p);
            if (czmxVarH.aa && czmxVarH.O != null) {
                czmxVarH.h.c(czmkVar.Q, czmkVar.a, new Runnable() { // from class: czmv
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((czln) czmxVarH.O).H().a();
                    }
                });
            }
            MediaViewerButton mediaViewerButton = czmxVarH.s;
            if (mediaViewerButton != null) {
                czmxVarH.q(czmxVarH.A, mediaViewerButton);
                czmxVarH.I.b(czmxVarH.A, czmxVarH.s.d());
            }
            if (czmxVarH.aa) {
                au auVar = (au) czmxVarH.F.getLayoutParams();
                if (auVar != null) {
                    czmxVarH.ad = auVar.bottomMargin;
                }
                czmxVarH.U.e((ConstraintLayout) czmxVarH.v);
                czmxVarH.ae = czmkVar.B().getDimensionPixelSize(R.dimen.direct_send_viewer_margin);
                cyuq cyuqVar = czmxVarH.T;
                cyuqVar.b(new danz() { // from class: czmm
                    @Override // defpackage.danz
                    public final void a() {
                        czmxVarH.k();
                    }
                });
                cyuqVar.a(new dany() { // from class: czmn
                    @Override // defpackage.dany
                    public final void a() {
                        czmxVarH.k();
                    }
                });
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.czll
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

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final czmx H() {
        czmx czmxVar = this.d;
        if (czmxVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czmxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [eieu] */
    @Override // defpackage.czll, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragment", 96, czmk.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, czmk.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof czmk)) {
                                    throw new IllegalStateException(a.M(eaVar, czmx.class));
                                }
                                czmk czmkVar = (czmk) eaVar;
                                ahkn ahknVar = ((ahib) objBb).a;
                                ahng ahngVar = ahknVar.b;
                                einm einmVar = (einm) ahngVar.nT.b();
                                ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                                egpr egprVar = (egpr) ((ahib) objBb).l.b();
                                eosc eoscVar = (eosc) ahknVar.y.b();
                                ahnh ahnhVar = ahknVar.a;
                                egxv egxvVar = (egxv) ahnhVar.ut.b();
                                egyt egytVar = (egyt) ahknVar.dj.b();
                                eyik eyikVar = ahknVar.cD;
                                cogw cogwVar = (cogw) eyikVar.b();
                                cqjk cqjkVar = (cqjk) ahknVar.no.b();
                                eosc eoscVar2 = (eosc) ahknVar.y.b();
                                bxxd bxxdVar = (bxxd) ahnhVar.MF.b();
                                ahhk ahhkVar = ((ahib) objBb).c;
                                czog czogVar = new czog(eoscVar, egxvVar, egytVar, cogwVar, cqjkVar, new czoo(eoscVar2, bxxdVar, (daig) ahhkVar.bn.b(), ahnhVar.qi, (cogw) eyikVar.b(), (ajsn) ahnhVar.Qp.b()));
                                avmp avmpVar = (avmp) ahnhVar.Jm.b();
                                eyik eyikVar2 = ahhkVar.h;
                                srw srwVar = (srw) ahnhVar.aaX.b();
                                this.d = new czmx(czmkVar, einmVar, ehacVar, egprVar, czogVar, avmpVar, eyikVar2, srwVar, (cqei) ahngVar.kI.b(), new aiwg(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), new aivz(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), ahnhVar.an(), new aivm(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), new aivs(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), new aivp(ahnhVar.zs, new aiwc(), (Executor) ahknVar.p.b()), ahnhVar.c, (cogw) eyikVar.b(), (tlt) ahhkVar.n.b(), Optional.of(new Object() { // from class: czpw
                                }), Optional.of(new czqe()), ahnhVar.qN, new auvz(ahngVar.a.cD), (cssf) ahnhVar.uo.b(), (daoe) ahngVar.hX.b(), (cyuq) ((ahib) objBb).bB.b(), new czoi((eosc) ahknVar.y.b(), (ehrb) ahknVar.hD.b(), (Context) ahknVar.t.b()), (bxle) ahknVar.eJ.b(), ahnhVar.adE);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.c, this.a));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    context.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context = eieuVarG2;
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
            czmx czmxVarH = H();
            daij daijVar = czmxVarH.b;
            ea eaVar = daijVar.a;
            eaVar.G().getClass();
            daijVar.b = eaVar.G().getWindow();
            if (bundle != null) {
                daijVar.d = bundle.getBoolean("state_translucent_navigation_flag");
                daijVar.e = bundle.getBoolean("state_had_light_navigation_bar_flag");
                daijVar.c = bundle.getInt("state_previous_navigation_bar_color");
            } else {
                boolean z = true;
                daijVar.d = (daijVar.b.getAttributes().flags & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) == 134217728;
                daijVar.c = daijVar.b.getNavigationBarColor();
                if ((daijVar.b.getDecorView().getSystemUiVisibility() & 16) == 0) {
                    z = false;
                }
                daijVar.e = z;
            }
            egpr egprVar = czmxVarH.e;
            egprVar.j(czmxVarH.ai);
            egprVar.j(czmxVarH.ah);
            egprVar.j(czmxVarH.ag);
            egprVar.j(czmxVarH.aj);
            if (bundle != null) {
                cyqq cyqqVar = czmxVarH.c;
                cyqqVar.a = (cyqr) new lxo(cyqqVar.g()).a(cyqr.class);
                cyqqVar.a.b(bundle.getBoolean("STATE_FULLSCREEN"));
                cyqqVar.a.a(bundle.getBoolean("STATE_ENABLED"));
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
            if (this.Q == null) {
                this.ag.c();
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

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
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
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bk(bundle);
            czmx czmxVarH = H();
            daij daijVar = czmxVarH.b;
            bundle.putBoolean("state_translucent_navigation_flag", daijVar.d);
            bundle.putBoolean("state_had_light_navigation_bar_flag", daijVar.e);
            bundle.putInt("state_previous_navigation_bar_color", daijVar.c);
            cyqq cyqqVar = czmxVarH.c;
            bundle.putBoolean("STATE_FULLSCREEN", cyqqVar.a.b);
            bundle.putBoolean("STATE_ENABLED", cyqqVar.a.a);
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
    public final void l() {
        this.c.k();
        try {
            bl();
            czmx czmxVarH = H();
            if (czmxVarH.Y == null) {
                czmxVarH.Y = new cznq(czmx.z(czmxVarH.H.m));
            }
            czmxVarH.Y.b = czmxVarH.k.f().toEpochMilli();
            if (!czmxVarH.W) {
                czmxVarH.i();
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0030, B:12:0x003e, B:17:0x004c, B:11:0x003a), top: B:26:0x0005 }] */
    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r12 = this;
            eics r0 = r12.c
            r0.k()
            r12.bm()     // Catch: java.lang.Throwable -> L63
            czmx r0 = r12.H()     // Catch: java.lang.Throwable -> L63
            cznq r1 = r0.Y     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L5f
            cogw r2 = r0.k     // Catch: java.lang.Throwable -> L63
            j$.time.Instant r2 = r2.f()     // Catch: java.lang.Throwable -> L63
            long r2 = r2.toEpochMilli()     // Catch: java.lang.Throwable -> L63
            r1.c = r2     // Catch: java.lang.Throwable -> L63
            aivz r1 = r0.i     // Catch: java.lang.Throwable -> L63
            emza r2 = r0.e()     // Catch: java.lang.Throwable -> L63
            cznq r3 = r0.Y     // Catch: java.lang.Throwable -> L63
            int r4 = r3.a     // Catch: java.lang.Throwable -> L63
            long r5 = r3.b     // Catch: java.lang.Throwable -> L63
            r7 = -1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L3a
            long r10 = r3.c     // Catch: java.lang.Throwable -> L63
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L3e
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L3e
        L3a:
            long r5 = r3.c     // Catch: java.lang.Throwable -> L63
            r3.b = r5     // Catch: java.lang.Throwable -> L63
        L3e:
            long r10 = r3.c     // Catch: java.lang.Throwable -> L63
            long r10 = r10 - r5
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            int r5 = (int) r10     // Catch: java.lang.Throwable -> L63
            r6 = 0
            if (r3 < 0) goto L4b
            if (r5 < 0) goto L4b
            r3 = 1
            goto L4c
        L4b:
            r3 = r6
        L4c:
            defpackage.ejwl.a(r3)     // Catch: java.lang.Throwable -> L63
            cznq r3 = r0.Y     // Catch: java.lang.Throwable -> L63
            int r3 = r3.e     // Catch: java.lang.Throwable -> L63
            aivy r7 = new aivy     // Catch: java.lang.Throwable -> L63
            r7.<init>()     // Catch: java.lang.Throwable -> L63
            r1.k(r7)     // Catch: java.lang.Throwable -> L63
            cznq r0 = r0.Y     // Catch: java.lang.Throwable -> L63
            r0.a = r6     // Catch: java.lang.Throwable -> L63
        L5f:
            defpackage.eidc.q()
            return
        L63:
            r0 = move-exception
            defpackage.eidc.q()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r1 = move-exception
            r0.addSuppressed(r1)
        L6c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czmk.m():void");
    }

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final czmx czmxVarH = H();
        czpx czpxVar = czmxVarH.u;
        if (czpxVar != null) {
            czpxVar.a();
        }
        if (czmxVarH.t != null && le.m(czmxVarH.N.h()) && (czmxVarH.O instanceof czln)) {
            cqei cqeiVar = czmxVarH.h;
            czmk czmkVar = czmxVarH.H;
            cqeiVar.c(czmkVar.Q, czmkVar.a, new Runnable() { // from class: czml
                @Override // java.lang.Runnable
                public final void run() {
                    czmx czmxVar = czmxVarH;
                    ((czpe) czmxVar.t).H().a(((czln) czmxVar.O).H().a());
                }
            });
        }
    }

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.czll, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
