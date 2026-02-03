package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcc extends fdcy {
    final /* synthetic */ dpcf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpcc(dpcf dpcfVar) {
        super(null);
        this.a = dpcfVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpgq dpgqVar = (dpgq) obj2;
        dpgq dpgqVar2 = (dpgq) obj;
        if (dpgqVar2 != null) {
            dpgqVar2.setSelected(false);
        }
        if (dpgqVar != null) {
            dpgqVar.setSelected(true);
            dpcf dpcfVar = this.a;
            if (dpcfVar.g.c() != dpjd.d) {
                dpcfVar.c.g(dpgqVar, false);
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
