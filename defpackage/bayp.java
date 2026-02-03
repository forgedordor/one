package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bayp extends fcyz implements fdat {
    int a;
    final /* synthetic */ bays b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ MessageIdType d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bayp(bays baysVar, MessageCoreData messageCoreData, MessageIdType messageIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = baysVar;
        this.c = messageCoreData;
        this.d = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bayp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bays baysVar = this.b;
            MessageCoreData messageCoreData = this.c;
            MessageIdType messageIdType = this.d;
            this.a = 1;
            Object objA = fdin.a(eicg.a(baysVar.c), new bayn(null, baysVar, messageCoreData, messageIdType), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
        }
        return new Integer(this.b.b().size());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bayp(this.b, this.c, this.d, fcxyVar);
    }
}
