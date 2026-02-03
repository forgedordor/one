package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eceq {
    public final ecev a;
    public final echo b;
    public final List c;
    public final List d;
    public final Uri e;
    public final Uri f;

    public eceq(ecep ecepVar) {
        this.a = ecepVar.a;
        this.b = ecepVar.b;
        this.c = ecepVar.c;
        this.d = ecepVar.d;
        this.e = ecepVar.e;
        this.f = ecepVar.f;
    }

    public final List a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        List list = this.d;
        if (!list.isEmpty()) {
            Uri uri = this.e;
            int i = eceo.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                echr echrVarB = ((echs) it.next()).b(uri);
                if (echrVarB != null) {
                    arrayList2.add(echrVarB);
                }
            }
            eceo eceoVar = !arrayList2.isEmpty() ? new eceo(outputStream, arrayList2) : null;
            if (eceoVar != null) {
                arrayList.add(eceoVar);
            }
        }
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(((echu) it2.next()).b(this.e, (OutputStream) ekis.j(arrayList)));
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }
}
