package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atht extends fcyz implements fdat {
    int a;
    final /* synthetic */ athv b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ String d;
    final /* synthetic */ fdch e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atht(athv athvVar, MessageCoreData messageCoreData, String str, fdch fdchVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = athvVar;
        this.c = messageCoreData;
        this.d = str;
        this.e = fdchVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atht) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVarC = ((cmoi) this.b.d.b()).c(this.c.F());
            if (fdkfVarC != null) {
                this.a = 1;
                obj = fdkfVarC.c(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
        }
        athv athvVar = this.b;
        MessageCoreData messageCoreData = this.c;
        athvVar.c.a(messageCoreData.F(), this.d, this.e.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atht(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
