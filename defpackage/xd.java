package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xd {
    public static int a(ws wsVar, vc vcVar, View view, View view2, wb wbVar, boolean z) {
        if (wbVar.as() == 0 || wsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(wb.bu(view) - wb.bu(view2)) + 1;
        }
        return Math.min(vcVar.k(), vcVar.a(view2) - vcVar.d(view));
    }

    public static int b(ws wsVar, vc vcVar, View view, View view2, wb wbVar, boolean z, boolean z2) {
        if (wbVar.as() == 0 || wsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (wsVar.a() - Math.max(wb.bu(view), wb.bu(view2))) - 1) : Math.max(0, Math.min(wb.bu(view), wb.bu(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(vcVar.a(view2) - vcVar.d(view)) / (Math.abs(wb.bu(view) - wb.bu(view2)) + 1))) + (vcVar.j() - vcVar.d(view)));
        }
        return iMax;
    }

    public static int c(ws wsVar, vc vcVar, View view, View view2, wb wbVar, boolean z) {
        if (wbVar.as() == 0 || wsVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return wsVar.a();
        }
        return (int) (((vcVar.a(view2) - vcVar.d(view)) / (Math.abs(wb.bu(view) - wb.bu(view2)) + 1)) * wsVar.a());
    }
}
