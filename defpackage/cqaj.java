package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqaj implements cqad {
    public final fcsu a;
    private final Executor b;

    public cqaj(fcsu fcsuVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = new eoss(eoscVar);
    }

    @Override // defpackage.cqad
    public final void c() {
        auvh.h(eijx.f(new Runnable() { // from class: cqah
            @Override // java.lang.Runnable
            public final void run() {
                Iterable$EL.forEach((Set) this.a.a.b(), new Consumer() { // from class: cqaf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((cqae) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, this.b));
    }

    @Override // defpackage.cqad
    public final void f() {
        auvh.h(eijx.f(new Runnable() { // from class: cqag
            @Override // java.lang.Runnable
            public final void run() {
                Iterable$EL.forEach((Set) this.a.a.b(), new Consumer() { // from class: cqai
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((cqae) obj).b();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, this.b));
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cqad
    public final /* synthetic */ void e() {
    }
}
