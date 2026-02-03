package defpackage;

import io.grpc.Status;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxa extends cjit {
    public static final void j(fcsf fcsfVar) {
        fcsfVar.b(Status.l.withDescription("JibeService not initialized").asException());
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void b(final cjgh cjghVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfwy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().b(cjghVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwz
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void c(final cjgx cjgxVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfwm
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().c(cjgxVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwr
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void d(final cjkc cjkcVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfwn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().d(cjkcVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwo
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void e(final cjky cjkyVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfws
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().e(cjkyVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwt
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void f(final cjlg cjlgVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfwu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().f(cjlgVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwv
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void g(final cjls cjlsVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfww
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().g(cjlsVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwx
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void h(final cjma cjmaVar, final fcsf fcsfVar) {
        dhfg.a().ifPresentOrElse(new Consumer() { // from class: dfwp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfo) obj).f().h(cjmaVar, fcsfVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: dfwq
            @Override // java.lang.Runnable
            public final void run() {
                dfxa.j(fcsfVar);
            }
        });
    }

    @Override // defpackage.cjit, defpackage.cjir
    public final void i() {
        throw new IllegalStateException("Not implemented anymore!");
    }
}
