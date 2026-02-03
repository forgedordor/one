package defpackage;

import defpackage.afu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afu<BuilderType extends afu> {
    public final ajo a;
    public final afu b;

    public afu(afv afvVar) {
        int i = afv.b;
        this.a = new ajo(afvVar.a);
        this.b = this;
    }

    public static final void l(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Property name cannot be blank.");
        }
    }

    public final afu a(String str, afv... afvVarArr) {
        lcg.i(str);
        l(str);
        ajp[] ajpVarArr = new ajp[afvVarArr.length];
        for (int i = 0; i < afvVarArr.length; i++) {
            afv afvVar = afvVarArr[i];
            if (afvVar == null) {
                throw new IllegalArgumentException(a.e(i, "The document at ", " is null."));
            }
            ajpVarArr[i] = afvVar.a;
        }
        ajo ajoVar = this.a;
        ajz ajzVar = new ajz(str);
        ajzVar.a = ajpVarArr;
        ajoVar.b(str, ajzVar.a());
        return this.b;
    }

    public final afu b(String str, String... strArr) {
        lcg.i(str);
        lcg.i(strArr);
        l(str);
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == null) {
                throw new IllegalArgumentException(a.e(i, "The String at ", " is null."));
            }
        }
        ajo ajoVar = this.a;
        ajz ajzVar = new ajz(str);
        ajzVar.f(strArr);
        ajoVar.b(str, ajzVar.a());
        return this.b;
    }

    public final afu c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Document score cannot be negative.");
        }
        this.a.b = i;
        return this.b;
    }

    public final afu d(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        this.a.d(j);
        return this.b;
    }

    public final afv e() {
        return new afv(this.a.a());
    }

    public final void f(String str) {
        lcg.i(str);
        str.getClass();
        this.a.c.remove(str);
    }

    public final void g(long j) {
        this.a.a = j;
    }

    public final void h(String str, boolean... zArr) {
        lcg.i(str);
        lcg.i(zArr);
        l(str);
        ajz ajzVar = new ajz(str);
        ajzVar.b(zArr);
        this.a.b(str, ajzVar.a());
    }

    public final void i(String str, byte[]... bArr) {
        lcg.i(str);
        lcg.i(bArr);
        l(str);
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == null) {
                throw new IllegalArgumentException(a.e(i, "The byte[] at ", " is null."));
            }
        }
        ajo ajoVar = this.a;
        ajz ajzVar = new ajz(str);
        ajzVar.c(bArr);
        ajoVar.b(str, ajzVar.a());
    }

    public final void j(String str, double... dArr) {
        lcg.i(str);
        lcg.i(dArr);
        l(str);
        ajz ajzVar = new ajz(str);
        ajzVar.d(dArr);
        this.a.b(str, ajzVar.a());
    }

    public final void k(String str, long... jArr) {
        lcg.i(str);
        lcg.i(jArr);
        l(str);
        ajz ajzVar = new ajz(str);
        ajzVar.e(jArr);
        this.a.b(str, ajzVar.a());
    }

    public afu(String str, String str2, String str3) {
        lcg.i(str);
        lcg.i(str2);
        lcg.i(str3);
        this.b = this;
        this.a = new ajo(str, str2, str3);
    }
}
