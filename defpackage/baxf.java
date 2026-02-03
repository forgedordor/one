package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baxf {
    private final fcsu a;
    private final fcsu b;

    public baxf(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final int a(MessageCoreData messageCoreData, int i) {
        if (messageCoreData.dg()) {
            return 0;
        }
        if (messageCoreData.cl()) {
            return (((chwq) this.b.b()).d() == 1 && messageCoreData.ch()) ? 0 : 1;
        }
        return ((bagw) this.a.b()).a(cssr.a(messageCoreData.as(), ""), i, messageCoreData.M(), "automatic fallback message");
    }
}
