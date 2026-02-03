package defpackage;

import android.support.v7.widget.SwitchCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yr extends lpu {
    private final Reference a;

    public yr(SwitchCompat switchCompat) {
        this.a = new WeakReference(switchCompat);
    }

    @Override // defpackage.lpu
    public final void a(Throwable th) {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // defpackage.lpu
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
