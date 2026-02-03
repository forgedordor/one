package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvg extends fcyz implements fdat {
    final /* synthetic */ UUID a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvg(fcxy fcxyVar, UUID uuid) {
        super(2, fcxyVar);
        this.a = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = btsn.a;
        btsi btsiVar = new btsi(btsn.a);
        btsiVar.A("getAttachmentMetadata");
        btsiVar.c(ahvh.a);
        btqt btqtVarA = btqy.a();
        btqtVarA.c(new ahvi(this.a));
        ekgb ekgbVarZ = ((btsi) btsiVar.j(dqts.i(btqtVarA.b(), btqy.c.a, btsn.b.b))).b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            aiad aiadVarM = ((btrc) it.next()).m();
            if (aiadVarM != null) {
                arrayList.add(aiadVarM);
            }
        }
        return fcva.ao(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahvg ahvgVar = new ahvg(fcxyVar, this.a);
        ahvgVar.b = obj;
        return ahvgVar;
    }
}
