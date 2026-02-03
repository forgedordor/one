package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwg {
    public static ejwf a(Class cls) {
        return new ejwf(cls.getSimpleName());
    }

    public static ejwf b(Object obj) {
        return new ejwf(obj.getClass().getSimpleName());
    }

    public static Object c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
