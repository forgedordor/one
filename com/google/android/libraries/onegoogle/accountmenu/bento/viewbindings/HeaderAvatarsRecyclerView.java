package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.bento.common.BentoRecyclerView;
import defpackage.dyem;
import defpackage.vo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class HeaderAvatarsRecyclerView extends BentoRecyclerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAvatarsRecyclerView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        vo voVar = this.n;
        if (voVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        if ((voVar instanceof dyem ? (dyem) voVar : null) == null) {
            throw new IllegalArgumentException("Only HeaderAvatarsAdapter can be used as an adapter for HeaderAvatarsRecyclerView.");
        }
        getContext().getClass();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAvatarsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderAvatarsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
