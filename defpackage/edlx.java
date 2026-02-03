package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edlx extends edml {
    private final Bitmap a;
    private final String b;
    private final boolean c;

    public edlx(Bitmap bitmap, String str, boolean z) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.a = bitmap;
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.edml
    public final Bitmap a() {
        return this.a;
    }

    @Override // defpackage.edml
    public final String b() {
        return this.b;
    }

    @Override // defpackage.edml
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edml) {
            edml edmlVar = (edml) obj;
            if (this.a.equals(edmlVar.a()) && this.b.equals(edmlVar.b()) && this.c == edmlVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ProfilePhoto{bitmap=" + this.a.toString() + ", url=" + this.b + ", isDefault=" + this.c + "}";
    }
}
