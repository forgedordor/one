package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqje implements Closeable {
    public abstract cqjc a();

    public abstract cqjc b();

    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        elee eleeVar = new elee();
        eleeVar.a(b());
        eleeVar.a(a());
        eleeVar.close();
    }

    public abstract void d();
}
