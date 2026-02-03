package defpackage;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echh implements ecer {
    public boolean a = false;

    @Override // defpackage.ecer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InputStream a(eceq eceqVar) {
        InputStream inputStreamE = eceqVar.b.e(eceqVar.f);
        if (this.a) {
            inputStreamE = new BufferedInputStream(inputStreamE);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamE);
        List list = eceqVar.d;
        if (!list.isEmpty()) {
            int i = ecen.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((echs) it.next()).h();
            }
            ecen ecenVar = !arrayList2.isEmpty() ? new ecen(inputStreamE, arrayList2) : null;
            if (ecenVar != null) {
                arrayList.add(ecenVar);
            }
        }
        Iterator it2 = eceqVar.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((echu) it2.next()).a(eceqVar.e, (InputStream) ekis.j(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
