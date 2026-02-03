package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvuk extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvuo b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ aoer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvuk(bvuo bvuoVar, ConversationIdType conversationIdType, aoer aoerVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvuoVar;
        this.c = conversationIdType;
        this.d = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvuk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvuo bvuoVar = this.b;
            ConversationIdType conversationIdType = this.c;
            aoer aoerVar = this.d;
            this.a = 1;
            if (bvuoVar.d(conversationIdType, aoerVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvuk(this.b, this.c, this.d, fcxyVar);
    }
}
