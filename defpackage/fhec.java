package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhec implements GenericArrayType {
    private final Type a;

    public fhec(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && fhef.n(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(fhef.f(this.a)).concat("[]");
    }
}
