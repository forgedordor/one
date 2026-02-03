package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cink implements bayk {
    private final fcsu a;
    private final ains b;

    public cink(fcsu fcsuVar, ains ainsVar) {
        fcsuVar.getClass();
        ainsVar.getClass();
        this.a = fcsuVar;
        this.b = ainsVar;
    }

    @Override // defpackage.bayk
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        cinh cinhVarB;
        messageCoreData.getClass();
        messageIdType.getClass();
        eyga eygaVarAc = messageCoreData.ac();
        if (eygaVarAc == null || (cinhVarB = cinj.b(eygaVarAc)) == null) {
            return;
        }
        this.b.d("Bugle.RcsGroups.Mentions.Sent.Count", cinhVarB.b.size());
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return ((ardn) this.a.b()).a();
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
