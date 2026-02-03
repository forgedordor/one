package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajps {
    public static final eksp a = eksp.c("Bugle");
    public static final QuerySpecification b;
    public final fdjx c;
    public final fcsu d;
    public final alrj e;
    public final dedd f;

    static {
        dbit dbitVar = new dbit();
        dbitVar.a = true;
        dbitVar.b();
        dbitVar.c(new Section("thing_proto", true, 16));
        b = dbitVar.a();
    }

    public ajps(fdjx fdjxVar, fcsu fcsuVar, alrj alrjVar, dedd deddVar) {
        this.c = fdjxVar;
        this.d = fcsuVar;
        this.e = alrjVar;
        this.f = deddVar;
    }

    public static final String a(eyea eyeaVar, String str) {
        evtg evtgVar = eyeaVar.b;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : evtgVar) {
            eydy eydyVar = (eydy) obj;
            if (eydyVar.b().equals(str) && eydyVar.a() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((eydy) it.next()).d());
        }
        String str2 = (String) fcva.P(arrayList2);
        return str2 == null ? "" : str2;
    }
}
