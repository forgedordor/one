package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.widget.ImageButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumi implements View.OnClickListener {
    final /* synthetic */ ImageButton a;
    final /* synthetic */ eumy b;

    public eumi(eumy eumyVar, ImageButton imageButton) {
        this.a = imageButton;
        this.b = eumyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eumy eumyVar = this.b;
        if (eumyVar.N) {
            ImageButton imageButton = this.a;
            AnimatedVectorDrawable animatedVectorDrawable = eumyVar.m;
            imageButton.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            int width = eumyVar.I.getWidth();
            ViewGroup viewGroup = eumyVar.f;
            int width2 = viewGroup.getWidth();
            float f = width2;
            float x = viewGroup.getX();
            eumt eumtVar = new eumt(eumyVar, width, width2, x, x + viewGroup.getWidth());
            eumu eumuVar = new eumu(eumyVar, eumyVar.I.getHeight(), viewGroup.getHeight(), viewGroup.getY() + viewGroup.getHeight());
            float x2 = eumyVar.i.getX();
            eumg eumgVar = new eumg(eumyVar, x2, eumyVar.q() ? (x2 - f) + r2.getWidth() : (f + x2) - r2.getWidth(), width2);
            Interpolator interpolator = eumyVar.p;
            eumtVar.setInterpolator(interpolator);
            eumtVar.setDuration(eumyVar.t());
            eumuVar.setInterpolator(eumyVar.o);
            eumuVar.setDuration(eumyVar.t());
            eumgVar.setInterpolator(interpolator);
            eumgVar.setDuration(eumyVar.t());
            AnimationSet animationSet = eumyVar.w;
            animationSet.getAnimations().clear();
            animationSet.addAnimation(eumtVar);
            animationSet.addAnimation(eumuVar);
            animationSet.addAnimation(eumgVar);
            viewGroup.startAnimation(animationSet);
            eumyVar.N = false;
            eumyVar.g.animate().alpha(1.0f).withLayer().setInterpolator(eumyVar.r).setDuration(100L).start();
            eumyVar.h.animate().alpha(0.0f).withLayer().setInterpolator(eumyVar.q).setDuration(150L).start();
            return;
        }
        ImageButton imageButton2 = this.a;
        AnimatedVectorDrawable animatedVectorDrawable2 = eumyVar.l;
        imageButton2.setImageDrawable(animatedVectorDrawable2);
        animatedVectorDrawable2.start();
        int width3 = eumyVar.H.getWidth();
        float f2 = width3;
        int height = eumyVar.H.getHeight();
        ViewGroup viewGroup2 = eumyVar.f;
        int width4 = viewGroup2.getWidth();
        int height2 = viewGroup2.getHeight();
        float y = viewGroup2.getY();
        float x3 = viewGroup2.getX();
        eumq eumqVar = new eumq(eumyVar, width3, width4, x3, x3 + viewGroup2.getWidth());
        eumr eumrVar = new eumr(eumyVar, height, height2, y);
        float x4 = eumyVar.i.getX();
        eums eumsVar = new eums(eumyVar, x4, eumyVar.q() ? (f2 + x4) - r4.getWidth() : (x4 - f2) + r4.getWidth(), width4);
        eumqVar.setInterpolator(eumyVar.o);
        eumqVar.setDuration(eumyVar.t());
        Interpolator interpolator2 = eumyVar.p;
        eumrVar.setInterpolator(interpolator2);
        eumrVar.setDuration(eumyVar.t());
        eumsVar.setInterpolator(interpolator2);
        eumsVar.setDuration(eumyVar.t());
        AnimationSet animationSet2 = eumyVar.v;
        animationSet2.getAnimations().clear();
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(eumqVar);
        animationSet2.addAnimation(eumrVar);
        animationSet2.addAnimation(eumsVar);
        viewGroup2.startAnimation(animationSet2);
        eumyVar.N = true;
        eumyVar.g.animate().alpha(0.0f).withLayer().setInterpolator(eumyVar.q).setDuration(250L).start();
        eumyVar.h.setAlpha(1.0f);
    }
}
