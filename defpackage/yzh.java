package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzh extends fcyz implements fdaz {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    /* synthetic */ boolean d;
    /* synthetic */ Object e;
    /* synthetic */ int f;
    /* synthetic */ boolean g;
    /* synthetic */ boolean h;
    final /* synthetic */ zaa i;
    final /* synthetic */ yyq j;
    final /* synthetic */ Long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzh(zaa zaaVar, yyq yyqVar, Long l, fcxy fcxyVar) {
        super(8, fcxyVar);
        this.i = zaaVar;
        this.j = yyqVar;
        this.k = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [dktt, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int i;
        boolean z;
        boolean z2;
        fcyl fcylVar = fcyl.a;
        if (this.a == 0) {
            fctl.b(obj);
            boolean z3 = this.b;
            boolean z4 = this.c;
            boolean z5 = this.d;
            ?? r8 = this.e;
            i = this.f;
            z = this.g;
            z2 = this.h;
            if (!z4) {
                zaa zaaVar = this.i;
                yyq yyqVar = this.j;
                if (zaaVar.i(yyqVar, z3, z5, r8, zaaVar.p, true)) {
                    this.f = i;
                    this.b = z;
                    this.c = z2;
                    this.a = 1;
                    obj = zaaVar.d(yyqVar, this);
                    if (obj == fcylVar) {
                        return fcylVar;
                    }
                }
            }
            return null;
        }
        boolean z6 = this.c;
        z = this.b;
        i = this.f;
        fctl.b(obj);
        z2 = z6;
        boolean z7 = z;
        int i2 = i;
        anho anhoVar = (anho) obj;
        ekrw ekrwVarG = zaa.a.g();
        ekrwVarG.X(eksq.a, "BugleReactions");
        ekrd ekrdVar = (ekrd) ekrwVarG;
        yyq yyqVar2 = this.j;
        ekrz ekrzVar = cqnc.c;
        ajlt ajltVar = yyqVar2.a;
        ekrdVar.X(ekrzVar, ajltVar.b());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionsBarPopupUiAdapterImpl$getAutoRevealReactionBarPopupUiData$1", "invokeSuspend", 424, "ReactionsBarPopupUiAdapterImpl.kt")).q("Creating auto reveal reaction bar ui data");
        zaa zaaVar2 = this.i;
        return zaaVar2.b(yyqVar2, zaaVar2.p, this.k, anhoVar, zaaVar2.c(anhoVar != null ? anhoVar.a : null, ajltVar), i2, z7, z2, true);
    }

    @Override // defpackage.fdaz
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Number) obj5).intValue();
        boolean zBooleanValue4 = ((Boolean) obj6).booleanValue();
        boolean zBooleanValue5 = ((Boolean) obj7).booleanValue();
        yzh yzhVar = new yzh(this.i, this.j, this.k, (fcxy) obj8);
        yzhVar.b = zBooleanValue;
        yzhVar.c = zBooleanValue2;
        yzhVar.d = zBooleanValue3;
        yzhVar.e = (dktt) obj4;
        yzhVar.f = iIntValue;
        yzhVar.g = zBooleanValue4;
        yzhVar.h = zBooleanValue5;
        return yzhVar.b(fctx.a);
    }
}
