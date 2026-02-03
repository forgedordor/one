package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ehck extends ehcl {
    @Override // defpackage.ehcl
    public final Throwable a() {
        throw new IllegalStateException("This Result was a success, and is being polled for an error.");
    }

    @Override // defpackage.ehcl
    public abstract Object b();

    @Override // defpackage.ehcl
    public final boolean c() {
        return true;
    }
}
