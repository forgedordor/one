package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opw {
    public int a;
    public int b;
    public final fcuq c = new fcuq();
    public final orz d = new orz();
    public boolean e;

    public final List a() {
        if (!this.e) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList();
        orz orzVar = this.d;
        fcuq fcuqVar = this.c;
        orq orqVarB = orzVar.b();
        if (fcuqVar.isEmpty()) {
            arrayList.add(new ose(orqVarB));
            return arrayList;
        }
        osd osdVar = osd.a;
        arrayList.add(new osd(orr.a, fcva.ao(fcuqVar), this.a, this.b, orqVarB));
        return arrayList;
    }
}
