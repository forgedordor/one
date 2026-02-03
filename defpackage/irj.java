package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irj extends fdbr implements fdap {
    final /* synthetic */ fdci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irj(fdci fdciVar) {
        super(1);
        this.a = fdciVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fdci fdciVar = this.a;
        irm irmVar = (irm) obj;
        if (fdciVar.a == null && irmVar.b) {
            fdciVar.a = irmVar;
        }
        return true;
    }
}
