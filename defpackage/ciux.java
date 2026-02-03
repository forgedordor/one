package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciux {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final cmqj b;
    public final ciuw c;
    public final ains d;

    public ciux(cmqj cmqjVar, ciuw ciuwVar, ains ainsVar) {
        this.b = cmqjVar;
        this.c = ciuwVar;
        this.d = ainsVar;
    }

    public final ciuu a(cnqj cnqjVar) {
        cmqj cmqjVar = this.b;
        String strD = cmqjVar.D(cnqjVar);
        if (ejwk.c(strD)) {
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(cqnc.u, cnqjVar);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 68, "RcsGroupTelephonyRecipientsManager.java")).q("Cannot find recipient IDs for provided thread ID.");
            ciuo ciuoVar = new ciuo();
            ciuoVar.d(ciut.NO_RECIPIENT_IDS_FOR_THREAD_ID);
            return ciuoVar.e();
        }
        strD.getClass();
        if (TextUtils.split(strD, " ").length != 1) {
            eksl ekslVar2 = (eksl) a.j();
            ekslVar2.X(cqnc.u, cnqjVar);
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 79, "RcsGroupTelephonyRecipientsManager.java")).q("RCS group thread should only have a single recipient ID.");
            ciuo ciuoVar2 = new ciuo();
            ciuoVar2.d(ciut.MULTIPLE_RECIPIENT_IDS_RETURNED);
            return ciuoVar2.e();
        }
        List listU = cmqjVar.U(strD);
        if (listU.size() != 1) {
            eksl ekslVar3 = (eksl) a.j();
            ekslVar3.X(cqnc.u, cnqjVar);
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/rcs/groups/telephony/RcsGroupTelephonyRecipientsManager", "getRcsGroupTelephonyData", 93, "RcsGroupTelephonyRecipientsManager.java")).r("RCS group thread should only have a single recipient, but instead found %d.", listU.size());
            ciuo ciuoVar3 = new ciuo();
            ciuoVar3.d(ciut.MULTIPLE_RECIPIENTS_PARSED);
            return ciuoVar3.e();
        }
        alqm alqmVar = (alqm) listU.get(0);
        cczv cczvVar = alvx.a;
        ciur ciurVarA = this.c.a(ejwk.b(alqmVar.i(((Boolean) new alvr().get()).booleanValue())));
        if (ciurVarA == null) {
            ciuo ciuoVar4 = new ciuo();
            ciuoVar4.d(ciut.INVALID_RECIPIENT_ADDRESS_FORMAT);
            return ciuoVar4.e();
        }
        ciuo ciuoVar5 = new ciuo();
        ciuoVar5.a = Optional.of(ciurVarA);
        return ciuoVar5.e();
    }
}
