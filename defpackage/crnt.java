package defpackage;

import android.telephony.PhoneNumberUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crnt {
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/phone/SelfNumberChecker");
    public static final fctc a = fctd.a(new fdae() { // from class: crnr
        @Override // defpackage.fdae
        public final Object invoke() {
            fctc fctcVar = crnt.a;
            return new fdgl("^[+|0]?0+$");
        }
    });

    public crnt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    public final alqm a(String str, int i) {
        final String strS = ((crny) this.d.b()).h(i).s();
        if (!((ephj) this.c.b()).h(str, strS)) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.w, Integer.valueOf(i));
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/phone/SelfNumberChecker", "isPossibleSelfNumberWithDecoratedTests", 43, "SelfNumberChecker.kt")).D("Phone number for self is invalid! With country=%s and number=%s", strS, cqcv.b(str));
            return null;
        }
        fdgl fdglVar = (fdgl) a.a();
        String strStripSeparators = PhoneNumberUtils.stripSeparators(str);
        strStripSeparators.getClass();
        if (!fdglVar.e(strStripSeparators)) {
            return ((alfq) this.e.b()).c(str, new ejxr() { // from class: crns
                @Override // defpackage.ejxr
                public final Object get() {
                    fctc fctcVar = crnt.a;
                    return Optional.of(strS);
                }
            });
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ;
        ekrdVar2.X(cqnc.w, Integer.valueOf(i));
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/util/phone/SelfNumberChecker", "isPossibleSelfNumberWithDecoratedTests", 55, "SelfNumberChecker.kt")).q("Phone number for self is all-0s");
        return null;
    }
}
