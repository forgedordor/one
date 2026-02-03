package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eifm implements eifp {
    public final eieu a;

    public eifm(eieu eieuVar) {
        this.a = eieuVar;
    }

    @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
