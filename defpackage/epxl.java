package defpackage;

import com.sun.jna.Pointer;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxl implements epzy {
    final /* synthetic */ ccnl a;

    public epxl(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzy
    public eqay invoke(Pointer pointer, eqau eqauVar, Pointer pointer2) {
        eqaw eqawVarA;
        final String str;
        dqqj dqqjVarP;
        ccff ccffVar;
        eqauVar.getClass();
        pointer2.getClass();
        byte[] bArrB = epzk.b(eqauVar);
        epze epzeVar = new epze(pointer2);
        try {
            ccnm ccnmVar = this.a.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            str = new String(bArrCopyOf, fdfy.a);
            final String str2 = ccnmVar.b;
            String[] strArr = ccfu.a;
            ccfr ccfrVar = new ccfr(ccfu.a);
            ccfrVar.A("getState");
            ccfrVar.k(new ccfs((ccft) new Function() { // from class: ccnr
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
            }.apply(new ccft())));
            dqqjVarP = ccfrVar.b().p();
            try {
                ccffVar = (ccff) dqqjVarP;
            } finally {
            }
        } catch (Exception e) {
            if (e instanceof ccno) {
                eqax eqaxVar = eqaw.a;
                eqawVarA = eqav.b();
            } else {
                ekrw ekrwVarI = ccnl.a.i();
                ekrwVarI.X(eksq.a, "BugleE2eeMls");
                ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "state-rto03Yo", 76, "GroupStateStorageAdapter.kt")).t("Failed to get group state from MlsGroupStates table, groupId: %s", ccoj.a(bArrB));
                eqax eqaxVar2 = eqaw.a;
                eqawVarA = eqav.a(eqbq.w);
            }
        }
        if (!ccffVar.moveToFirst()) {
            throw new ccno(str);
        }
        ccet ccetVar = (ccet) ccffVar.cU();
        epta eptaVar = (epta) eptb.a.createBuilder();
        eptaVar.getClass();
        ccetVar.aA(1, "group_id");
        evqs evqsVarA = evqs.A(ccetVar.b);
        eptaVar.copyOnWrite();
        eptb eptbVar = (eptb) eptaVar.instance;
        eptbVar.b = 1 | eptbVar.b;
        eptbVar.c = evqsVarA;
        ccetVar.aA(2, "epoch_data");
        evqs evqsVarX = evqs.x(ccetVar.c);
        eptaVar.copyOnWrite();
        eptb eptbVar2 = (eptb) eptaVar.instance;
        eptbVar2.b = 2 | eptbVar2.b;
        eptbVar2.d = evqsVarX;
        evsn evsnVarBuild = eptaVar.build();
        evsnVarBuild.getClass();
        eptb eptbVar3 = (eptb) evsnVarBuild;
        fczl.a(dqqjVarP, null);
        byte[] byteArray = eptbVar3.toByteArray();
        byte[] bArrCopyOf2 = Arrays.copyOf(byteArray, byteArray.length);
        bArrCopyOf2.getClass();
        epzeVar.a(bArrCopyOf2);
        eqax eqaxVar3 = eqaw.a;
        eqawVarA = eqav.c();
        return eqawVarA.b;
    }
}
