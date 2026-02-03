package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyy extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdpl c;
    final /* synthetic */ vzk d;
    final /* synthetic */ fdci e;
    final /* synthetic */ arwb f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyy(fcxy fcxyVar, fdpl fdplVar, vzk vzkVar, fdci fdciVar, arwb arwbVar) {
        super(3, fcxyVar);
        this.c = fdplVar;
        this.d = vzkVar;
        this.e = fdciVar;
        this.f = arwbVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vyy vyyVar = new vyy((fcxy) obj3, this.c, this.d, this.e, this.f);
        vyyVar.g = (fdpm) obj;
        vyyVar.b = obj2;
        return vyyVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdplVarB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r8 = this.g;
            ajli ajliVar = (ajli) this.b;
            if (ajliVar != ajli.NONE) {
                ekrw ekrwVarE = vzk.a.e();
                ekrwVarE.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver$transportCapabilityDataFlow$1$invokeSuspend$$inlined$flatMapLatest$1", "invokeSuspend", 572, "MapiTransportCapabilityResolver.kt")).t("Disabled Transport Capability with ComposeDisabledReason %s", ajliVar);
                ajliVar.getClass();
                fdplVarB = new fdpu(new vzw(ajliVar));
            } else {
                fdpl fdplVar = this.c;
                vzk vzkVar = this.d;
                fdplVarB = fdud.b(fdqq.a(new vze(fdplVar, vzkVar)), vzkVar.k, vzkVar.l, vzkVar.m, new vyx(this.e, vzkVar, this.f, null));
            }
            this.a = 1;
            if (fdpy.c(r8, fdplVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
