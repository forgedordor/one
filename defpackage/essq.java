package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essq extends fbng {
    public final fbng a;
    boolean b = false;
    final /* synthetic */ essu c;

    public essq(essu essuVar, fbng fbngVar) {
        this.c = essuVar;
        this.a = fbngVar;
    }

    @Override // defpackage.fbng
    public final void a(final Status status, final fbrg fbrgVar) {
        this.c.a.execute(new Runnable() { // from class: essn
            @Override // java.lang.Runnable
            public final void run() {
                Status status2 = status;
                fbrg fbrgVar2 = fbrgVar;
                essq essqVar = this.a;
                if (essqVar.b) {
                    return;
                }
                try {
                    essqVar.a.a(status2, fbrgVar2);
                } finally {
                    essqVar.b = true;
                    essqVar.c.h.a();
                }
            }
        });
    }

    @Override // defpackage.fbng
    public final void b(final fbrg fbrgVar) {
        this.c.a.execute(new Runnable() { // from class: essm
            @Override // java.lang.Runnable
            public final void run() {
                essq essqVar = this.a;
                if (essqVar.b) {
                    return;
                }
                essqVar.a.b(fbrgVar);
            }
        });
    }

    @Override // defpackage.fbng
    public final void c(final Object obj) {
        this.c.a.execute(new Runnable() { // from class: esso
            @Override // java.lang.Runnable
            public final void run() {
                essq essqVar = this.a;
                if (essqVar.b) {
                    return;
                }
                essqVar.a.c(obj);
            }
        });
    }

    @Override // defpackage.fbng
    public final void d() {
        this.c.a.execute(new Runnable() { // from class: essp
            @Override // java.lang.Runnable
            public final void run() {
                essq essqVar = this.a;
                if (essqVar.b) {
                    return;
                }
                essqVar.a.d();
            }
        });
    }
}
