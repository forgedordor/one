package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eoot extends eoox {
    private static final eorz b = new eorz(eoot.class);
    private ekfn c;
    private final boolean d;
    private final boolean e;

    public eoot(ekfn ekfnVar, boolean z, boolean z2) {
        super(ekfnVar.size());
        ekfnVar.getClass();
        this.c = ekfnVar;
        this.d = z;
        this.e = z2;
    }

    private final void w(int i, Future future) {
        try {
            e(i, eote.a(future));
        } catch (ExecutionException e) {
            x(e.getCause());
        } catch (Throwable th) {
            x(th);
        }
    }

    private final void x(Throwable th) {
        th.getClass();
        if (this.d && !setException(th)) {
            Set<Throwable> set = this.seenExceptionsField;
            if (set == null) {
                Set setI = ekpg.i();
                d(setI);
                eoox.a.b(this, setI);
                set = this.seenExceptionsField;
                set.getClass();
            }
            if (z(set, th)) {
                y(th);
                return;
            }
        }
        if (th instanceof Error) {
            y(th);
        }
    }

    private static void y(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean z(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.eoox
    public final void d(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thJ = j();
        thJ.getClass();
        z(set, thJ);
    }

    public abstract void e(int i, Object obj);

    public final void f(ekfn ekfnVar) {
        int iA = eoox.a.a(this);
        int i = 0;
        ejwl.m(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (ekfnVar != null) {
                ekqg ekqgVarListIterator = ekfnVar.listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    Future future = (Future) ekqgVarListIterator.next();
                    if (!future.isCancelled()) {
                        w(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            g();
            v(2);
        }
    }

    public abstract void g();

    @Override // defpackage.eooi
    protected final String gu() {
        ekfn ekfnVar = this.c;
        return ekfnVar != null ? "futures=".concat(ekfnVar.toString()) : super.gu();
    }

    @Override // defpackage.eooi
    protected final void gv() {
        ekfn ekfnVar = this.c;
        v(1);
        if ((ekfnVar != null) && isCancelled()) {
            boolean zP = p();
            ekqg ekqgVarListIterator = ekfnVar.listIterator();
            while (ekqgVarListIterator.hasNext()) {
                ((Future) ekqgVarListIterator.next()).cancel(zP);
            }
        }
    }

    final void t() {
        ekfn ekfnVar = this.c;
        ekfnVar.getClass();
        if (ekfnVar.isEmpty()) {
            g();
            return;
        }
        if (this.d) {
            ekqg ekqgVarListIterator = this.c.listIterator();
            final int i = 0;
            while (ekqgVarListIterator.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) ekqgVarListIterator.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    u(i, listenableFuture);
                } else {
                    listenableFuture.b(new Runnable() { // from class: eoor
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.u(i, listenableFuture);
                        }
                    }, eoqg.a);
                }
                i = i2;
            }
            return;
        }
        ekfn ekfnVar2 = this.c;
        final ekfn ekfnVar3 = true != this.e ? null : ekfnVar2;
        Runnable runnable = new Runnable() { // from class: eoos
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f(ekfnVar3);
            }
        };
        ekqg ekqgVarListIterator2 = ekfnVar2.listIterator();
        while (ekqgVarListIterator2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) ekqgVarListIterator2.next();
            if (listenableFuture2.isDone()) {
                f(ekfnVar3);
            } else {
                listenableFuture2.b(runnable, eoqg.a);
            }
        }
    }

    public final void u(int i, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                w(i, listenableFuture);
            }
        } finally {
            f(null);
        }
    }

    public void v(int i) {
        this.c = null;
    }
}
