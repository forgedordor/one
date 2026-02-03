package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eedh<V extends View> extends kty<V> {
    private eedi a;
    private int b;

    public eedh() {
        this.b = 0;
    }

    public final int I() {
        eedi eediVar = this.a;
        if (eediVar != null) {
            return eediVar.b;
        }
        return 0;
    }

    public final boolean J(int i) {
        eedi eediVar = this.a;
        if (eediVar != null) {
            return eediVar.c(i);
        }
        this.b = i;
        return false;
    }

    protected void fG(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.kty
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        fG(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new eedi(view);
        }
        this.a.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    public eedh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
