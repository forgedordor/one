package com.google.android.apps.messaging.ui.conversationlist.fab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cwwy;
import defpackage.cwwz;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.kty;
import defpackage.lud;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationListFabBehavior extends kty<Button> {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversationlist/fab/ConversationListFabBehavior");
    private final Object b;
    private Animation c;
    private Animation d;
    private int e;

    public ConversationListFabBehavior() {
        this.b = new Object();
        this.e = -1;
    }

    private final void t(View view) {
        Object obj = this.b;
        int width = view.getWidth();
        synchronized (obj) {
            int i = this.e - width;
            if (i < 0) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/conversationlist/fab/ConversationListFabBehavior", "expand", 112, "ConversationListFabBehavior.java")).q("widthToGrow is negative!");
                return;
            }
            Animation animation = this.d;
            if (animation != null) {
                animation.cancel();
                this.d = null;
            }
            if (this.c != null) {
                return;
            }
            cwwy cwwyVar = new cwwy(view, width, i);
            this.c = cwwyVar;
            cwwyVar.setDuration((int) (this.e / view.getContext().getResources().getDisplayMetrics().density));
            this.c.setInterpolator(new lud());
            view.startAnimation(this.c);
        }
    }

    @Override // defpackage.kty
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // defpackage.kty
    public final /* synthetic */ boolean k(View view, View view2) {
        return view2 instanceof RecyclerView;
    }

    @Override // defpackage.kty
    public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Button button = (Button) view;
        if (((RecyclerView) view2).computeVerticalScrollOffset() == 0) {
            t(button);
        }
    }

    @Override // defpackage.kty
    public final /* bridge */ /* synthetic */ void p(View view, int i) {
        Button button = (Button) view;
        if (i <= 10 || button.getVisibility() != 0) {
            if (i >= -10 || button.getVisibility() != 0) {
                return;
            }
            t(button);
            return;
        }
        synchronized (this.b) {
            if (this.e <= 0) {
                this.e = button.getMeasuredWidth();
            }
        }
        int width = button.getWidth();
        int measuredHeight = button.getMeasuredHeight();
        int i2 = width - measuredHeight;
        if (i2 < 0) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/conversationlist/fab/ConversationListFabBehavior", "collapse", 165, "ConversationListFabBehavior.java")).q("widthToShrink is negative!");
            return;
        }
        synchronized (this.b) {
            Animation animation = this.c;
            if (animation != null) {
                animation.cancel();
                this.c = null;
            }
            if (this.d != null) {
                return;
            }
            cwwz cwwzVar = new cwwz(button, measuredHeight, width, i2);
            this.d = cwwzVar;
            cwwzVar.setDuration((int) (width / button.getContext().getResources().getDisplayMetrics().density));
            this.d.setInterpolator(new lud());
            button.startAnimation(this.d);
        }
    }

    public ConversationListFabBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Object();
        this.e = -1;
    }
}
