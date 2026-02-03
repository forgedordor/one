package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebgv extends ebhz {
    public final ebhy a;
    public final ewmk b;
    public final List c;
    public final Optional d;
    public final Optional e;
    public final long f;

    public ebgv(ebhy ebhyVar, ewmk ewmkVar, List list, Optional optional, Optional optional2, long j) {
        this.a = ebhyVar;
        if (ewmkVar == null) {
            throw new NullPointerException("Null result");
        }
        this.b = ewmkVar;
        if (list == null) {
            throw new NullPointerException("Null resolvedTargets");
        }
        this.c = list;
        this.d = optional;
        this.e = optional2;
        this.f = j;
    }

    @Override // defpackage.ebhz
    public final long a() {
        return this.f;
    }

    @Override // defpackage.ebhz
    public final ebhy b() {
        return this.a;
    }

    @Override // defpackage.ebhz
    public final ewmk c() {
        return this.b;
    }

    @Override // defpackage.ebhz
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.ebhz
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebhz) {
            ebhz ebhzVar = (ebhz) obj;
            if (this.a.equals(ebhzVar.b()) && this.b.equals(ebhzVar.c()) && this.c.equals(ebhzVar.f()) && this.d.equals(ebhzVar.e()) && this.e.equals(ebhzVar.d()) && this.f == ebhzVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ebhz
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.f;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        List list = this.c;
        ewmk ewmkVar = this.b;
        return "LoggableResponse{query=" + this.a.toString() + ", result=" + ewmkVar.toString() + ", resolvedTargets=" + list.toString() + ", failureType=" + optional2.toString() + ", clientExceptionType=" + optional.toString() + ", responseTimeMillis=" + this.f + "}";
    }
}
