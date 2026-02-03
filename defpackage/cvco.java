package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvco implements fdae {
    final /* synthetic */ ea a;
    final /* synthetic */ fctc b;

    public cvco(ea eaVar, fctc fctcVar) {
        this.a = eaVar;
        this.b = fctcVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        lxk lxkVarR;
        lxq lxqVarA = lrw.a(this.b);
        luv luvVar = lxqVarA instanceof luv ? (luv) lxqVarA : null;
        return (luvVar == null || (lxkVarR = luvVar.R()) == null) ? this.a.R() : lxkVarR;
    }
}
