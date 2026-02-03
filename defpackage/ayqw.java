package defpackage;

import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/MmsMergingTargetRcsGroupFinder");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final cogw i;

    public ayqw(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cogw cogwVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        cogwVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = cogwVar;
    }

    private final void c(Uri uri, int i) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/MmsMergingTargetRcsGroupFinder", "logsMergingFailureDueToNoMatchingRcsGroupFound", 88, "MmsMergingTargetRcsGroupFinder.kt")).B("Found no matching RCS group conversation, not merging MMS message (%s) on subId (%d).", uri, i);
        cipl ciplVar = (cipl) this.e.b();
        enco encoVar = (enco) encs.a.createBuilder();
        encoVar.getClass();
        enuv.b(3, encoVar);
        enuv.c(2, encoVar);
        ciplVar.a(enuv.a(encoVar));
    }

    private final void d(Uri uri, int i, ConversationIdType conversationIdType) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/MmsMergingTargetRcsGroupFinder", "logsMergingSuccess", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "MmsMergingTargetRcsGroupFinder.kt")).I("Found single matching RCS group conversation (%s), merging MMS message (%s) on subId (%d) into it.", conversationIdType, uri, Integer.valueOf(i));
        ((cipl) this.e.b()).b();
    }

    private static final boolean e(bojh bojhVar) {
        return bojhVar.n() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r17, int r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayqw.a(android.net.Uri, int, fcxy):java.lang.Object");
    }

    public final boolean b(bojh bojhVar) {
        if (!e(bojhVar)) {
            return false;
        }
        if (bojhVar.M() == cins.j) {
            return true;
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(bojhVar.x());
        cogw cogwVar = this.i;
        fcsu fcsuVar = this.h;
        Instant instantF = cogwVar.f();
        Object objB = fcsuVar.b();
        objB.getClass();
        return instantOfEpochMilli.isAfter(instantF.x(((Number) objB).longValue(), ChronoUnit.DAYS));
    }
}
