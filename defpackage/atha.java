package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atha {
    public final athe a;
    public final athh b;
    public final int c;
    public aubq d;
    public final atjp e = new atjp();
    public final AtomicReference f;

    public atha(athe atheVar, athh athhVar, MessageCoreData messageCoreData, int i) {
        this.a = atheVar;
        this.b = athhVar;
        this.c = i;
        AtomicReference atomicReference = new AtomicReference(null);
        this.f = atomicReference;
        atomicReference.set(messageCoreData);
    }

    public final MessageCoreData a() {
        return (MessageCoreData) this.f.get();
    }
}
