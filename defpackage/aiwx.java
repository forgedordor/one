package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiwx extends fcyz implements fdat {
    int a;
    final /* synthetic */ aiwz b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ SelfIdentityId d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiwx(aiwz aiwzVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiwzVar;
        this.c = conversationIdType;
        this.d = selfIdentityId;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiwx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aiwz aiwzVar = this.b;
            ConversationIdType conversationIdType = this.c;
            SelfIdentityId selfIdentityId = this.d;
            int i2 = this.e;
            this.a = 1;
            if (aiwzVar.b(conversationIdType, selfIdentityId, i2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aiwx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
