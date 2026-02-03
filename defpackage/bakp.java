package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bakp extends fcyz implements fdat {
    final /* synthetic */ bakq a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ ajsm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bakp(bakq bakqVar, ConversationIdType conversationIdType, ajsm ajsmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bakqVar;
        this.b = conversationIdType;
        this.c = ajsmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bakp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object objB = this.a.a.b();
        objB.getClass();
        Iterator it = ((Iterable) objB).iterator();
        while (it.hasNext()) {
            ajsm ajsmVar = this.c;
            ((bakm) it.next()).a(this.b, ajsmVar);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bakp(this.a, this.b, this.c, fcxyVar);
    }
}
