package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aslc {
    public final String a;
    public final Optional b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aslc(String str) {
        this(str, Optional.empty());
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aslc)) {
            return false;
        }
        aslc aslcVar = (aslc) obj;
        return fdbq.f(this.a, aslcVar.a) && fdbq.f(this.b, aslcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DomainAndOptionalPath(domainRoot=" + this.a + ", path=" + this.b + ")";
    }

    public aslc(String str, Optional optional) {
        str.getClass();
        this.a = str;
        this.b = optional;
    }
}
