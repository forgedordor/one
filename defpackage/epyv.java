package defpackage;

import com.sun.jna.Pointer;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyv implements eqak {
    final /* synthetic */ ccom a;

    public epyv(ccom ccomVar) {
        this.a = ccomVar;
    }

    @Override // defpackage.eqak
    public eqay invoke(Pointer pointer, eqau eqauVar, Pointer pointer2) {
        eqaw eqawVarA;
        epvp epvpVar;
        eqauVar.getClass();
        pointer2.getClass();
        byte[] bArrB = epzk.b(eqauVar);
        epze epzeVar = new epze(pointer2);
        try {
            final ccoq ccoqVar = this.a.b;
            byte[] bArrCopyOf = Arrays.copyOf(bArrB, bArrB.length);
            bArrCopyOf.getClass();
            final String str = new String(bArrCopyOf, fdfy.a);
            String[] strArr = ccni.a;
            ccnf ccnfVar = new ccnf(ccni.a);
            ccnfVar.A("ZinniaStateStoragePersisterImpl#getState");
            ccnfVar.k(new ccng((ccnh) new Function() { // from class: ccoo
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
            }.apply(new ccnh())));
            ccnfVar.y(1);
            ekgb ekgbVarZ = ccnfVar.b().z();
            ekgbVarZ.getClass();
            ccmi ccmiVar = (ccmi) fcva.Y(ekgbVarZ);
            if (ccmiVar == null) {
                evsn evsnVarBuild = ((epve) epvp.a.createBuilder()).build();
                evsnVarBuild.getClass();
                epvpVar = (epvp) evsnVarBuild;
                ccoqVar.a(str, epvpVar);
            } else {
                ccmiVar.aA(2, "zinnia_state");
                epvpVar = (epvp) evsn.parseFrom(epvp.a, ccmiVar.c);
                epvpVar.getClass();
            }
            byte[] byteArray = epvpVar.toByteArray();
            byte[] bArrCopyOf2 = Arrays.copyOf(byteArray, byteArray.length);
            bArrCopyOf2.getClass();
            epzeVar.a(bArrCopyOf2);
            eqax eqaxVar = eqaw.a;
            eqawVarA = eqav.c();
        } catch (Exception e) {
            ekrw ekrwVarI = ccom.a.i();
            ekrwVarI.X(eksq.a, "BugleE2eeMls");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/e2ee/mls/data/traits/ZinniaStateStorageAdapter", "state-rto03Yo", 58, "ZinniaStateStorageAdapter.kt")).t("Failed to get Zinnia state from MlsZinniaStates table, a default instance will be returned. groupId: %s", ccoj.a(bArrB));
            if (e instanceof ccon) {
                eqax eqaxVar2 = eqaw.a;
                eqawVarA = eqav.b();
            } else {
                eqax eqaxVar3 = eqaw.a;
                eqawVarA = eqav.a(eqbq.w);
            }
        }
        return eqawVarA.b;
    }
}
