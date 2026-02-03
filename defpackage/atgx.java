package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atgx extends fcyz implements fdat {
    int a;
    final /* synthetic */ atgy b;
    final /* synthetic */ athh c;
    final /* synthetic */ int d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgx(atgy atgyVar, athh athhVar, int i, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atgyVar;
        this.c = athhVar;
        this.d = i;
        this.e = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atgx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            atgy atgyVar = this.b;
            athh athhVar = this.c;
            int i2 = this.d;
            MessageCoreData messageCoreData = this.e;
            this.a = 1;
            if (atgyVar.a.i(athhVar, i2, messageCoreData, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atgx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
