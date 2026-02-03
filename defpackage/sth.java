package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sth implements baxz, baya {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;
    private final fdjx d;

    public sth(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.c = fcsuVar2;
        this.b = fcsuVar3;
        this.d = fdjxVar;
    }

    private final void a(MessageCoreData messageCoreData) {
        MessagePartCoreData messagePartCoreDataH;
        if (((crej) this.c.b()).j() && (messagePartCoreDataH = messageCoreData.H()) != null && messagePartCoreDataH.aY()) {
            auvw.m(this.d, null, new stg(this, messageCoreData, null), 3);
        }
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        a(messageCoreData);
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
