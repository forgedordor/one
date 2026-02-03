package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfsg {
    public static final fbod a;

    static {
        fbog fbogVar = fbog.d;
        a = new fbod("ProxyMetadata");
    }

    public static final cfsf a(fbog fbogVar) {
        Object objB = a.b(fbogVar);
        if (objB != null) {
            return (cfsf) objB;
        }
        throw new IllegalArgumentException("ProxyMetadata is missing in the gRPC context.");
    }
}
