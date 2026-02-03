package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akkv implements anpj {
    public final fcsu a;
    public final Conversation b;
    public final ajln c;
    public final anpj d;
    private final fdjx e;

    public akkv(fdjx fdjxVar, fcsu fcsuVar, Conversation conversation, ajln ajlnVar, anpj anpjVar) {
        this.e = fdjxVar;
        this.a = fcsuVar;
        this.b = conversation;
        this.c = ajlnVar;
        this.d = anpjVar;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        cquc cqucVarA = this.b.g().a(anpiVar);
        cqucVarA.getClass();
        return cqucVarA;
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.e, fcyi.a, fdjz.a, new akku(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException("PenpalBotConversationLocalIdentitiesSupplier.getBlocking is not supported.");
    }
}
