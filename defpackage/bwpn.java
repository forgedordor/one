package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpn extends fcyz implements fdat {
    int a;
    final /* synthetic */ bwps b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpn(fcxy fcxyVar, bwps bwpsVar) {
        super(2, fcxyVar);
        this.b = bwpsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bwps bwpsVar = this.b;
            eiju eijuVarB = ((anty) bwpsVar.a.b()).e(new BugleConversationId(bwpsVar.e.a)).b();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((ResolvedRecipient) obj2).g().e().isPresent()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpn bwpnVar = new bwpn(fcxyVar, this.b);
        bwpnVar.c = obj;
        return bwpnVar;
    }
}
