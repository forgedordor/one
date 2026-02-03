package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdiy extends fdlx {
    public final fdiu a;

    public fdiy(fdiu fdiuVar) {
        this.a = fdiuVar;
    }

    @Override // defpackage.fdlx
    public final void a(Throwable th) {
        fdiu fdiuVar = this.a;
        Throwable thR = fdiuVar.r(e());
        if (fdiuVar.G()) {
            fdhz fdhzVar = ((fdye) fdiuVar.a).f;
            while (true) {
                Object obj = fdhzVar.a;
                fdzi fdziVar = fdyf.b;
                if (fdbq.f(obj, fdziVar)) {
                    if (fdhzVar.d(fdziVar, thR)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (fdhzVar.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        fdiuVar.h(thR);
        fdiuVar.A();
    }

    @Override // defpackage.fdlx
    public final boolean b() {
        return true;
    }
}
