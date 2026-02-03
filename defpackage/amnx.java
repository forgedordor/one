package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amnx extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ amnz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amnx(MessageId messageId, amnz amnzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = messageId;
        this.c = amnzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amnx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            MessageId messageId = this.b;
            if (messageId == null) {
                return null;
            }
            eiju eijuVarV = this.c.m.v(messageId);
            eijuVarV.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarV, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return (ajlt) obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amnx(this.b, this.c, fcxyVar);
    }
}
