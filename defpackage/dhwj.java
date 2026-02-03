package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwj extends dhph {
    public final dhvp a;
    public final long b;
    public final List c;
    public final List d;
    public final evqs e;
    public final dhuo f;

    public dhwj(dhvp dhvpVar, long j, List list, List list2, evqs evqsVar, dhuo dhuoVar) {
        dhuoVar.getClass();
        this.a = dhvpVar;
        this.b = j;
        this.c = list;
        this.d = list2;
        this.e = evqsVar;
        this.f = dhuoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhwj)) {
            return false;
        }
        dhwj dhwjVar = (dhwj) obj;
        return fdbq.f(this.a, dhwjVar.a) && fdhi.p(this.b, dhwjVar.b) && fdbq.f(this.c, dhwjVar.c) && fdbq.f(this.d, dhwjVar.d) && fdbq.f(this.e, dhwjVar.e) && this.f == dhwjVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = fdhi.a;
        return ((((((((iHashCode + fdhh.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }
}
