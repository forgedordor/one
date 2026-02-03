package defpackage;

import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkj extends dpkl {
    public final dpku a;
    public final KeyboardDetectorViewInsetsListener b;
    public final dpje c;

    public dpkj(dpku dpkuVar, KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener, dpje dpjeVar) {
        this.a = dpkuVar;
        this.b = keyboardDetectorViewInsetsListener;
        this.c = dpjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpkj)) {
            return false;
        }
        dpkj dpkjVar = (dpkj) obj;
        return fdbq.f(this.a, dpkjVar.a) && fdbq.f(this.b, dpkjVar.b) && fdbq.f(this.c, dpkjVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Attached(detectorView=" + this.a + ", insetsListener=" + this.b + ", stateListener=" + this.c + ")";
    }
}
