package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anan extends fcyz implements fdat {
    int a;
    final /* synthetic */ anao b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ MessageIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anan(anao anaoVar, MessageIdType messageIdType, MessageIdType messageIdType2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anaoVar;
        this.c = messageIdType;
        this.d = messageIdType2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anan) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            MessageIdType messageIdType = this.c;
            MessageIdType messageIdType2 = this.d;
            this.a = 1;
            if (anao.j(messageIdType, messageIdType2) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anan(this.b, this.c, this.d, fcxyVar);
    }
}
