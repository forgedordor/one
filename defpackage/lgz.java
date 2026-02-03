package defpackage;

import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgz extends lgy {
    public lgz(Window window, lhb lhbVar, leb lebVar) {
        super(window, lebVar);
    }

    @Override // defpackage.lgx, defpackage.lha
    public final boolean h() {
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.lgx, defpackage.lha
    public final boolean j() {
        return (this.a.getSystemBarsAppearance() & 16) != 0;
    }

    public lgz(WindowInsetsController windowInsetsController, leb lebVar) {
        super(windowInsetsController);
    }
}
