package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acxv extends vq {
    private static final cqce a = cqce.g("Bugle", "ConversationListAdapter");

    @Override // defpackage.vq
    public final void a() {
        a.q("onChanged");
    }

    @Override // defpackage.vq
    public final void b(int i, int i2) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("onItemRangeChanged");
        cqbdVarD.y("positionStart", i);
        cqbdVarD.y("itemCount", i2);
        cqbdVarD.r();
    }

    @Override // defpackage.vq
    public final void c(int i, int i2, Object obj) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("onItemRangeChanged");
        cqbdVarD.y("positionStart", i);
        cqbdVarD.y("itemCount", i2);
        cqbdVarD.A("payload", obj);
        cqbdVarD.r();
    }

    @Override // defpackage.vq
    public final void d(int i, int i2) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("onItemRangeInserted");
        cqbdVarD.y("positionStart", i);
        cqbdVarD.y("itemCount", i2);
        cqbdVarD.r();
    }

    @Override // defpackage.vq
    public final void e(int i, int i2) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("onItemRangeRemoved");
        cqbdVarD.y("positionStart", i);
        cqbdVarD.y("itemCount", i2);
        cqbdVarD.r();
    }

    @Override // defpackage.vq
    public final void g(int i, int i2) {
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("onItemRangeMoved");
        cqbdVarD.y("fromPosition", i);
        cqbdVarD.y("toPosition", i2);
        cqbdVarD.y("itemCount", 1);
        cqbdVarD.r();
    }
}
