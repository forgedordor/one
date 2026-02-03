package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class asqq extends fcyz implements fdat {
    final /* synthetic */ asqr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ asqe c;
    final /* synthetic */ ConversationIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asqq(asqr asqrVar, boolean z, asqe asqeVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = asqrVar;
        this.b = z;
        this.c = asqeVar;
        this.d = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asqq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final asqe asqeVar = this.c;
        final asqr asqrVar = this.a;
        final boolean z = this.b;
        final ConversationIdType conversationIdType = this.d;
        asqrVar.a.d("RbmToolstoneDatabaseOperations#persistToolstoneState", new Runnable() { // from class: asqp
            @Override // java.lang.Runnable
            public final void run() {
                ConversationIdType conversationIdType2 = conversationIdType;
                asqe asqeVar2 = asqeVar;
                if (z && asqeVar2 == asqe.HIDE) {
                    asqrVar.d(conversationIdType2);
                } else {
                    asqr.h(conversationIdType2, asqeVar2);
                }
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new asqq(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
