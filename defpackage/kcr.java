package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcr {
    public final kbj a;
    public final kcc b;
    public final int c;
    public final int d;
    public final Object e = null;

    public kcr(kbj kbjVar, kcc kccVar, int i, int i2) {
        this.a = kbjVar;
        this.b = kccVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcr)) {
            return false;
        }
        kcr kcrVar = (kcr) obj;
        if (!fdbq.f(this.a, kcrVar.a) || !fdbq.f(this.b, kcrVar.b) || !kbw.b(this.c, kcrVar.c) || !kbx.b(this.d, kcrVar.d)) {
            return false;
        }
        Object obj2 = kcrVar.e;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        kbj kbjVar = this.a;
        return (((((((kbjVar == null ? 0 : kbjVar.hashCode()) * 31) + this.b.i) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) kbw.a(this.c)) + ", fontSynthesis=" + ((Object) kbx.a(this.d)) + ", resourceLoaderCacheKey=null)";
    }
}
