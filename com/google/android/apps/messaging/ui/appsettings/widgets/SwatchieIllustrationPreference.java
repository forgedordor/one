package com.google.android.apps.messaging.ui.appsettings.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import defpackage.cpch;
import defpackage.cqtf;
import defpackage.cuiu;
import defpackage.eebd;
import defpackage.eebe;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.fdbq;
import defpackage.pab;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SwatchieIllustrationPreference extends Preference {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/ui/appsettings/widgets/SwatchieIllustrationPreference");
    public LottieAnimationView a;
    public eebe b;

    /* compiled from: PG */
    public interface a {
        cpch a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwatchieIllustrationPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.A = R.layout.swatchie_illustration_preference;
    }

    @Override // androidx.preference.Preference
    public final void a(pab pabVar) throws Resources.NotFoundException {
        pabVar.getClass();
        super.a(pabVar);
        View viewC = pabVar.C(R.id.lottie_view);
        viewC.getClass();
        this.a = (LottieAnimationView) viewC;
        Context context = this.j;
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        View viewC2 = pabVar.C(R.id.illustration_frame);
        viewC2.getClass();
        FrameLayout frameLayout = (FrameLayout) viewC2;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.width = Math.min(i, i2);
        frameLayout.setLayoutParams(layoutParams);
        context.getClass();
        int iA = cuiu.a(context);
        View viewC3 = pabVar.C(R.id.background_view);
        viewC3.getClass();
        ImageView imageView = (ImageView) viewC3;
        imageView.setColorFilter(iA);
        boolean zG = ((a) cqtf.a(a.class)).a().g();
        eebe eebeVar = this.b;
        if (eebeVar != null) {
            eebd.e(eebeVar, k(), zG);
        } else {
            ekrw ekrwVarE = c.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/ui/appsettings/widgets/SwatchieIllustrationPreference", "onBindViewHolder", 61, "SwatchieIllustrationPreference.kt")).q("No illustration set for SwatchieIllustrationPreference");
        }
        LottieAnimationView lottieAnimationViewK = k();
        Resources resources = imageView.getResources();
        resources.getClass();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.settings_illustration_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.settings_illustration_height);
        imageView.setMaxHeight(dimensionPixelSize2);
        lottieAnimationViewK.setMaxHeight(dimensionPixelSize2);
        float f = dimensionPixelSize2;
        lottieAnimationViewK.setMaxWidth((int) (f * (dimensionPixelSize / f)));
    }

    public final LottieAnimationView k() {
        LottieAnimationView lottieAnimationView = this.a;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        fdbq.c("illustrationView");
        return null;
    }
}
