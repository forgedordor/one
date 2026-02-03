package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.GetApiAvailabilityResponse;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling");
    public final dcsx b;
    private final eosc c;

    public csxp(eosc eoscVar, dcsx dcsxVar) {
        this.c = eoscVar;
        this.b = dcsxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ekgb ekgbVar, int i) {
        final HashSet hashSet = new HashSet();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(((ParticipantsTable.BindData) ekgbVar.get(i2)).R());
        }
        if (hashSet.isEmpty()) {
            return;
        }
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("updateAvailabilityInDb");
        bsbsVarF.S(i);
        bsbsVarF.U(new Function() { // from class: csxo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.m(hashSet);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.b().e();
    }

    public static DuoId[] c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alqm alqmVar = (alqm) it.next();
            cczv cczvVar = alvx.a;
            String strP = alqmVar.p(((Boolean) new alul().get()).booleanValue());
            if (ejwk.c(strP)) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/video/DuoKitVideoCalling", "duoIdsFromMessagingIdentities", 126, "DuoKitVideoCalling.java")).q("Fail to get destination from messagingIdentities.");
                return null;
            }
            DuoId duoId = new DuoId();
            duoId.b = strP;
            dcss.a(duoId);
            arrayList.add(duoId);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (DuoId[]) arrayList.toArray(new DuoId[0]);
    }

    final eiju a(final ekgb ekgbVar) {
        return ekgbVar.isEmpty() ? eijx.e(ekgbVar) : eiju.g(drgi.a(this.b.f())).i(new eooz() { // from class: csxn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int i = ((GetApiAvailabilityResponse) obj).a;
                ekgb ekgbVar2 = ekgbVar;
                if (i == 0) {
                    return eijx.e(ekgbVar2);
                }
                if (i == 1 || i == 2) {
                    csxp.b(ekgbVar2, 8);
                    return eijx.e(new ArrayList());
                }
                csxp.b(ekgbVar2, 7);
                return eijx.e(new ArrayList());
            }
        }, this.c);
    }
}
