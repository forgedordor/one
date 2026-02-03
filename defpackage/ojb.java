package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojb extends abs {
    final /* synthetic */ ojc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojb(ojc ojcVar) {
        super(false);
        this.a = ojcVar;
    }

    @Override // defpackage.abs
    public final void b() {
        ona onaVar = this.a.b;
        if (onaVar.f.isEmpty()) {
            return;
        }
        ojx ojxVarE = onaVar.e();
        ojxVarE.getClass();
        onaVar.w(ojxVarE.c(), true);
    }
}
