package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekad extends WeakReference implements ekal {
    final int g;
    final ekal h;
    volatile ejzz i;

    public ekad(ReferenceQueue referenceQueue, Object obj, int i, ekal ekalVar) {
        super(obj, referenceQueue);
        this.i = ekak.b;
        this.g = i;
        this.h = ekalVar;
    }

    @Override // defpackage.ekal
    public final int a() {
        return this.g;
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekal
    public final ejzz d() {
        return this.i;
    }

    @Override // defpackage.ekal
    public final ekal e() {
        return this.h;
    }

    public ekal f() {
        throw new UnsupportedOperationException();
    }

    public ekal g() {
        throw new UnsupportedOperationException();
    }

    public ekal h() {
        throw new UnsupportedOperationException();
    }

    public ekal i() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekal
    public final Object j() {
        return get();
    }

    public void k(long j) {
        throw new UnsupportedOperationException();
    }

    public void l(ekal ekalVar) {
        throw new UnsupportedOperationException();
    }

    public void m(ekal ekalVar) {
        throw new UnsupportedOperationException();
    }

    public void n(ekal ekalVar) {
        throw new UnsupportedOperationException();
    }

    public void o(ekal ekalVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekal
    public final void p(ejzz ejzzVar) {
        this.i = ejzzVar;
    }

    public void q(long j) {
        throw new UnsupportedOperationException();
    }
}
