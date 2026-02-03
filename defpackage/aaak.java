package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaak implements hnx {
    final /* synthetic */ fr a;
    final /* synthetic */ fdci b;

    public aaak(fr frVar, fdci fdciVar) {
        this.a = frVar;
        this.b = fdciVar;
    }

    @Override // defpackage.hnx
    public final void a() {
        fr frVar = this.a;
        if (frVar == null || frVar.ag()) {
            return;
        }
        fdci fdciVar = this.b;
        if (fdciVar.a != null) {
            cg cgVar = new cg(frVar);
            cgVar.o((ea) fdciVar.a);
            cgVar.c();
        }
    }
}
