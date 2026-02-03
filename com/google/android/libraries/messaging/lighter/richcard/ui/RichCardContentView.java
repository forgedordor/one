package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import defpackage.dwye;
import defpackage.dwyo;
import defpackage.fbfm;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RichCardContentView extends FrameLayout implements dwye {
    public RichCardContentView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public RichCardContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RichCardContentView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        dwyo.a(getContext(), fbfm.e());
        dwyo.a(getContext(), fbfm.d());
        getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding);
    }
}
