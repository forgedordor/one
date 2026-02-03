package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckfd extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckfg b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckfd(ckfg ckfgVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckfgVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckfd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckfg ckfgVar = this.b;
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            if (ckfgVar.a(messageCoreData, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckfd(this.b, this.c, fcxyVar);
    }
}
