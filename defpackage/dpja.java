package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpja extends fdcy {
    final /* synthetic */ dpjc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpja(Object obj, dpjc dpjcVar) {
        super(obj);
        this.a = dpjcVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        dpix dpixVar = (dpix) obj2;
        dpix dpixVar2 = (dpix) obj;
        if (dpixVar2 instanceof dpiv) {
            ((dpiv) dpixVar2).a.b();
        }
        if (dpixVar instanceof dpiv) {
            ((dpiv) dpixVar).a.a(this.a);
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
