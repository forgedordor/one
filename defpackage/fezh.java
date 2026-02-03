package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezh implements Closeable {
    public final fezb a;
    public final feyz b;
    public final String c;
    public final int d;
    public final feyk e;
    public final feyn f;
    public final fezk g;
    public final fezh h;
    public final fezh i;
    public final fezh j;
    public final long k;
    public final long l;
    public final ffae m;

    public fezh(fezb fezbVar, feyz feyzVar, String str, int i, feyk feykVar, feyn feynVar, fezk fezkVar, fezh fezhVar, fezh fezhVar2, fezh fezhVar3, long j, long j2, ffae ffaeVar) {
        this.a = fezbVar;
        this.b = feyzVar;
        this.c = str;
        this.d = i;
        this.e = feykVar;
        this.f = feynVar;
        this.g = fezkVar;
        this.h = fezhVar;
        this.i = fezhVar2;
        this.j = fezhVar3;
        this.k = j;
        this.l = j2;
        this.m = ffaeVar;
    }

    public static /* synthetic */ String b(fezh fezhVar, String str) {
        String strB = fezhVar.f.b(str);
        if (strB == null) {
            return null;
        }
        return strB;
    }

    public final boolean a() {
        int i = this.d;
        return i >= 200 && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fezk fezkVar = this.g;
        if (fezkVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        fezkVar.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
