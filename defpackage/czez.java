package defpackage;

import android.animation.TimeAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.SwitchImageView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import defpackage.eyhq;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czez extends cziv implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    public final lvn a = new lvn(this);
    private final eino ag = new eino();
    private boolean ah;
    private czgf d;
    private Context e;

    @Deprecated
    public czez() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czgf.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final czgf czgfVarH = H();
            czgfVarH.v = layoutInflater.inflate(R.layout.camera_fragment, viewGroup, false);
            czgfVarH.w = (ConstraintLayout) czgfVarH.v.findViewById(R.id.camera_fragment);
            czgfVarH.x = (CameraTextureView) czgfVarH.v.findViewById(R.id.camera_texture_view);
            czgfVarH.x.i = new czft(czgfVarH);
            czgfVarH.A = (SwitchImageView) czgfVarH.v.findViewById(R.id.back_close_button);
            czgfVarH.y = czgfVarH.v.findViewById(R.id.switch_camera);
            czgfVarH.z = (CarouselRecyclerView) czgfVarH.v.findViewById(R.id.mode_recycler);
            czgfVarH.B = (SwitchImageView) czgfVarH.v.findViewById(R.id.camera_flash_button);
            czgfVarH.D = czgfVarH.v.findViewById(R.id.shutter_button);
            czgfVarH.E = (ImageView) czgfVarH.v.findViewById(R.id.shutter_button_fill);
            czgfVarH.F = (TextView) czgfVarH.v.findViewById(R.id.recording_duration_display_text);
            czgfVarH.C = (FrameLayout) czgfVarH.v.findViewById(R.id.confirmation_container);
            czgfVarH.G = czgfVarH.v.findViewById(R.id.stop_recording_button);
            ImageView imageView = (ImageView) czgfVarH.v.findViewById(R.id.shutter_button_ring);
            ImageView imageView2 = (ImageView) czgfVarH.v.findViewById(R.id.video_progress_ring);
            RenderOverlay renderOverlay = (RenderOverlay) czgfVarH.v.findViewById(R.id.focus_visual);
            czgfVarH.s = new czir(new Consumer() { // from class: czfu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) throws Resources.NotFoundException {
                    Integer num = (Integer) obj;
                    int iIntValue = 360 - num.intValue();
                    lud ludVar = new lud();
                    czgf czgfVar = czgfVarH;
                    for (View view : czgfVar.M) {
                        view.setPivotX(view.getWidth() / 2);
                        view.setPivotY(view.getHeight() / 2);
                        view.animate().setInterpolator(ludVar).rotation(iIntValue % 360);
                    }
                    czgfVar.H.a(num.intValue());
                    boolean z = czgfVar.P % 180 == 0;
                    Boolean bool = czgfVar.t;
                    if (bool == null || bool.booleanValue() != z) {
                        czgfVar.t = Boolean.valueOf(z);
                        czgfVar.o.a(z ? czgfVar.B : czgfVar.A, czgfVar.g.u());
                        SwitchImageView switchImageView = czgfVar.A;
                        int iF = R.drawable.back_arrow_shadow;
                        switchImageView.e(z ? R.drawable.back_arrow_shadow : cziu.f(czgfVar.o.a));
                        SwitchImageView switchImageView2 = czgfVar.B;
                        if (z) {
                            iF = cziu.f(czgfVar.o.a);
                        }
                        switchImageView2.e(iF);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            czez czezVar = czgfVarH.T;
            if (czezVar.G() != null) {
                Window window = czezVar.G().getWindow();
                View decorView = window.getDecorView();
                window.setFlags(512, 512);
                decorView.setSystemUiVisibility(1025);
                TypedValue typedValue = new TypedValue();
                czezVar.G().getTheme().resolveAttribute(R.attr.backgroundColor, typedValue, true);
                window.setNavigationBarColor(typedValue.data);
            }
            czgfVarH.A.a(R.drawable.back_arrow_shadow, new View.OnClickListener() { // from class: czfv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czgfVarH.e();
                }
            }, czezVar.Y(R.string.action_back));
            czgfVarH.B.b(R.drawable.back_arrow_shadow, new View.OnClickListener() { // from class: czfw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czgfVarH.e();
                }
            }, czezVar.Y(R.string.action_back));
            czgfVarH.q = ColorStateList.valueOf(czezVar.z().getColor(R.color.camera_shutter_photo_fill_tint));
            czgfVarH.r = ColorStateList.valueOf(czezVar.z().getColor(R.color.camera_shutter_video_fill_tint));
            imageView.setOutlineProvider(new dakk());
            imageView.setClipToOutline(true);
            new cvjg(czgfVarH.D, czgfVarH.i, czgfVarH.z);
            czgfVarH.y.setOnClickListener(new View.OnClickListener() { // from class: czfx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final czgf czgfVar = czgfVarH;
                    if (!czgfVar.u) {
                        czgfVar.y.animate().rotationBy(-180.0f).setInterpolator(new lud()).withStartAction(new Runnable() { // from class: czfr
                            @Override // java.lang.Runnable
                            public final void run() {
                                czgfVar.u = true;
                            }
                        }).withEndAction(new Runnable() { // from class: czfs
                            @Override // java.lang.Runnable
                            public final void run() {
                                czgfVar.u = false;
                            }
                        });
                    }
                    czib czibVar = czgfVar.g;
                    czibVar.p();
                    boolean zU = czibVar.u();
                    cziu cziuVar = czgfVar.o;
                    cziuVar.b = zU;
                    cziuVar.d();
                    View view2 = czgfVar.y;
                    czez czezVar2 = czgfVar.T;
                    view2.setContentDescription(czezVar2.B().getString(zU ? R.string.camera_back_switch_button : R.string.camera_front_switch_button));
                    cpga.e(czezVar2.B().getString(true != zU ? R.string.camera_back : R.string.camera_front), czgfVar.y);
                }
            });
            czgfVarH.S = new czip(czezVar.B().getDimensionPixelSize(R.dimen.camera_video_progress_drawable_stroke_width));
            imageView2.setImageDrawable(czgfVarH.S);
            czgfVarH.I = new TimeAnimator();
            czgfVarH.I.setTimeListener(new TimeAnimator.TimeListener() { // from class: czfy
                @Override // android.animation.TimeAnimator.TimeListener
                public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
                    czgf czgfVar = czgfVarH;
                    float f = j / czgfVar.b;
                    czgfVar.S.setLevel((int) (10000.0f * f));
                    czgfVar.F.setText(cqbj.a(czgfVar.T.z(), j));
                    if (f >= 1.0d) {
                        czgfVar.c();
                    }
                }
            });
            czgfVarH.G.setOnClickListener(new View.OnClickListener() { // from class: czfb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czgf czgfVar = czgfVarH;
                    if (czgfVar.i()) {
                        czgfVar.c();
                    }
                }
            });
            SwitchImageView switchImageView = czgfVarH.B;
            czib czibVar = czgfVarH.g;
            czibVar.getClass();
            czfc czfcVar = new czfc(czibVar);
            boolean zU = czibVar.u();
            cziu cziuVar = new cziu(czfcVar);
            cziuVar.a(switchImageView, zU);
            cziuVar.c();
            czgfVarH.o = cziuVar;
            czibVar.n(renderOverlay);
            czibVar.l(false);
            czjv czjvVar = new czjv(czgfVarH.z, czgfVarH.ad);
            CarouselRecyclerView carouselRecyclerView = ((czkx) czjvVar).a;
            carouselRecyclerView.y(new czku(czjvVar));
            carouselRecyclerView.x(new czkv(czjvVar));
            czgfVarH.n = czjvVar;
            czjv czjvVar2 = czgfVarH.n;
            czgd czgdVar = czgd.PHOTO;
            czjvVar2.F(new czjw(czgdVar));
            czgfVarH.n.F(new czjw(czgd.VIDEO));
            czgfVarH.z.al(czgfVarH.n);
            czgfVarH.n.p();
            czgfVarH.k(czgdVar, 0);
            View view = czgfVarH.v;
            if (view == null) {
                czgj.a(this, H());
            }
            eidc.q();
            return view;
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

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final czgf H() {
        czgf czgfVar = this.d;
        if (czgfVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czgfVar;
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

    @Override // defpackage.cziv, defpackage.ecdo, defpackage.ea
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
            czgf czgfVarH = H();
            czgfVarH.k.disable();
            if (czgfVarH.i()) {
                czgfVarH.c();
            }
            czgfVarH.p = false;
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
            czgf czgfVarH = H();
            if (czgfVarH.k == null) {
                czgfVarH.k = new czgb(czgfVarH, czgfVarH.T.z());
            }
            czgfVarH.k.enable();
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
            einc.b(this).b = view;
            H();
            czgj.a(this, H());
            bn(view, bundle);
            final czgf czgfVarH = H();
            view.post(new Runnable() { // from class: czfp
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    czgf czgfVar = czgfVarH;
                    czez czezVar = czgfVar.T;
                    eg egVarG = czezVar.G();
                    View view2 = czgfVar.v;
                    czgfVar.H = new czjz(egVarG, (ViewGroup) view2, (Guideline) view2.findViewById(R.id.screen_top_guideline), (Guideline) czgfVar.v.findViewById(R.id.screen_bottom_guideline), czgfVar.U.a);
                    czkc czkcVar = czgfVar.H;
                    czkcVar.c = 0.5625f;
                    czkcVar.c();
                    czgfVar.J = new aw();
                    czgfVar.J.e(czgfVar.w);
                    czgfVar.K = new aw();
                    czgfVar.K.e(czgfVar.w);
                    czgfVar.L = new aw();
                    czgfVar.Q = TransitionInflater.from(czezVar.z()).inflateTransition(R.transition.camera_mode_filters_in);
                    czgfVar.R = TransitionInflater.from(czezVar.z()).inflateTransition(R.transition.camera_mode_filters_out);
                    Transition transition = czgfVar.Q;
                    czge czgeVar = czgfVar.h;
                    transition.addListener(czgeVar);
                    czgfVar.R.addListener(czgeVar);
                    aw awVar = czgfVar.K;
                    aw awVar2 = new aw();
                    HashMap map = awVar2.a;
                    map.clear();
                    HashMap map2 = awVar.a;
                    for (Integer num : map2.keySet()) {
                        map.put(num, ((av) map2.get(num)).clone());
                    }
                    awVar2.l(R.id.mode_recycler, 4);
                    awVar2.l(R.id.switch_camera, 4);
                    awVar2.l(R.id.shutter_button_fill, 4);
                    awVar2.l(R.id.shutter_button_ring, 4);
                    awVar2.l(R.id.recording_duration_display_background, 0);
                    awVar2.l(R.id.recording_duration_display_text, 0);
                    awVar2.l(R.id.recording_duration_display_icon, 0);
                    awVar2.l(R.id.video_progress_container, 0);
                    czgfVar.L = awVar2;
                    czgfVar.K.i(R.id.shutter_button_video_dot, 1.0f);
                    czgfVar.K.j(R.id.shutter_button_video_dot, 1.0f);
                    List list = czgfVar.M;
                    list.add(czgfVar.y);
                    list.add(czgfVar.A);
                    list.add(czgfVar.B);
                    czgfVar.x.e();
                }
            });
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

    @Override // defpackage.cziv
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

    @Override // defpackage.cziv, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragment", 96, czez.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, czez.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof czez)) {
                                throw new IllegalStateException(a.M(eaVar, czgf.class));
                            }
                            czez czezVar = (czez) eaVar;
                            ahkn ahknVar = ((ahib) objBb).a;
                            eosc eoscVar = (eosc) ahknVar.y.b();
                            ahnh ahnhVar = ahknVar.a;
                            aiqd aiqdVar = new aiqd(ahnhVar.zs, new aiqn(), (Executor) ahknVar.p.b());
                            aiqh aiqhVar = new aiqh(ahnhVar.zs, new aiqn(), (Executor) ahknVar.p.b());
                            aiqk aiqkVar = new aiqk(ahnhVar.zs, new aiqn(), (Executor) ahknVar.p.b());
                            ajfo ajfoVar = (ajfo) ahnhVar.vh.b();
                            ahng ahngVar = ahknVar.b;
                            czib czibVar = (czib) ahngVar.oN.b();
                            ahhk ahhkVar = ((ahib) objBb).c;
                            eyik eyikVar = ahhkVar.h;
                            tlt tltVar = (tlt) ahhkVar.n.b();
                            eosc eoscVar2 = (eosc) ahknVar.pP.b();
                            dakl daklVar = (dakl) ahnhVar.BK.b();
                            this.d = new czgf(czezVar, eoscVar, aiqdVar, aiqhVar, aiqkVar, ajfoVar, czibVar, eyikVar, tltVar, eoscVar2, daklVar, ahnhVar.pQ);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.a));
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
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            czgf czgfVarH = H();
            czgfVarH.g.n(null);
            dqyy dqyyVar = czgfVarH.x.g;
            if (dqyyVar != null) {
                euwf euwfVar = dqyyVar.d;
                if (euwfVar != null) {
                    euwfVar.a(null);
                }
                dqzc dqzcVar = dqyyVar.c;
                if (dqzcVar != null) {
                    dqzcVar.b();
                    dqyyVar.c = null;
                }
                euxq euxqVar = dqyyVar.b;
                if (euxqVar != null) {
                    euxqVar.d();
                }
                dqyyVar.b = null;
                euwf euwfVar2 = dqyyVar.d;
                if (euwfVar2 != null) {
                    euwe euweVar = euwfVar2.a;
                    if (euweVar != null) {
                        euweVar.l();
                        try {
                            euwfVar2.a.join();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
                            throw new RuntimeException(e);
                        }
                    }
                    dqyyVar.d = null;
                }
            }
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

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Resources.NotFoundException {
        super.onConfigurationChanged(configuration);
        czgf czgfVarH = H();
        final czib czibVar = czgfVarH.g;
        if (czibVar.o != czibVar.a()) {
            czibVar.f(new Consumer() { // from class: czhe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    czib czibVar2 = czibVar;
                    czibVar2.t((Camera) obj, czibVar2.n);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        czkc czkcVar = czgfVarH.H;
        if (czkcVar != null) {
            czkcVar.c();
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

    @Override // defpackage.cziv, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
