package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import com.google.research.ink.libs.buttons.ColorSelectionButton;
import com.google.research.ink.libs.buttons.PenSelectionButton;
import defpackage.eyhq;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpe extends czos implements ehlg, eyhx, ehlc, ehnw, eifl {
    private czpu a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public czpe() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czpu.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final czpu czpuVarH = H();
            ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.media_editor_fragment, viewGroup, false);
            ebtb ebtbVar = czpuVarH.c;
            final ebtj ebtjVarB = ebtbVar.b();
            czpuVarH.d.o = czpuVarH;
            czpuVarH.h = new HashMap();
            czpuVarH.h.put(ebte.b, (ImageButton) constraintLayout.findViewById(R.id.draw_button));
            czpuVarH.h.put(ebte.c, (ImageButton) constraintLayout.findViewById(R.id.text_button));
            for (final Map.Entry entry : czpuVarH.h.entrySet()) {
                ((ImageButton) entry.getValue()).setOnClickListener(new View.OnClickListener() { // from class: czpn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ebtjVarB.b((ebte) entry.getKey());
                    }
                });
            }
            czpuVarH.i = new HashMap();
            czpuVarH.i.put(ebtd.c, (PenSelectionButton) constraintLayout.findViewById(R.id.highlighter_line_type));
            czpuVarH.i.put(ebtd.a, (PenSelectionButton) constraintLayout.findViewById(R.id.pencil_line_type));
            czpuVarH.i.put(ebtd.b, (PenSelectionButton) constraintLayout.findViewById(R.id.calligraphy_line_type));
            for (final Map.Entry entry2 : czpuVarH.i.entrySet()) {
                ((PenSelectionButton) entry2.getValue()).setOnClickListener(new View.OnClickListener() { // from class: czpo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ebtd ebtdVar = (ebtd) entry2.getKey();
                        ebtdVar.getClass();
                        ebtj ebtjVar = ebtjVarB;
                        ExpressiveTextContext expressiveTextContext = ebtjVar.a;
                        if (expressiveTextContext.p()) {
                            ebtjVar.b.b(expressiveTextContext.b(ebtdVar));
                        }
                    }
                });
            }
            czpuVarH.k = (ColorSelectionButton) constraintLayout.findViewById(R.id.ink_color_white);
            czpuVarH.j = new HashMap();
            TypedArray typedArrayObtainTypedArray = czpuVarH.a.B().obtainTypedArray(R.array.color_buttons);
            for (int i = 0; i < typedArrayObtainTypedArray.length(); i++) {
                final ColorSelectionButton colorSelectionButton = (ColorSelectionButton) constraintLayout.findViewById(typedArrayObtainTypedArray.getResourceId(i, 0));
                czpuVarH.j.put(Integer.valueOf(colorSelectionButton.b), colorSelectionButton);
                colorSelectionButton.setOnClickListener(new View.OnClickListener() { // from class: czpp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws Throwable {
                        ebtj ebtjVar = ebtjVarB;
                        ColorSelectionButton colorSelectionButton2 = colorSelectionButton;
                        ebte ebteVar = czpuVarH.d.e;
                        if (ebteVar == ebte.b) {
                            int i2 = colorSelectionButton2.b;
                            ExpressiveTextContext expressiveTextContext = ebtjVar.a;
                            if (expressiveTextContext.p()) {
                                expressiveTextContext.f(i2);
                                ebtjVar.b.a(i2);
                                return;
                            }
                            return;
                        }
                        if (ebteVar == ebte.c) {
                            int i3 = colorSelectionButton2.b;
                            if (ebtjVar.a.p()) {
                                ebtjVar.b.f(i3);
                            }
                        }
                    }
                });
            }
            typedArrayObtainTypedArray.recycle();
            czpuVarH.l = (EditText) constraintLayout.findViewById(R.id.media_editor_edit_text);
            constraintLayout.findViewById(R.id.done_button).setOnClickListener(new View.OnClickListener() { // from class: czpq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebtj ebtjVar = ebtjVarB;
                    czpu czpuVar = czpuVarH;
                    ebtg ebtgVar = czpuVar.d;
                    if (ebtgVar.e == ebte.c) {
                        long j = ebtgVar.n;
                        String strTrim = czpuVar.l.getText().toString().trim();
                        int i2 = ebtgVar.h;
                        EditText editText = czpuVar.l;
                        StaticLayout staticLayout = new StaticLayout(editText.getText().toString().trim(), editText.getPaint(), editText.getWidth(), Layout.Alignment.ALIGN_CENTER, editText.getLineSpacingMultiplier(), editText.getLineSpacingExtra(), editText.getIncludeFontPadding());
                        int iMax = Math.max(staticLayout.getWidth(), 1);
                        int iMax2 = Math.max(staticLayout.getHeight(), 1);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax + iMax, iMax2 + iMax2, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.scale(2.0f, 2.0f);
                        staticLayout.draw(canvas);
                        strTrim.getClass();
                        bitmapCreateBitmap.getClass();
                        ExpressiveTextContext expressiveTextContext = ebtjVar.a;
                        if (expressiveTextContext.p()) {
                            expressiveTextContext.m(j, strTrim, i2, bitmapCreateBitmap);
                        }
                    }
                    ebtjVar.b(ebte.a);
                }
            });
            constraintLayout.findViewById(R.id.cancel_or_undo_button).setOnClickListener(new View.OnClickListener() { // from class: czpr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebtj ebtjVar = ebtjVarB;
                    ebtg ebtgVar = czpuVarH.d;
                    if (ebtgVar.e != ebte.b || ebtgVar.j <= 0) {
                        ebtjVar.b(ebte.a);
                        return;
                    }
                    ExpressiveTextContext expressiveTextContext = ebtjVar.a;
                    if (expressiveTextContext.p()) {
                        expressiveTextContext.j();
                    }
                }
            });
            LottieAnimationView lottieAnimationView = (LottieAnimationView) constraintLayout.findViewById(R.id.drag_to_delete_animation);
            lottieAnimationView.g("delete_icon_animation.json");
            czor czorVar = czpuVarH.f;
            Context context = (Context) czorVar.a.b();
            context.getClass();
            cogw cogwVar = (cogw) czorVar.b.b();
            cogwVar.getClass();
            Vibrator vibrator = (Vibrator) czorVar.c.b();
            vibrator.getClass();
            lottieAnimationView.getClass();
            czpuVarH.o = new czoq(context, cogwVar, vibrator, lottieAnimationView, ebtjVarB);
            lottieAnimationView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: czps
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    czpuVarH.o.e = new Rect(i2, i3, i4, i5);
                }
            });
            constraintLayout.findViewById(R.id.exit_button).setOnClickListener(new View.OnClickListener() { // from class: czpt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czpu czpuVar = czpuVarH;
                    if (czpuVar.b()) {
                        czpuVar.g();
                    } else {
                        einf.g(new czou(false), view);
                    }
                }
            });
            czpuVarH.m = (GLTextureView) constraintLayout.findViewById(R.id.textureview);
            czpuVarH.m.setOpaque(false);
            GLTextureView gLTextureView = czpuVarH.m;
            gLTextureView.a();
            gLTextureView.f = 2;
            GLTextureView gLTextureView2 = czpuVarH.m;
            ebtm ebtmVar = new ebtm(gLTextureView2, 8, 0);
            gLTextureView2.a();
            gLTextureView2.e = ebtmVar;
            GLTextureView gLTextureView3 = czpuVarH.m;
            gLTextureView3.g = true;
            gLTextureView3.b(true);
            GLTextureView gLTextureView4 = czpuVarH.m;
            gLTextureView4.a();
            if (gLTextureView4.e == null) {
                gLTextureView4.e = new ebts(gLTextureView4);
            }
            if (gLTextureView4.h == null) {
                gLTextureView4.h = new ebtn(gLTextureView4);
            }
            if (gLTextureView4.i == null) {
                gLTextureView4.i = new ebto();
            }
            gLTextureView4.d = ebtbVar;
            gLTextureView4.c = new ebtq(gLTextureView4.b);
            gLTextureView4.c.start();
            czpuVarH.m.c.c(1);
            czpuVarH.m.setOnTouchListener(new View.OnTouchListener() { // from class: czpg
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return czpuVarH.j(view, motionEvent);
                }
            });
            if (((Boolean) czns.g.e()).booleanValue()) {
                czpuVarH.m.setOnHoverListener(new View.OnHoverListener() { // from class: czph
                    @Override // android.view.View.OnHoverListener
                    public final boolean onHover(View view, MotionEvent motionEvent) {
                        czpu czpuVar = czpuVarH;
                        if (czpuVar.e.isTouchExplorationEnabled()) {
                            return czpuVar.j(view, motionEvent);
                        }
                        return false;
                    }
                });
            }
            float f = constraintLayout.getContext().getResources().getDisplayMetrics().density;
            if (f >= 1.0f) {
                ebtjVarB.b.k = Float.valueOf(f);
                ExpressiveTextContext expressiveTextContext = ebtjVarB.a;
                if (expressiveTextContext.p()) {
                    expressiveTextContext.i(f);
                }
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) constraintLayout.findViewById(R.id.media_editor_toolbars);
            aw awVar = czpuVarH.q;
            awVar.e(constraintLayout2);
            aw awVar2 = czpuVarH.r;
            awVar2.e(constraintLayout2);
            aw awVar3 = czpuVarH.s;
            awVar3.e(constraintLayout2);
            aw awVar4 = czpuVarH.t;
            awVar4.e(constraintLayout2);
            czpuVarH.u.e(constraintLayout2);
            awVar.l(R.id.media_editor_action_bar, 0);
            awVar.l(R.id.drag_to_delete_animation, 0);
            awVar2.l(R.id.drag_to_delete_animation, 0);
            awVar3.l(R.id.media_editor_text_views, 0);
            awVar3.l(R.id.media_editor_color_bar, 0);
            awVar3.l(R.id.media_editor_tool_action_bar, 0);
            awVar4.l(R.id.media_editor_brush_bar, 0);
            awVar4.l(R.id.media_editor_tool_action_bar, 0);
            awVar4.l(R.id.media_editor_color_bar, 0);
            czpuVarH.v = new AutoTransition();
            czpuVarH.v.setDuration(83L);
            ViewGroup viewGroup2 = (ViewGroup) constraintLayout.findViewById(R.id.media_editor_toolbars);
            View viewInflate = layoutInflater.inflate(R.layout.media_editor_action_bar_background, viewGroup2, false);
            viewGroup2.addView(viewInflate, 0);
            au auVar = (au) viewInflate.getLayoutParams();
            if (auVar != null) {
                auVar.n = R.id.screen_start_guideline;
                auVar.p = R.id.screen_end_guideline;
                auVar.h = R.id.screen_top_guideline;
                viewInflate.setLayoutParams(auVar);
                viewInflate.requestLayout();
            }
            czpuVarH.p = czpuVarH.b();
            eidc.q();
            return constraintLayout;
        } finally {
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

    @Override // defpackage.czos, defpackage.ecdo, defpackage.ea
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
            czpu czpuVarH = H();
            czpuVarH.f(false, "");
            czpuVarH.m.b(false);
            czpuVarH.n.a(true);
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
            ebtq ebtqVar = H().m.c;
            ebtr ebtrVar = GLTextureView.a;
            synchronized (ebtrVar) {
                ebtqVar.b = true;
                ebtrVar.notifyAll();
                while (!ebtqVar.a && !ebtqVar.c) {
                    try {
                        ebtrVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            czpu czpuVarH = H();
            ebtq ebtqVar = czpuVarH.m.c;
            ebtr ebtrVar = GLTextureView.a;
            synchronized (ebtrVar) {
                ebtqVar.b = false;
                ebtqVar.h = true;
                ebtqVar.i = false;
                ebtrVar.notifyAll();
                while (!ebtqVar.a && ebtqVar.c && !ebtqVar.i) {
                    try {
                        ebtrVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            czpuVarH.h();
            View view = czpuVarH.a.Q;
            view.getClass();
            view.setSystemUiVisibility(1);
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

    @Override // defpackage.czos
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
    public final czpu H() {
        czpu czpuVar = this.a;
        if (czpuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czpuVar;
    }

    @Override // defpackage.czos, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/mediaeditor/MediaEditorFragment", 85, czpe.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/mediaviewer/mediaeditor/MediaEditorFragment", 90, czpe.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahib) objBb).a;
                            Context context2 = (Context) ahknVar.t.b();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof czpe)) {
                                throw new IllegalStateException(a.M(eaVar, czpu.class));
                            }
                            czpe czpeVar = (czpe) eaVar;
                            ahng ahngVar = ahknVar.b;
                            this.a = new czpu(context2, czpeVar, (czov) ahngVar.oR.b(), (ebtb) ahngVar.oQ.b(), (ebtg) ahngVar.oP.b(), new czor(ahknVar.t, ahknVar.cD, ahngVar.kN), (cyuq) ((ahib) objBb).bB.b(), (daoe) ahngVar.hX.b());
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
            final czpu czpuVarH = H();
            czpe czpeVar = czpuVarH.a;
            czpeVar.G().setRequestedOrientation(1);
            czpuVarH.n = (cyqr) new lxo(czpeVar.G()).a(cyqr.class);
            czpuVarH.n.a(false);
            cyuq cyuqVar = czpuVarH.g;
            cyuqVar.b(new danz() { // from class: czpl
                @Override // defpackage.danz
                public final void a() {
                    czpuVarH.h();
                }
            });
            cyuqVar.a(new dany() { // from class: czpm
                @Override // defpackage.dany
                public final void a() {
                    czpuVarH.h();
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            czpu czpuVarH = H();
            czpuVarH.c.c();
            czpuVarH.d.o = null;
            View view = czpuVarH.a.Q;
            view.getClass();
            view.setSystemUiVisibility(0);
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
            czpu czpuVarH = H();
            czpuVarH.e(czpuVarH.d);
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

    @Override // defpackage.czos, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
