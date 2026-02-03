package defpackage;

import com.sun.jna.Pointer;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxk implements epzx {
    final /* synthetic */ ccnl a;

    public epxk(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzx
    public eqbn invoke(Pointer pointer, eqau eqauVar) {
        eqbl eqblVarA;
        eqauVar.getClass();
        ccnl ccnlVar = this.a;
        byte[] bArrB = epzk.b(eqauVar);
        try {
            ccnm ccnmVar = ccnlVar.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            final String str = new String(bArrCopyOf, fdfy.a);
            final String str2 = ccnmVar.b;
            String[] strArr = ccen.a;
            ccei cceiVar = new ccei(ccen.a);
            cceiVar.A("getMaxEpochId");
            cceiVar.c(new Function() { // from class: ccnq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ccem ccemVar = (ccem) obj;
                    ccemVar.d(str2);
                    ccemVar.c(str);
                    return ccemVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ccdr ccdrVar = ccen.b.c;
            cceiVar.D((String) DesugarArrays.stream(new ccef[]{new ccef(ccdrVar)}).map(new Function() { // from class: cceh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((ccef) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining(", ")));
            cceiVar.y(1);
            ccds ccdsVar = (ccds) cceiVar.b().q(ccdrVar);
            try {
                ekgb ekgbVarC = ccdsVar.c();
                ccdsVar.close();
                ekgbVarC.getClass();
                Long l = (Long) fcva.P(ekgbVarC);
                if (l == null) {
                    ekrw ekrwVarH = ccnl.a.h();
                    ekrwVarH.X(eksq.a, "BugleE2eeMls");
                    ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "maxEpochId-GBYM_sE", 113, "GroupStateStorageAdapter.kt")).t("No group information found, returning not found maximum epoch ID. groupId: %s", ccoj.a(bArrB));
                    eqblVarA = new eqbl(eqbl.a.Zinnia_U64StorageTraitResult_not_found());
                } else {
                    eqbm eqbmVar = eqbl.a;
                    eqblVarA = eqbk.b(l.longValue());
                }
            } finally {
            }
        } catch (Exception e) {
            ekrw ekrwVarJ = ccnl.a.j();
            ekrwVarJ.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "maxEpochId-GBYM_sE", 103, "GroupStateStorageAdapter.kt")).t("Failed to get max epoch ID from MlsEpochRecords table, groupId: %s", ccoj.a(bArrB));
            eqbm eqbmVar2 = eqbl.a;
            eqblVarA = eqbk.a(eqbq.w);
        }
        return eqblVarA.b;
    }
}
