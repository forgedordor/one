package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibu {
    private final eigp a;

    public eibu(eigp eigpVar) {
        this.a = eigpVar;
    }

    public final eifp a(String str, String str2) {
        final ejwi ejwiVarJ = eidc.v() ? ejud.a : ejwi.j(this.a.d("com/google/apps/tiktok/tracing/BinderTraceCreation", "onBinderMethodBegin", 29, "Invoking ".concat(str)));
        final eieu eieuVarK = eiiy.k(a.q(str2, str, "."));
        return new eifp() { // from class: eibt
            /* JADX WARN: Type inference failed for: r0v2, types: [eifp, java.lang.Object] */
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eieuVarK.close();
                ejwi ejwiVar = ejwiVarJ;
                if (ejwiVar.g()) {
                    ejwiVar.c().close();
                }
            }
        };
    }
}
