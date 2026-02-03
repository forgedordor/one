package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aamm {
    public static final eksp a = eksp.c("DuplicateRcsGroupId");
    public final eosc b;
    public final eosc c;
    public final aapx d;
    public final ConversationIdType e;
    public final String f;

    public aamm(eosc eoscVar, eosc eoscVar2, aapx aapxVar, ConversationIdType conversationIdType, String str) {
        ejwl.b(!conversationIdType.b(), "conversation ID is empty");
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = aapxVar;
        this.e = conversationIdType;
        this.f = str;
    }
}
