package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dmob implements fdpm, fdbl {
    final /* synthetic */ dmoo a;

    public dmob(dmoo dmooVar) {
        this.a = dmooVar;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbb(2, this.a, dmoo.class, "onZoomStateEvent", "onZoomStateEvent(Landroidx/camera/core/ZoomState;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fdpm) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        this.a.b((bdv) obj);
        return fctx.a;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
