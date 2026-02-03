package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdd implements bayk {
    private final fcsu a;
    private final arvu b;

    public ckdd(fcsu fcsuVar, arvu arvuVar) {
        fcsuVar.getClass();
        arvuVar.getClass();
        this.a = fcsuVar;
        this.b = arvuVar;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final void h(MessageCoreData messageCoreData) throws IOException {
        String strAB = messageCoreData.aB();
        if (strAB == null) {
            return;
        }
        eieu eieuVarH = eiiy.h("DeleteOnOutgoingMessageInsertionListener#onInsertInTransaction");
        try {
            ckdl ckdlVarT = messageCoreData.T();
            if (ckdlVarT == null) {
                fczl.a(eieuVarH, null);
            } else {
                ((ckdc) this.a.b()).a(ckdlVarT.b, strAB);
                fczl.a(eieuVarH, null);
            }
        } finally {
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return this.b.a();
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
