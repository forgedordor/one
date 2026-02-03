package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabe implements daaw {
    private final Context a;

    public dabe(Context context, aqbz aqbzVar) {
        context.getClass();
        aqbzVar.getClass();
        this.a = context;
    }

    @Override // defpackage.daaw
    public final eiju a() {
        String string = this.a.getString(R.string.unread_filter_name);
        string.getClass();
        String[] strArr = bdxk.a;
        bdxj bdxjVar = new bdxj();
        int iIntValue = bdxk.c().intValue();
        if (iIntValue < 59220) {
            dqru.x("marked_as_unread", iIntValue);
        }
        bdxjVar.ap(new dqty("conversations.marked_as_unread", 1, 1));
        bdxj bdxjVar2 = new bdxj();
        bdxjVar2.ar(new dqxl("$R > 0", new Object[]{"unread_message_count"}));
        bdxj bdxjVar3 = new bdxj();
        bdxjVar3.aq(bdxjVar, bdxjVar2);
        String[] strArr2 = bcve.a;
        bcvd bcvdVar = new bcvd();
        int iIntValue2 = bcve.d().intValue();
        if (iIntValue2 < 59220) {
            dqru.x("marked_as_unread", iIntValue2);
        }
        bcvdVar.ap(new dqty("conversations.marked_as_unread", 1, 1));
        bcvd bcvdVar2 = new bcvd();
        bcvdVar2.ar(new dqxl("$R > 0", new Object[]{"unread_message_count"}));
        bcvd bcvdVar3 = new bcvd();
        int iIntValue3 = bcve.d().intValue();
        if (iIntValue3 < 60740) {
            dqru.x("unread_count", iIntValue3);
        }
        bcvdVar3.ap(new dqty("conversations.unread_count", 7, 0));
        bcvd bcvdVar4 = new bcvd();
        bcvdVar4.aq(bcvdVar, bcvdVar2);
        eiju eijuVarE = eijx.e(new byar(R.drawable.unread, string, bdxjVar3, bcvdVar4, true, 12, byas.b));
        eijuVarE.getClass();
        return eijuVarE;
    }
}
