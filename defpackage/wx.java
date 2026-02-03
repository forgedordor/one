package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wx extends lcl {
    final RecyclerView a;
    public final ww b;

    public wx(RecyclerView recyclerView) {
        this.a = recyclerView;
        lcl lclVarJ = j();
        if (lclVarJ == null || !(lclVarJ instanceof ww)) {
            this.b = new ww(this);
        } else {
            this.b = (ww) lclVarJ;
        }
    }

    @Override // defpackage.lcl
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        wb wbVar;
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (wbVar = ((RecyclerView) view).o) == null) {
            return;
        }
        wbVar.Y(accessibilityEvent);
    }

    @Override // defpackage.lcl
    public void c(View view, lhg lhgVar) {
        wb wbVar;
        super.c(view, lhgVar);
        if (k() || (wbVar = this.a.o) == null) {
            return;
        }
        RecyclerView recyclerView = wbVar.u;
        wbVar.m(recyclerView.e, recyclerView.N, lhgVar);
    }

    @Override // defpackage.lcl
    public final boolean i(View view, int i, Bundle bundle) {
        wb wbVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k() || (wbVar = this.a.o) == null) {
            return false;
        }
        return wbVar.u(i, bundle);
    }

    public lcl j() {
        return this.b;
    }

    final boolean k() {
        return this.a.aC();
    }
}
