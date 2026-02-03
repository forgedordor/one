package defpackage;

import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essw extends fbou {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public boolean c;
    public Status d;
    public fbrg e;
    private final ekgb g;
    private final Queue h;
    private final Set i;
    private int j;
    private boolean k;
    private boolean l;
    private fbrg m;

    public essw(fbng fbngVar, ekgb ekgbVar, Set set) {
        super(fbngVar);
        this.a = new LinkedHashMap();
        this.h = new ArrayDeque();
        this.b = new LinkedHashMap();
        this.g = ekgbVar;
        this.j = ((ekoe) ekgbVar).c;
        this.i = set;
    }

    private final void i() {
        if (g() || !this.h.isEmpty() || !this.l || this.c) {
            return;
        }
        f();
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void a(Status status, fbrg fbrgVar) {
        this.d = status;
        this.e = fbrgVar;
        this.l = true;
        i();
    }

    @Override // defpackage.fbrz, defpackage.fbng
    public final void b(fbrg fbrgVar) {
        this.m = fbrgVar;
        new esru(fbrgVar);
        Iterator it = ekjz.f(this.g.subList(0, this.j)).iterator();
        while (it.hasNext()) {
            this.j--;
            for (esrw esrwVar : ekjz.f((List) it.next())) {
                if (this.i.contains(esrwVar)) {
                    try {
                        esrwVar.f();
                    } catch (Throwable th) {
                        this.d = Status.c(th);
                        this.e = new fbrg();
                        f();
                        return;
                    }
                }
            }
            if (g()) {
                return;
            }
        }
        this.f.b(this.m);
        this.k = true;
        e();
    }

    @Override // defpackage.fbov, defpackage.fbng
    public final void c(Object obj) {
        this.h.add(new essv(obj, ((ekoe) this.g).c));
        e();
    }

    public final void e() {
        if (this.k) {
            Queue<essv> queue = this.h;
            for (essv essvVar : queue) {
                Iterator it = ekjz.f(this.g.subList(0, essvVar.c)).iterator();
                while (it.hasNext()) {
                    for (esrw esrwVar : ekjz.f((List) it.next())) {
                        if (this.i.contains(esrwVar)) {
                            new esrv(essvVar.a);
                            try {
                                esrwVar.g();
                            } catch (Throwable th) {
                                this.d = Status.c(th);
                                this.e = new fbrg();
                                f();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (!essvVar.a()) {
                        return;
                    } else {
                        essvVar.c--;
                    }
                }
            }
            while (!queue.isEmpty()) {
                essv essvVar2 = (essv) queue.peek();
                if (!essvVar2.a() || essvVar2.c != 0) {
                    break;
                } else {
                    this.f.c(((essv) queue.poll()).a);
                }
            }
            i();
        }
    }

    public final void f() {
        Iterator it = ekjz.f(this.g).iterator();
        while (it.hasNext()) {
            for (esrw esrwVar : ekjz.f((List) it.next())) {
                esrr esrrVar = new esrr(this.d, this.e);
                if (this.i.contains(esrwVar)) {
                    try {
                        esrwVar.d(esrrVar);
                    } catch (Throwable th) {
                        this.d = Status.c(th);
                        this.e = new fbrg();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            this.f.a(this.d, this.e);
        }
    }

    public final boolean g() {
        return !this.a.isEmpty();
    }
}
