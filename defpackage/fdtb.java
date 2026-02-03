package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdtb implements fdpm {
    final /* synthetic */ fdci a;

    public fdtb(fdci fdciVar) {
        this.a = fdciVar;
    }

    @Override // defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        fdci fdciVar = this.a;
        if (fdciVar.a != fdwz.a) {
            throw new IllegalArgumentException("Flow has more than one element");
        }
        fdciVar.a = obj;
        return fctx.a;
    }
}
