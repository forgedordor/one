package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqak implements fdpm {
    final /* synthetic */ dqan a;

    public dqak(dqan dqanVar) {
        this.a = dqanVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        int iIntValue = ((Number) obj).intValue();
        ((ekrd) dqan.b.e().h("com/google/android/libraries/compose/ui/views/recycler/reactive/LayoutManagerSizeObserver$attach$2$2", "emit", 70, "LayoutManagerSizeObserver.kt")).r("Dispatching new RecyclerView size (%d)", iIntValue);
        this.a.f.invoke(new Integer(iIntValue));
        return fctx.a;
    }
}
