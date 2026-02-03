package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvl extends dhph implements Closeable {
    public final List a;
    public final fdap b;
    public final List c;
    public final Closeable d;
    public final evqs e;

    public dhvl(List list, fdap fdapVar, List list2, Closeable closeable, evqs evqsVar) {
        list2.getClass();
        this.a = list;
        this.b = fdapVar;
        this.c = list2;
        this.d = closeable;
        this.e = evqsVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhvl)) {
            return false;
        }
        dhvl dhvlVar = (dhvl) obj;
        return fdbq.f(this.a, dhvlVar.a) && fdbq.f(this.b, dhvlVar.b) && fdbq.f(this.c, dhvlVar.c) && fdbq.f(this.d, dhvlVar.d) && fdbq.f(this.e, dhvlVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdap fdapVar = this.b;
        return ((((((iHashCode + (fdapVar == null ? 0 : fdapVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }
}
