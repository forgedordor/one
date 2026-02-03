package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agyh extends fcyz implements fdat {
    int a;
    final /* synthetic */ agyi b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyh(agyi agyiVar, MessageCoreData messageCoreData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = agyiVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agyh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objI;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agyi agyiVar = this.b;
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            Optional optionalA = civb.a(messageCoreData.ac(), civa.RCS_PENPAL_NAMESPACE, "PENPAL-CONVERSATION-ID");
            if (optionalA.isEmpty() || (objI = ((cgte) agyiVar.a.b()).i((String) optionalA.get(), this)) != fcylVar) {
                objI = fctx.a;
            }
            if (objI == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agyh(this.b, this.c, fcxyVar);
    }
}
