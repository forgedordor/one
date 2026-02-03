package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eotb extends eory {
    final /* synthetic */ eotc a;
    private final Callable b;

    public eotb(eotc eotcVar, Callable callable) {
        this.a = eotcVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.eory
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.eory
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.eory
    public final void d(Throwable th) {
        this.a.setException(th);
    }

    @Override // defpackage.eory
    public final void e(Object obj) {
        this.a.set(obj);
    }

    @Override // defpackage.eory
    public final boolean g() {
        return this.a.isDone();
    }
}
