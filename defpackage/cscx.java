package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cscx {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fdjx i;

    public cscx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.h = fcsuVar8;
        this.i = fdjxVar;
    }

    public final void a(MessageCoreData messageCoreData, Integer num, eyga eygaVar) throws IOException {
        messageCoreData.getClass();
        eieu eieuVarA = eiiy.a("IncomingMessageSpamProtectionEntrypoint.checkIfIncomingMessageIsSpam");
        try {
            auvw.k(this.i, null, null, new cscw(this, messageCoreData, num, eygaVar, null), 3);
            fczl.a(eieuVarA, null);
        } finally {
        }
    }

    public final void b(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        a(messageCoreData, null, null);
    }
}
