package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import j$.util.function.Consumer$CC;
import j$.util.function.IntUnaryOperator$CC;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrv {
    public final Handler a;
    public final dcko b;
    public final dcrx c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();

    public dcrv(Handler handler, dcko dckoVar, dcrx dcrxVar) {
        dclh.b(dckoVar.d == handler.getLooper(), "GmsClient invokes callbacks is on an unexpected worker thread");
        this.a = handler;
        this.b = dckoVar;
        this.c = dcrxVar;
    }

    public static void b(dcru dcruVar, dcko dckoVar, defr defrVar) {
        try {
            defrVar.b(dcruVar.a(dckoVar));
        } catch (dcff e) {
            defrVar.a(e);
        }
    }

    final int a() {
        return this.d.get();
    }

    public final void c(final dcru dcruVar, final defr defrVar) {
        this.c.a.add(new Consumer() { // from class: dcrq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dcrv dcrvVar = this.a;
                Status status = (Status) obj;
                dclh.d(dcrvVar.a);
                boolean zD = status.d();
                defr defrVar2 = defrVar;
                if (zD) {
                    dcrv.b(dcruVar, dcrvVar.b, defrVar2);
                } else {
                    defrVar2.a(dcjq.a(status));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final defn d(final int i, final int i2, final dcru dcruVar) {
        this.e.incrementAndGet();
        final defr defrVar = new defr();
        Runnable runnable = new Runnable() { // from class: dcrr
            @Override // java.lang.Runnable
            public final void run() {
                dcrv dcrvVar = this.a;
                dclh.d(dcrvVar.a);
                dcru dcruVar2 = dcruVar;
                dcko dckoVar = dcrvVar.b;
                defr defrVar2 = defrVar;
                if (dckoVar.p()) {
                    dcrv.b(dcruVar2, dckoVar, defrVar2);
                    return;
                }
                if (dckoVar.q()) {
                    dcrvVar.c(dcruVar2, defrVar2);
                } else if (i - 1 != 0) {
                    dcrx dcrxVar = dcrvVar.c;
                    defrVar2.a(dcjq.a(dcrxVar.b.d() ? new Status(8, "GmsClient is disconnected with SUCCESS connection status.") : dcrxVar.b));
                } else {
                    dcrvVar.c(dcruVar2, defrVar2);
                    dckoVar.A();
                }
            }
        };
        final Handler handler = this.a;
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
        defv defvVar = defrVar.a;
        defvVar.o(new Executor() { // from class: dcrs
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) {
                handler.post(runnable2);
            }
        }, new defb() { // from class: dcrt
            @Override // defpackage.defb
            public final void a(defn defnVar) {
                int iUpdateAndGet;
                dcrv dcrvVar = this.a;
                Handler handler2 = dcrvVar.a;
                dclh.d(handler2);
                dclh.d(handler2);
                if (defnVar.m()) {
                    int i3 = i2 - 1;
                    iUpdateAndGet = i3 != 0 ? i3 != 2 ? dcrvVar.d.get() : DesugarAtomicInteger.updateAndGet(dcrvVar.d, new IntUnaryOperator() { // from class: dcrp
                        public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                            return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                        }

                        @Override // java.util.function.IntUnaryOperator
                        public final int applyAsInt(int i4) {
                            return Math.max(i4 - 1, 0);
                        }

                        public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                            return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                        }
                    }) : dcrvVar.d.incrementAndGet();
                } else {
                    iUpdateAndGet = dcrvVar.d.get();
                }
                int iDecrementAndGet = dcrvVar.e.decrementAndGet();
                if (iUpdateAndGet > 0 || iDecrementAndGet > 0) {
                    return;
                }
                dcko dckoVar = dcrvVar.b;
                if (dckoVar.p()) {
                    dckoVar.m();
                }
            }
        });
        return defvVar;
    }
}
