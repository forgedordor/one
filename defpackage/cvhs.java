package defpackage;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhs implements cpbb {
    public final LinearLayout a;
    public final LayoutTransition b;
    public final int c;
    public int d;
    public ImageView e;
    public LinearLayout f;
    public int g;
    public dajw h;
    public final AttachmentsContainer i;
    public final Context j;
    public final fcsu k;
    public int l = 1;
    public int m;
    private Animator n;

    public cvhs(AttachmentsContainer attachmentsContainer, fcsu fcsuVar, fcsu fcsuVar2) throws Resources.NotFoundException {
        new HashMap();
        this.g = 0;
        new ArrayList();
        this.m = 1;
        this.i = attachmentsContainer;
        Context context = (Context) fcsuVar2.b();
        this.j = context;
        this.k = fcsuVar;
        ekgp ekgpVar = ekoj.a;
        int i = ekgb.d;
        new cvhx(ekgpVar, ekoe.a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        LayoutTransition layoutTransition = new LayoutTransition();
        this.b = layoutTransition;
        layoutTransition.disableTransitionType(3);
        layoutTransition.disableTransitionType(4);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.compose_attachment_container_height);
        Math.round(context.getResources().getDimension(R.dimen.compress_info_image_view_hide_threshold));
        context.getResources().getString(R.string.media_compress_info);
        context.getResources().getString(R.string.video_compress_info);
        context.getResources().getString(R.string.image_compress_info);
        attachmentsContainer.addView(linearLayout);
    }

    public final void a() {
        dajw dajwVar = this.h;
        if (dajwVar != null) {
            dajwVar.a();
        }
    }

    public final void b(int i, int i2) {
        Animator animator = this.n;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "animatedHeight", i, i2);
        this.n = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(this.j.getResources().getInteger(R.integer.attachment_container_animation_duration));
        this.n.setInterpolator(cqei.a);
        this.n.setStartDelay(this.g);
        this.n.addListener(new cvhr(this, i2));
        this.n.start();
        this.l = i2 == 0 ? 4 : 2;
    }

    public void setAnimatedHeight(int i) {
        if (this.d != i) {
            this.d = i;
            this.i.requestLayout();
        }
    }
}
