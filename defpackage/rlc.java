package defpackage;

import java.net.URL;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rlc implements res {
    public final rld b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    private volatile byte[] g;
    private int h;

    public rlc(String str, rld rldVar) {
        this.c = null;
        rvi.c(str);
        this.d = str;
        rvi.f(rldVar);
        this.b = rldVar;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = b().getBytes(a);
        }
        messageDigest.update(this.g);
    }

    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        rvi.f(url);
        return url.toString();
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof rlc) {
            rlc rlcVar = (rlc) obj;
            if (b().equals(rlcVar.b()) && this.b.equals(rlcVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = b().hashCode();
        this.h = iHashCode;
        int iHashCode2 = (iHashCode * 31) + this.b.hashCode();
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return b();
    }

    public rlc(URL url) {
        rld rldVar = rld.a;
        rvi.f(url);
        this.c = url;
        this.d = null;
        rvi.f(rldVar);
        this.b = rldVar;
    }
}
