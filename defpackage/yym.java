package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yym extends fcyz implements fdax {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ int d;
    /* synthetic */ Object e;
    final /* synthetic */ yyp f;
    final /* synthetic */ yyq g;
    final /* synthetic */ AtomicBoolean h;
    final /* synthetic */ boolean i;
    final /* synthetic */ anho j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yym(yyp yypVar, yyq yyqVar, AtomicBoolean atomicBoolean, boolean z, anho anhoVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = yypVar;
        this.g = yyqVar;
        this.h = atomicBoolean;
        this.i = z;
        this.j = anhoVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj4).intValue();
        yym yymVar = new yym(this.f, this.g, this.h, this.i, this.j, (fcxy) obj6);
        yymVar.a = zBooleanValue;
        yymVar.b = zBooleanValue2;
        yymVar.c = (dktt) obj3;
        yymVar.d = iIntValue;
        yymVar.e = (dnvg) obj5;
        return yymVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dktt, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dnwx dnwxVar;
        fctl.b(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        ?? r1 = this.c;
        int i = this.d;
        Object obj2 = this.e;
        final yyq yyqVar = this.g;
        ajlt ajltVar = yyqVar.a;
        boolean zF = yyp.f(ajltVar.b(), z, z2, r1, false);
        final yyp yypVar = this.f;
        if (!zF) {
            yypVar.d();
            return null;
        }
        ekrw ekrwVarG = yyp.a.g();
        ekrwVarG.X(eksq.a, "BugleReactions");
        ekrd ekrdVar = (ekrd) ekrwVarG;
        ekrdVar.X(cqnc.c, ajltVar.b());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/reactions/ReactionBarUiAdapterImplV2$createSelectionReactionBarUiData$1", "invokeSuspend", 192, "ReactionBarUiAdapterImplV2.kt")).q("Creating selection reaction bar ui data");
        if (this.h.compareAndSet(true, false)) {
            yypVar.c.f(ajltVar.q());
            zvc zvcVar = yypVar.f;
            boolean z3 = this.i;
            boolean z4 = yypVar.o;
            dnwy dnwyVar = dnwy.a;
            dnwyVar.getClass();
            if (crbf.e() && z3 && !z4 && (dnwxVar = zvcVar.g) != null) {
                dnwxVar.c(dnwyVar);
            }
        }
        zqk zqkVar = yyqVar.c;
        return yypVar.b(yyqVar, this.j, i, zqkVar.c, this.i, obj2 != null ? anhp.b((dnvg) obj2) : null, new yyl(yypVar), new fdae() { // from class: yyk
            @Override // defpackage.fdae
            public final Object invoke() {
                ajlt ajltVar2 = yyqVar.a;
                yyp yypVar2 = yypVar;
                yypVar2.c.e(ajltVar2.q());
                yypVar2.d();
                return fctx.a;
            }
        });
    }
}
