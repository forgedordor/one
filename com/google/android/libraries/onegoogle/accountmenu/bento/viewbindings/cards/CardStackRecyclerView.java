package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import defpackage.eehg;
import defpackage.eejk;
import defpackage.vv;
import defpackage.wj;
import defpackage.ws;
import defpackage.xz;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CardStackRecyclerView extends BentoRecyclerView {

    /* compiled from: PG */
    public static final class LayoutManagerWithoutAccessibilityIndication extends LinearLayoutManager {
        @Override // defpackage.wb
        public final int bT(wj wjVar, ws wsVar) {
            wjVar.getClass();
            wsVar.getClass();
            return 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context) {
        super(context);
        context.getClass();
        eejk eejkVar = new eejk(getContext());
        eejkVar.c(eehg.c(getContext(), R.attr.colorSurfaceContainer, 0));
        eejkVar.d();
        eejkVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        v(eejkVar);
        getContext().getClass();
        ao(new LayoutManagerWithoutAccessibilityIndication());
        setNestedScrollingEnabled(false);
        vv vvVar = this.E;
        vvVar = true != (vvVar instanceof xz) ? null : vvVar;
        if (vvVar != null) {
            ((xz) vvVar).u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        eejk eejkVar = new eejk(getContext());
        eejkVar.c(eehg.c(getContext(), R.attr.colorSurfaceContainer, 0));
        eejkVar.d();
        eejkVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        v(eejkVar);
        getContext().getClass();
        ao(new LayoutManagerWithoutAccessibilityIndication());
        setNestedScrollingEnabled(false);
        vv vvVar = this.E;
        vvVar = true != (vvVar instanceof xz) ? null : vvVar;
        if (vvVar != null) {
            ((xz) vvVar).u();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        eejk eejkVar = new eejk(getContext());
        eejkVar.c(eehg.c(getContext(), R.attr.colorSurfaceContainer, 0));
        eejkVar.d();
        eejkVar.a = getContext().getResources().getDimensionPixelSize(R.dimen.og_bento_card_stack_divider_width);
        v(eejkVar);
        getContext().getClass();
        ao(new LayoutManagerWithoutAccessibilityIndication());
        setNestedScrollingEnabled(false);
        vv vvVar = this.E;
        vvVar = true != (vvVar instanceof xz) ? null : vvVar;
        if (vvVar != null) {
            ((xz) vvVar).u();
        }
    }
}
