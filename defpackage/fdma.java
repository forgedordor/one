package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdma implements fdll {
    public final fdmj a;
    public final fdhw b;
    private final fdhz c;
    private final fdhz d;

    public fdma(fdmj fdmjVar, Throwable th) {
        this.a = fdmjVar;
        fdia fdiaVar = fdia.a;
        this.b = new fdhw(false, fdiaVar);
        this.c = new fdhz(th, fdiaVar);
        this.d = new fdhz(null, fdiaVar);
    }

    public final Object c() {
        return this.d.a;
    }

    public final Throwable d() {
        return (Throwable) this.c.a;
    }

    public final void e(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            this.c.c(th);
            return;
        }
        if (th == thD) {
            return;
        }
        Object objC = c();
        if (objC == null) {
            f(th);
            return;
        }
        if (!(objC instanceof Throwable)) {
            if (objC instanceof ArrayList) {
                ((ArrayList) objC).add(th);
                return;
            } else {
                Objects.toString(objC);
                throw new IllegalStateException("State is ".concat(objC.toString()));
            }
        }
        if (th != objC) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(objC);
            arrayList.add(th);
            f(arrayList);
        }
    }

    public final void f(Object obj) {
        this.d.c(obj);
    }

    public final boolean g() {
        return d() != null;
    }

    public final boolean h() {
        return this.b.b();
    }

    @Override // defpackage.fdll
    public final boolean hA() {
        return d() == null;
    }

    @Override // defpackage.fdll
    public final fdmj hy() {
        return this.a;
    }

    public final String toString() {
        return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + this.a + "]";
    }
}
