package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class snq implements smp {
    public static final String a = "snq";
    public final smj b;
    protected final smq c;
    protected final eosc d;
    public final Executor e;
    public final Object f = new Object();
    public ListenableFuture g;
    private ListenableFuture h;
    private final ejcr i;

    protected snq(smj smjVar, smq smqVar, ejcr ejcrVar) {
        this.b = smjVar;
        this.c = smqVar;
        this.i = ejcrVar;
        this.d = smjVar.e();
        this.e = smjVar.f();
    }

    private final ListenableFuture f() {
        ListenableFuture listenableFuture;
        synchronized (this.f) {
            ListenableFuture listenableFuture2 = this.h;
            smj smjVar = this.b;
            if (listenableFuture2 == smjVar.d() && (listenableFuture = this.g) != null) {
                return listenableFuture;
            }
            final ejcr ejcrVar = this.i;
            eoqt eoqtVarT = eoqt.t(!smjVar.g() ? eorv.a : eooq.g(eoqt.t(smjVar.c(this.c)), new eooz() { // from class: snd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    final snq snqVar = this.a;
                    final ejcr ejcrVar2 = ejcrVar;
                    if (iIntValue == 0) {
                        final smo smoVar = new smo(1, 0, "Feature is unavailable.", null);
                        snqVar.e.execute(new Runnable() { // from class: snj
                            @Override // java.lang.Runnable
                            public final void run() {
                                ejcz ejczVar = ejcrVar2.a;
                                ekrw ekrwVarI = ejczVar.d.i();
                                ekrwVarI.X(eksq.a, "BuglePenpal");
                                ((ekrd) ((ekrd) ekrwVarI).g(smoVar).h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadDidNotStart", 504, "PenpalOnDeviceClientImpl.kt")).r("Feature %d download did not start", snqVar.c.a());
                                ((ejcp) ejczVar.e.get()).a();
                            }
                        });
                        return eork.h(smoVar);
                    }
                    if (iIntValue == 1 || iIntValue == 2) {
                        return snqVar.b.h(snqVar.c, ejcrVar2);
                    }
                    if (iIntValue != 3) {
                        Objects.toString(num);
                        return eork.h(new smo(1, 0, "Unexpected feature status: ".concat(String.valueOf(num)), null));
                    }
                    smq smqVar = snqVar.c;
                    Log.i(snq.a, "Feature " + smqVar.h() + " is downloaded and ready.");
                    snqVar.e.execute(new Runnable() { // from class: sni
                        @Override // java.lang.Runnable
                        public final void run() {
                            ejcrVar2.a(snqVar.c);
                        }
                    });
                    return eorv.a;
                }
            }, this.d));
            eooz eoozVar = new eooz() { // from class: sne
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.b.d();
                }
            };
            eosc eoscVar = this.d;
            ListenableFuture listenableFutureG = eooq.g(eooq.g(eoqtVarT, eoozVar, eoscVar), new eooz() { // from class: snf
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    smi smiVar = (smi) obj;
                    try {
                        return eork.i(new som(this.a.c(smiVar.a()), smiVar.b()));
                    } catch (RemoteException e) {
                        return eork.h(new smo(2, 6, "Failed to initialize service.", e));
                    } catch (RuntimeException e2) {
                        return eork.h(new smo(2, 0, "Failed to initialize service.", e2));
                    }
                }
            }, eoscVar);
            this.g = listenableFutureG;
            this.h = smjVar.d();
            eork.r(listenableFutureG, new snn(this), eoqg.a);
            return listenableFutureG;
        }
    }

    @Override // defpackage.smp
    public final ListenableFuture a(final Object obj) {
        return eooq.g(f(), new eooz() { // from class: snh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final snp snpVar = (snp) obj2;
                final snq snqVar = this.a;
                final Object obj3 = obj;
                return snpVar.a().a(kol.a(new koi() { // from class: snb
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        snq snqVar2 = snqVar;
                        snp snpVar2 = snpVar;
                        try {
                            final ICancellationCallback iCancellationCallbackD = snqVar2.d(snpVar2.b(), obj3, new sno(kogVar));
                            kogVar.a(new Runnable() { // from class: snk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str = snq.a;
                                    try {
                                        iCancellationCallbackD.cancel();
                                    } catch (RemoteException e) {
                                        Log.w(snq.a, "Failed to cancel inference", e);
                                    }
                                }
                            }, snqVar2.d);
                            return "runInferenceFuture";
                        } catch (RemoteException e) {
                            kogVar.c(new smo(2, 6, "Failed to run inference", e));
                            return null;
                        } catch (RuntimeException e2) {
                            kogVar.c(new smo(2, 0, "Failed to run inference", e2));
                            return null;
                        }
                    }
                }), new ejxr() { // from class: snc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String str = snq.a;
                        return new smo(3, 6, "AICore service disconnected", null);
                    }
                });
            }
        }, this.d);
    }

    @Override // defpackage.smp
    public final ListenableFuture b(final Object obj) {
        return eooq.g(f(), new eooz() { // from class: sng
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final snp snpVar = (snp) obj2;
                final snq snqVar = this.a;
                final Object obj3 = obj;
                return snpVar.a().a(kol.a(new koi() { // from class: smz
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        snm snmVar = new snm(kogVar);
                        snq snqVar2 = snqVar;
                        try {
                            final ICancellationCallback iCancellationCallbackE = snqVar2.e(obj3, snpVar.b(), snmVar);
                            kogVar.a(new Runnable() { // from class: snl
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str = snq.a;
                                    try {
                                        iCancellationCallbackE.cancel();
                                    } catch (RemoteException e) {
                                        Log.w(snq.a, "Failed to cancel tokenization request", e);
                                    }
                                }
                            }, snqVar2.d);
                            return "getTokenInfoFuture";
                        } catch (RemoteException e) {
                            kogVar.c(new smo(5, 6, "Failed to tokenize the input query", e));
                            return null;
                        } catch (RuntimeException e2) {
                            kogVar.c(new smo(5, 0, "Failed to tokenize the input query", e2));
                            return null;
                        }
                    }
                }), new ejxr() { // from class: sna
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String str = snq.a;
                        return new smo(5, 6, "AICore service disconnected", null);
                    }
                });
            }
        }, this.d);
    }

    protected abstract Object c(IAICoreService iAICoreService);

    protected abstract ICancellationCallback d(Object obj, Object obj2, sno snoVar);

    protected ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        throw null;
    }
}
