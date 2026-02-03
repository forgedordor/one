package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aama {
    public static final eksp a = eksp.c("ConvsCreatedReporter");
    public final eosc b;
    public final eosc c;
    public final aapx d;
    public final ConversationIdType e;
    public final Optional f;

    public aama(eosc eoscVar, eosc eoscVar2, aapx aapxVar, ConversationIdType conversationIdType, Optional optional) {
        ejwl.b(!conversationIdType.b(), "conversation ID is empty");
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = aapxVar;
        this.e = conversationIdType;
        this.f = optional;
    }
}
