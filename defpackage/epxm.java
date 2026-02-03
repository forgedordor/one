package defpackage;

import com.sun.jna.Pointer;
import j$.util.function.BiConsumer$CC;
import java.util.Arrays;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epxm implements epzz {
    final /* synthetic */ ccnl a;

    public epxm(ccnl ccnlVar) {
        this.a = ccnlVar;
    }

    @Override // defpackage.epzz
    public eqay invoke(Pointer pointer, eqau eqauVar, eqau eqauVar2, eqau eqauVar3) {
        Exception exc;
        final eptb eptbVar;
        eqaw eqawVarA;
        evqs evqsVar;
        byte[] bArrI;
        eqauVar.getClass();
        eqauVar2.getClass();
        eqauVar3.getClass();
        ccnl ccnlVar = this.a;
        byte[] bArrB = epzk.b(eqauVar);
        byte[] bArrB2 = epzk.b(eqauVar2);
        byte[] bArrB3 = epzk.b(eqauVar3);
        String strA = null;
        try {
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            eptbVar = (eptb) evsn.parseFrom(eptb.a, bArrCopyOf);
        } catch (Exception e) {
            exc = e;
            eptbVar = null;
        }
        try {
            byte[] bArrCopyOf2 = Arrays.copyOf(bArrB2, bArrB2.length);
            bArrCopyOf2.getClass();
            epsl epslVar = epsl.a;
            final epsl epslVar2 = (epsl) evsn.parseFrom(epslVar, bArrCopyOf2);
            epslVar2.getClass();
            byte[] bArrCopyOf3 = Arrays.copyOf(bArrB3, bArrB3.length);
            bArrCopyOf3.getClass();
            final epsl epslVar3 = (epsl) evsn.parseFrom(epslVar, bArrCopyOf3);
            epslVar3.getClass();
            ccnm ccnmVar = ccnlVar.b;
            eptbVar.getClass();
            ccnp ccnpVar = ccnmVar.a;
            final String str = ccnmVar.b;
            final ccny ccnyVar = (ccny) ccnpVar;
            ((dqsn) ((ccny) ccnpVar).b.b()).d("GroupStateStoragePersisterImpl#writeState", new Runnable() { // from class: ccns
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr = ccfu.a;
                    ccew ccewVar = new ccew();
                    eptb eptbVar2 = eptbVar;
                    ccewVar.c(eptbVar2.c.E());
                    String str2 = str;
                    ccewVar.d(str2);
                    ccewVar.b(eptbVar2.d.I());
                    dqru.B(ccfu.a(), 5, false, new BiConsumer() { // from class: cces
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            String[] strArr2 = ccfu.a;
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                        }
                    }, ccewVar.a());
                    String strE = eptbVar2.c.E();
                    ccny ccnyVar2 = ccnyVar;
                    ccnyVar2.a(strE, str2, epslVar2, 1);
                    ccnyVar2.a(eptbVar2.c.E(), str2, epslVar3, 2);
                }
            });
            eqax eqaxVar = eqaw.a;
            eqawVarA = eqav.c();
        } catch (Exception e2) {
            exc = e2;
            ekrw ekrwVarI = ccnl.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).g(exc).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/GroupStateStorageAdapter", "write-mugzhHU", 47, "GroupStateStorageAdapter.kt");
            if (eptbVar != null && (evqsVar = eptbVar.c) != null && (bArrI = evqsVar.I()) != null) {
                byte[] bArrCopyOf4 = Arrays.copyOf(bArrI, bArrI.length);
                bArrCopyOf4.getClass();
                strA = ccoj.a(bArrCopyOf4);
            }
            ekrdVar.t("Failed to write group state into MlsGroupStates table, groupId: %s", strA);
            if (exc instanceof ccnn) {
                eqax eqaxVar2 = eqaw.a;
                eqawVarA = eqav.b();
            } else {
                eqax eqaxVar3 = eqaw.a;
                eqawVarA = eqav.a(eqbq.t);
            }
            return eqawVarA.b;
        }
        return eqawVarA.b;
    }
}
