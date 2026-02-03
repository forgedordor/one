package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crch extends fcyz implements fdat {
    final /* synthetic */ crcm a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crch(fcxy fcxyVar, crcm crcmVar, ConversationIdType conversationIdType, long j) {
        super(2, fcxyVar);
        this.a = crcmVar;
        this.b = conversationIdType;
        this.c = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crch) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        baxe baxeVar = (baxe) this.a.a.b();
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestVisibleMessageForConversationBeforeTimestamp");
        long j = this.c;
        try {
            brec brecVarE = baxe.E(this.b);
            brecVarE.S(j);
            MessageCoreData messageCoreDataN = baxeVar.n(new brdv(brecVarE));
            eieuVarK.close();
            return messageCoreDataN;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crch crchVar = new crch(fcxyVar, this.a, this.b, this.c);
        crchVar.d = obj;
        return crchVar;
    }
}
