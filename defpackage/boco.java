package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class boco extends dqpg {
    public long a;
    public ConversationIdType b;
    public boolean c;

    public boco() {
        super(bodn.b());
        this.b = barn.a;
    }

    public final bocm a() {
        bocn bocnVar = new bocn();
        bocnVar.aD(aB());
        bocnVar.a = this.a;
        bocnVar.b = this.b;
        bocnVar.c = this.c;
        bocnVar.cM = aC();
        return bocnVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void c(boolean z) {
        aE(2);
        this.c = z;
    }
}
