package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import defpackage.eftu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ItemGroup extends AbstractItemHierarchy {
    public final List b;
    public boolean c;
    private final SparseIntArray d;
    private int e;

    public ItemGroup() {
        this.b = new ArrayList();
        this.d = new SparseIntArray();
        this.e = 0;
        this.c = false;
    }

    private final void h() {
        if (!this.c) {
            return;
        }
        this.e = 0;
        SparseIntArray sparseIntArray = this.d;
        sparseIntArray.clear();
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                this.c = false;
                return;
            }
            eftu eftuVar = (eftu) list.get(i);
            if (eftuVar.a() > 0) {
                sparseIntArray.put(i, this.e);
            }
            this.e += eftuVar.a();
            i++;
        }
    }

    @Override // defpackage.eftu
    public final int a() {
        h();
        return this.e;
    }

    public final int b(eftu eftuVar) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (list.get(i) == eftuVar) {
                break;
            }
            i++;
        }
        h();
        if (i == -1) {
            return -1;
        }
        int size2 = list.size();
        int i2 = -1;
        while (i2 < 0 && i < size2) {
            i2 = this.d.get(i, -1);
            i++;
        }
        return i2 < 0 ? a() : i2;
    }

    public void f(eftu eftuVar, int i) {
        this.c = true;
        int iB = b(eftuVar);
        if (iB >= 0) {
            d(iB + i);
        } else {
            Log.e("ItemGroup", "Unexpected child remove ".concat(eftuVar.toString()));
        }
    }

    public void g(eftu eftuVar, int i) {
        this.c = true;
        int iB = b(eftuVar);
        if (iB >= 0) {
            e(iB + i);
        } else {
            Log.e("ItemGroup", "Unexpected child insert ".concat(eftuVar.toString()));
        }
    }

    public ItemGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.d = new SparseIntArray();
        this.e = 0;
        this.c = false;
    }
}
