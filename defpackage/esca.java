package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esca<T> {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final escf f;
    public final Set g;

    public esca(String str, Set set, Set set2, int i, int i2, escf escfVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = escfVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static esbz a(esde esdeVar) {
        return new esbz(esdeVar, new esde[0]);
    }

    public static esbz b(Class cls) {
        return new esbz(cls, new Class[0]);
    }

    public static esbz c(Class cls) {
        esbz esbzVarB = b(cls);
        esbzVarB.b = 1;
        return esbzVarB;
    }

    public static esca d(final Object obj, Class cls) {
        esbz esbzVarC = c(cls);
        esbzVarC.c = new escf() { // from class: esbx
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return obj;
            }
        };
        return esbzVarC.a();
    }

    @SafeVarargs
    public static esca e(final Object obj, Class cls, Class... clsArr) {
        esbz esbzVar = new esbz(cls, clsArr);
        esbzVar.c = new escf() { // from class: esby
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return obj;
            }
        };
        return esbzVar.a();
    }

    public final boolean f() {
        return this.e == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
