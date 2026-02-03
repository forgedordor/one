package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daax implements daaw {
    private final Context a;

    public daax(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.daaw
    public final eiju a() {
        String string = this.a.getString(R.string.known_contacts_filter_name);
        string.getClass();
        String[] strArr = bdxk.a;
        bdxj bdxjVar = new bdxj();
        bdxj[] bdxjVarArr = new bdxj[2];
        bdxj bdxjVar2 = new bdxj();
        bdxjVar2.ap(new dqpn("one_on_one_participant.lookup_key", 6));
        bdxjVarArr[0] = bdxjVar2;
        bdxj bdxjVar3 = new bdxj();
        int iIntValue = bdxk.c().intValue();
        if (iIntValue < 12001) {
            dqru.x("participant_type", iIntValue);
        }
        bdxjVar3.ap(new dqty("one_on_one_participant.participant_type", 2, 0));
        bdxjVarArr[1] = bdxjVar3;
        bdxjVar.aq(bdxjVarArr);
        bdxj bdxjVar4 = new bdxj();
        bdxjVar4.ap(new dqty("conversations.participant_count", 7, 1));
        bdxj bdxjVar5 = new bdxj();
        bdxjVar5.aq(bdxjVar, bdxjVar4);
        String[] strArr2 = bcve.a;
        bcvd bcvdVar = new bcvd();
        bcvd[] bcvdVarArr = new bcvd[2];
        bcvd bcvdVar2 = new bcvd();
        bcvdVar2.ap(new dqpn("one_on_one_participant.lookup_key", 6));
        bcvdVarArr[0] = bcvdVar2;
        bcvd bcvdVar3 = new bcvd();
        int iIntValue2 = bcve.d().intValue();
        if (iIntValue2 < 12001) {
            dqru.x("participant_type", iIntValue2);
        }
        bcvdVar3.ap(new dqty("one_on_one_participant.participant_type", 2, 0));
        bcvdVarArr[1] = bcvdVar3;
        bcvdVar.aq(bcvdVarArr);
        bcvd bcvdVar4 = new bcvd();
        bcvdVar4.ap(new dqty("conversations.participant_count", 7, 1));
        bcvd bcvdVar5 = new bcvd();
        bcvdVar5.aq(bcvdVar, bcvdVar4);
        eiju eijuVarE = eijx.e(new byar(R.drawable.quantum_gm_ic_account_circle_vd_theme_24, string, bdxjVar5, bcvdVar5, true, 13, byas.c));
        eijuVarE.getClass();
        return eijuVarE;
    }
}
