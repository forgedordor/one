package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfl extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfl(Object obj, dpfq dpfqVar) {
        super(obj);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        float f = ((kir) obj2).a;
        dpfq dpfqVar = this.a;
        kio kioVarD = dpfqVar.d();
        kir kirVar = new kir(f);
        if (true == Float.isNaN(kirVar.a)) {
            kirVar = null;
        }
        if (kirVar != null) {
            int iEp = kioVarD.ep(kirVar.a);
            dpfqVar.setPadding(dpfqVar.getPaddingLeft(), iEp, dpfqVar.getPaddingRight(), iEp);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
