package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class viw extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajlt b;
    final /* synthetic */ vix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viw(ajlt ajltVar, vix vixVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajltVar;
        this.c = vixVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((viw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        MessageId messageIdB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajlt ajltVar = this.b;
            if (ajltVar.B() != null) {
                angj angjVarB = ajltVar.B();
                angjVarB.getClass();
                bqec bqecVar = (bqec) fcva.N(angjVarB.a);
                bqecVar.aA(0, "message_id");
                messageIdB = new CoreBugleMessageId(bqecVar.a, -1L, bqecVar.k(), bqecVar.k());
            } else {
                messageIdB = ajltVar.b();
            }
            amvr amvrVarG = ajltVar.g();
            String strC = amvrVarG instanceof amwf ? ((amwf) amvrVarG).c() : null;
            vix vixVar = this.c;
            IncomingDraft incomingDraftA = IncomingDraft.a(avoc.a(ajltVar), null, null, new EditingData(messageIdB, strC, ajltVar.b()), 95);
            viv vivVar = new viv(null);
            this.a = 1;
            obj = vixVar.h.a(incomingDraftA, vivVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((Boolean) obj).booleanValue();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new viw(this.b, this.c, fcxyVar);
    }
}
