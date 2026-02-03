package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cylt extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cylt(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cylt cyltVar = new cylt((fcxy) obj3);
        cyltVar.a = (Map) obj;
        cyltVar.b = (Map) obj2;
        return cyltVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r11 = this.a;
        ?? r0 = this.b;
        ArrayList arrayList = new ArrayList(r11.size());
        for (Map.Entry entry : r11.entrySet()) {
            String str = (String) entry.getKey();
            cbmk cbmkVar = (cbmk) entry.getValue();
            int size = cbmkVar.b.size();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(cbmkVar.a);
            instantOfEpochMilli.getClass();
            Integer num = (Integer) r0.get(str);
            int iMax = 0;
            if (num != null) {
                iMax = Math.max(num.intValue() - size, 0);
            }
            arrayList.add(new cynk(str, instantOfEpochMilli, iMax, size, cbmkVar.c));
        }
        return arrayList;
    }
}
