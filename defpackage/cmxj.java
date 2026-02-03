package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmxj implements bayb {
    private final cmxn a;

    public cmxj(cmxn cmxnVar) {
        this.a = cmxnVar;
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        if (((Boolean) cmxn.n.e()).booleanValue()) {
            dzfh dzfhVar = new dzfh("ToMessageStoredInDbRcs");
            String strF = messageCoreData.F().f();
            cmxn cmxnVar = this.a;
            messageCoreData.cl();
            cmxnVar.j(strF, dzfhVar, cmxn.k);
        }
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) {
    }
}
