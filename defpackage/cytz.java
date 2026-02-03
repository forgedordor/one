package defpackage;

import android.view.animation.Animation;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedAutoCompleteList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytz implements Animation.AnimationListener {
    final /* synthetic */ SpannedAutoCompleteList a;

    public cytz(SpannedAutoCompleteList spannedAutoCompleteList) {
        this.a = spannedAutoCompleteList;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SpannedAutoCompleteList spannedAutoCompleteList = this.a;
        if (!spannedAutoCompleteList.b) {
            spannedAutoCompleteList.setVisibility(8);
            spannedAutoCompleteList.a.setVisibility(8);
            spannedAutoCompleteList.a.layout(0, 0, 0, 0);
        }
        spannedAutoCompleteList.a.setVerticalScrollBarEnabled(true);
        spannedAutoCompleteList.c = null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
