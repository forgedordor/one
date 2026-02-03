package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvmq {
    public final String a;
    public final Bitmap b;

    public bvmq(String str, Bitmap bitmap) {
        str.getClass();
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvmq)) {
            return false;
        }
        bvmq bvmqVar = (bvmq) obj;
        return fdbq.f(this.a, bvmqVar.a) && fdbq.f(this.b, bvmqVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return iHashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "GaiaAccountInfo(accountName=" + this.a + ", accountAvatar=" + this.b + ")";
    }
}
