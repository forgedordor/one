package defpackage;

import com.sun.jna.Pointer;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxi implements epzv {
    final /* synthetic */ ccnl a;

    public epxi(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzv
    public eqay invoke(Pointer pointer, eqau eqauVar) {
        eqaw eqawVarA;
        eqauVar.getClass();
        ccnl ccnlVar = this.a;
        byte[] bArrB = epzk.b(eqauVar);
        try {
            ccnm ccnmVar = ccnlVar.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            final String str = new String(bArrCopyOf, fdfy.a);
            final String str2 = ccnmVar.b;
            String[] strArr = ccfu.a;
            ccfl ccflVar = new ccfl();
            ccflVar.f("deleteGroup1");
            ccflVar.b = new ccfs((ccft) new Function() { // from class: ccnu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ccft ccftVar = (ccft) obj;
                    ccftVar.c(str2);
                    ccftVar.b(str);
                    return ccftVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new ccft()));
            int iB = ccflVar.b().b();
            String[] strArr2 = ccen.a;
            ccea cceaVar = new ccea();
            cceaVar.f("deleteGroup2");
            cceaVar.c(new Function() { // from class: ccnv
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
            cceaVar.b().b();
            if (iB > 0) {
                eqax eqaxVar = eqaw.a;
                eqawVarA = eqav.c();
            } else {
                eqax eqaxVar2 = eqaw.a;
                eqawVarA = eqav.b();
            }
        } catch (Exception e) {
            ekrw ekrwVarI = ccnl.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "deleteGroup-GBYM_sE", 171, "GroupStateStorageAdapter.kt")).t("Failed to delete group state from MlsGroupStates table, groupId: %s", ccoj.a(bArrB));
            eqax eqaxVar3 = eqaw.a;
            eqawVarA = eqav.a(eqbq.w);
        }
        return eqawVarA.b;
    }
}
