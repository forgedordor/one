package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdo extends fcyz implements fdat {
    final /* synthetic */ MessageIdType a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckdo(fcxy fcxyVar, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.a = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckdo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getEarliestReceivedTimestampForEditedMessage");
        brdrVarD.e(ckdp.a);
        brdrVarD.h(new ckdq(this.a));
        brdrVarD.y(1);
        dqqj dqqjVarP = brdrVarD.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (!brapVar.moveToFirst()) {
                fczl.a(dqqjVarP, null);
                return null;
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(brapVar.l());
            fczl.a(dqqjVarP, null);
            return instantOfEpochMilli;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckdo ckdoVar = new ckdo(fcxyVar, this.a);
        ckdoVar.b = obj;
        return ckdoVar;
    }
}
