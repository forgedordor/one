package defpackage;

import com.sun.jna.Pointer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyw implements eqal {
    final /* synthetic */ ccom a;

    public epyw(ccom ccomVar) {
        this.a = ccomVar;
    }

    @Override // defpackage.eqal
    public eqay invoke(Pointer pointer, eqau eqauVar, eqau eqauVar2) {
        eqaw eqawVarA;
        eqauVar.getClass();
        eqauVar2.getClass();
        ccom ccomVar = this.a;
        byte[] bArrB = epzk.b(eqauVar);
        byte[] bArrB2 = epzk.b(eqauVar2);
        try {
            byte[] bArrCopyOf = Arrays.copyOf(bArrB2, bArrB2.length);
            bArrCopyOf.getClass();
            epvp epvpVar = (epvp) evsn.parseFrom(epvp.a, bArrCopyOf);
            epvpVar.getClass();
            ccoq ccoqVar = ccomVar.b;
            byte[] bArrCopyOf2 = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf2.getClass();
            ccoqVar.a(new String(bArrCopyOf2, fdfy.a), epvpVar);
            eqax eqaxVar = eqaw.a;
            eqawVarA = eqav.c();
        } catch (Exception e) {
            ekrw ekrwVarI = ccom.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/ZinniaStateStorageAdapter", "write-uo5YlkA", 34, "ZinniaStateStorageAdapter.kt")).t("Failed to write Zinnia state into MlsZinniaStates table, groupId: %s", ccoj.a(bArrB));
            eqax eqaxVar2 = eqaw.a;
            eqawVarA = eqav.a(eqbq.w);
        }
        return eqawVarA.b;
    }
}
