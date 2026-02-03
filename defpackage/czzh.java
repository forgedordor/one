package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
class czzh implements egps<Recipient, Conversation> {
    final /* synthetic */ czzj a;

    public czzh(czzj czzjVar) {
        this.a = czzjVar;
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        czzj czzjVar = this.a;
        czzjVar.d.h(czzjVar.b.A(), ((Conversation) obj2).d(), Optional.of(czzjVar.o));
        czzjVar.g.a();
    }

    @Override // defpackage.egps
    public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
        eg egVarG = this.a.b.G();
        egVarG.getClass();
        eeji eejiVar = new eeji(egVarG);
        eejiVar.k(R.string.conversation_creation_failed);
        eejiVar.a();
    }

    @Override // defpackage.egps
    public final /* synthetic */ void b(Object obj) {
    }
}
