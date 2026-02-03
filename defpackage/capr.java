package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class capr implements bayk {
    private final aoot a;
    private final caqb b;

    public capr(aoot aootVar, axky axkyVar, caqb caqbVar) {
        aootVar.getClass();
        axkyVar.getClass();
        this.a = aootVar;
        this.b = caqbVar;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final void h(MessageCoreData messageCoreData) {
        if (messageCoreData.X() != cpyi.CMS_RESTORE_IN_PROGRESS) {
            return;
        }
        caqb caqbVar = this.b;
        int iD = axky.d();
        caqg caqgVar = (caqg) caqh.a.createBuilder();
        caqgVar.getClass();
        caqgVar.copyOnWrite();
        ((caqh) caqgVar.instance).b = iD;
        long jA = MessageIdType.a(messageCoreData.C());
        caqgVar.copyOnWrite();
        ((caqh) caqgVar.instance).c = jA;
        evsn evsnVarBuild = caqgVar.build();
        evsnVarBuild.getClass();
        auvh.h(((cazj) caqbVar.a.b()).a(cbcu.f("finish_cms_restore_after_message_insertion", (caqh) evsnVarBuild)).b());
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return this.a.a();
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
