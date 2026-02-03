package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awco {
    private final fcsu a;

    public awco(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final ConversationIdType a(cicr cicrVar) {
        if (((ciaj) cicrVar).c) {
            return ((cicm) this.a.b()).a(cicrVar);
        }
        throw new IllegalArgumentException("isRcsGroup must be true.");
    }
}
