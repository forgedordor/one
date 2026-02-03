package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbxf implements fcma {
    private final fbvy a;
    private final fbwo b;
    private final fbmw c;
    private fbrg d;
    private InputStream e;

    public fbxf(fbvy fbvyVar, fbwo fbwoVar, fbmw fbmwVar) {
        this.a = fbvyVar;
        this.b = fbwoVar;
        this.c = fbmwVar;
    }

    @Override // defpackage.fcma
    public final fbmw a() {
        return this.c;
    }

    @Override // defpackage.fcma
    public final fcmm b() {
        return this.b.f;
    }

    @Override // defpackage.fcma
    public final void c(Status status) {
        fbvy fbvyVar = this.a;
        synchronized (fbvyVar) {
            fbvyVar.i(status);
        }
    }

    @Override // defpackage.fcma
    public final void e(Status status, fbrg fbrgVar) {
        try {
            fbwo fbwoVar = this.b;
            synchronized (fbwoVar) {
                fbrg fbrgVar2 = this.d;
                InputStream inputStream = this.e;
                if (fbwoVar.b == null) {
                    if (fbrgVar2 != null) {
                        fbwoVar.a = fbrgVar2;
                    }
                    fbwoVar.e();
                    if (inputStream != null) {
                        fbwoVar.d(inputStream);
                    }
                    ejwl.l(fbwoVar.c == null);
                    fbwoVar.b = status;
                    fbwoVar.c = fbrgVar;
                    fbwoVar.f();
                    fbwoVar.g();
                }
            }
            fbvy fbvyVar = this.a;
            synchronized (fbvyVar) {
                fbvyVar.f();
            }
        } catch (StatusException e) {
            fbvy fbvyVar2 = this.a;
            synchronized (fbvyVar2) {
                fbvyVar2.h(e.a);
            }
        }
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        fbvy fbvyVar = this.a;
        synchronized (fbvyVar) {
            fbvyVar.n(i);
        }
    }

    @Override // defpackage.fcma
    public final void i(fcmb fcmbVar) {
        fbvy fbvyVar = this.a;
        synchronized (fbvyVar) {
            fbvyVar.l(this.b, fcmbVar);
        }
    }

    @Override // defpackage.fcma
    public final void l(fbrg fbrgVar) {
        this.d = fbrgVar;
    }

    @Override // defpackage.fcma
    public final void m() {
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) {
        if (this.e == null) {
            this.e = inputStream;
            return;
        }
        fbvy fbvyVar = this.a;
        synchronized (fbvyVar) {
            fbvyVar.h(Status.o.withDescription("too many messages"));
        }
    }

    @Override // defpackage.fcmn
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        fbwo fbwoVar = this.b;
        return "SingleMessageServerStream[" + this.a.toString() + "/" + fbwoVar.toString() + "]";
    }

    @Override // defpackage.fcmn
    public final void d() {
    }

    @Override // defpackage.fcmn
    public final void f() {
    }

    @Override // defpackage.fcma
    public final void j() {
    }

    @Override // defpackage.fcma
    public final void k() {
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
    }
}
