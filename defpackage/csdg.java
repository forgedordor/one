package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csdg {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    private final fdjx g;

    public csdg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fdjxVar;
    }

    public final void a(MessageId messageId, String str) throws IOException {
        if (!(messageId instanceof amgc)) {
            throw new IllegalArgumentException("MAPI MessageID is not yet natively supported in spam.");
        }
        MessageIdType messageIdTypeC = ((amgc) messageId).c();
        messageIdTypeC.getClass();
        if (((Set) this.a.b()).isEmpty()) {
            return;
        }
        eieu eieuVarA = eiiy.a("UrlClickSpamProtectionEntrypoint.classifyOnClick");
        try {
            auvw.k(this.g, null, null, new csdf(this, messageIdTypeC, str, null), 3);
            fczl.a(eieuVarA, null);
        } finally {
        }
    }
}
