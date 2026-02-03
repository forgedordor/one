package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvkz {
    public final Optional b;
    public final ComposeMessageView c;
    public final View d;
    public ImageView e;
    public SharedPreferences.OnSharedPreferenceChangeListener f;
    public final cvkf g;
    public final cvkf h;
    public cvkf i;
    public cvkf j;
    public aw k;
    public aw l;
    public Transition m;
    public Transition n;
    public final boolean o;
    public final List p;
    public ValueAnimator q;
    private final eigp u;
    private final ImageView v;
    private final LinearLayout w;
    private static final cczv r = cdag.p(134702254);
    public static final cczv a = cdag.d(cdag.b, "collapse_attach_buttons_text_threshold", 0.75f);
    private static final cvky[] s = {new cvky(R.drawable.ic_compose_plus_unselected, R.drawable.ic_compose_plus_selected), new cvky(R.drawable.ic_compose_plus_unselected_v2, R.drawable.ic_compose_plus_selected_v2), new cvky(R.drawable.ic_compose_plus_unselected_v2, R.drawable.ic_compose_plus_selected_v2)};
    private static final cvky[] t = {new cvky(R.drawable.ic_compose_camera_gallery_unselected, R.drawable.ic_compose_camera_gallery_selected, 0.08f, 0.12f), new cvky(R.drawable.ic_compose_camera_gallery_unselected_v2, R.drawable.ic_compose_camera_gallery_selected_v2, 0.18f, 0.24f), new cvky(R.drawable.ic_compose_camera_gallery_unselected_v3, R.drawable.ic_compose_camera_gallery_selected_v3, 0.17f, 0.25f)};

    public cvkz(final Context context, eigp eigpVar, Optional optional, fcsu fcsuVar, final fcsu fcsuVar2, ComposeMessageView composeMessageView, final fcsu fcsuVar3, fcsu fcsuVar4) {
        ComposeMessageView composeMessageView2;
        cvkf cvkfVar;
        int i;
        int i2;
        final ComposeMessageView composeMessageView3;
        final cvkz cvkzVar;
        cvkf cvkfVar2;
        int i3;
        ImageView imageView;
        this.u = eigpVar;
        this.c = composeMessageView;
        ImageView imageView2 = (ImageView) composeMessageView.findViewById(R.id.expand_attach_button);
        this.v = imageView2;
        LinearLayout linearLayout = (LinearLayout) composeMessageView.findViewById(R.id.compose_message_box_linear_layout);
        this.w = linearLayout;
        this.d = composeMessageView.findViewById(R.id.compress_info_image_view);
        this.b = optional;
        if (!g() || composeMessageView.findViewById(R.id.magic_button) == null) {
            composeMessageView2 = composeMessageView;
        } else {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(composeMessageView.getContext());
            if (!((aqab) fcsuVar4.b()).a() || ((Boolean) crbf.bd.e()).booleanValue()) {
                i3 = R.layout.magic_compose_button;
            } else {
                i3 = R.layout.magic_compose_with_only_rewrite_button;
            }
            composeMessageView2 = composeMessageView;
            this.e = (ImageView) cpdw.c(ImageView.class, layoutInflaterFrom, composeMessageView, R.id.magic_button, i3, R.id.magic_button);
            if (((Boolean) ((cczi) crbf.aW.get()).e()).booleanValue() && (imageView = this.e) != null) {
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(eehg.b(imageView, R.attr.colorPrimary)), Integer.valueOf(kzb.h(eehg.b(this.e, R.attr.colorSecondaryContainer), 127)));
                this.q = valueAnimatorOfObject;
                valueAnimatorOfObject.setDuration(1000L);
                this.q.setRepeatCount(3);
                this.q.setRepeatMode(2);
                this.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cvkh
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.a.e.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                this.q.addListener(new cvkx(this));
            }
        }
        this.p = new ArrayList();
        ImageView imageView3 = (ImageView) composeMessageView2.findViewById(R.id.plus_button);
        ImageView imageView4 = (ImageView) composeMessageView2.findViewById(R.id.camera_gallery_button);
        int iB = eehg.b(composeMessageView2, R.attr.colorInactiveComposeIcon);
        int iB2 = eehg.b(composeMessageView2, R.attr.colorActiveComposeIcon);
        cvkf cvkfVarH = h(imageView3, iB, iB2, f(s, "PLUS_ICON_VERSIONS"), R.string.attachMediaButtonContentDescription, "PlusButton::OnClick");
        this.g = cvkfVarH;
        cvkf cvkfVarH2 = h(imageView4, iB, iB2, f(t, "CAMERA_GALLERY_ICON_VERSIONS"), R.string.c2o_open_gallery_button_content_description, "CameraGalleryButton::OnClick");
        this.h = cvkfVarH2;
        if (((Boolean) ccze.g.e()).booleanValue()) {
            ImageView imageView5 = (ImageView) ((ViewStub) composeMessageView2.findViewById(R.id.emoji_button_view_stub)).inflate();
            imageView5.setVisibility(0);
            i = iB;
            i2 = iB2;
            cvkfVar = cvkfVarH2;
            composeMessageView3 = composeMessageView;
            this.i = e(imageView5, new cvke(R.drawable.ic_compose_emoji_gallery_unselected, iB, R.string.c2o_category_emoji_content_description), new cvke(R.drawable.ic_compose_emoji_gallery_unselected, iB, R.string.c2o_category_emoji_content_description), new cvke(R.drawable.ic_compose_emoji_gallery_selected, iB2, R.string.keyboard_content_description), 0.0f, 0.16f, "EmojiButton::OnClick");
        } else {
            cvkfVar = cvkfVarH2;
            i = iB;
            i2 = iB2;
            composeMessageView3 = composeMessageView2;
        }
        ejxr ejxrVar = ujw.l;
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            int i4 = i;
            cvkzVar = this;
            cvkzVar.j = h((ImageView) new cpdw(composeMessageView3, R.id.audio_button_compose_view_stub, R.id.audio_button_compose_view).b(), i4, eehg.b(composeMessageView3, R.attr.colorSecondary), new cvky(R.drawable.gs_sound_sensing_vd_theme_24, R.drawable.gs_sound_sensing_vd_theme_24, 0.0f, 0.0f, Integer.valueOf(R.drawable.compose_audio_button_selected_background)), R.string.audio_button_open_compose_content_description, "AudioButton::OnClick");
        } else {
            cvkzVar = this;
        }
        au auVar = (au) linearLayout.getLayoutParams();
        if (((Boolean) crbf.aP.e()).booleanValue()) {
            auVar.m = R.id.magic_button;
        } else {
            auVar.m = R.id.camera_gallery_button;
        }
        linearLayout.setLayoutParams(auVar);
        imageView2.setBackground(null);
        imageView2.setElevation(0.0f);
        imageView2.setColorFilter(i2);
        final cvlk cvlkVarH = composeMessageView3.H();
        Runnable runnable = new Runnable() { // from class: cvkl
            @Override // java.lang.Runnable
            public final void run() {
                cvlk cvlkVar = cvlkVarH;
                ((ajfo) cvlkVar.b.b()).d(ajfo.t);
                cvmj cvmjVar = cvlkVar.c;
                cvtm cvtmVar = cvmjVar.j;
                ((crqv) cvmjVar.H.b()).k("last_opened_media_picker_time_millis", ((cogw) cvmjVar.K.b()).f().toEpochMilli());
            }
        };
        final cvlk cvlkVarH2 = composeMessageView3.H();
        cvkfVarH.c(runnable, new Runnable() { // from class: cvkm
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final cvlk cvlkVarH3 = composeMessageView3.H();
        Runnable runnable2 = new Runnable() { // from class: cvkn
            @Override // java.lang.Runnable
            public final void run() {
                cvlk cvlkVar = cvlkVarH3;
                fcsu fcsuVar5 = cvlkVar.b;
                ((ajfo) fcsuVar5.b()).d(ajfo.r);
                ((ajfo) fcsuVar5.b()).d(ajfo.s);
                cvtm cvtmVar = cvlkVar.c.j;
                throw null;
            }
        };
        final cvlk cvlkVarH4 = composeMessageView3.H();
        cvkf cvkfVar3 = cvkfVar;
        cvkfVar3.c(runnable2, new Runnable() { // from class: cvkm
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        if (cvkzVar.e != null) {
            cvkzVar.f = new eigb(eigpVar, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: cvko
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (str.equals(context.getString(R.string.mc_enabled_pref_key))) {
                        ComposeMessageView composeMessageView4 = composeMessageView3;
                        fcsu fcsuVar5 = fcsuVar2;
                        cvkz cvkzVar2 = this.a;
                        ((cqei) fcsuVar5.b()).d(cvkzVar2.e, 8, null);
                        cvkzVar2.m = TransitionInflater.from(composeMessageView4.getContext()).inflateTransition(R.transition.compose_icons_collapse_transition);
                        cvkzVar2.n = TransitionInflater.from(composeMessageView4.getContext()).inflateTransition(R.transition.compose_icons_expand_transition);
                        cvkzVar2.k.l(R.id.magic_button, 8);
                    }
                }
            }, "com/google/android/apps/messaging/ui/conversation/ComposeEntryPointsController", "<init>", 238, "ComposeEntryPointsController");
            ((crqv) fcsuVar.b()).m(cvkzVar.f);
            cvkzVar.e.addOnAttachStateChangeListener(new cvku(cvkzVar, fcsuVar));
            cvkzVar.e.setOnClickListener(new View.OnClickListener() { // from class: cvkp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cvkz cvkzVar2;
                    ValueAnimator valueAnimator;
                    cvmj cvmjVar = composeMessageView3.H().c;
                    if (crbf.d()) {
                        cvtm cvtmVar = cvmjVar.j;
                    }
                    if (((Boolean) ((cczi) crbf.aW.get()).e()).booleanValue() && (valueAnimator = (cvkzVar2 = this.a).q) != null && valueAnimator.isRunning()) {
                        fcsu fcsuVar5 = fcsuVar3;
                        cvkzVar2.q.end();
                        ((vbv) fcsuVar5.b()).b(true);
                    }
                }
            });
        }
        cvkf cvkfVar4 = cvkzVar.i;
        if (cvkfVar4 != null) {
            final cvlk cvlkVarH5 = composeMessageView3.H();
            Runnable runnable3 = new Runnable() { // from class: cvkq
                @Override // java.lang.Runnable
                public final void run() {
                    cvlk cvlkVar = cvlkVarH5;
                    ((ajfo) cvlkVar.b.b()).d(ajfo.u);
                    cvtm cvtmVar = cvlkVar.c.j;
                }
            };
            final cvlk cvlkVarH6 = composeMessageView3.H();
            cvkfVar4.c(runnable3, new Runnable() { // from class: cvkm
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        ((cvkv) cvkfVarH).d.setVisibility(0);
        boolean zBooleanValue = ((Boolean) ccze.L.e()).booleanValue();
        cvkzVar.o = zBooleanValue;
        if (zBooleanValue) {
            ((cvkv) cvkfVar3).d.setVisibility(0);
            int id = ((cvkv) cvkfVarH).d.getId();
            int id2 = ((cvkv) cvkfVar3).d.getId();
            float dimensionPixelSize = composeMessageView3.getResources().getDimensionPixelSize(R.dimen.compose_message_view_attach_button_size) / 2;
            imageView2.setPivotX(dimensionPixelSize);
            imageView2.setPivotY(dimensionPixelSize);
            ((cvkv) cvkfVarH).d.setPivotX(dimensionPixelSize);
            ((cvkv) cvkfVarH).d.setPivotY(dimensionPixelSize);
            ((cvkv) cvkfVar3).d.setPivotX(dimensionPixelSize);
            ((cvkv) cvkfVar3).d.setPivotY(dimensionPixelSize);
            aw awVar = new aw();
            cvkzVar.k = awVar;
            awVar.e(cvkzVar.a());
            aw awVar2 = new aw();
            cvkzVar.l = awVar2;
            awVar2.e(cvkzVar.a());
            cvkzVar.l.d(id2, 7);
            if (((Boolean) ccze.n.e()).booleanValue()) {
                cvkzVar.l.d(id, 6);
                cvkzVar.l.m(id2, 6, 0);
            } else {
                cvkzVar.l.m(id2, 6, R.id.message_compose_view_container_with_c2o);
            }
            cvkzVar.l.m(id, 7, R.id.compose_message_box_linear_layout);
            cvkzVar.l.m(R.id.expand_attach_button, 7, R.id.compose_message_box_linear_layout);
            if (cvkzVar.g()) {
                cvkzVar.l.m(R.id.magic_button, 6, 0);
                cvkzVar.l.m(R.id.magic_button, 7, R.id.compose_message_box_linear_layout);
                cvkzVar.l.k(R.id.magic_button, dimensionPixelSize, dimensionPixelSize);
            }
            cvkzVar.l.k(id, dimensionPixelSize, dimensionPixelSize);
            cvkzVar.l.k(id2, dimensionPixelSize, dimensionPixelSize);
            cvkzVar.l.k(R.id.expand_attach_button, 0.0f, 0.0f);
            cvkzVar.l.i(id, 0.001f);
            cvkzVar.l.j(id, 0.001f);
            cvkzVar.l.l(id, 4);
            cvkzVar.l.i(id2, 0.001f);
            cvkzVar.l.j(id2, 0.001f);
            cvkzVar.l.l(id2, 4);
            if (cvkzVar.g()) {
                cvkzVar.l.i(R.id.magic_button, 0.001f);
                cvkzVar.l.j(R.id.magic_button, 0.001f);
                cvkzVar.l.l(R.id.magic_button, 4);
            }
            cvkzVar.l.h(id2, 6, composeMessageView3.getResources().getDimensionPixelSize(R.dimen.compose_message_view_attach_button_margin_start));
            cvkzVar.l.i(R.id.expand_attach_button, 1.0f);
            cvkzVar.l.j(R.id.expand_attach_button, 1.0f);
            cvkzVar.l.l(R.id.expand_attach_button, 0);
            cvkzVar.d();
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: cvkr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.c();
                }
            });
        }
        if (!((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue() || (cvkfVar2 = cvkzVar.j) == null) {
            return;
        }
        final cvlk cvlkVarH7 = composeMessageView3.H();
        Runnable runnable4 = new Runnable() { // from class: cvks
            @Override // java.lang.Runnable
            public final void run() {
                cvtm cvtmVar = cvlkVarH7.c.j;
            }
        };
        final cvlk cvlkVarH8 = composeMessageView3.H();
        cvkfVar2.c(runnable4, new Runnable() { // from class: cvkm
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    private final cvkf e(final ImageView imageView, cvke cvkeVar, cvke cvkeVar2, cvke cvkeVar3, float f, float f2, String str) {
        ComposeMessageView composeMessageView = this.c;
        cvjd cvjdVar = new cvjd(composeMessageView.getContext().getDrawable(cvkeVar.a), composeMessageView.getContext().getDrawable(cvkeVar3.a), f, f2);
        imageView.setImageDrawable(cvjdVar);
        if (((Boolean) r.e()).booleanValue()) {
            imageView.addOnLayoutChangeListener(new cvkw(imageView));
        }
        final cvkv cvkvVar = new cvkv(new BiConsumer() { // from class: cvkt
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) throws Resources.NotFoundException {
                cvkd cvkdVar;
                cvkf cvkfVar = (cvkf) obj;
                cvkd cvkdVar2 = (cvkd) obj2;
                int iOrdinal = cvkdVar2.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        cvkdVar = cvkd.HIGHLIGHTED;
                    } else {
                        if (iOrdinal != 2) {
                            throw new IllegalStateException("Unexpected state ".concat(String.valueOf(String.valueOf(cvkdVar2))));
                        }
                        cvkdVar = cvkd.INACTIVE;
                    }
                    for (cvkf cvkfVar2 : this.a.p) {
                        if (cvkfVar2 != cvkfVar) {
                            cvkfVar2.d(cvkdVar);
                        }
                    }
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, cvkd.HIGHLIGHTED, imageView, cvjdVar, cvkeVar, cvkeVar2, cvkeVar3);
        imageView.setOnClickListener(new eifs(this.u, "com/google/android/apps/messaging/ui/conversation/ComposeEntryPointsController", "proxyComposeButton", 669, str, new View.OnClickListener() { // from class: cvki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                cvkd cvkdVar;
                Runnable runnable;
                cczv cczvVar = cvkz.a;
                final ImageView imageView2 = imageView;
                imageView2.animate().scaleX(1.06f).scaleY(1.06f).setInterpolator(new lud()).setDuration(250L).withEndAction(new Runnable() { // from class: cvkk
                    @Override // java.lang.Runnable
                    public final void run() {
                        cczv cczvVar2 = cvkz.a;
                        imageView2.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new lud()).setDuration(167L);
                    }
                });
                cvkf cvkfVar = cvkvVar;
                int iOrdinal = cvkfVar.c.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    cvkdVar = cvkd.OPEN;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException("Unable to determine state after ".concat(String.valueOf(String.valueOf(cvkfVar.c))));
                    }
                    cvkdVar = cvkd.HIGHLIGHTED;
                }
                cvkfVar.d(cvkdVar);
                if (cvkdVar != cvkd.OPEN || (runnable = cvkfVar.a) == null) {
                    return;
                }
                runnable.run();
            }
        }));
        this.p.add(cvkvVar);
        return cvkvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.cvky f(defpackage.cvky[] r3, java.lang.String r4) {
        /*
            cczi r0 = defpackage.ccze.M
            java.lang.Object r1 = r0.e()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 < 0) goto L12
            int r2 = r3.length
            r2 = 3
            if (r1 < r2) goto L22
        L12:
            boolean r2 = defpackage.cqbe.c()
            if (r2 != 0) goto L25
            cczg r0 = (defpackage.cczg) r0
            java.lang.Object r4 = r0.c
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r1 = r4.intValue()
        L22:
            r3 = r3[r1]
            return r3
        L25:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unhandled \""
            java.lang.String r2 = "\" version "
            java.lang.String r4 = defpackage.a.B(r1, r4, r0, r2)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkz.f(cvky[], java.lang.String):cvky");
    }

    private final boolean g() {
        return crbf.d() && this.b.isPresent();
    }

    private final cvkf h(ImageView imageView, int i, int i2, cvky cvkyVar, int i3, String str) {
        int i4 = cvkyVar.a;
        return e(imageView, new cvke(i4, i, i3), new cvke(i4, i, i3), new cvke(cvkyVar.b, i2, R.string.keyboard_content_description, cvkyVar.e), cvkyVar.c, cvkyVar.d, str);
    }

    public final ConstraintLayout a() {
        return ((Boolean) ccze.n.e()).booleanValue() ? this.c : this.c.H().c.h;
    }

    public final void b(final ImageView imageView, int i, int i2) {
        ComposeMessageView composeMessageView = this.c;
        final Drawable drawable = composeMessageView.getContext().getDrawable(i);
        final String string = composeMessageView.getContext().getString(i2);
        if (imageView.getVisibility() != 0) {
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(string);
        } else {
            imageView.clearAnimation();
            imageView.animate().scaleX(0.0f).scaleY(0.0f).setDuration(75L).setInterpolator(new AccelerateInterpolator()).withEndAction(new Runnable() { // from class: cvkj
                @Override // java.lang.Runnable
                public final void run() {
                    ImageView imageView2 = imageView;
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(string);
                    this.a.e.animate().scaleX(1.0f).scaleY(1.0f).setDuration(75L).setInterpolator(new DecelerateInterpolator()).start();
                }
            }).start();
        }
    }

    final void c() {
        ImageView imageView = this.v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.k.l(R.id.compress_info_image_view, this.d.getVisibility());
        TransitionManager.beginDelayedTransition(a(), this.n);
        this.k.b(a());
    }

    public final void d() {
        ComposeMessageView composeMessageView = this.c;
        TransitionInflater transitionInflaterFrom = TransitionInflater.from(composeMessageView.getContext());
        cczi ccziVar = crbf.aV;
        this.m = transitionInflaterFrom.inflateTransition(true != ((Boolean) ccziVar.e()).booleanValue() ? R.transition.compose_icons_collapse_transition : R.transition.compose_icons_collapse_transition_magic_compose);
        this.n = TransitionInflater.from(composeMessageView.getContext()).inflateTransition(true != ((Boolean) ccziVar.e()).booleanValue() ? R.transition.compose_icons_expand_transition : R.transition.compose_icons_expand_transition_magic_compose);
    }
}
