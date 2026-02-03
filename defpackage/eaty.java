package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaty extends eauy {
    private final Bitmap a;

    public eaty(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.a = bitmap;
    }

    @Override // defpackage.eauy
    public final Bitmap a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eauy) {
            return this.a.equals(((eauy) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchPhotoResponse{bitmap=" + this.a.toString() + "}";
    }
}
