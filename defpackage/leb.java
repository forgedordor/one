package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leb {
    private final lea a;

    public leb(View view) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new ldz(view) : new ldx(view);
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        this.a.b();
    }

    @Deprecated
    public leb(WindowInsetsController windowInsetsController) {
        this.a = new ldz(windowInsetsController);
    }
}
