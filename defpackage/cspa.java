package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspa extends fcyz implements fdat {
    final /* synthetic */ cspf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cspa(cspf cspfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cspfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cspa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cspf cspfVar = this.a;
        baxe baxeVar = (baxe) cspfVar.e.b();
        Object objE = crtr.g.e();
        objE.getClass();
        int iIntValue = ((Number) objE).intValue();
        Object objE2 = crtr.h.e();
        objE2.getClass();
        ekgb<MessageCoreData> ekgbVarH = baxeVar.H(cspfVar.g, Math.max(iIntValue, ((Number) objE2).intValue()));
        ekgbVarH.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarH, 10));
        for (MessageCoreData messageCoreData : ekgbVarH) {
            cspk cspkVar = (cspk) cspfVar.a.b();
            messageCoreData.getClass();
            arrayList.add(cspkVar.a(messageCoreData));
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cspa(this.a, fcxyVar);
    }
}
