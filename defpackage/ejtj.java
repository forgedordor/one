package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejtj {
    public final ejxr a;
    public final ejtb b;
    public final ejxr c;

    private ejtj(lvc lvcVar, ejxr ejxrVar, final ejxr ejxrVar2, ejtb ejtbVar) {
        ejwl.m(((lvn) lvcVar).c == lvb.b, "FutureCallbackRegistry must be created in onCreate of the Activity/Fragment.");
        this.a = ejxrVar;
        this.b = ejtbVar;
        this.c = ejxx.a(new ejxr() { // from class: ejte
            @Override // defpackage.ejxr
            public final Object get() {
                ejtt ejttVar = (ejtt) ((lxo) ejxrVar2.get()).a(ejtt.class);
                ejttVar.d = this.a.b;
                return ejttVar;
            }
        });
        lvcVar.c(new ejtg(this));
    }

    public static ejth a(ListenableFuture listenableFuture) {
        return new ejth(eooq.f(listenableFuture, new ejvt(null), eoqg.a));
    }

    public static ejtj b(final ea eaVar) {
        lvc lvcVarP = eaVar.P();
        eaVar.getClass();
        return new ejtj(lvcVarP, new ejxr() { // from class: ejtc
            @Override // defpackage.ejxr
            public final Object get() {
                return eaVar.I();
            }
        }, ejxx.a(new ejxr() { // from class: ejtd
            @Override // defpackage.ejxr
            public final Object get() {
                return new lxo(eaVar);
            }
        }), ejtb.a);
    }

    public final void c(ejth ejthVar, ejtf ejtfVar, Object obj) {
        fr frVar = (fr) this.a.get();
        ejwl.m((frVar.ag() || frVar.x) ? false : true, "Called when state-loss is possible.");
        ejtt ejttVar = (ejtt) this.c.get();
        ejtt.f();
        cvx cvxVar = ejttVar.a;
        if (cvxVar.a) {
            cvy.b(cvxVar);
        }
        int i = cvxVar.d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            } else if (cvxVar.c[i2] == ejtfVar) {
                break;
            } else {
                i2++;
            }
        }
        ejwl.m(i2 != -1, "Callback not registered.");
        int iB = cvxVar.b(i2);
        final ejtx ejtxVar = new ejtx(iB, obj, ejthVar.a);
        ejtt.f();
        ejwl.m(cvy.a(cvxVar, iB) != null, "Callback not registered.");
        ejwl.m(ejttVar.c != null, "Listening outside of callback window.");
        ejwl.m(ejttVar.g, "Executing tasks from lifecycle methods is disallowed since it can result in unnecessary operations during configuration changes or other lifecycle transitions.");
        ejwl.m(!ejttVar.h, "Calling listen() from FutureCallbackRegistry callbacks is disallowed because hopping through the UI thread adds extra latency. Chain the new Future to the original Future using Futures.transformAsync instead.");
        ejtb ejtbVar = ejttVar.d;
        ejtxVar.c.b(new Runnable() { // from class: ejtu
            @Override // java.lang.Runnable
            public final void run() {
                ejtxVar.a();
            }
        }, eoqg.a);
        ejttVar.b.add(ejtxVar);
        ejtxVar.b(ejttVar);
        if (ejtxVar.c()) {
            return;
        }
        ejttVar.k(ejtxVar);
    }

    public final void d(int i, ejtf ejtfVar) {
        ejwl.b(true, "Use an R.id value as the callbackId");
        ejtt ejttVar = (ejtt) this.c.get();
        ejtt.f();
        ejwl.m(!ejttVar.f, "Callbacks must be registered in onCreate().");
        cvx cvxVar = ejttVar.a;
        ejwl.m(cvy.a(cvxVar, i) == null, "Callback already registered.");
        ejtfVar.getClass();
        cvxVar.f(i, ejtfVar);
    }
}
