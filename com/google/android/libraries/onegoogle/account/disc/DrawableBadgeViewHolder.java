package com.google.android.libraries.onegoogle.account.disc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.messaging.R;
import defpackage.dsva;
import defpackage.dxyz;
import defpackage.dxzi;
import defpackage.dxzj;
import defpackage.dxzk;
import defpackage.dxzl;
import defpackage.dyyb;
import defpackage.ecem;
import defpackage.ejwh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class DrawableBadgeViewHolder {
    public final BadgeFrameLayout a;
    public final AvatarView b;
    public dyyb c;
    public Animator d = null;
    public dsva e;
    private dxyz f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PG */
    public static class AlphaLayerDrawable extends LayerDrawable implements Drawable.Callback {
        private final Drawable a;
        private final Drawable b;

        public AlphaLayerDrawable(Drawable drawable, Drawable drawable2) {
            super(new Drawable[]{drawable, drawable2});
            this.a = drawable;
            this.b = drawable2;
            drawable2.setCallback(this);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public int getAlpha() {
            return this.b.getAlpha();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final int getOpacity() {
            return this.a.getOpacity();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            Drawable drawable = this.b;
            drawable.setAlpha(i);
            drawable.invalidateSelf();
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.a.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    public DrawableBadgeViewHolder(BadgeFrameLayout badgeFrameLayout, AvatarView avatarView) {
        this.a = badgeFrameLayout;
        avatarView.d();
        this.b = avatarView;
    }

    private static Drawable b(dxyz dxyzVar) {
        if (dxyzVar == null) {
            return null;
        }
        return dxyzVar.a();
    }

    public final void a(dxyz dxyzVar, boolean z) {
        ObjectAnimator objectAnimatorOfInt;
        ecem.c();
        if (ejwh.a(this.f, dxyzVar)) {
            return;
        }
        Drawable drawableB = b(this.f);
        this.f = dxyzVar;
        Drawable drawableB2 = b(dxyzVar);
        if (drawableB == null) {
            objectAnimatorOfInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 0.0f, 1.0f);
            objectAnimatorOfInt.addListener(new dxzk(this, drawableB2));
        } else if (dxyzVar == null) {
            objectAnimatorOfInt = ObjectAnimator.ofFloat(this.b, "badgeScale", 1.0f, 0.0f);
            objectAnimatorOfInt.addListener(new dxzl(this));
        } else {
            AlphaLayerDrawable alphaLayerDrawable = new AlphaLayerDrawable(drawableB, drawableB2);
            objectAnimatorOfInt = ObjectAnimator.ofInt(alphaLayerDrawable, "alpha", 0, 255);
            objectAnimatorOfInt.addListener(new dxzj(this, alphaLayerDrawable, drawableB2));
        }
        objectAnimatorOfInt.setDuration(z ? this.b.getResources().getInteger(R.integer.og_decoration_transition_duration) : 0L);
        objectAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfInt.addListener(new dxzi(this, dxyzVar));
        Animator animator = this.d;
        if (animator != null) {
            animator.end();
        }
        this.d = objectAnimatorOfInt;
        objectAnimatorOfInt.start();
    }
}
