package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqe implements abqi {
    public static final cqce a = cqce.g("Bugle", "JsBridgeTransportV1ToV2Wrapper");
    public final cqud b;
    private final eosc c;
    private final AtomicReference d = new AtomicReference(Optional.empty());
    private final abrd e;

    public abqe(cqtp cqtpVar, eosc eoscVar, abrd abrdVar) {
        this.e = abrdVar;
        this.c = eoscVar;
        this.b = new cqud(cqtpVar, abqg.NOT_STARTED);
    }

    @Override // defpackage.abpx
    public final void a(String str) {
        abrd abrdVar = this.e;
        if (!abrdVar.g.isPresent()) {
            throw new abpv();
        }
        ((ppj) abrdVar.g.get()).a(str);
    }

    @Override // defpackage.abqi
    public final abqg b() {
        return (abqg) this.b.d();
    }

    @Override // defpackage.abqi
    public final cquc c(String str, cqtk cqtkVar) {
        return this.b.a(str, cqtkVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        abrd abrdVar = this.e;
        synchronized (abrdVar.b) {
            abrdVar.j = true;
            abrdVar.i = null;
            abrdVar.g = Optional.empty();
            if (abrdVar.h.isPresent()) {
                ((kog) abrdVar.h.get()).d();
                abrdVar.h = Optional.empty();
            }
        }
        abto abtoVar = abrdVar.d;
        String str = abrdVar.e;
        WebView webView = (WebView) abtoVar.b().orElseThrow(new Supplier() { // from class: abtw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("Cannot add message listener; WebView has been destroyed");
            }
        });
        Uri uri = pps.a;
        if (!pqx.h.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        pps.a(webView).a.removeWebMessageListener(str);
        ((Optional) this.d.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: abqc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((eiju) obj).cancel(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b.f(abqg.CLOSED);
    }

    @Override // defpackage.abqi
    public final void d() {
        eiju eijuVarG;
        this.b.g(abqg.NOT_STARTED, abqg.CONNECTING);
        final abrd abrdVar = this.e;
        synchronized (abrdVar.b) {
            abrdVar.j = false;
            if (abrdVar.i == null) {
                abrdVar.i = new egpe(new eooy() { // from class: abrb
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final abrd abrdVar2 = abrdVar;
                        return eiju.g(kol.a(new koi() { // from class: abra
                            @Override // defpackage.koi
                            public final Object a(kog kogVar) {
                                abrd abrdVar3 = abrdVar2;
                                synchronized (abrdVar3.b) {
                                    abrdVar3.h = Optional.of(kogVar);
                                }
                                abto abtoVar = abrdVar3.d;
                                pps.b((WebView) abtoVar.b().orElseThrow(new Supplier() { // from class: abtx
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return new IllegalStateException("Cannot add message listener; WebView has been destroyed");
                                    }
                                }), abrdVar3.e, abnq.a, new abrc(abrdVar3, abrdVar3));
                                return null;
                            }
                        }));
                    }
                }, abrdVar.c);
            }
            eijuVarG = eiju.g(abrdVar.i.c());
        }
        ejvr ejvrVar = new ejvr() { // from class: abpz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.b.g(abqg.CONNECTING, abqg.CONNECTED);
                return null;
            }
        };
        eosc eoscVar = this.c;
        eiju eijuVarE = eijuVarG.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: abqa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (exc instanceof CancellationException) {
                    return null;
                }
                abqe abqeVar = this.a;
                abqe.a.s("JsBridgeTransport#open() failed", exc);
                abqeVar.b.g(abqg.CONNECTING, abqg.NOT_STARTED);
                return null;
            }
        }, eoscVar);
        ((Optional) this.d.getAndSet(Optional.of(eijuVarE))).ifPresent(new Consumer() { // from class: abqb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((eiju) obj).cancel(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eijuVarE.k(auvh.b(), eoscVar);
    }

    @Override // defpackage.abqi
    public final /* synthetic */ boolean e() {
        return abqf.a(this);
    }
}
