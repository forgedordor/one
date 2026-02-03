package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqz {
    private final fcsu a;
    private final fcsu b;

    public cgqz(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final void a(ConversationIdType conversationIdType, Duration duration, boolean z, cgrc cgrcVar) {
        conversationIdType.getClass();
        duration.getClass();
        cgrcVar.getClass();
        int iOrdinal = cgrcVar.ordinal();
        int i = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? 2 : 5 : 4 : 3;
        cgkj cgkjVar = (cgkj) this.a.b();
        cgiw cgiwVar = (cgiw) this.b.b();
        cgpb cgpbVar = (cgpb) cgpd.a.createBuilder();
        cgpbVar.getClass();
        cgpbVar.copyOnWrite();
        cgpd cgpdVar = (cgpd) cgpbVar.instance;
        cgpdVar.b |= 2;
        cgpdVar.e = false;
        cgpbVar.copyOnWrite();
        cgpd cgpdVar2 = (cgpd) cgpbVar.instance;
        cgpdVar2.b |= 1;
        cgpdVar2.d = false;
        DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(cgpdVar2.c)).getClass();
        String strA = conversationIdType.a();
        strA.getClass();
        cgos cgosVar = (cgos) cgov.a.createBuilder();
        cgosVar.getClass();
        long millis = duration.toMillis();
        cgosVar.copyOnWrite();
        cgov cgovVar = (cgov) cgosVar.instance;
        cgovVar.b |= 1;
        cgovVar.c = millis;
        cgosVar.copyOnWrite();
        cgov cgovVar2 = (cgov) cgosVar.instance;
        cgovVar2.d = i - 1;
        cgovVar2.b |= 2;
        evsn evsnVarBuild = cgosVar.build();
        evsnVarBuild.getClass();
        cgpbVar.a(strA, (cgov) evsnVarBuild);
        evsn evsnVarBuild2 = cgpbVar.build();
        evsnVarBuild2.getClass();
        cgkjVar.d(cgiwVar, (cgpd) evsnVarBuild2, z);
    }
}
