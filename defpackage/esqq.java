package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esqq extends fbnh {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public fbnh c;
    final /* synthetic */ fbnd d;
    final /* synthetic */ fbrk e;
    final /* synthetic */ fbnc f;

    public esqq(fbnd fbndVar, fbrk fbrkVar, fbnc fbncVar) {
        this.d = fbndVar;
        this.e = fbrkVar;
        this.f = fbncVar;
        this.c = fbndVar.a(fbrkVar, fbncVar);
    }

    @Override // defpackage.fbnh
    public final void a(final fbng fbngVar, fbrg fbrgVar) {
        synchronized (this.a) {
            final fbrg fbrgVar2 = new fbrg();
            fbrgVar2.g(fbrgVar);
            this.b.add(new Runnable() { // from class: esqo
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b().a(fbngVar, fbrgVar2);
                }
            });
            b().a(new esqp(this, fbngVar), fbrgVar);
        }
    }

    public final fbnh b() {
        fbnh fbnhVar;
        synchronized (this.a) {
            fbnhVar = this.c;
        }
        return fbnhVar;
    }

    @Override // defpackage.fbnh
    public final void c(final String str, final Throwable th) {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: esqm
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b().c(str, th);
                }
            });
            b().c(str, th);
        }
    }

    @Override // defpackage.fbnh
    public final void d() {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: esqk
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b().d();
                }
            });
            b().d();
        }
    }

    @Override // defpackage.fbnh
    public final void e(final int i) {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: esql
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b().e(i);
                }
            });
            b().e(i);
        }
    }

    @Override // defpackage.fbnh
    public final void f(final Object obj) {
        synchronized (this.a) {
            this.b.add(new Runnable() { // from class: esqn
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b().f(obj);
                }
            });
            b().f(obj);
        }
    }
}
