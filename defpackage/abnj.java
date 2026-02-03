package defpackage;

import com.google.android.apps.messaging.dittosatellite.intent.DittoAttachment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnj extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ abno c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnj(fcxy fcxyVar, List list, abno abnoVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = abnoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abnj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            List<DittoAttachment> list = this.b;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (DittoAttachment dittoAttachment : list) {
                fcyi fcyiVar = fcyi.a;
                arrayList.add(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new abnk(null, dittoAttachment, this.c)));
            }
            this.a = 1;
            obj = fdii.a(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fcva.ae((Iterable) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        abnj abnjVar = new abnj(fcxyVar, this.b, this.c);
        abnjVar.d = obj;
        return abnjVar;
    }
}
