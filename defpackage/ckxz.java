package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxz {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ckxz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    public final void a(ezfb ezfbVar, MessageCoreData messageCoreData) {
        eieu eieuVarA = eiiy.a("ReactionMessageTranslator#alterFallbackMessage");
        try {
            Object objB = this.b.b();
            objB.getClass();
            ckmb ckmbVarA = ckyi.a(ezfbVar, (ckmg) objB, this.c);
            if (ckmbVarA == null) {
                fczl.a(eieuVarA, null);
                return;
            }
            for (MessagePartCoreData messagePartCoreData : ((MessageData) messageCoreData).i) {
                if (messagePartCoreData.bv()) {
                    messagePartCoreData.aI(((ckya) this.a.b()).a(ckyi.b(ezfbVar), ckmbVarA, new ckns(ezfbVar.c)));
                }
            }
            fczl.a(eieuVarA, null);
        } finally {
        }
    }
}
