package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwn extends fcyz implements fdat {
    final /* synthetic */ ccwo a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwn(ccwo ccwoVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ccwoVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVarZ = ccwo.f(this.b, null).z();
        ekgbVarZ.getClass();
        ArrayList<bpei> arrayList = new ArrayList();
        for (Object obj2 : ekgbVarZ) {
            ccwo ccwoVar = this.a;
            if (((bpei) obj2).n().isAfter(((cogw) ccwoVar.a.b()).f())) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() > 2) {
            throw new IllegalStateException("More than 2 EmergencySessionsTable entries returned.");
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (bpei bpeiVar : arrayList) {
            bpeiVar.getClass();
            arrayList2.add(amqk.a(bpeiVar));
        }
        return arrayList2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ccwn(this.a, this.b, fcxyVar);
    }
}
