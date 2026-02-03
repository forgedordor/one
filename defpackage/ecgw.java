package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecgw implements ecer {
    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) {
        OutputStream outputStreamF = eceqVar.b.f(eceqVar.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamF);
        List list = eceqVar.d;
        if (!list.isEmpty()) {
            Uri uri = eceqVar.e;
            int i = eceo.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                echr echrVarA = ((echs) it.next()).a(uri);
                if (echrVarA != null) {
                    arrayList2.add(echrVarA);
                }
            }
            eceo eceoVar = !arrayList2.isEmpty() ? new eceo(outputStreamF, arrayList2) : null;
            if (eceoVar != null) {
                arrayList.add(eceoVar);
            }
        }
        Iterator it2 = eceqVar.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((echu) it2.next()).d((OutputStream) ekis.j(arrayList)));
        }
        Collections.reverse(arrayList);
        return (OutputStream) arrayList.get(0);
    }
}
