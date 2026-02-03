package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtkq extends ea {
    public dtlp a;
    private ColorStateList aA;
    private ColorStateList aB;
    private ColorStateList aC;
    private int aD;
    private int aE;
    private ColorStateList aF;
    private int aG;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private float aN;
    private int aO;
    private int aP;
    private int aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    private int aU;
    private dtln aV;
    private dtkr aW;
    private int aX;
    private boolean aY;
    dtki ag;
    public dtli ah;
    private int am;
    private int an;
    private CharSequence ao;
    private int ap;
    private int aq;
    private ColorStateList ar;
    private int as;
    private CharSequence at;
    private int au;
    private int av;
    private ColorStateList aw;
    private int ax;
    private CharSequence ay;
    private int az;
    public String b;
    public boolean c;
    public long d;
    CharSequence e;
    private int aH = 0;
    private int aI = 0;
    public int ai = 0;
    public final Runnable aj = new Runnable() { // from class: dtkn
        @Override // java.lang.Runnable
        public final void run() {
            this.a.e(5);
        }
    };
    public boolean ak = false;
    public boolean al = false;

    public final View a() {
        eg egVarG;
        int i = this.an;
        if (i == -1 || (egVarG = G()) == null) {
            return null;
        }
        return egVarG.findViewById(i);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) throws Resources.NotFoundException {
        super.ae(bundle);
        boolean z = bundle != null;
        this.ak = z;
        if (z && this.ai == 0) {
            f();
            return;
        }
        int i = this.aX;
        dtli dtliVar = new dtli(i == 0 ? z() : new ContextThemeWrapper(z(), i), this.aW);
        this.ah = dtliVar;
        boolean z2 = this.aR;
        dtliVar.z = z2;
        dtll dtllVar = dtliVar.r;
        dtllVar.e = z2;
        dtliVar.A = this.aS;
        dtliVar.B = this.aT;
        dtllVar.f = this.aU;
        int i2 = this.aG;
        if (i2 != 0) {
            dtliVar.e.c(i2);
        }
        int i3 = this.aH;
        if (i3 != 0) {
            int i4 = this.aI;
            if (i4 != 0) {
                this.ah.j(i3, i4);
            } else {
                dtli dtliVar2 = this.ah;
                dtliVar2.j(i3, kzb.h(i3, dtliVar2.getContext().getResources().getInteger(dtliVar2.H == dtkr.Legacy ? R.integer.libraries_material_featurehighlight_pulse_base_alpha : R.integer.libraries_material_featurehighlight_gm_pulse_base_alpha)));
            }
        }
        int i5 = this.aJ;
        if (i5 != 0) {
            this.ah.e.d(i5);
        }
        int i6 = this.aK;
        if (i6 != 0) {
            this.ah.i = i6;
        }
        if (this.aL != 0) {
            Resources resourcesB = B();
            int i7 = this.aL;
            Resources.Theme theme = G().getTheme();
            WeakHashMap weakHashMap = kyy.a;
            Drawable drawable = resourcesB.getDrawable(i7, theme);
            if (drawable != null) {
                if (this.aM != 0) {
                    drawable.mutate();
                    drawable.setTint(this.aM);
                }
                dtli dtliVar3 = this.ah;
                dtliVar3.l = drawable;
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.setCallback(dtliVar3);
            }
        }
        dtli dtliVar4 = this.ah;
        float f = this.aN;
        float f2 = dtliVar4.m;
        dtliVar4.m = f;
        if (dtliVar4.C && f2 != f) {
            dtliVar4.requestLayout();
        }
        dtli dtliVar5 = this.ah;
        boolean z3 = this.aY;
        dtliVar5.n = z3;
        if (dtliVar5.h != null) {
            if (z3) {
                dtliVar5.l();
            } else {
                ImageView imageView = dtliVar5.p;
                if (imageView != null) {
                    dtliVar5.removeView(imageView);
                    dtliVar5.p = null;
                }
            }
        }
        if (this.ap != 0) {
            this.ah.g.w(B().getDimension(this.ap) / B().getDisplayMetrics().density);
        }
        int i8 = this.aq;
        if (i8 != 0) {
            this.ah.g.u(i8);
        }
        ColorStateList colorStateList = this.ar;
        if (colorStateList != null) {
            this.ah.g.v(colorStateList);
        }
        this.ah.g.t(this.as);
        if (this.au != 0) {
            this.ah.g.k(B().getDimension(this.au) / B().getDisplayMetrics().density);
        }
        int i9 = this.av;
        if (i9 != 0) {
            this.ah.g.i(i9);
        }
        ColorStateList colorStateList2 = this.aw;
        if (colorStateList2 != null) {
            this.ah.g.j(colorStateList2);
        }
        this.ah.g.h(this.ax);
        int i10 = this.az;
        if (i10 != 0) {
            this.ah.g.r(i10);
        }
        ColorStateList colorStateList3 = this.aA;
        if (colorStateList3 != null) {
            this.ah.g.s(colorStateList3);
        }
        ColorStateList colorStateList4 = this.aB;
        if (colorStateList4 != null) {
            this.ah.g.o(colorStateList4);
        }
        ColorStateList colorStateList5 = this.aC;
        if (colorStateList5 != null) {
            this.ah.g.p(colorStateList5);
        }
        this.ah.g.q(this.aD);
        this.ah.g.m(this.aE);
        ColorStateList colorStateList6 = this.aF;
        if (colorStateList6 != null) {
            this.ah.g.n(colorStateList6);
        }
        if (this.aO != 0 && this.aP != 0) {
            int dimensionPixelOffset = B().getDimensionPixelOffset(this.aO);
            int dimensionPixelOffset2 = B().getDimensionPixelOffset(this.aP);
            dtlm dtlmVar = this.ah.e;
            dtlmVar.f = dimensionPixelOffset;
            dtlmVar.e = dimensionPixelOffset2;
        }
        if (this.aQ != 0) {
            this.ah.e.a = B().getDimensionPixelOffset(this.aQ);
        }
        int i11 = this.am;
        if (i11 != 0) {
            dtli dtliVar6 = this.ah;
            dtliVar6.F = i11;
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            dtliVar6.E = paint;
            if (dtliVar6.q()) {
                dtliVar6.i();
            }
        }
        this.ah.g.x(this.ao, this.at, this.ay);
        this.ah.setContentDescription(this.e);
        dtli dtliVar7 = this.ah;
        dtliVar7.f.g = this.aV;
        if (!dtliVar7.t && !dtliVar7.z && dtliVar7.C) {
            dtliVar7.n(dtliVar7.a());
        }
        this.ah.setTag(R.id.featurehighlight_view_tag_fragment, this);
        ((ViewGroup) G().findViewById(android.R.id.content)).addView(this.ah);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        lvj lvjVar = this.E;
        if (lvjVar instanceof dtki) {
            this.ag = (dtki) lvjVar;
        } else if (activity instanceof dtki) {
            this.ag = (dtki) activity;
        }
    }

    @Override // defpackage.ea
    public final void ai() {
        dtli dtliVar = this.ah;
        if (dtliVar != null) {
            dtliVar.setTag(R.id.featurehighlight_view_tag_fragment, null);
            ((ViewGroup) G().findViewById(android.R.id.content)).removeView(this.ah);
            this.ah = null;
        }
        super.ai();
    }

    @Override // defpackage.ea
    public final void am() {
        super.am();
        this.ah.removeCallbacks(this.aj);
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        dtli dtliVar = this.ah;
        if (dtliVar != null) {
            long j = this.d;
            if (j > 0) {
                dtliVar.postDelayed(this.aj, j);
            }
            if (this.al) {
                return;
            }
            dtli dtliVar2 = this.ah;
            Runnable runnable = new Runnable() { // from class: dtkk
                @Override // java.lang.Runnable
                public final void run() {
                    final dtkq dtkqVar = this.a;
                    dtli dtliVar3 = dtkqVar.ah;
                    if (dtliVar3 != null) {
                        dtliVar3.bringToFront();
                        if (dtkqVar.al) {
                            return;
                        }
                        dtkqVar.al = true;
                        dtkh dtkhVarB = dtkqVar.b();
                        if (dtkhVarB != null) {
                            ((eksl) dsql.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onAttached", 50, "FeatureHighlightController.java")).q("FeatureHighlight attached");
                        }
                        eg egVarG = dtkqVar.G();
                        View viewA = egVarG == null ? null : dtkqVar.a.a(egVarG, dtkqVar.a());
                        if (viewA == null) {
                            if (dtkhVarB != null) {
                                ((eksl) dsql.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onViewNotFound", 109, "FeatureHighlightController.java")).q("FeatureHighlight view not found");
                                dsoo dsooVar = dsoo.FAILED_VIEW_NOT_FOUND;
                                dsql dsqlVar = ((dsqk) dtkhVarB).b;
                                dsqlVar.e.b(dsqlVar.b, dsooVar);
                            }
                            dtkqVar.f();
                            return;
                        }
                        dtkqVar.ah.k = dtkqVar.a();
                        dtkqVar.ah.h(new dtkp(dtkqVar));
                        if (dtkqVar.ai == 1) {
                            if (dtkqVar.ak) {
                                dtli dtliVar4 = dtkqVar.ah;
                                dtliVar4.k(viewA);
                                dtliVar4.addOnLayoutChangeListener(new dtla(dtliVar4));
                                dtliVar4.requestLayout();
                                return;
                            }
                            dtli dtliVar5 = dtkqVar.ah;
                            Runnable runnable2 = new Runnable() { // from class: dtkm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dtkh dtkhVarB2 = dtkqVar.b();
                                    if (dtkhVarB2 != null) {
                                        ((eksl) dsql.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onShow", 72, "FeatureHighlightController.java")).q("FeatureHighlight shown");
                                        dsoo dsooVar2 = dsoo.SUCCESS;
                                        dsql dsqlVar2 = ((dsqk) dtkhVarB2).b;
                                        dsqlVar2.e.b(dsqlVar2.b, dsooVar2);
                                    }
                                }
                            };
                            dtliVar5.k(viewA);
                            dtliVar5.addOnLayoutChangeListener(new dtkz(dtliVar5, runnable2));
                            dtliVar5.requestLayout();
                        }
                    }
                }
            };
            int[] iArr = ley.a;
            dtliVar2.postOnAnimation(runnable);
        }
    }

    public final dtkh b() {
        dtki dtkiVar = this.ag;
        if (dtkiVar != null) {
            return dtkiVar.b();
        }
        return null;
    }

    final void e(int i) {
        if (this.ai != 1 || this.ah == null) {
            return;
        }
        dtkh dtkhVarB = b();
        if (dtkhVarB != null) {
            ((eksl) dsql.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onDismiss", 90, "FeatureHighlightController.java")).q("FeatureHighlight dismissed");
            dsqk dsqkVar = (dsqk) dtkhVarB;
            dsql dsqlVar = dsqkVar.b;
            etjv etjvVar = etjv.DISMISSED;
            dsbi dsbiVar = dsqlVar.b;
            etnj etnjVar = dsbiVar.c().f;
            if (etnjVar == null) {
                etnjVar = etnj.a;
            }
            etnx etnxVar = etnjVar.c == 3 ? (etnx) etnjVar.d : etnx.a;
            if (i == 3) {
                etlk etlkVar = etnxVar.p;
                if (etlkVar == null) {
                    etlkVar = etlk.a;
                }
                etli etliVarB = etli.b(etlkVar.e);
                if (etliVarB == null) {
                    etliVarB = etli.ACTION_UNKNOWN;
                }
                if (etliVarB == etli.ACTION_ACKNOWLEDGE) {
                    etjvVar = etjv.ACKNOWLEDGE_RESPONSE;
                }
            }
            dsqlVar.e.a(dsbiVar, etjvVar);
            dsqkVar.a = true;
        }
        p();
        this.ah.g(new Runnable() { // from class: dtkl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        });
    }

    public final void f() {
        fr frVar;
        if (G() == null || G().isFinishing() || !aF() || this.s || (frVar = this.B) == null) {
            return;
        }
        cg cgVar = new cg(frVar);
        cgVar.o(this);
        cgVar.k();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            return;
        }
        bundle2.setClassLoader(dtkq.class.getClassLoader());
        this.a = (dtlp) bundle2.getParcelable("fh_view_finder");
        this.am = bundle2.getInt("fh_target_view_tint_color");
        this.an = bundle2.getInt("fh_confining_view_id");
        this.ao = bundle2.getCharSequence("fh_header_text");
        this.ap = bundle2.getInt("fh_header_text_size_res");
        this.aq = bundle2.getInt("fh_header_text_appearance");
        this.ar = (ColorStateList) bundle2.getParcelable("fh_header_text_color");
        this.as = bundle2.getInt("fh_header_text_alignment");
        this.at = bundle2.getCharSequence("fh_body_text");
        this.au = bundle2.getInt("fh_body_text_size_res");
        this.av = bundle2.getInt("fh_body_text_appearance");
        this.aw = (ColorStateList) bundle2.getParcelable("fh_body_text_color");
        this.ax = bundle2.getInt("fh_body_text_alignment");
        this.ay = bundle2.getCharSequence("fh_dismiss_action_text");
        this.az = bundle2.getInt("fh_dismiss_action_text_appearance");
        this.aA = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_text_color");
        this.aB = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_ripple_color");
        this.aC = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_stroke_color");
        this.aD = bundle2.getInt("fh_dismiss_action_text_alignment");
        this.aE = bundle2.getInt("fh_dismiss_action_button_alignment");
        this.aF = (ColorStateList) bundle2.getParcelable("fh_dismiss_action_button_background_color");
        this.aG = bundle2.getInt("fh_outer_color");
        this.aH = bundle2.getInt("fh_pulse_inner_color");
        this.aI = bundle2.getInt("fh_pulse_outer_color");
        this.aJ = bundle2.getInt("fh_scrim_color");
        this.aK = bundle2.getInt("fh_target_text_color");
        this.aL = bundle2.getInt("fh_target_drawable");
        this.aM = bundle2.getInt("fh_target_drawable_color");
        this.aN = bundle2.getFloat("fh_target_scale");
        this.aY = bundle2.getBoolean("fh_target_shadow_enabled");
        bundle2.getString("fh_callback_id");
        this.b = bundle2.getString("fh_task_tag");
        this.aO = bundle2.getInt("fh_vertical_offset_res");
        this.aP = bundle2.getInt("fh_horizontal_offset_res");
        this.aQ = bundle2.getInt("fh_center_threshold_res");
        this.c = bundle2.getBoolean("fh_task_complete_on_tap");
        this.d = bundle2.getLong("fh_duration");
        this.aR = bundle2.getBoolean("fh_pin_to_closest_vertical_edge");
        this.aS = bundle2.getBoolean("fh_swipe_to_dismiss_enabled");
        this.aT = bundle2.getBoolean("fh_tap_to_dismiss_enabled");
        this.aU = bundle2.getInt("fh_text_vertical_gravity_hint");
        this.e = bundle2.getCharSequence("fh_content_description");
        this.aV = (dtln) bundle2.getSerializable("fh_pulse_animation_type");
        this.aW = (dtkr) bundle2.getSerializable("fh_feature_highlight_style");
        this.aX = bundle2.getInt("fh_theme_overlay");
        if (bundle != null) {
            int i = bundle.getInt("showState");
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("Unrecognised show state.");
            }
            this.ai = i;
        }
    }

    @Override // defpackage.ea
    public final void j() {
        super.j();
        dtkh dtkhVarB = b();
        if (dtkhVarB != null) {
            ((eksl) dsql.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/taptarget/FeatureHighlightController$1", "onDetached", 55, "FeatureHighlightController.java")).q("FeatureHighlight detached");
            dsqk dsqkVar = (dsqk) dtkhVarB;
            if (!dsqkVar.a) {
                dsql dsqlVar = dsqkVar.b;
                if (!dsqlVar.c.d) {
                    dsqlVar.e.a(dsqlVar.b, etjv.DISMISSED);
                    dsqkVar.a = true;
                }
            }
            dsqn dsqnVar = dsqkVar.b.c;
            if (dsqnVar != null) {
                dsqnVar.a();
            }
        }
        this.ag = null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putInt("showState", this.ai);
    }

    public final void p() {
        this.ai = 0;
    }
}
