package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.a;
import defpackage.eftq;
import defpackage.eftu;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class AbstractItemHierarchy implements eftu {
    public final ArrayList a = new ArrayList();

    public AbstractItemHierarchy() {
    }

    public final void c(int i) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", a.g(i, "notifyItemRangeChanged: Invalid position="));
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ItemGroup itemGroup = (ItemGroup) arrayList.get(i2);
            int iB = itemGroup.b(this);
            if (iB >= 0) {
                itemGroup.c(iB + i);
            } else {
                Log.e("ItemGroup", "Unexpected child change ".concat(toString()));
            }
        }
    }

    public final void d(int i) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", a.g(i, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ItemGroup) arrayList.get(i2)).f(this, i);
        }
    }

    public final void e(int i) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", a.g(i, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ItemGroup) arrayList.get(i2)).g(this, i);
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.a);
        typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
