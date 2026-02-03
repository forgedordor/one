package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class boat extends dqpg {
    public String a;
    public ConversationIdType b;
    public long c;
    public boolean d;
    public auej e;
    public bbaj f;

    public boat() {
        super(bocg.g());
        this.b = barn.a;
        this.d = false;
        this.e = auej.UNKNOWN_STATE;
        this.f = bbam.b();
    }

    public final boar a() {
        boas boasVar = new boas();
        boasVar.aD(aB());
        boasVar.a = this.a;
        boasVar.b = this.b;
        boasVar.c = this.c;
        boasVar.d = this.d;
        boasVar.e = this.e;
        boasVar.f = this.f;
        boasVar.cM = aC();
        return boasVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void c(long j) {
        aE(2);
        this.c = j;
    }

    public final void d(auej auejVar) {
        int i = this.aB;
        if (i < 58570) {
            dqru.x("rcs_group_join_status", i);
        }
        aE(4);
        this.e = auejVar;
    }
}
