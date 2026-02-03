package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esev implements esez {
    private final int a;
    private final esey b;

    public esev(int i, esey eseyVar) {
        this.a = i;
        this.b = eseyVar;
    }

    @Override // defpackage.esez
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return esez.class;
    }

    @Override // defpackage.esez
    public final esey b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esez)) {
            return false;
        }
        esez esezVar = (esez) obj;
        return this.a == esezVar.a() && this.b.equals(esezVar.b());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
