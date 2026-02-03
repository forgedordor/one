package com.google.android.apps.messaging.ui.mediapicker.c2o.selectable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import defpackage.cqei;
import defpackage.czer;
import defpackage.uig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SelectableContentItemView extends czer {
    public cqei f;
    public TextView g;
    public View h;
    public MediaContentItem i;
    public uig j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    protected final View.OnClickListener o;

    public SelectableContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new View.OnClickListener() { // from class: czev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        this.m = false;
        this.n = -1;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.m;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (TextView) findViewById(R.id.content_selected_index_overlay);
        this.h = findViewById(R.id.content_selected_tint);
        this.k = getResources().getColor(R.color.c2o_content_item_tint_start_color);
        this.l = getResources().getColor(R.color.c2o_content_item_tint_end_color);
        setClipToOutline(true);
    }
}
