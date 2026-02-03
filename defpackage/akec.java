package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akec extends fcyz implements fdat {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ Optional c;
    final /* synthetic */ ekgb d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akec(akee akeeVar, Optional optional, ekgb ekgbVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akeeVar;
        this.c = optional;
        this.d = ekgbVar;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akec) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            akee akeeVar = this.b;
            eiju eijuVarO = akeeVar.b.o(this.c, this.d, this.e);
            eijuVarO.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarO, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        akee akeeVar2 = this.b;
        Conversation conversation = (Conversation) obj;
        conversation.getClass();
        return akeeVar2.a.a((BugleConversation) conversation);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akec(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
