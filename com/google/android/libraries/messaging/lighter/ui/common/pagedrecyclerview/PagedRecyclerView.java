package com.google.android.libraries.messaging.lighter.ui.common.pagedrecyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.dwyl;
import defpackage.dwys;
import defpackage.dwyt;
import defpackage.dwyv;
import defpackage.ejwm;
import defpackage.ekeh;
import defpackage.ku;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PagedRecyclerView extends RecyclerView {
    public final LinearLayoutManager ab;
    public Drawable ac;
    private dwyv ad;

    public PagedRecyclerView(Context context) {
        this(context, null);
    }

    public PagedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        Drawable drawableA;
        super(context, attributeSet, i);
        getContext();
        dwys dwysVar = new dwys();
        this.ab = dwysVar;
        ao(dwysVar);
        al(new dwyt());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dwyl.b, i, 0);
        dwyv dwyvVar = dwyv.MORE_ON_BOTTOM;
        final int integer = typedArrayObtainStyledAttributes.getInteger(1, dwyvVar.c);
        this.ad = (dwyv) ekeh.e(dwyv.values()).a(new ejwm() { // from class: dwyu
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((dwyv) obj).c == integer;
            }
        }).e(dwyvVar);
        this.ac = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (drawableA = ku.a(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getDrawable(0) : drawableA;
        typedArrayObtainStyledAttributes.recycle();
        dwysVar.ad(this.ad == dwyv.MORE_ON_TOP);
    }
}
