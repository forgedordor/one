package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csaz extends fcyz implements fdat {
    int a;
    final /* synthetic */ BugleConversation b;
    final /* synthetic */ csba c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csaz(BugleConversation bugleConversation, csba csbaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bugleConversation;
        this.c = csbaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csaz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            BugleConversation bugleConversation = this.b;
            csba csbaVar = this.c;
            this.a = 1;
            obj = csbaVar.c(bugleConversation, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            return null;
        }
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        fcsu fcsuVar = this.c.a;
        ((csbb) fcsuVar.b()).c(((DefaultConversation) this.b).a.a);
        csbb csbbVar = (csbb) fcsuVar.b();
        this.a = 2;
        if (csbbVar.b(this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csaz(this.b, this.c, fcxyVar);
    }
}
