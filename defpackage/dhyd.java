package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyd extends dhph implements Closeable {
    public final List a;
    public final fdap b;
    private final Closeable c;

    public dhyd(List list, fdap fdapVar, Closeable closeable) {
        this.a = list;
        this.b = fdapVar;
        this.c = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhyd)) {
            return false;
        }
        dhyd dhydVar = (dhyd) obj;
        return fdbq.f(this.a, dhydVar.a) && fdbq.f(this.b, dhydVar.b) && fdbq.f(this.c, dhydVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdap fdapVar = this.b;
        return ((iHashCode + (fdapVar == null ? 0 : fdapVar.hashCode())) * 31) + this.c.hashCode();
    }
}
