package defpackage;

import android.os.Build;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awg {
    public final awo a;

    public awg(awo awoVar) {
        this.a = awoVar;
    }

    public final Surface a() {
        return this.a.a();
    }

    public final void b(int i) {
        this.a.h(i);
    }

    public final void c(String str) {
        this.a.g(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awg) {
            return this.a.equals(((awg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public awg(Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new awn(surface);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.a = new awm(surface);
        } else {
            this.a = new awk(surface);
        }
    }
}
