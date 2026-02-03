package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dwye;
import defpackage.dwyo;
import defpackage.fbfm;
import defpackage.tf;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CardCarouselView extends RecyclerView implements dwye {
    private final tf ab;

    public CardCarouselView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public CardCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardCarouselView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        setPadding(getResources().getDimensionPixelSize(R.dimen.rich_card_start_end_padding), 0, 0, 0);
        setClipToPadding(false);
        tf tfVar = new tf(getContext());
        this.ab = tfVar;
        Drawable drawable = getContext().getDrawable(R.drawable.rich_card_divider);
        if (drawable != null) {
            tfVar.a = drawable;
            if (!fbfm.h()) {
                v(tfVar);
            }
            setNestedScrollingEnabled(false);
            if (fbfm.h()) {
                dwyo.a(getContext(), fbfm.e());
                dwyo.a(getContext(), fbfm.d());
                getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
    }
}
