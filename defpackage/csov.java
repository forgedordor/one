package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csov extends fcyz implements fdat {
    int a;
    final /* synthetic */ cspf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csov(cspf cspfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cspfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csov) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVarK = this.b.k();
            this.a = 1;
            obj = fdkfVarK.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        MessageCoreData messageCoreData = (MessageCoreData) obj;
        if (messageCoreData == null) {
            return null;
        }
        return messageCoreData.cI() ? Instant.ofEpochMilli(messageCoreData.o()) : Instant.ofEpochMilli(messageCoreData.r());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csov(this.b, fcxyVar);
    }
}
