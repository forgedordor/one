package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essu extends fbnh {
    public final Executor a;
    public int d;
    public esst e;
    public fbng f;
    public final esss h;
    public fbnh j;
    private final fbnd k;
    private final fbrk l;
    private final ekgb m;
    private fbnc q;
    private int s;
    private fbrg t;
    public final Set b = ekpg.j();
    private final LinkedHashMap n = new LinkedHashMap();
    private final Set o = ekpg.j();
    public boolean g = false;
    public boolean i = false;
    public final Deque c = new ArrayDeque();
    private final Queue r = new ArrayDeque();
    private final Queue p = new ArrayDeque();

    public essu(fbnd fbndVar, fbrk fbrkVar, fbnc fbncVar, ekgb ekgbVar) {
        this.k = fbndVar;
        this.l = fbrkVar;
        this.q = fbncVar;
        this.m = ekgbVar;
        this.e = new esst(((ekoe) ekgbVar).c, 1, 0, 0);
        Executor executor = fbncVar.c;
        esss esssVar = new esss(executor == null ? eoqg.a : executor);
        this.h = esssVar;
        final eoss eossVar = new eoss(esssVar);
        this.a = new Executor() { // from class: essb
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                final essu essuVar = this.a;
                eossVar.execute(new Runnable() { // from class: essk
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            essu essuVar2 = essuVar;
                            essuVar2.i = true;
                            fbng fbngVar = essuVar2.f;
                            if (fbngVar != null) {
                                fbngVar.a(Status.c(th), new fbrg());
                                fbnh fbnhVar = essuVar2.j;
                                if (fbnhVar == null || essuVar2.e.e != 4) {
                                    return;
                                }
                                fbnhVar.c(null, th);
                            }
                        }
                    }
                });
            }
        };
    }

    private final esrs l(fbnc fbncVar, fbrg fbrgVar, String str) {
        fbncVar.getClass();
        fbrgVar.getClass();
        str.getClass();
        return new esrs(this.l, fbncVar, fbrgVar, str);
    }

    private final esrs m(esrs esrsVar) {
        fbnc fbncVar = this.q;
        return fbncVar == esrsVar.b ? esrsVar : l(fbncVar, esrsVar.a, esrsVar.d);
    }

    private final void n() {
        while (true) {
            Deque deque = this.c;
            if (deque.isEmpty()) {
                return;
            }
            essr essrVar = (essr) deque.peek();
            if (!essrVar.b.isEmpty() || essrVar.c != essrVar.d.e.a) {
                return;
            }
            Object obj = ((essr) deque.poll()).a;
            if (this.e.e == 4) {
                this.j.f(obj);
            } else {
                this.p.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(final essr essrVar, int i, int i2) {
        final esrt esrtVar = new esrt(essrVar.a);
        while (i < i2) {
            ekgb ekgbVar = (ekgb) this.m.get(i);
            int size = ekgbVar.size();
            int i3 = 0;
            while (i3 < size) {
                esrw esrwVar = (esrw) ekgbVar.get(i3);
                estb estbVarE = esrwVar.e();
                if (estbVarE.d == 4) {
                    ListenableFuture listenableFutureA = estbVarE.a();
                    essrVar.b.put(esrwVar, listenableFutureA);
                    listenableFutureA.b(eiid.k(new Runnable() { // from class: essa
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.g(esrtVar, essrVar);
                        }
                    }), this.a);
                }
                i3++;
                if (q(estbVarE)) {
                    return;
                }
            }
            i++;
        }
        essrVar.c = i2;
        if (essrVar.b.isEmpty()) {
            n();
            h();
        }
    }

    private final void p() {
        esst esstVar;
        esst esstVar2 = this.e;
        int i = esstVar2.e;
        ejwl.m(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            esstVar = new esst(esstVar2.a, 4, esstVar2.b, esstVar2.c);
        } else if (i == 1 && esstVar2.d) {
            int i2 = esstVar2.a;
            int i3 = esstVar2.b;
            esstVar = new esst(i2, 2, i3, i3);
        } else {
            int i4 = esstVar2.b;
            int i5 = i4 + 1;
            int i6 = esstVar2.a;
            int i7 = esstVar2.c;
            esstVar = i5 < i6 ? new esst(i6, 1, i5, i7) : new esst(i6, 3, i4, i7);
        }
        this.e = esstVar;
        int i8 = esstVar.e - 1;
        if (i8 == 0) {
            j(this.t);
            return;
        }
        if (i8 != 2) {
            i();
            return;
        }
        fbnh fbnhVarA = this.k.a(this.l, this.q);
        this.j = fbnhVarA;
        fbnhVarA.a(this.f, this.t);
        int i9 = this.d;
        if (i9 > 0) {
            this.j.e(i9);
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.j.f(it.next());
        }
        if (this.g && this.c.isEmpty()) {
            this.j.d();
        }
        p();
    }

    private final boolean q(estb estbVar) {
        int i = estbVar.d - 1;
        if (i == 0) {
            return r(estbVar);
        }
        if (i != 1) {
            if (i != 3) {
                throw null;
            }
            final ListenableFuture listenableFutureA = estbVar.a();
            this.b.add(listenableFutureA);
            listenableFutureA.b(eiid.k(new Runnable() { // from class: esse
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b.remove(listenableFutureA);
                }
            }), this.a);
            return r(estbVar);
        }
        essx essxVar = estbVar.b;
        fbng fbngVar = this.f;
        Status status = essxVar.a;
        fbngVar.a(status, essxVar.b);
        if (this.e.e == 4) {
            this.j.c("Aborted RPC with exception", status.t);
        }
        this.i = true;
        return true;
    }

    private final boolean r(estb estbVar) {
        fbnc fbncVar = estbVar.c;
        if (fbncVar == null) {
            return false;
        }
        if (this.e.e == 1) {
            this.q = fbncVar;
            return false;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Cannot return *WithCallOptions() from message processing methods");
        this.f.a(Status.c(illegalStateException), new fbrg());
        if (this.e.e == 4) {
            this.j.c("Interceptor returned invalid outcome", illegalStateException);
        }
        return true;
    }

    @Override // defpackage.fbnh
    public final void a(fbng fbngVar, final fbrg fbrgVar) {
        this.f = new essq(this, new estg(new essw(fbngVar, this.m, this.o)));
        this.t = fbrgVar;
        this.a.execute(eiid.k(new Runnable() { // from class: essf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(fbrgVar);
            }
        }));
    }

    public final void b(final esrs esrsVar) {
        LinkedHashMap linkedHashMap = this.n;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            esrw esrwVar = (esrw) entry.getKey();
            estb estbVarA = esrwVar.a(m(esrsVar));
            if (estbVarA.d == 4) {
                ListenableFuture listenableFutureA = estbVarA.a();
                linkedHashMap.put(esrwVar, listenableFutureA);
                listenableFutureA.b(eiid.k(new Runnable() { // from class: essl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(esrsVar);
                    }
                }), this.a);
            }
            if (q(estbVarA)) {
                return;
            }
        }
        if (!linkedHashMap.isEmpty() || this.i) {
            return;
        }
        p();
    }

    @Override // defpackage.fbnh
    public final void c(final String str, final Throwable th) {
        this.a.execute(eiid.k(new Runnable() { // from class: essg
            @Override // java.lang.Runnable
            public final void run() {
                essu essuVar = this.a;
                Iterator it = essuVar.b.iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(true);
                }
                fbnh fbnhVar = essuVar.j;
                if (fbnhVar != null) {
                    fbnhVar.c(str, th);
                }
            }
        }));
    }

    @Override // defpackage.fbnh
    public final void d() {
        this.a.execute(eiid.k(new Runnable() { // from class: essc
            @Override // java.lang.Runnable
            public final void run() {
                essu essuVar = this.a;
                if (essuVar.i) {
                    return;
                }
                essuVar.g = true;
                essuVar.h();
            }
        }));
    }

    @Override // defpackage.fbnh
    public final void e(final int i) {
        synchronized (this.r) {
            this.s += i;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.r;
        synchronized (queue) {
            if (!queue.isEmpty()) {
                int i2 = this.s;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objPoll = queue.poll();
                    if (objPoll != null) {
                        arrayDeque.add(objPoll);
                        this.s--;
                    }
                }
                boolean zIsEmpty = queue.isEmpty();
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.f.c(it.next());
                }
                if (zIsEmpty) {
                    this.f.a(Status.b, null);
                }
            }
        }
        this.a.execute(eiid.k(new Runnable() { // from class: essd
            @Override // java.lang.Runnable
            public final void run() {
                essu essuVar = this.a;
                if (essuVar.i) {
                    return;
                }
                int i4 = i;
                if (essuVar.e.e == 4) {
                    essuVar.j.e(i4);
                } else {
                    essuVar.d += i4;
                }
            }
        }));
    }

    @Override // defpackage.fbnh
    public final void f(final Object obj) {
        this.a.execute(eiid.k(new Runnable() { // from class: essh
            @Override // java.lang.Runnable
            public final void run() {
                essu essuVar = this.a;
                essuVar.c.add(new essr(essuVar, obj));
                essuVar.i();
            }
        }));
    }

    public final void g(final esrt esrtVar, final essr essrVar) {
        LinkedHashMap linkedHashMap = essrVar.b;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((ListenableFuture) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            esrw esrwVar = (esrw) entry.getKey();
            estb estbVarC = esrwVar.c();
            if (estbVarC.d == 4) {
                ListenableFuture listenableFutureA = estbVarC.a();
                linkedHashMap.put(esrwVar, listenableFutureA);
                listenableFutureA.b(eiid.k(new Runnable() { // from class: essi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g(esrtVar, essrVar);
                    }
                }), this.a);
            }
            if (q(estbVarC)) {
                return;
            }
        }
        if (linkedHashMap.isEmpty()) {
            n();
            h();
        }
    }

    public final void h() {
        if (this.g) {
            essr essrVar = (essr) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && essrVar == null) {
                    this.j.d();
                    return;
                }
                return;
            }
            if (essrVar == null || (essrVar.b.isEmpty() && essrVar.c == essrVar.d.e.c + 1)) {
                p();
            }
        }
    }

    public final void i() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i != 3) {
                return;
            }
            for (essr essrVar : this.c) {
                o(essrVar, essrVar.c, this.e.a);
            }
            return;
        }
        for (essr essrVar2 : this.c) {
            int i2 = essrVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                o(essrVar2, i2, i3 + 1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(fbrg fbrgVar) {
        final esrs esrsVarL = l(this.q, fbrgVar, this.k.b());
        ekgb ekgbVar = (ekgb) this.m.get(this.e.b);
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            esrw esrwVar = (esrw) ekgbVar.get(i);
            estb estbVarB = esrwVar.b(m(esrsVarL));
            if (estbVarB.d == 4) {
                ListenableFuture listenableFutureA = estbVarB.a();
                this.n.put(esrwVar, listenableFutureA);
                listenableFutureA.b(eiid.k(new Runnable() { // from class: essj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(esrsVarL);
                    }
                }), this.a);
            }
            if (q(estbVarB)) {
                return;
            }
            this.o.add(esrwVar);
        }
        if (this.n.isEmpty()) {
            p();
        }
    }
}
