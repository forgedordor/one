package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejzl implements ejzz {
    volatile ejzz a;
    final SettableFuture b;
    final ejxm c;

    public ejzl() {
        ejzz ejzzVar = ekak.b;
        this.b = SettableFuture.create();
        this.c = new ejxm();
        this.a = ejzzVar;
    }

    @Override // defpackage.ejzz
    public final int a() {
        return 0;
    }

    @Override // defpackage.ejzz
    public final ekal c() {
        return null;
    }

    @Override // defpackage.ejzz
    public final Object d() {
        return eote.a(this.b);
    }

    @Override // defpackage.ejzz
    public final void e(Object obj) {
        if (obj != null) {
            h(obj);
        } else {
            this.a = ekak.b;
        }
    }

    @Override // defpackage.ejzz
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ejzz
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ejzz
    public final Object get() {
        return null;
    }

    public final boolean h(Object obj) {
        return this.b.set(obj);
    }

    public final void i() {
        this.c.a(TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.ejzz
    public final ejzz b(ReferenceQueue referenceQueue, Object obj, ekal ekalVar) {
        return this;
    }
}
