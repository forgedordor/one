package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bei extends bfp {
    public final Size a;
    public final int b;

    public bei(Size size, int i) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.a = size;
        this.b = i;
    }

    @Override // defpackage.bfp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bfp
    public final Size b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfp) {
            bfp bfpVar = (bfp) obj;
            if (this.a.equals(bfpVar.b()) && this.b == bfpVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PostviewSettings{resolution=" + this.a + ", inputFormat=" + this.b + "}";
    }
}
