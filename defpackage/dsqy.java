package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqy {
    public final View a;
    public final dsqx b;
    public final int c;
    public final int d;

    public dsqy(View view, View view2, int i, int i2) {
        view.getClass();
        this.a = view2;
        this.c = i;
        this.d = i2;
        dsqx dsqxVar = new dsqx(view.getContext());
        this.b = dsqxVar;
        dsqxVar.e = view;
        dsqxVar.c = new PopupWindow(dsqxVar, 0, 0, !dsbe.b(dsqxVar.getContext()) && fbcn.a.get().b());
        dsqxVar.addView(view);
        if (fbcn.b()) {
            int[] iArr = ley.a;
            dsqxVar.setImportantForAccessibility(4);
        }
    }

    public final void a() {
        PopupWindow popupWindow = this.b.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean b() {
        return this.b.isShown();
    }
}
