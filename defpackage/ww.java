package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ww extends lcl {
    final wx a;
    public final Map b = new WeakHashMap();

    public ww(wx wxVar) {
        this.a = wxVar;
    }

    @Override // defpackage.lcl
    public final lhj a(View view) {
        lcl lclVar = (lcl) this.b.get(view);
        return lclVar != null ? lclVar.a(view) : super.a(view);
    }

    @Override // defpackage.lcl
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        lcl lclVar = (lcl) this.b.get(view);
        if (lclVar != null) {
            lclVar.b(view, accessibilityEvent);
        } else {
            super.b(view, accessibilityEvent);
        }
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        wb wbVar;
        wx wxVar = this.a;
        if (wxVar.k() || (wbVar = wxVar.a.o) == null) {
            super.c(view, lhgVar);
            return;
        }
        wbVar.aT(view, lhgVar);
        lcl lclVar = (lcl) this.b.get(view);
        if (lclVar != null) {
            lclVar.c(view, lhgVar);
        } else {
            super.c(view, lhgVar);
        }
    }

    @Override // defpackage.lcl
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        lcl lclVar = (lcl) this.b.get(view);
        if (lclVar != null) {
            lclVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    @Override // defpackage.lcl
    public final void e(View view, int i) {
        lcl lclVar = (lcl) this.b.get(view);
        if (lclVar != null) {
            lclVar.e(view, i);
        } else {
            super.e(view, i);
        }
    }

    @Override // defpackage.lcl
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        lcl lclVar = (lcl) this.b.get(view);
        if (lclVar != null) {
            lclVar.f(view, accessibilityEvent);
        } else {
            super.f(view, accessibilityEvent);
        }
    }

    @Override // defpackage.lcl
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        lcl lclVar = (lcl) this.b.get(view);
        return lclVar != null ? lclVar.g(view, accessibilityEvent) : super.g(view, accessibilityEvent);
    }

    @Override // defpackage.lcl
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        lcl lclVar = (lcl) this.b.get(viewGroup);
        return lclVar != null ? lclVar.h(viewGroup, view, accessibilityEvent) : super.h(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        wx wxVar = this.a;
        if (!wxVar.k()) {
            RecyclerView recyclerView = wxVar.a;
            if (recyclerView.o != null) {
                lcl lclVar = (lcl) this.b.get(view);
                if (lclVar != null) {
                    if (lclVar.i(view, i, bundle)) {
                        return true;
                    }
                } else if (super.i(view, i, bundle)) {
                    return true;
                }
                RecyclerView recyclerView2 = recyclerView.o.u;
                wj wjVar = recyclerView2.e;
                ws wsVar = recyclerView2.N;
                return false;
            }
        }
        return super.i(view, i, bundle);
    }
}
