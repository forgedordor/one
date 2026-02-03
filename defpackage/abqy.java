package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqy implements abqi {
    public static final cqce a = cqce.g("Bugle", "MessagePortJsBridgeTransport");
    public final abtq b;
    public final eosc c;
    public final eosc d;
    public final abto e;
    public final String f;
    public final abpy g;
    public final cqud h;
    public final AtomicReference i = new AtomicReference(Optional.empty());
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final elee k = new elee();

    public abqy(cqtp cqtpVar, abtq abtqVar, eosc eoscVar, eosc eoscVar2, abto abtoVar, String str, abpy abpyVar) {
        this.b = abtqVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = abtoVar;
        this.f = str;
        this.g = abpyVar;
        this.h = new cqud(cqtpVar, abqg.NOT_STARTED);
    }

    @Override // defpackage.abpx
    public final void a(String str) {
        Optional optional = (Optional) this.i.get();
        if (!optional.isPresent()) {
            throw new abpv();
        }
        ((ppm) optional.get()).d(new ppk(str, (ppm[]) null));
    }

    @Override // defpackage.abqi
    public final abqg b() {
        return (abqg) this.h.d();
    }

    @Override // defpackage.abqi
    public final cquc c(String str, cqtk cqtkVar) {
        return this.h.a(str, cqtkVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.set(true);
        this.k.close();
        this.h.f(abqg.CLOSED);
        Optional optional = (Optional) this.i.getAndSet(Optional.empty());
        if (optional.isEmpty()) {
            a.p("Not closing channel, as no channel is open");
        } else {
            a.p("Closing channel");
            ((ppm) optional.get()).c();
        }
    }

    @Override // defpackage.abqi
    public final void d() {
        a.p("Opening MessagePort JsBridge. Waiting for Ditto signal.");
        final abto abtoVar = this.e;
        if (!abtoVar.b().isPresent()) {
            throw new IllegalStateException("WebView has been destroyed");
        }
        this.h.g(abqg.NOT_STARTED, abqg.CONNECTING);
        eiju eijuVarG = eijx.g(new Callable() { // from class: abqo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return abtoVar.a();
            }
        }, this.d);
        ejvr ejvrVar = new ejvr() { // from class: abqp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                final abqy abqyVar = this.a;
                if (abqyVar.j.get()) {
                    return null;
                }
                abqy.a.p("Waiting on new message port channel");
                optional.getClass();
                abtd abtdVar = (abtd) optional.orElseThrow(new Supplier() { // from class: abqw
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new IllegalStateException("Could not get WebViewClient");
                    }
                });
                elee eleeVar = abqyVar.k;
                eleeVar.a(abtdVar.a("MessagePortJsBridgeTransport detected Ditto load", new cqtk() { // from class: abqm
                    @Override // defpackage.cqtk
                    public final eiju a(Object obj2) {
                        abqyVar.f();
                        abqy.a.p("Received Ditto Load event.");
                        return eijx.e(null);
                    }
                }));
                eleeVar.a(abtdVar.g.a(new cqtk() { // from class: abqn
                    @Override // defpackage.cqtk
                    public final eiju a(Object obj2) {
                        String str = (String) obj2;
                        final abqy abqyVar2 = abqyVar;
                        if (!str.equals("listening_on_".concat(abqyVar2.f))) {
                            cqbd cqbdVarC = abqy.a.c();
                            cqbdVarC.I("Ignoring interceptor signal");
                            cqbdVarC.A("signal", str);
                            cqbdVarC.r();
                            return eijx.e(null);
                        }
                        abqy.a.p("Received interceptor signal. Starting JsBridge connection");
                        abqyVar2.f();
                        Callable callable = new Callable() { // from class: abqr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                abqy abqyVar3 = abqyVar2;
                                return abqyVar3.b.b(abqyVar3.e);
                            }
                        };
                        eosc eoscVar = abqyVar2.d;
                        eiju eijuVarG2 = eijx.g(callable, eoscVar);
                        ejvr ejvrVar2 = new ejvr() { // from class: abqs
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                ppm[] ppmVarArr = (ppm[]) obj3;
                                abqy.a.p("Ditto ready, establishing channel");
                                int length = ppmVarArr.length;
                                if (length != 2) {
                                    throw new IllegalStateException(String.format("Port pair contains %d ports, not two", Integer.valueOf(length)));
                                }
                                abqy abqyVar3 = abqyVar2;
                                ((Optional) abqyVar3.i.getAndSet(Optional.of(ppmVarArr[0]))).ifPresent(new Consumer() { // from class: abqq
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj4) {
                                        ((ppm) obj4).c();
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                ppmVarArr[0].e(new abqx(abqyVar3));
                                return new ppk(abqyVar3.f, new ppm[]{ppmVarArr[1]});
                            }
                        };
                        eosc eoscVar2 = abqyVar2.c;
                        return eijuVarG2.h(ejvrVar2, eoscVar2).h(new ejvr() { // from class: abqt
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                abqy abqyVar3 = abqyVar2;
                                abto abtoVar2 = abqyVar3.e;
                                ppk ppkVar = (ppk) obj3;
                                Optional map = abtoVar2.b().map(new Function() { // from class: abtn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return ((WebView) obj4).getUrl();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (map.isEmpty()) {
                                    abqy.a.r("WebView had no origin");
                                    throw new abpw();
                                }
                                ekqg ekqgVarListIterator = abnq.a.listIterator();
                                while (ekqgVarListIterator.hasNext()) {
                                    String str2 = (String) ekqgVarListIterator.next();
                                    if (((String) map.get()).startsWith(str2)) {
                                        abqyVar3.b.a(abtoVar2, ppkVar, Uri.parse(str2));
                                        return null;
                                    }
                                }
                                throw new abpw();
                            }
                        }, eoscVar).h(new ejvr() { // from class: abqu
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                Void r4 = (Void) obj3;
                                abqyVar2.h.g(abqg.CONNECTING, abqg.CONNECTED);
                                return r4;
                            }
                        }, eoscVar2).e(Exception.class, new ejvr() { // from class: abqv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                abqy.a.s("Could not connect to WebView", (Exception) obj3);
                                abqyVar2.h.g(abqg.CONNECTING, abqg.NOT_STARTED);
                                return null;
                            }
                        }, eoscVar2);
                    }
                }, "Subscribe to Ditto Request Interceptor Events", "MessagePortJsBridgeTransport detected Ditto interceptor signal", "Unsubscribe from Ditto Request Interceptor Events"));
                return null;
            }
        };
        eosc eoscVar = this.c;
        eijuVarG.h(ejvrVar, eoscVar).k(auvh.b(), eoscVar);
    }

    @Override // defpackage.abqi
    public final /* synthetic */ boolean e() {
        return abqf.a(this);
    }

    public final void f() {
        UnaryOperator unaryOperator = new UnaryOperator() { // from class: abql
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                abqg abqgVar = (abqg) obj;
                return (abqgVar == abqg.NOT_STARTED || abqgVar == abqg.CLOSED) ? abqgVar : abqg.CONNECTING;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        cqud cqudVar = this.h;
        cqud.h(DesugarAtomicReference.updateAndGet(cqudVar.a, unaryOperator));
        cqudVar.e();
    }
}
