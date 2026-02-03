package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdpj implements fdpl {
    public final fdap a;
    public final fdat b;
    private final fdpl c;

    public fdpj(fdpl fdplVar, fdap fdapVar, fdat fdatVar) {
        this.c = fdplVar;
        this.a = fdapVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdci fdciVar = new fdci();
        fdciVar.a = fdwz.a;
        Object objA = this.c.a(new fdpi(this, fdciVar, fdpmVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
