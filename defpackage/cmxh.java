package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxh implements bayg {
    private final cmxn a;

    public cmxh(cmxn cmxnVar) {
        this.a = cmxnVar;
    }

    @Override // defpackage.bayg
    public final eieu a() {
        return eiiy.k("MessageLatencyAnalytics::onProcessDeliverSuccess");
    }

    @Override // defpackage.bayg
    public final void b(MessageCoreData messageCoreData) {
        fhaz fhazVarAJ = messageCoreData.aJ();
        if (fhazVarAJ == null) {
            return;
        }
        dzfh dzfhVarA = dzfh.a(new dzfh("ToDelivered"), cmxn.a(messageCoreData.d()));
        cmxn cmxnVar = this.a;
        String str = fhazVarAJ.b;
        messageCoreData.cl();
        cmxnVar.j(str, dzfhVarA, cmxn.i);
    }
}
