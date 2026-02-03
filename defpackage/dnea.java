package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnea {
    public final String a;
    public final fdap b;
    public final fdat c;

    public dnea(String str, fdap fdapVar, fdat fdatVar) {
        this.a = str;
        this.b = fdapVar;
        this.c = fdatVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnea)) {
            return false;
        }
        dnea dneaVar = (dnea) obj;
        return fdbq.f(this.a, dneaVar.a) && fdbq.f(this.b, dneaVar.b) && fdbq.f(this.c, dneaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "EntityDescriptor(name=" + this.a + ", serializer=" + this.b + ", deserializer=" + this.c + ")";
    }
}
