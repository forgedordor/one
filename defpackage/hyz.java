package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyz extends hza {
    public hyz(long j, hzn hznVar) {
        super(j, hznVar, null, new fdap() { // from class: hyw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                synchronized (hzt.c) {
                    List list = hzt.h;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((fdap) list.get(i)).invoke(obj);
                    }
                }
                return fctx.a;
            }
        });
    }

    @Override // defpackage.hza
    public final hza a(fdap fdapVar, fdap fdapVar2) {
        return (hza) hzt.c(new hyx(fdapVar, fdapVar2));
    }

    @Override // defpackage.hza, defpackage.hzg
    public final hzg b(fdap fdapVar) {
        return (hzd) hzt.c(new hyy(fdapVar));
    }

    @Override // defpackage.hza
    public final hzj c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void d() {
        synchronized (hzt.c) {
            z();
        }
    }

    @Override // defpackage.hza, defpackage.hzg
    public final void e() {
        hzt.r();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final /* bridge */ /* synthetic */ void f() {
        iag.a();
        throw new fcta();
    }

    @Override // defpackage.hza, defpackage.hzg
    public final /* bridge */ /* synthetic */ void g() {
        iag.a();
        throw new fcta();
    }
}
