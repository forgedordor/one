package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atgw extends fcyz implements fdat {
    int a;
    final /* synthetic */ atgy b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgw(atgy atgyVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atgyVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atgw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            atgy atgyVar = this.b;
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            if (atgyVar.a.f(messageCoreData, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atgw(this.b, this.c, fcxyVar);
    }
}
