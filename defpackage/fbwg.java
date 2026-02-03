package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwg implements fcan {
    private final fbvx a;
    private final fbwn b;

    public fbwg(fbvx fbvxVar, fbwn fbwnVar) {
        this.a = fbvxVar;
        this.b = fbwnVar;
    }

    @Override // defpackage.fcan
    public final fbmw a() {
        throw null;
    }

    @Override // defpackage.fcan
    public final void c(Status status) {
        fbvx fbvxVar = this.a;
        synchronized (fbvxVar) {
            fbvxVar.i(status);
        }
    }

    @Override // defpackage.fcan
    public final void e() {
        try {
            fbwn fbwnVar = this.b;
            synchronized (fbwnVar) {
                fbwnVar.f();
                fbwnVar.g();
            }
        } catch (StatusException e) {
            fbvx fbvxVar = this.a;
            synchronized (fbvxVar) {
                fbvxVar.h(e.a);
            }
        }
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        fbvx fbvxVar = this.a;
        synchronized (fbvxVar) {
            fbvxVar.n(i);
        }
    }

    @Override // defpackage.fcan
    public final void i(fbol fbolVar) {
        fbwn fbwnVar = this.b;
        synchronized (fbwnVar) {
            fbwnVar.c(fbolVar);
        }
    }

    @Override // defpackage.fcan
    public final void m(fcap fcapVar) {
        fbvx fbvxVar = this.a;
        synchronized (fbvxVar) {
            fbvxVar.l(this.b, fcapVar);
        }
        fbwn fbwnVar = this.b;
        if (fbwnVar.h()) {
            fcapVar.e();
        }
        try {
            synchronized (fbwnVar) {
                fbwnVar.e();
                fbwnVar.g();
            }
        } catch (StatusException e) {
            fbvx fbvxVar2 = this.a;
            synchronized (fbvxVar2) {
                fbvxVar2.h(e.a);
            }
        }
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) {
        try {
            fbwn fbwnVar = this.b;
            synchronized (fbwnVar) {
                fbwnVar.d(inputStream);
                fbwnVar.g();
            }
        } catch (StatusException e) {
            fbvx fbvxVar = this.a;
            synchronized (fbvxVar) {
                fbvxVar.h(e.a);
            }
        }
    }

    @Override // defpackage.fcmn
    public final boolean o() {
        return this.b.h();
    }

    public final String toString() {
        fbwn fbwnVar = this.b;
        return "MultiMessageClientStream[" + this.a.toString() + "/" + fbwnVar.toString() + "]";
    }

    @Override // defpackage.fcmn
    public final void d() {
    }

    @Override // defpackage.fcmn
    public final void f() {
    }

    @Override // defpackage.fcan
    public final void b(fceg fcegVar) {
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
    }

    @Override // defpackage.fcan
    public final void j(fboo fbooVar) {
    }

    @Override // defpackage.fcan
    public final void k(int i) {
    }

    @Override // defpackage.fcan
    public final void l(int i) {
    }
}
