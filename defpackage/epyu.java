package defpackage;

import com.sun.jna.Pointer;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyu implements eqaj {
    final /* synthetic */ ccom a;

    public epyu(ccom ccomVar) {
        this.a = ccomVar;
    }

    @Override // defpackage.eqaj
    public eqay invoke(Pointer pointer, eqau eqauVar) {
        eqaw eqawVarA;
        eqauVar.getClass();
        ccom ccomVar = this.a;
        byte[] bArrB = epzk.b(eqauVar);
        try {
            final ccoq ccoqVar = ccomVar.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            final String str = new String(bArrCopyOf, fdfy.a);
            String[] strArr = ccni.a;
            ccna ccnaVar = new ccna();
            ccnaVar.f("ZinniaStateStoragePersisterImpl#deleteState");
            ccnaVar.b = new ccng((ccnh) new Function() { // from class: ccop
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ccnh ccnhVar = (ccnh) obj;
                    ccnhVar.c(ccoqVar.a);
                    ccnhVar.b(str);
                    return ccnhVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new ccnh()));
            if (ccnaVar.b().b() > 0) {
                eqax eqaxVar = eqaw.a;
                eqawVarA = eqav.c();
            } else {
                eqax eqaxVar2 = eqaw.a;
                eqawVarA = eqav.b();
            }
        } catch (Exception e) {
            ekrw ekrwVarI = ccom.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/ZinniaStateStorageAdapter", "delete-GBYM_sE", 77, "ZinniaStateStorageAdapter.kt")).t("Failed to delete Zinnia state from MlsZinniaStates table, groupId: %s", ccoj.a(bArrB));
            eqax eqaxVar3 = eqaw.a;
            eqawVarA = eqav.a(eqbq.w);
        }
        return eqawVarA.b;
    }
}
