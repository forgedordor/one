package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amjd extends fcyz implements fdat {
    final /* synthetic */ MessageId a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amjd(fcxy fcxyVar, MessageId messageId) {
        super(2, fcxyVar);
        this.a = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amjd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessageId messageId = this.a;
        if (!(messageId instanceof CoreBugleMessageId)) {
            if (!(messageId instanceof CoreBuglePartialMessageId)) {
                throw new IllegalArgumentException("Unhandled MessageId type.");
            }
            PartsTable.BindData bindDataA = PartsTable.a(String.valueOf(((CoreBuglePartialMessageId) messageId).b));
            if (bindDataA == null) {
                throw new IllegalStateException("row not found");
            }
            if (!le.f(bindDataA.I()) || bindDataA.t() == null) {
                throw new IllegalArgumentException("No audio part for given BuglePartialMessageId.");
            }
            return bindDataA;
        }
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("AudioMessageTranscriberImpl#getAudioPartFromMessageId");
        bsjeVarC.h(new amjf(messageId));
        ekgb ekgbVarZ = bsjeVarC.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : ekgbVarZ) {
            PartsTable.BindData bindData = (PartsTable.BindData) obj2;
            if (le.f(bindData.I()) && bindData.t() != null) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        throw new IllegalArgumentException("No support for CoreBugleMessageId without exactly one audio part.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        amjd amjdVar = new amjd(fcxyVar, this.a);
        amjdVar.b = obj;
        return amjdVar;
    }
}
