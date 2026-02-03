package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtq {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final eosc d;
    private final fcsu e;

    public crtq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar) {
        this.a = fcsuVar;
        this.e = fcsuVar2;
        this.b = fcsuVar3;
        this.c = fcsuVar4;
        this.d = eoscVar;
    }

    public final boolean a(ConversationIdType conversationIdType) {
        return ((bakt) this.e.b()).s(conversationIdType) == bvdk.SPAM_FOLDER;
    }
}
