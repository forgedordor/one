package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrs extends cqdj {
    final /* synthetic */ raw a;
    final /* synthetic */ cxsa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxrs(cxsa cxsaVar, raw rawVar) {
        super("Bugle.Async.DebugUtils.clearGlideCache.Duration");
        this.a = rawVar;
        this.b = cxsaVar;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        this.a.g();
        return null;
    }

    @Override // defpackage.cqdj
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        ((dakl) this.b.Y.b()).j("Glide cache cleared.");
    }
}
