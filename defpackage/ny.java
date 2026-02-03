package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ny implements AdapterView.OnItemClickListener, op {
    Context a;
    public LayoutInflater b;
    oc c;
    public ExpandedMenuView d;
    public oo e;
    public nx f;

    public ny(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.op
    public final int a() {
        return 0;
    }

    @Override // defpackage.op
    public final void c(Context context, oc ocVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ocVar;
        nx nxVar = this.f;
        if (nxVar != null) {
            nxVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.op
    public final void d(oc ocVar, boolean z) {
        oo ooVar = this.e;
        if (ooVar != null) {
            ooVar.a(ocVar, z);
        }
    }

    @Override // defpackage.op
    public final Parcelable dG() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // defpackage.op
    public final void e(oo ooVar) {
        throw null;
    }

    @Override // defpackage.op
    public final void f(boolean z) {
        nx nxVar = this.f;
        if (nxVar != null) {
            nxVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.op
    public final boolean g() {
        return false;
    }

    @Override // defpackage.op
    public final boolean h(ox oxVar) {
        if (!oxVar.hasVisibleItems()) {
            return false;
        }
        od odVar = new od(oxVar);
        oc ocVar = odVar.a;
        iu iuVar = new iu(ocVar.a);
        odVar.c = new ny(iuVar.getContext());
        ny nyVar = odVar.c;
        nyVar.e = odVar;
        ocVar.g(nyVar);
        ListAdapter listAdapterK = odVar.c.k();
        ir irVar = iuVar.a;
        irVar.s = listAdapterK;
        irVar.t = odVar;
        View view = ocVar.g;
        if (view != null) {
            irVar.f = view;
        } else {
            iuVar.b(ocVar.f);
            iuVar.setTitle(ocVar.e);
        }
        irVar.q = odVar;
        odVar.b = iuVar.create();
        odVar.b.setOnDismissListener(odVar);
        WindowManager.LayoutParams attributes = odVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        odVar.b.show();
        oo ooVar = this.e;
        if (ooVar == null) {
            return true;
        }
        ooVar.b(oxVar);
        return true;
    }

    @Override // defpackage.op
    public final boolean i(of ofVar) {
        return false;
    }

    @Override // defpackage.op
    public final boolean j(of ofVar) {
        return false;
    }

    public final ListAdapter k() {
        if (this.f == null) {
            this.f = new nx(this);
        }
        return this.f;
    }

    @Override // defpackage.op
    public final void n(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
