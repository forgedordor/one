package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agd {
    public final ajr a;

    public agd(ajr ajrVar) {
        lcg.i(ajrVar);
        this.a = ajrVar;
    }

    public final String a() {
        return this.a.a;
    }

    public final byte[] b() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agd) {
            return this.a.equals(((agd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public agd(String str, byte[] bArr) {
        lcg.i(str);
        lcg.i(bArr);
        this.a = new ajr(str, bArr);
    }
}
