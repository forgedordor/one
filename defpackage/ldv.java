package defpackage;

import android.os.Build;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldv {
    private final ldu a;

    public ldv(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new lds(view);
        } else {
            this.a = new ldt();
        }
    }

    public final void a(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }
}
