package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhed implements ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    public fhed(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            type3.getClass();
            fhef.l(type3);
        }
        this.a = type;
        this.b = type2;
        this.c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && fhef.n(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ Arrays.hashCode(this.c);
        Type type = this.a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        if (length == 0) {
            return fhef.f(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(fhef.f(this.b));
        sb.append("<");
        sb.append(fhef.f(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(fhef.f(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
