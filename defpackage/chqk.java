package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chqk extends fcyz implements fdat {
    int a;
    final /* synthetic */ chql b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqk(chql chqlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chqlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chql chqlVar = this.b;
            if (!((Boolean) chqlVar.c.b()).booleanValue()) {
                ekrw ekrwVarH = chql.a.h();
                ekrwVarH.X(eksq.a, "BugleProfiles");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 39, "ProfilesRefreshWorker.kt")).q("Profiles full refresh disabled, not refreshing profiles");
                return new qam();
            }
            if (((artb) chqlVar.d.b()).a()) {
                ekrw ekrwVarH2 = chql.a.h();
                ekrwVarH2.X(eksq.a, "BugleProfiles");
                ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 44, "ProfilesRefreshWorker.kt")).q("Profiles startup task disabled, using synclet instead");
                return new qam();
            }
            ekrw ekrwVarH3 = chql.a.h();
            ekrwVarH3.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 48, "ProfilesRefreshWorker.kt")).q("Profiles daily full refresh worker started");
            chqo chqoVar = chqlVar.b;
            this.a = 1;
            if (chqoVar.b(this) == fcylVar) {
                return fcylVar;
            }
        }
        ekrw ekrwVarH4 = chql.a.h();
        ekrwVarH4.X(eksq.a, "BugleProfiles");
        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker$startWork$1", "invokeSuspend", 50, "ProfilesRefreshWorker.kt")).q("Profiles daily full refresh worker finished");
        return new qao();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chqk(this.b, fcxyVar);
    }
}
