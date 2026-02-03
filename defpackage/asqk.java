package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class asqk extends fcyz implements fdat {
    final /* synthetic */ asqr a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asqk(asqr asqrVar, int i, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = asqrVar;
        this.c = i;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((asqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final asqr asqrVar = this.a;
        final int i = this.c;
        final ConversationIdType conversationIdType = this.b;
        asqrVar.a.d("RbmToolstoneDatabaseOperations#calculateAndStoreToolstoneAppearance", new Runnable() { // from class: asqj
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                asqrVar.f(i, conversationIdType);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new asqk(this.a, this.c, this.b, fcxyVar);
    }
}
