package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwb extends dhph implements Closeable {
    public final List a;
    public final dhyr b;
    public final List c;
    public final evqs d;
    private final Closeable e;

    public dhwb() {
        this(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dhpe) it.next()).close();
        }
        dhyr dhyrVar = this.b;
        if (dhyrVar != null) {
            dhyrVar.close();
        }
        Closeable closeable = this.e;
        if (closeable != null) {
            closeable.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhwb)) {
            return false;
        }
        dhwb dhwbVar = (dhwb) obj;
        return fdbq.f(this.a, dhwbVar.a) && fdbq.f(this.b, dhwbVar.b) && fdbq.f(this.c, dhwbVar.c) && fdbq.f(this.e, dhwbVar.e) && fdbq.f(this.d, dhwbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dhyr dhyrVar = this.b;
        int iHashCode2 = (((iHashCode + (dhyrVar == null ? 0 : dhyrVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        Closeable closeable = this.e;
        return ((iHashCode2 + (closeable != null ? closeable.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public dhwb(List list, dhyr dhyrVar, List list2, Closeable closeable, evqs evqsVar) {
        evqsVar.getClass();
        this.a = list;
        this.b = dhyrVar;
        this.c = list2;
        this.e = closeable;
        this.d = evqsVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dhwb(byte[] bArr) {
        fcvo fcvoVar = fcvo.a;
        this(fcvoVar, null, fcvoVar, null, evqs.b);
    }
}
