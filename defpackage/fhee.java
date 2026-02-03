package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhee implements WildcardType {
    private final Type a;
    private final Type b;

    public fhee(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length != 1) {
            Type type = typeArr[0];
            type.getClass();
            fhef.l(type);
            this.b = null;
            this.a = typeArr[0];
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        fhef.l(type2);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.b = typeArr2[0];
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && fhef.n(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : fhef.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super ".concat(String.valueOf(fhef.f(type)));
        }
        Type type2 = this.a;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(fhef.f(type2)));
    }
}
