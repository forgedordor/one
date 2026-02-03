package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgg implements kgj {
    public hsf a;

    public kgg() {
        this.a = lpz.h() ? a() : null;
    }

    public final hsf a() {
        lpz lpzVarC = lpz.c();
        if (lpzVarC.b() == 1) {
            return new kgl(true);
        }
        hpl hplVar = new hpl(false, hsi.a);
        lpzVarC.f(new kgf(hplVar, this));
        return hplVar;
    }
}
