package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crbw extends fcyz implements fdat {
    int a;
    final /* synthetic */ crcm b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ elny e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crbw(fcxy fcxyVar, crcm crcmVar, ConversationIdType conversationIdType, long j, elny elnyVar) {
        super(2, fcxyVar);
        this.b = crcmVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = elnyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crbw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            baxe baxeVar = (baxe) this.b.a.b();
            ConversationIdType conversationIdType = this.c;
            long j = this.d;
            eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getLatestMessageForConversationBeforeTimestamp");
            try {
                String[] strArr = MessagesTable.a;
                brec brecVar = new brec();
                brecVar.m(conversationIdType);
                brecVar.S(j);
                MessageCoreData messageCoreDataN = baxeVar.n(new brdv(brecVar));
                eieuVarK.close();
                if (messageCoreDataN != null) {
                    crcm crcmVar = this.b;
                    this.a = 1;
                    if (crcmVar.l(messageCoreDataN, this) == fcylVar) {
                        return fcylVar;
                    }
                }
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crbw crbwVar = new crbw(fcxyVar, this.b, this.c, this.d, this.e);
        crbwVar.f = obj;
        return crbwVar;
    }
}
