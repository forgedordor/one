package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgij {
    public final List a;
    public final char b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public fgij f;
    public fgij g;

    public fgij(List list, char c, boolean z, boolean z2, fgij fgijVar) {
        this.a = list;
        this.b = c;
        this.d = z;
        this.e = z2;
        this.f = fgijVar;
        this.c = list.size();
    }

    public final int a() {
        return this.a.size();
    }

    public final Iterable b(int i) {
        if (i > 0 && i <= a()) {
            return this.a.subList(0, i);
        }
        throw new IllegalArgumentException("length must be between 1 and " + a() + ", was " + i);
    }

    public final Iterable c(int i) {
        if (i > 0 && i <= a()) {
            List list = this.a;
            return list.subList(list.size() - i, list.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + a() + ", was " + i);
    }

    public final fglo d() {
        return (fglo) this.a.get(0);
    }

    public final fglo e() {
        return (fglo) this.a.get(r0.size() - 1);
    }
}
