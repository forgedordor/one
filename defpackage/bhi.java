package defpackage;

import android.util.Size;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhi extends blp {
    private final Surface a;
    private final Size b;
    private final int c;

    public bhi(Surface surface, Size size, int i) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.b = size;
        this.c = i;
    }

    @Override // defpackage.blp
    public final int a() {
        return this.c;
    }

    @Override // defpackage.blp
    public final Size b() {
        return this.b;
    }

    @Override // defpackage.blp
    public final Surface c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof blp) {
            blp blpVar = (blp) obj;
            if (this.a.equals(blpVar.c()) && this.b.equals(blpVar.b()) && this.c == blpVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "OutputSurface{surface=" + this.a + ", size=" + this.b + ", imageFormat=" + this.c + "}";
    }
}
