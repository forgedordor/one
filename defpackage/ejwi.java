package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejwi<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static ejwi h() {
        return ejud.a;
    }

    public static ejwi i(Object obj) {
        return obj == null ? ejud.a : new ejwt(obj);
    }

    public static ejwi j(Object obj) {
        obj.getClass();
        return new ejwt(obj);
    }

    public abstract ejwi a(ejwi ejwiVar);

    public abstract ejwi b(ejvr ejvrVar);

    public abstract Object c();

    public abstract Object d(ejxr ejxrVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();
}
