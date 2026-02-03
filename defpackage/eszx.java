package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eszx implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public eszx(Type type) {
        type.getClass();
        this.a = etaa.c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && etaa.g(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(etaa.b(this.a)).concat("[]");
    }
}
