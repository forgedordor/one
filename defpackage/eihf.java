package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eihf extends eifm {
    final /* synthetic */ eifn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eihf(eieu eieuVar, eifn eifnVar) {
        super(eieuVar);
        this.b = eifnVar;
    }

    @Override // defpackage.eifm, defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        eifn eifnVar = this.b;
        if (eifnVar != null) {
            eidc.g(eifnVar);
        }
    }
}
