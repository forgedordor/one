package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class iqh {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        return (obj instanceof iqh) && fdbq.f(this.a, ((iqh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
