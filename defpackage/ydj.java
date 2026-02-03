package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ydj extends fcyz implements fdat {
    int a;
    final /* synthetic */ yek b;
    final /* synthetic */ MessageId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydj(yek yekVar, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = yekVar;
        this.c = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            yek yekVar = this.b;
            MessageId messageId = this.c;
            this.a = 1;
            if (yekVar.h.c(messageId, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ydj(this.b, this.c, fcxyVar);
    }
}
