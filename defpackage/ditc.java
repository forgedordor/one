package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ditc implements fdpm {
    final /* synthetic */ disb a;
    final /* synthetic */ hox b;

    public ditc(disb disbVar, hox hoxVar) {
        this.a = disbVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        gvt gvtVar = (gvt) obj;
        if (gvtVar == gvt.a || gvtVar == gvt.b) {
            fdae fdaeVar = this.a.f;
            if (fdaeVar != null) {
                fdaeVar.invoke();
            }
            this.b.b(true);
        }
        return fctx.a;
    }
}
