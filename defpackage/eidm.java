package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidm {
    private final eigp a;

    public eidm(eigp eigpVar) {
        this.a = eigpVar;
    }

    public final eifp a(String str) {
        if (eidc.v()) {
            return new eifp() { // from class: eidj
                @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
        }
        eidc.s();
        if (eidc.v()) {
            return new eifp() { // from class: eidk
                @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eidc.q();
                }
            };
        }
        final eieh eiehVarD = this.a.d("com/google/apps/tiktok/tracing/LayoutTraceCreation", "beginRootTraceOrResume", 77, str);
        return new eifp() { // from class: eidl
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eiehVarD.close();
                eidc.q();
            }
        };
    }
}
