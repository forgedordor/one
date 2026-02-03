package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugt extends fcyz implements fdat {
    int a;
    final /* synthetic */ ugv b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugt(fcxy fcxyVar, ugv ugvVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.b = ugvVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ugt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        bafp bafpVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            bafpVar = (bafp) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ugv ugvVar = this.b;
            ConversationIdType conversationIdType = this.c;
            bafp bafpVar2 = ugvVar.b;
            this.d = bafpVar2;
            this.a = 1;
            obj = ugvVar.d.c(conversationIdType, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            bafpVar = bafpVar2;
        }
        return bafpVar.a(ekfv.a((Collection) obj));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ugt ugtVar = new ugt(fcxyVar, this.b, this.c);
        ugtVar.d = obj;
        return ugtVar;
    }
}
