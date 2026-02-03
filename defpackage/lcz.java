package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcz {
    public final DisplayCutout a;

    public lcz(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.a.getSafeInsetBottom();
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.a.getSafeInsetLeft();
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.a.getSafeInsetRight();
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.a.getSafeInsetTop();
        }
        return 0;
    }

    public final kzc e() {
        return Build.VERSION.SDK_INT >= 30 ? kzc.e(this.a.getWaterfallInsets()) : kzc.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((lcz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
