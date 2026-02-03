package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwxu extends dwxx {
    public final Bitmap a;
    private final ejwi b;
    private final int c;

    public dwxu(Bitmap bitmap, ejwi ejwiVar, int i) {
        this.a = bitmap;
        this.b = ejwiVar;
        this.c = i;
    }

    @Override // defpackage.dwxx
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dwxx
    public final Bitmap b() {
        return this.a;
    }

    @Override // defpackage.dwxx
    public final ejwi c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwxx) {
            dwxx dwxxVar = (dwxx) obj;
            if (this.a.equals(dwxxVar.b()) && this.b.equals(dwxxVar.c()) && this.c == dwxxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "CacheValue{avatar=" + this.a.toString() + ", imageUrl=" + ejwiVar.toString() + ", profileHashCode=" + this.c + "}";
    }
}
