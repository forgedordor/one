package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpw implements ehpl {
    public ehpl a;
    private final ea b;
    private final fcyh c;

    public ehpw(ea eaVar, fcyh fcyhVar) {
        this.b = eaVar;
        this.c = fcyhVar;
    }

    @Override // defpackage.ehpl
    public final ehpi a(final fdvc fdvcVar) {
        fdvcVar.getClass();
        if (!fdbq.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalStateException("streamFrom() must be called from the main thread.");
        }
        try {
            if (((lvn) this.b.Q().P()).c != lvb.b) {
                throw new IllegalStateException("A @ViewLifecycle StreamMixin may only register callbacks in `onCreateView()`.");
            }
            ehpl ehplVar = this.a;
            if (ehplVar == null) {
                ea eaVar = this.b;
                lvj lvjVarQ = eaVar.Q();
                try {
                    ehpt ehptVar = new ehpt(lvjVarQ, ehou.a(this.c, lvjVarQ.P()), ehpg.a(lvjVarQ, eaVar));
                    lvjVarQ.P().c(new eijk(new ehpv(this)));
                    this.a = ehptVar;
                    ehplVar = ehptVar;
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            if (!fdbq.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                throw new IllegalStateException("streamFrom() must be called from the main thread.");
            }
            final ehpt ehptVar2 = (ehpt) ehplVar;
            ehpu ehpuVar = ehptVar2.c;
            Map map = ehpuVar.a;
            Object objValueOf = map.get(fdvcVar);
            if (objValueOf == null) {
                if (!ehpuVar.b) {
                    throw new IllegalStateException("This StateFlow object was not streamed from in the first lifecycle of this LifecycleOwner. A LifecycleOwner must streamFrom() every StateFlow it wishes to stream from in its first lifecycle, and must always stream from exactly the same set of StateFlow objects after each configuration change. This prevents state loss.");
                }
                int[] iArr = ley.a;
                objValueOf = Integer.valueOf(View.generateViewId());
                map.put(fdvcVar, objValueOf);
            }
            ehptVar2.d.b(((Number) objValueOf).intValue(), ehptVar2.a, new ehow() { // from class: ehpm
                @Override // defpackage.ehow
                public final Object a() {
                    if (ehptVar2.c.b) {
                        return fctx.a;
                    }
                    throw new IllegalStateException("This shouldn't happen. If there was a client-side error, it should've crashed during `flowId` generation. Please report go/tiktok-bug.");
                }
            });
            return new ehph(new fdap() { // from class: ehpn
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ehpj ehpjVar = (ehpj) obj;
                    ehpjVar.getClass();
                    if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    fdvc fdvcVar2 = fdvcVar;
                    ehpt ehptVar3 = ehptVar2;
                    fdjz fdjzVar = fdjz.d;
                    fdin.c(ehptVar3.b, eicg.a(fcyi.a), fdjzVar, new ehps(null, ehptVar3, fdvcVar2, ehpjVar));
                    return fctx.a;
                }
            });
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle StreamMixin may only register callbacks in `onCreateView()`.", e2);
        }
    }
}
