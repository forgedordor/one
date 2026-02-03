package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxy extends wv {
    public final LottieAnimationView s;
    public final LottieAnimationView t;

    private acxy(View view) {
        super(view);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.ghost_loading_intro);
        this.s = lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) view.findViewById(R.id.ghost_loading_loop);
        this.t = lottieAnimationView2;
        eebh eebhVarC = eebg.c(view.getContext());
        eebd.d(eebm.a, lottieAnimationView, eebhVarC);
        eebd.d(eebn.a, lottieAnimationView2, eebhVarC);
        view.addOnAttachStateChangeListener(new acxw(this));
    }

    public static acxy C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new acxy(layoutInflater.inflate(R.layout.conversation_list_loading_item_lottie, viewGroup, false));
    }
}
