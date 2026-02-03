package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqt extends fcyz implements fdat {
    int a;
    final /* synthetic */ chqw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqt(fcxy fcxyVar, chqw chqwVar) {
        super(2, fcxyVar);
        this.b = chqwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aofc aofcVar;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                aofcVar = (aofc) this.c;
                fctl.b(obj);
            } else {
                fctl.b(obj);
                chqw chqwVar = this.b;
                aofc aofcVar2 = chqwVar.c;
                this.c = aofcVar2;
                this.a = 1;
                obj = chqwVar.c(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                aofcVar = aofcVar2;
            }
            eiju eijuVarH = aofcVar.h(((Boolean) obj).booleanValue() ? Optional.of(this.b.e) : Optional.empty());
            ekrw ekrwVarH = chqw.a.h();
            ekrwVarH.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$selfProfilesRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 133, "ProfilesRefresherImpl.kt")).t("selfProfilesRefresh completed, result: %s", eijuVarH);
        } catch (Exception e) {
            ekrw ekrwVarJ = chqw.a.j();
            ekrwVarJ.X(eksq.a, "BugleProfiles");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefresherImpl$selfProfilesRefresh$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 138, "ProfilesRefresherImpl.kt")).q("An unexpected exception occurred while refreshing shel profiles");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chqt chqtVar = new chqt(fcxyVar, this.b);
        chqtVar.c = obj;
        return chqtVar;
    }
}
