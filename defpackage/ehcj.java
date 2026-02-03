package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ehcj extends ehcl {
    @Override // defpackage.ehcl
    public abstract Throwable a();

    @Override // defpackage.ehcl
    public final Object b() {
        throw new IllegalStateException("This Result was a failure, and is being polled for data.");
    }

    @Override // defpackage.ehcl
    public final boolean c() {
        return false;
    }
}
