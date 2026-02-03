package com.google.android.apps.messaging.conversation.reactions.ui.selection;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.eksp;
import defpackage.unl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReactionSelectionRecyclerView extends unl {
    static {
        eksp.c("BugleReactions");
    }

    public ReactionSelectionRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.scrollable_reactions_selection_bar_recycler_view_width);
        setLayoutParams(layoutParams);
    }
}
