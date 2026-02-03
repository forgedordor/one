package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxsc {
    private final dxrk a;
    private final eygg b;

    public dxsc(dxrk dxrkVar, eygg eyggVar, dxrm dxrmVar, eygg eyggVar2) {
        dxrkVar.getClass();
        eyggVar.getClass();
        dxrmVar.getClass();
        eyggVar2.getClass();
        this.a = dxrkVar;
        this.b = eyggVar;
    }

    public final dxrk a(dxha dxhaVar) {
        dxhaVar.getClass();
        if (dxhaVar.a()) {
            Object objB = this.b.b();
            objB.getClass();
            return (dxrk) objB;
        }
        if (dxhaVar.b()) {
            return this.a;
        }
        throw new IllegalStateException("Unsupported targetType for GnpAccountStorageProviderImpl");
    }
}
