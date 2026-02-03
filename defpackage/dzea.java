package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzea extends AnimatorListenerAdapter {
    final /* synthetic */ dzeb a;

    public dzea(dzeb dzebVar) {
        this.a = dzebVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        final TooltipView tooltipView = this.a.a;
        dyml dymlVar = tooltipView.j;
        if (dymlVar != null) {
            dzdv dzdvVar = tooltipView.i;
            final dymm dymmVar = dymlVar.a;
            dymmVar.e(tooltipView, 105604);
            dymmVar.e(dzdvVar, 90573);
            dzdvVar.setOnClickListener(new View.OnClickListener() { // from class: dymh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dymmVar.f(view);
                }
            });
            final dzdp dzdpVar = dymlVar.d;
            final dzdh dzdhVar = dymlVar.c;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dymi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dymm dymmVar2 = dymmVar;
                    if (((dymg) dymmVar2.a).e) {
                        ((SelectedAccountDisc) dzdhVar).performClick();
                    }
                    dzdp dzdpVar2 = dzdpVar;
                    dymmVar2.f(tooltipView);
                    dzdpVar2.a();
                }
            };
            dymt dymtVar = dymlVar.b;
            dymtVar.setOnClickListener(onClickListener);
            dymtVar.findViewById(R.id.og_tooltip_dismiss_button).setOnClickListener(new View.OnClickListener() { // from class: dymj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dymmVar.f(tooltipView);
                    dzdpVar.a();
                }
            });
        }
    }
}
