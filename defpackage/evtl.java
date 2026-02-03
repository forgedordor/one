package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evtl {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(evqs.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);

    public final Class k;

    static {
        evqs evqsVar = evqs.b;
    }

    evtl(Class cls) {
        this.k = cls;
    }
}
