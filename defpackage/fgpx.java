package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpx implements Comparable {
    fgms a;
    int b;
    String c;
    Locale d;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fgpx fgpxVar) {
        fgms fgmsVar = fgpxVar.a;
        int iA = fgpz.a(this.a.s(), fgmsVar.s());
        return iA != 0 ? iA : fgpz.a(this.a.q(), fgmsVar.q());
    }

    final long b(long j, boolean z) {
        String str = this.c;
        long j2 = str == null ? this.a.j(j, this.b) : this.a.i(j, str, this.d);
        return z ? this.a.g(j2) : j2;
    }

    final void c(fgms fgmsVar, int i) {
        this.a = fgmsVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}
