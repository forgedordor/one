package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyb extends fdbr implements fdau {
    final /* synthetic */ fdap a;
    final /* synthetic */ dhk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyb(fdap fdapVar, dhk dhkVar) {
        super(3);
        this.a = fdapVar;
        this.b = dhkVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j;
        ixp ixpVar = (ixp) obj;
        iyl iylVarE = ((ixk) obj2).e(((kil) obj3).a);
        if (!ixpVar.ev() || ((Boolean) this.a.invoke(this.b.f())).booleanValue()) {
            j = (iylVarE.a << 32) | (iylVarE.b & 4294967295L);
        } else {
            j = 0;
        }
        return ixpVar.ej((int) (j >> 32), (int) (4294967295L & j), fcvp.a, new cya(iylVarE));
    }
}
