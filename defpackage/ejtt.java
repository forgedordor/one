package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejtt extends lxd implements ejtw {
    private static volatile Handler j;
    public ejtb d;
    public boolean g;
    public final String i;
    private final lwn k;
    public final cvx a = new cvx();
    public final Set b = new css();
    public fr c = null;
    public boolean e = false;
    public boolean f = false;
    public boolean h = false;

    public ejtt(lwn lwnVar) {
        this.g = false;
        this.k = lwnVar;
        this.i = ejvr.class.getName() + ea.class.getName() + getClass().getName();
        if (lwnVar.f()) {
            Bundle bundle = (Bundle) lwnVar.b("FutureListenerState");
            this.g = true;
            l(bundle);
            Parcelable[] parcelableArray = bundle.getParcelableArray("futures");
            if (parcelableArray != null) {
                for (Parcelable parcelable : parcelableArray) {
                    this.b.add((ejtx) parcelable);
                }
            }
        }
        lwnVar.e("FutureListenerState", new piw() { // from class: ejtq
            @Override // defpackage.piw
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                ejtt ejttVar = this.a;
                bundle2.putString("appVersion", ejttVar.i);
                cvx cvxVar = ejttVar.a;
                int iC = cvxVar.c();
                int[] iArr = new int[iC];
                for (int i = 0; i < iC; i++) {
                    iArr[i] = cvxVar.b(i);
                }
                bundle2.putIntArray("callback_ids", iArr);
                Set set = ejttVar.b;
                bundle2.putParcelableArray("futures", (Parcelable[]) set.toArray(new ejtx[((css) set).c]));
                return bundle2;
            }
        });
    }

    public static final void f() {
        ejwl.m(Looper.myLooper() == Looper.getMainLooper(), "Must be called from the main thread.");
    }

    private final void l(Bundle bundle) {
        String string = bundle.getString("appVersion");
        if (string == null) {
            throw new ejts("Got key but not value from saved state.");
        }
        String str = this.i;
        if (!str.equals(string)) {
            throw new ejts(a.n(string, str, "Got data from old app version: expected=", " got="));
        }
    }

    public final void a(Runnable runnable) {
        this.h = true;
        try {
            runnable.run();
        } finally {
            this.h = false;
        }
    }

    @Override // defpackage.ejtw
    public final void b(final ejtx ejtxVar, final Throwable th) {
        c(ejtxVar, new Runnable() { // from class: ejtn
            @Override // java.lang.Runnable
            public final void run() {
                ejtt ejttVar = this.a;
                cvx cvxVar = ejttVar.a;
                final ejtx ejtxVar2 = ejtxVar;
                final ejtf ejtfVar = (ejtf) cvy.a(cvxVar, ejtxVar2.a);
                final Throwable th2 = th;
                ejttVar.a(new Runnable() { // from class: ejtr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ejtfVar.a(ejtxVar2.b, th2);
                    }
                });
            }
        });
    }

    public final void c(final ejtx ejtxVar, final Runnable runnable) {
        if (this.c != null) {
            if (j == null) {
                j = new Handler(Looper.getMainLooper());
            }
            j.post(new Runnable() { // from class: ejtm
                @Override // java.lang.Runnable
                public final void run() {
                    ejtt ejttVar = this.a;
                    fr frVar = ejttVar.c;
                    if (frVar != null) {
                        if (frVar.ag()) {
                            ejttVar.e = true;
                        } else {
                            if (frVar.x) {
                                return;
                            }
                            if (ejttVar.b.remove(ejtxVar)) {
                                runnable.run();
                            }
                        }
                    }
                }
            });
        }
    }

    final void e(fr frVar) {
        boolean z = true;
        ejwl.a(frVar != null);
        fr frVar2 = this.c;
        ejwl.l(frVar2 == null || frVar == frVar2);
        if (!this.f) {
            lwn lwnVar = this.k;
            if (lwnVar.f()) {
                Bundle bundle = (Bundle) lwnVar.b("FutureListenerState");
                l(bundle);
                for (int i : bundle.getIntArray("callback_ids")) {
                    ejwl.m(cvy.a(this.a, i) != null, "Didn't re-register callback.");
                }
            }
            this.f = true;
        }
        if (!this.e && this.c != null) {
            z = false;
        }
        if (this.c == null) {
            this.c = frVar;
        }
        if (z) {
            this.e = false;
            csr csrVar = new csr((css) this.b);
            while (csrVar.hasNext()) {
                ejtx ejtxVar = (ejtx) csrVar.next();
                if (!ejtxVar.c()) {
                    k(ejtxVar);
                }
                ejtxVar.b(this);
            }
        }
    }

    @Override // defpackage.lxd
    public final void fC() {
        Set set = this.b;
        css cssVar = (css) set;
        Log.i("FutureListener", "Dropped results for " + cssVar.c + " pending futures.");
        csr csrVar = new csr(cssVar);
        while (csrVar.hasNext()) {
            final ejtx ejtxVar = (ejtx) csrVar.next();
            if (((ejtf) cvy.a(this.a, ejtxVar.a)) != null) {
                a(new Runnable() { // from class: ejtk
                    @Override // java.lang.Runnable
                    public final void run() {
                        ejtx ejtxVar2 = ejtxVar;
                        Object obj = ejtxVar2.b;
                        ListenableFuture listenableFuture = ejtxVar2.c;
                    }
                });
            }
        }
        set.clear();
    }

    public final void k(final ejtx ejtxVar) {
        a(new Runnable() { // from class: ejtp
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = ejtxVar.b;
            }
        });
    }
}
