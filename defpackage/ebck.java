package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebck extends ebcn {
    public final long a;
    private final Context b;
    private final Uri c;

    public ebck(Context context, Uri uri, long j) {
        this.b = context;
        this.c = uri;
        this.a = j;
    }

    @Override // defpackage.ebcn
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ebcn
    public final Context b() {
        return this.b;
    }

    @Override // defpackage.ebcn
    public final Uri c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebcn) {
            ebcn ebcnVar = (ebcn) obj;
            if (this.b.equals(ebcnVar.b()) && this.c.equals(ebcnVar.c()) && this.a == ebcnVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        long j = this.a;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Uri uri = this.c;
        return "FileContent{context=" + this.b.toString() + ", contentUri=" + uri.toString() + ", contentLength=" + this.a + "}";
    }
}
