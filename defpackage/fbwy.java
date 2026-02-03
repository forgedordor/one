package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwy extends fbsl {
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.fbsl
    public final void a() {
        this.b.offer(new fbwx() { // from class: fbwv
            @Override // defpackage.fbwx
            public final void a(fbsl fbslVar) {
                fbslVar.a();
            }
        });
        f();
    }

    @Override // defpackage.fbsl
    public final void b() {
        this.b.offer(new fbwx() { // from class: fbwt
            @Override // defpackage.fbwx
            public final void a(fbsl fbslVar) {
                fbslVar.b();
            }
        });
        f();
    }

    @Override // defpackage.fbsl
    public final void c() {
        this.b.offer(new fbwx() { // from class: fbws
            @Override // defpackage.fbwx
            public final void a(fbsl fbslVar) {
                fbslVar.c();
            }
        });
        f();
    }

    @Override // defpackage.fbsl
    public final void d(final Object obj) {
        this.b.offer(new fbwx() { // from class: fbww
            @Override // defpackage.fbwx
            public final void a(fbsl fbslVar) {
                fbslVar.d(obj);
            }
        });
        f();
    }

    @Override // defpackage.fbsl
    public final void e() {
        this.b.offer(new fbwx() { // from class: fbwu
            @Override // defpackage.fbwx
            public final void a(fbsl fbslVar) {
                fbslVar.e();
            }
        });
        f();
    }

    public final void f() {
        fbsl fbslVar = (fbsl) this.a.get();
        if (fbslVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                fbwx fbwxVar = (fbwx) this.b.poll();
                if (fbwxVar != null) {
                    fbwxVar.a(fbslVar);
                }
            }
        }
    }
}
