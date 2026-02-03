package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.gaia.expresssignin.HqmsExpressSignInTopView;
import com.google.android.apps.messaging.ui.rcs.consent.InterceptTouchConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbu {
    public static final cczi a = cdag.g(cdag.b, "express_sign_in_top_view_learn_more_url", "https://support.google.com/messages?p=google_account_messages");
    public static final cczi b = cdag.h(cdag.b, "express_sign_in_top_view_scroll_to_how_it_works_link_by_default", false);
    public final fcsu c;
    public final czrc d;
    private final Activity e;
    private final eigp f;

    public acbu(HqmsExpressSignInTopView hqmsExpressSignInTopView, fcsu fcsuVar, fcsu fcsuVar2, eigp eigpVar) {
        ConstraintLayout constraintLayout;
        this.c = fcsuVar;
        this.e = (Activity) fcsuVar2.b();
        this.f = eigpVar;
        TextView textView = (TextView) hqmsExpressSignInTopView.findViewById(R.id.how_it_works_link_overlap_with_subtitle_fix);
        hqmsExpressSignInTopView.findViewById(R.id.how_it_works_link_overlap_with_subtitle_fix).setVisibility(0);
        hqmsExpressSignInTopView.findViewById(R.id.esi_subtitle_overlap_with_subtitle_fix).setVisibility(0);
        hqmsExpressSignInTopView.findViewById(R.id.how_it_works_link).setVisibility(4);
        hqmsExpressSignInTopView.findViewById(R.id.esi_subtitle).setVisibility(4);
        final Context context = hqmsExpressSignInTopView.getContext();
        Resources resources = context.getResources();
        SpannableStringBuilder spannableStringBuilderE = dajs.e(context, resources.getString(R.string.tooltip_content_with_line_break_fix), resources.getString(R.string.tooltip_link), new eifs(eigpVar, "com/google/android/apps/messaging/gaia/expresssignin/HqmsExpressSignInTopViewPeer", "getTooltipText", 164, "HqmsExpressSignInTopViewPeer#clickLearnMore", new View.OnClickListener() { // from class: acbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((achu) this.a.c.b()).d(context, (String) acbu.a.e());
            }
        }));
        View view = textView;
        while (!(view instanceof ConstraintLayout)) {
            if (view != null) {
                Object parent = view.getParent();
                if (parent == null) {
                    constraintLayout = null;
                    break;
                }
                view = (View) parent;
            }
            if (view == null) {
                constraintLayout = null;
                break;
            }
        }
        constraintLayout = (ConstraintLayout) view;
        if (constraintLayout == null) {
            throw new IllegalArgumentException("WelcomeTooltip must have a ConstraintLayout in its parent hierarchy");
        }
        czrc czrcVar = new czrc(textView, LayoutInflater.from(constraintLayout.getContext()), constraintLayout);
        czrcVar.b.setText(spannableStringBuilderE);
        this.d = czrcVar;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.e.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        czrcVar.i = (displayMetrics.widthPixels * 251) / 360;
        TextView textView2 = (TextView) czrcVar.e.findViewById(R.id.tooltip_text);
        textView2.setTextAppearance(R.style.TextAppearance_GoogleMaterial3_Body2);
        textView2.setTextColor(eehg.b(textView2, R.attr.colorOnSurfaceVariant));
        eebt.d(textView2, LinkMovementMethod.getInstance());
        eebt.c(textView2);
        ((InterceptTouchConstraintLayout) hqmsExpressSignInTopView.findViewById(R.id.esi_content)).i = new czqu(czrcVar);
        Activity activity = this.e;
        if (activity instanceof abi) {
            ((abi) activity).c().b((abi) this.e, czrcVar.f);
        }
        textView.setOnClickListener(new eifs(eigpVar, "com/google/android/apps/messaging/gaia/expresssignin/HqmsExpressSignInTopViewPeer", "<init>", 96, "HqmsExpressSignInTopViewPeer#clickHowItWorks", new View.OnClickListener() { // from class: acbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czrc czrcVar2 = this.a.d;
                int i = czrcVar2.l;
                if (i == 0) {
                    czrcVar2.b.sendAccessibilityEvent(32768);
                    return;
                }
                if (i == 2) {
                    czrcVar2.g.removeAllListeners();
                    czrcVar2.g.cancel();
                }
                if (czrcVar2.l == 3) {
                    FrameLayout frameLayout = czrcVar2.a;
                    frameLayout.setVisibility(0);
                    ViewGroup viewGroup = czrcVar2.d;
                    viewGroup.addView(frameLayout);
                    if (!czrcVar2.h) {
                        ktp ktpVar = new ktp();
                        ktpVar.i(frameLayout.getId(), -2);
                        int id = frameLayout.getId();
                        View view3 = czrcVar2.c;
                        int id2 = view3.getId();
                        int id3 = view3.getId();
                        ktpVar.g(id, 6, id2, 6, 0);
                        ktpVar.g(id, 7, id3, 7, 0);
                        ktk ktkVar = (ktk) ktpVar.b.get(Integer.valueOf(id));
                        if (ktkVar != null) {
                            ktkVar.d.y = 0.5f;
                        }
                        int iApplyDimension = (int) TypedValue.applyDimension(1, 8.0f, frameLayout.getContext().getResources().getDisplayMetrics());
                        ktpVar.b(frameLayout.getId()).d.e = (int) frameLayout.getResources().getDimension(R.dimen.welcome_tooltip_max_height);
                        if (czrcVar2.i != 0) {
                            ktpVar.i(frameLayout.getId(), czrcVar2.i);
                        }
                        czrcVar2.j.isPresent();
                        czrcVar2.k.isPresent();
                        ktpVar.g(frameLayout.getId(), 4, view3.getId(), 3, iApplyDimension);
                        ktpVar.b(frameLayout.getId()).b.d = frameLayout.getAlpha();
                        ktpVar.c((ConstraintLayout) viewGroup);
                        czrcVar2.h = true;
                    }
                }
                int i2 = czrcVar2.l;
                if (i2 == 3 || i2 == 2) {
                    float alpha = czrcVar2.a.getAlpha();
                    ValueAnimator valueAnimatorA = czrcVar2.a(alpha, 1.0f);
                    valueAnimatorA.setDuration((long) ((1.0f - alpha) * 150.0f));
                    valueAnimatorA.addListener(new czra(czrcVar2));
                    valueAnimatorA.start();
                    czrcVar2.g = valueAnimatorA;
                }
                czrcVar2.b.sendAccessibilityEvent(32768);
                czrcVar2.l = 1;
                czrcVar2.f.h(true);
            }
        }));
        if (((Boolean) b.e()).booleanValue()) {
            ScrollView scrollView = (ScrollView) hqmsExpressSignInTopView.findViewById(R.id.scroll_view);
            scrollView.addOnLayoutChangeListener(new acbt(scrollView, textView));
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) hqmsExpressSignInTopView.findViewById(R.id.express_sign_in_illustration);
        lottieAnimationView.f(R.raw.hqms_illustration);
        lottieAnimationView.d();
    }
}
