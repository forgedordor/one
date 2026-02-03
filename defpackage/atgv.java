package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgv extends fcyz implements fdat {
    int a;
    final /* synthetic */ atgy b;
    final /* synthetic */ athh c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgv(atgy atgyVar, athh athhVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atgyVar;
        this.c = athhVar;
        this.d = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atgv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            atgy atgyVar = this.b;
            athh athhVar = this.c;
            MessageCoreData messageCoreData = this.d;
            this.a = 1;
            if (atgyVar.a.d(athhVar, messageCoreData, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atgv(this.b, this.c, this.d, fcxyVar);
    }
}
