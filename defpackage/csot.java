package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csot extends fcyz implements fdat {
    final /* synthetic */ cspf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csot(cspf cspfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cspfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csot) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cspf cspfVar = this.a;
        MessageCoreData messageCoreDataF = ((baxe) cspfVar.e.b()).f(cspfVar.g);
        Long l = messageCoreDataF != null ? new Long(messageCoreDataF.o()) : null;
        if (l == null) {
            return null;
        }
        return Instant.ofEpochMilli(l.longValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csot(this.a, fcxyVar);
    }
}
