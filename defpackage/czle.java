package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czle extends czlm {
    private final Rect a;

    public czle(Rect rect) {
        this.a = rect;
    }

    @Override // defpackage.czlm
    public final Rect a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czlm) {
            return this.a.equals(((czlm) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MediaDrawableChangedEvent{drawableBounds=" + this.a.toString() + "}";
    }
}
