package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zp {
    final zo a;
    final zn b = new zn();

    public zp(zo zoVar) {
        this.a = zoVar;
    }

    public final View a(int i, int i2, int i3, int i4) {
        zo zoVar = this.a;
        int iD = zoVar.d();
        int iC = zoVar.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewE = zoVar.e(i5);
            int iB = zoVar.b(viewE);
            int iA = zoVar.a(viewE);
            zn znVar = this.b;
            znVar.c(iD, iC, iB, iA);
            znVar.b();
            znVar.a(i3);
            if (znVar.d()) {
                return viewE;
            }
            if (i4 != 0) {
                znVar.b();
                znVar.a(i4);
                if (znVar.d()) {
                    view = viewE;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    public final boolean b(View view) {
        zn znVar = this.b;
        zo zoVar = this.a;
        znVar.c(zoVar.d(), zoVar.c(), zoVar.b(view), zoVar.a(view));
        znVar.b();
        znVar.a(24579);
        return znVar.d();
    }
}
