package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnrx implements fdpm, fdbl {
    final /* synthetic */ dnsa a;

    public dnrx(dnsa dnsaVar) {
        this.a = dnsaVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(2, this.a, dnsa.class, "onContainerWidthChanged", "onContainerWidthChanged(I)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        int iIntValue = ((Number) obj).intValue();
        Object obj2 = this.a.n;
        drqt drqtVar = obj2 instanceof drqt ? (drqt) obj2 : null;
        if (drqtVar != null) {
            drqtVar.f().f = iIntValue;
            drqtVar.f().p();
            drrb drrbVar = drqtVar.y;
            if (drrbVar != null) {
                drrbVar.p();
            }
        }
        return fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
