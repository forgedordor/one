package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awiq extends fcyz implements fdat {
    int a;
    final /* synthetic */ awjl b;
    final /* synthetic */ awiz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awiq(awjl awjlVar, awiz awizVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awjlVar;
        this.c = awizVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awiq) c((awjl) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarE = awiz.a.e();
            ekrwVarE.X(eksq.a, "BugleCME");
            ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/core/destination/CachingDestinationManager$getDestination$2", "invokeSuspend", 53, "CachingDestinationManager.kt");
            awjl awjlVar = this.b;
            ekrdVar.t("Cache miss fetching destination from token %s. Loading from database.", awjlVar);
            awjc awjcVar = (awjc) this.c.c.b();
            Set setB = fcwm.b(awjlVar);
            this.a = 1;
            obj = awjcVar.a(setB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        awjb awjbVar = (awjb) fcva.W((Iterable) obj);
        awiz awizVar = this.c;
        awizVar.b.d(awjbVar.c, awjbVar.a);
        return awjbVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awiq(this.b, this.c, fcxyVar);
    }
}
