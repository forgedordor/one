package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chlg extends fcyz implements fdat {
    final /* synthetic */ chlh a;
    final /* synthetic */ WorkerParameters b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlg(chlh chlhVar, WorkerParameters workerParameters, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chlhVar;
        this.b = workerParameters;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chlh chlhVar = this.a;
        if (!((Boolean) chlhVar.c.b()).booleanValue()) {
            ekrw ekrwVarH = chlh.a.h();
            ekrwVarH.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 53, "ProfilesCleanupWorker.kt")).q("Cleanup worker disabled, canceling work");
            return new qam();
        }
        if (this.b.b.h("profile_cleanup_is_one_time_extra")) {
            ekrw ekrwVarH2 = chlh.a.h();
            ekrwVarH2.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 58, "ProfilesCleanupWorker.kt")).q("Running one off cleanup work");
        } else if (((Boolean) chlhVar.b.b()).booleanValue()) {
            ekrw ekrwVarH3 = chlh.a.h();
            ekrwVarH3.X(eksq.a, "BugleProfiles");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 63, "ProfilesCleanupWorker.kt")).q("People API client enabled, canceling periodic work");
            return new qam();
        }
        ekrg ekrgVar = chlh.a;
        ekrw ekrwVarH4 = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH4.X(ekrzVar, "BugleProfiles");
        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker$startWork$1", "invokeSuspend", 68, "ProfilesCleanupWorker.kt")).q("Profiles cleanup worker started");
        String[] strArr = buat.a;
        buai buaiVar = new buai();
        buaiVar.f("ProfilesCleanupWorker#deleteSelfProfiles");
        buaiVar.e();
        int iD = buaiVar.d();
        ekrw ekrwVarH5 = ekrgVar.h();
        ekrwVarH5.X(ekrzVar, "BugleProfiles");
        ((ekrd) ekrwVarH5.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 79, "ProfilesCleanupWorker.kt")).r("Cleared %s self profile table rows", iD);
        bsun bsunVarA = ProfilesTable.a();
        bsunVarA.A("ProfilesCleanupWorker#getParticipants");
        bsunVarA.s();
        bstl bstlVar = (bstl) bsunVarA.b().q(ProfilesTable.c.b);
        try {
            ekgb ekgbVarC = bstlVar.c();
            bstlVar.close();
            ekgbVarC.getClass();
            final ArrayList arrayList = new ArrayList(fcva.p(ekgbVarC, 10));
            ekqh it = ekgbVarC.iterator();
            while (it.hasNext()) {
                arrayList.add(((Long) it.next()).toString());
            }
            bsui bsuiVar = new bsui();
            bsuiVar.f("ProfilesCleanupWorker#deleteProfiles");
            bsuiVar.e();
            int iD2 = bsuiVar.d();
            ekrg ekrgVar2 = chlh.a;
            ekrw ekrwVarH6 = ekrgVar2.h();
            ekrz ekrzVar2 = eksq.a;
            ekrwVarH6.X(ekrzVar2, "BugleProfiles");
            ekrd ekrdVar = (ekrd) ekrwVarH6;
            ekrdVar.X(choj.b, Integer.valueOf(iD2));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 96, "ProfilesCleanupWorker.kt")).q("Cleared profile table rows");
            if (arrayList.isEmpty()) {
                ekrw ekrwVarH7 = ekrgVar2.h();
                ekrwVarH7.X(ekrzVar2, "BugleProfiles");
                ((ekrd) ekrwVarH7.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 99, "ProfilesCleanupWorker.kt")).q("No profiles data to cleanup, not updating");
                return new qao();
            }
            bsbs bsbsVarF = ParticipantsTable.f();
            bsbsVarF.ap("ProfilesCleanupWorker#clearPhotos");
            bsbsVarF.U(new Function() { // from class: chlf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bsbx bsbxVar = (bsbx) obj2;
                    bsbxVar.m(arrayList);
                    bsbxVar.t();
                    return bsbxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsbsVarF.M(null);
            bsbsVarF.J(chpq.PROFILE_UNSPECIFIED_SOURCE);
            int iE = bsbsVarF.b().e();
            ekrw ekrwVarH8 = ekrgVar2.h();
            ekrwVarH8.X(ekrzVar2, "BugleProfiles");
            ekrd ekrdVar2 = (ekrd) ekrwVarH8;
            ekrdVar2.X(choj.a, Integer.valueOf(iE));
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 115, "ProfilesCleanupWorker.kt")).q("Cleared photos from participants table");
            ekrw ekrwVarH9 = ekrgVar2.h();
            ekrwVarH9.X(ekrzVar2, "BugleProfiles");
            ((ekrd) ekrwVarH9.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 117, "ProfilesCleanupWorker.kt")).q("Refreshing contacts");
            ((axsq) chlhVar.d.b()).a().x(301, 0L);
            ekrw ekrwVarH10 = ekrgVar2.h();
            ekrwVarH10.X(ekrzVar2, "BugleProfiles");
            ((ekrd) ekrwVarH10.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 123, "ProfilesCleanupWorker.kt")).q("Updated conversations for updated participants");
            ((bakt) chlhVar.e.b()).S(new ArrayList(arrayList));
            ekrw ekrwVarH11 = ekrgVar2.h();
            ekrwVarH11.X(ekrzVar2, "BugleProfiles");
            ((ekrd) ekrwVarH11.h("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker", "cleanup", 128, "ProfilesCleanupWorker.kt")).q("Profiles cleanup worker finished");
            return new qao();
        } catch (Throwable th) {
            try {
                bstlVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chlg(this.a, this.b, fcxyVar);
    }
}
