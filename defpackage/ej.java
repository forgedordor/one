package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ej {
    static eh a(Context context, ea eaVar, boolean z, boolean z2) throws Resources.NotFoundException {
        int iW;
        boolean z3;
        dv dvVar = eaVar.T;
        int iB = 0;
        int i = dvVar == null ? 0 : dvVar.f;
        if (z2) {
            if (z) {
                iW = eaVar.x();
                z3 = true;
            } else {
                iW = eaVar.y();
                z3 = false;
            }
        } else if (z) {
            iW = eaVar.v();
            z3 = true;
        } else {
            iW = eaVar.w();
            z3 = false;
        }
        boolean z4 = z3;
        eaVar.as(0, 0, 0, 0);
        ViewGroup viewGroup = eaVar.P;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            eaVar.P.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = eaVar.P;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        eaVar.aR(i, iW);
        eaVar.aS(i, iW);
        if (iW != 0) {
            iB = iW;
        } else if (i != 0) {
            iB = i != 4097 ? i != 8194 ? i != 8197 ? i != 4099 ? i != 4100 ? -1 : z4 ? b(context, android.R.attr.activityOpenEnterAnimation) : b(context, android.R.attr.activityOpenExitAnimation) : true != z3 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z4 ? b(context, android.R.attr.activityCloseEnterAnimation) : b(context, android.R.attr.activityCloseExitAnimation) : true != z3 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z3 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new eh(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new eh(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new eh(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int b(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
