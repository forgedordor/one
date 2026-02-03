package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyj extends fcyz implements fday {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ int e;
    /* synthetic */ Object f;
    final /* synthetic */ yyp g;
    final /* synthetic */ yyq h;
    final /* synthetic */ anho i;
    final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyj(yyp yypVar, yyq yyqVar, anho anhoVar, boolean z, fcxy fcxyVar) {
        super(7, fcxyVar);
        this.g = yypVar;
        this.h = yyqVar;
        this.i = anhoVar;
        this.j = z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dktt, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        ?? r2 = this.d;
        int i = this.e;
        Object obj2 = this.f;
        if (z2) {
            return null;
        }
        yyp yypVar = this.g;
        yyq yyqVar = this.h;
        ajlt ajltVar = yyqVar.a;
        if (!yyp.f(ajltVar.b(), z, z3, r2, true)) {
            return null;
        }
        ekrw ekrwVarG = yyp.a.g();
        ekrwVarG.X(eksq.a, "BugleReactions");
        ekrd ekrdVar = (ekrd) ekrwVarG;
        ekrdVar.X(cqnc.c, ajltVar.b());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2$createAutoRevealReactionBarUiData$1", "invokeSuspend", 242, "ReactionBarUiAdapterImplV2.kt")).q("Creating auto reveal reaction bar ui data");
        return yypVar.b(yyqVar, this.i, i, null, this.j, obj2 != null ? anhp.b((dnvg) obj2) : null, new yyi(yypVar), new yyh(yypVar));
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Number) obj5).intValue();
        yyj yyjVar = new yyj(this.g, this.h, this.i, this.j, (fcxy) obj7);
        yyjVar.a = zBooleanValue;
        yyjVar.b = zBooleanValue2;
        yyjVar.c = zBooleanValue3;
        yyjVar.d = (dktt) obj4;
        yyjVar.e = iIntValue;
        yyjVar.f = (dnvg) obj6;
        return yyjVar.b(fctx.a);
    }
}
