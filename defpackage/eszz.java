package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eszz implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;

    public eszz(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        eszw.a(length <= 1);
        eszw.a(typeArr.length == 1);
        if (length != 1) {
            Type type = typeArr[0];
            type.getClass();
            etaa.f(type);
            this.b = null;
            this.a = etaa.c(typeArr[0]);
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        etaa.f(type2);
        eszw.a(typeArr[0] == Object.class);
        this.b = etaa.c(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && etaa.g(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : etaa.a;
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
            return "? super ".concat(String.valueOf(etaa.b(type)));
        }
        Type type2 = this.a;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(etaa.b(type2)));
    }
}
