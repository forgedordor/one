package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class estg extends fbng {
    public final fbng a;
    private final eiik b = eiik.b();

    public estg(fbng fbngVar) {
        this.a = fbngVar;
    }

    private final void e(Runnable runnable) {
        if (eidc.v()) {
            runnable.run();
        } else {
            eiik.d(this.b, runnable).run();
        }
    }

    @Override // defpackage.fbng
    public final void a(final Status status, final fbrg fbrgVar) {
        e(new Runnable() { // from class: este
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(status, fbrgVar);
            }
        });
    }

    @Override // defpackage.fbng
    public final void b(final fbrg fbrgVar) {
        e(new Runnable() { // from class: estc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(fbrgVar);
            }
        });
    }

    @Override // defpackage.fbng
    public final void c(final Object obj) {
        e(new Runnable() { // from class: estf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c(obj);
            }
        });
    }

    @Override // defpackage.fbng
    public final void d() {
        final fbng fbngVar = this.a;
        fbngVar.getClass();
        e(new Runnable() { // from class: estd
            @Override // java.lang.Runnable
            public final void run() {
                fbngVar.d();
            }
        });
    }
}
