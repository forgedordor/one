package com.google.android.libraries.messaging.lighter.ui.conversationheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.kty;
import defpackage.kub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationHeaderScrollingViewBehavior extends kty<View> {
    public ConversationHeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.kty
    public final boolean k(View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // defpackage.kty
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        kub kubVar = (kub) view.getLayoutParams();
        if (kubVar.topMargin != view2.getBottom()) {
            kubVar.setMargins(kubVar.leftMargin, view2.getBottom(), kubVar.rightMargin, kubVar.bottomMargin);
            view.setLayoutParams(kubVar);
        }
    }
}
