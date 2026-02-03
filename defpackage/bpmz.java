package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpmz extends dqpg {
    public ConversationIdType a;
    public axcm b;
    public String c;

    public bpmz() {
        super(bpoa.a().M());
        this.a = barn.a;
        this.b = null;
    }

    public final bpmx a() {
        bpmy bpmyVar = new bpmy();
        bpmyVar.aD(aB());
        bpmyVar.a = this.a;
        bpmyVar.b = this.b;
        bpmyVar.c = this.c;
        bpmyVar.cM = aC();
        return bpmyVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(axcm axcmVar) {
        aE(1);
        this.b = axcmVar;
    }
}
