package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlpp implements dijt, dlps {
    public final String a;
    public final boolean b;
    public final List c;
    public final dlow d;
    private final String e = null;

    public dlpp(String str, boolean z, List list, dlow dlowVar) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = dlowVar;
    }

    @Override // defpackage.dijt
    public final String a() {
        return null;
    }

    @Override // defpackage.dijt
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlpp)) {
            return false;
        }
        dlpp dlppVar = (dlpp) obj;
        if (!fdbq.f(this.a, dlppVar.a) || this.b != dlppVar.b || !fdbq.f(this.c, dlppVar.c)) {
            return false;
        }
        String str = dlppVar.e;
        return fdbq.f(null, null) && fdbq.f(this.d, dlppVar.d);
    }

    @Override // defpackage.dijt
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 961) + this.d.hashCode();
    }

    public final String toString() {
        return "LoadingComplete(text=" + this.a + ", expanded=" + this.b + ", annotations=" + this.c + ", contentDescription=null, flags=" + this.d + ")";
    }
}
