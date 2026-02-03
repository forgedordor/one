package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabd implements daaw {
    private final Context a;

    public dabd(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.daaw
    public final eiju a() {
        String string = this.a.getString(R.string.unknown_contacts_filter_name);
        string.getClass();
        String[] strArr = bdxk.a;
        bdxj bdxjVar = new bdxj();
        bdxjVar.ap(new dqpn("one_on_one_participant.lookup_key", 5));
        bdxjVar.ap(new dqty("conversations.participant_count", 1, 1));
        int iIntValue = bdxk.c().intValue();
        if (iIntValue < 12001) {
            dqru.x("participant_type", iIntValue);
        }
        bdxjVar.ap(new dqty("one_on_one_participant.participant_type", 1, 0));
        String[] strArr2 = bcve.a;
        bcvd bcvdVar = new bcvd();
        bcvdVar.ap(new dqpn("one_on_one_participant.lookup_key", 5));
        bcvdVar.ap(new dqty("conversations.participant_count", 1, 1));
        int iIntValue2 = bcve.d().intValue();
        if (iIntValue2 < 12001) {
            dqru.x("participant_type", iIntValue2);
        }
        bcvdVar.ap(new dqty("one_on_one_participant.participant_type", 1, 0));
        eiju eijuVarE = eijx.e(new byar(R.drawable.quantum_gm_ic_no_accounts_vd_theme_24, string, bdxjVar, bcvdVar, true, 14, byas.d));
        eijuVarE.getClass();
        return eijuVarE;
    }
}
