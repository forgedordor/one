package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.eftq;
import defpackage.eftu;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SectionItem extends ItemGroup {
    private final Item d;

    public SectionItem() {
        SectionHeaderItem sectionHeaderItem = new SectionHeaderItem();
        this.d = sectionHeaderItem;
        sectionHeaderItem.h(false);
        h(sectionHeaderItem);
    }

    private final void i() {
        Item item = this.d;
        if (item.d) {
            if (a() == 1) {
                item.h(false);
            }
        } else {
            if (a() <= 0 || item.c == null) {
                return;
            }
            item.h(true);
        }
    }

    @Override // com.google.android.setupdesign.items.ItemGroup
    public final void f(eftu eftuVar, int i) {
        super.f(eftuVar, i);
        i();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup
    public final void g(eftu eftuVar, int i) {
        super.g(eftuVar, i);
        i();
    }

    public final void h(eftu eftuVar) {
        this.c = true;
        this.b.add(eftuVar);
        ((AbstractItemHierarchy) eftuVar).a.add(this);
        if (eftuVar.a() > 0) {
            e(super.b(eftuVar));
        }
        i();
    }

    public SectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.r);
        CharSequence text = typedArrayObtainStyledAttributes.getText(0);
        typedArrayObtainStyledAttributes.recycle();
        SectionHeaderItem sectionHeaderItem = new SectionHeaderItem();
        this.d = sectionHeaderItem;
        sectionHeaderItem.c = text;
        sectionHeaderItem.b();
        sectionHeaderItem.h(false);
        h(sectionHeaderItem);
    }
}
