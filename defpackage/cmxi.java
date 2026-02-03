package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxi implements bayh {
    private final cmxn a;
    private final fcsu b;

    public cmxi(cmxn cmxnVar, fcsu fcsuVar) {
        this.a = cmxnVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.bayh
    public final void a(MessageCoreData messageCoreData) {
        fhaz fhazVarAJ = messageCoreData.aJ();
        if (fhazVarAJ == null) {
            return;
        }
        dzfh dzfhVarA = dzfh.a(new dzfh("ToSent"), cmxn.a(messageCoreData.d()));
        cmxn cmxnVar = this.a;
        String str = fhazVarAJ.b;
        messageCoreData.cl();
        cmxnVar.j(str, dzfhVarA, cmxn.i);
        cmxnVar.e(fhazVarAJ.b, ((Integer) cmxn.a.e()).intValue(), cmxn.j);
        awgn awgnVar = (awgn) this.b.b();
        MessageIdType messageIdTypeC = messageCoreData.C();
        messageIdTypeC.getClass();
        if (awgnVar.f != null) {
            awgnVar.a();
        }
        awgnVar.f = messageIdTypeC;
        dzuc dzucVar = awgnVar.e;
        dzucVar.e(awgn.c);
        dzucVar.e(awgn.d);
        dzucVar.e(awgn.a);
        dzucVar.e(awgn.b);
    }

    @Override // defpackage.bayh, defpackage.baye
    public final eieu c() {
        return eiiy.k("MessageLatencyAnalytics::onProcessSendSuccess");
    }
}
