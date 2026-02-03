package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdlz extends fdlx {
    private final fdme a;
    private final fdma b;
    private final fdja c;
    private final Object h;

    public fdlz(fdme fdmeVar, fdma fdmaVar, fdja fdjaVar, Object obj) {
        this.a = fdmeVar;
        this.b = fdmaVar;
        this.c = fdjaVar;
        this.h = obj;
    }

    @Override // defpackage.fdlx
    public final void a(Throwable th) {
        boolean z = fdkb.a;
        fdme fdmeVar = this.a;
        fdma fdmaVar = this.b;
        fdja fdjaVar = this.c;
        fdja fdjaVarU = fdme.U(fdjaVar);
        Object obj = this.h;
        if (fdjaVarU == null || !fdmeVar.S(fdmaVar, fdjaVarU, obj)) {
            fdmaVar.a.j(2);
            fdja fdjaVarU2 = fdme.U(fdjaVar);
            if (fdjaVarU2 == null || !fdmeVar.S(fdmaVar, fdjaVarU2, obj)) {
                fdmeVar.hC(fdmeVar.C(fdmaVar, obj));
            }
        }
    }

    @Override // defpackage.fdlx
    public final boolean b() {
        return false;
    }
}
