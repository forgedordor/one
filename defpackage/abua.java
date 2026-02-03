package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abua extends fcyz implements fdat {
    int a;
    final /* synthetic */ abuc b;
    final /* synthetic */ abub c;
    final /* synthetic */ ehsm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abua(fcxy fcxyVar, abuc abucVar, abub abubVar, ehsm ehsmVar) {
        super(2, fcxyVar);
        this.b = abucVar;
        this.c = abubVar;
        this.d = ehsmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abua) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            abud abudVar = (abud) this.b.c.b();
            Intent intent = this.d.a;
            boolean zF = fdbq.f(intent != null ? intent.getAction() : null, "com.google.android.apps.messaging.ACTION_START_DEMO_ESOS_CONVERSATION");
            this.a = 1;
            obj = abudVar.a(zF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        abuc abucVar = this.b;
        return ehsj.b(((avmp) abucVar.d.b()).p(abucVar.a, (ConversationId) obj));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abua abuaVar = new abua(fcxyVar, this.b, this.c, this.d);
        abuaVar.e = obj;
        return abuaVar;
    }
}
