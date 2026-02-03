package defpackage;

import com.sun.jna.Pointer;
import j$.util.DesugarCollections;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxg implements epzt {
    final /* synthetic */ ccnl a;

    public epxg(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzt
    /* renamed from: invoke-aPcrCvc */
    public eqay mo435invokeaPcrCvc(Pointer pointer, eqau eqauVar, long j) {
        eqaw eqawVarA;
        eqauVar.getClass();
        ccnl ccnlVar = this.a;
        byte[] bArrB = epzk.b(eqauVar);
        try {
            ccnm ccnmVar = ccnlVar.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            String str = new String(bArrCopyOf, fdfy.a);
            epsh epshVar = (epsh) epsi.a.createBuilder();
            epshVar.getClass();
            epsj.d(j, epshVar);
            epsi epsiVarA = epsj.a(epshVar);
            epsk epskVar = (epsk) epsl.a.createBuilder();
            epskVar.getClass();
            DesugarCollections.unmodifiableList(((epsl) epskVar.instance).b).getClass();
            epskVar.copyOnWrite();
            epsl epslVar = (epsl) epskVar.instance;
            evtg evtgVar = epslVar.b;
            if (!evtgVar.c()) {
                epslVar.b = evsn.mutableCopy(evtgVar);
            }
            String str2 = ccnmVar.b;
            ccnp ccnpVar = ccnmVar.a;
            epslVar.b.add(epsiVarA);
            evsn evsnVarBuild = epskVar.build();
            evsnVarBuild.getClass();
            ((ccny) ccnpVar).a(str, str2, (epsl) evsnVarBuild, 1);
            eqax eqaxVar = eqaw.a;
            eqawVarA = eqav.c();
        } catch (Exception e) {
            ekrw ekrwVarI = ccnl.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "addEmptyEpochRecord-4uTJGpo", 218, "GroupStateStorageAdapter.kt")).D("Failed to add empty epoch record to MlsEpochRecords table, epochId: %s, groupId: %s", new fcts(j), ccoj.a(bArrB));
            eqax eqaxVar2 = eqaw.a;
            eqawVarA = eqav.a(eqbq.t);
        }
        return eqawVarA.b;
    }
}
