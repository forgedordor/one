package com.google.android.libraries.compose.proxy.ui.search;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.douo;
import defpackage.doup;
import defpackage.eemh;
import defpackage.eexh;
import defpackage.fdbq;
import defpackage.qx;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SearchBarView extends qx {
    private Rect a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context) {
        this(context, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchBarStyle);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(eexh.a(context, attributeSet, i, 0), attributeSet, i);
        context.getClass();
        float dimension = getResources().getDimension(R.dimen.google_opensearchbar_radius);
        TypedArray typedArrayA = eemh.a(context, attributeSet, douo.a, i, 0, new int[0]);
        int resourceId = typedArrayA.getResourceId(0, -1);
        String string = typedArrayA.getString(1);
        String string2 = typedArrayA.getString(2);
        typedArrayA.recycle();
        if (resourceId != -1) {
            setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setClickable(true);
        setFocusable(true);
        setClipToOutline(true);
        float elevation = getElevation() * 0.8f;
        float elevation2 = getElevation() * 0.5f;
        Rect rect = null;
        if (this.a == null) {
            Rect rect2 = new Rect();
            Drawable background = getBackground();
            InsetDrawable insetDrawable = background instanceof InsetDrawable ? (InsetDrawable) background : null;
            if (insetDrawable != null) {
                insetDrawable.getPadding(rect2);
            }
            this.a = rect2;
        }
        Rect rect3 = this.a;
        if (rect3 == null) {
            fdbq.c("backgroundInsets");
        } else {
            rect = rect3;
        }
        setOutlineProvider(new doup((int) elevation2, rect, (int) elevation, dimension));
    }
}
