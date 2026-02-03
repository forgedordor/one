package defpackage;

import android.net.Uri;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzn implements dnzp {
    public final Uri a;
    public final fdlr b;
    public final OutputStream c;

    public dnzn(Uri uri, fdlr fdlrVar, OutputStream outputStream) {
        uri.getClass();
        outputStream.getClass();
        this.a = uri;
        this.b = fdlrVar;
        this.c = outputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnzn)) {
            return false;
        }
        dnzn dnznVar = (dnzn) obj;
        return fdbq.f(this.a, dnznVar.a) && fdbq.f(this.b, dnznVar.b) && fdbq.f(this.c, dnznVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Started(gifUri=" + this.a + ", bitmapJob=" + this.b + ", outputStream=" + this.c + ")";
    }
}
