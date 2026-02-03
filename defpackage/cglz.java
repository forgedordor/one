package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cglz {
    static cglz h(ConversationIdType conversationIdType, cgrc cgrcVar, long j, badt badtVar, ekgb ekgbVar, cgpe cgpeVar, int i) {
        ejwl.l(!ekgbVar.isEmpty());
        return new cglw(conversationIdType, cgrcVar, j, badtVar, ekgbVar, cgpeVar, i);
    }

    public abstract int a();

    public abstract long b();

    public abstract badt c();

    public abstract ConversationIdType d();

    public abstract cgpe e();

    public abstract cgrc f();

    public abstract ekgb g();
}
