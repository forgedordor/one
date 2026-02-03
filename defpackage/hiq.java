package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class hiq extends fdbo implements fdax {
    public hiq(Object obj) {
        super(6, obj, hiz.class, "progressPathProvider", "progressPathProvider-wzdHmys(FFFJZLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
    }

    @Override // defpackage.fdax
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        lty ltyVar;
        float fFloatValue = ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        ((Number) obj3).floatValue();
        long j = ((ihz) obj4).a;
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        ikd ikdVar = (ikd) obj6;
        hic hicVar = ((hiz) this.g).h;
        ltr ltrVar = hicVar.e;
        if (ltrVar != null) {
            hjv.b(ltrVar, fFloatValue, ikdVar, zBooleanValue, 0.5f, 0.5f, 20);
            return ikdVar;
        }
        if (fFloatValue == 1.0f && (ltyVar = hicVar.d) != null) {
            hjv.c(ltyVar, ikdVar, zBooleanValue, 10);
            return ikdVar;
        }
        lty ltyVar2 = hicVar.c;
        if (ltyVar2 != null) {
            hjv.c(ltyVar2, ikdVar, zBooleanValue, 10);
        }
        return ikdVar;
    }
}
