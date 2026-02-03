package defpackage;

import android.content.Context;
import android.os.LocaleList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnoh implements duwm {
    private final Context a;

    public dnoh(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.duwm
    public final ListenableFuture a(dtok dtokVar) {
        dtokVar.getClass();
        LocaleList locales = this.a.getResources().getConfiguration().getLocales();
        locales.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            locale.getClass();
            linkedHashMap.put(dngl.a(locale), locale);
        }
        evtg evtgVar = dtokVar.c;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : evtgVar) {
            dtog dtogVar = ((dtoh) obj).c;
            if (dtogVar == null) {
                dtogVar = dtog.a;
            }
            evtg evtgVar2 = dtogVar.b;
            evtgVar2.getClass();
            if (!evtgVar2.isEmpty()) {
                Iterator<E> it = evtgVar2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (linkedHashMap.containsKey((String) it.next())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            dtns dtnsVar = ((dtoh) it2.next()).d;
            if (dtnsVar == null) {
                dtnsVar = dtns.a;
            }
            arrayList2.add(dtnsVar);
        }
        return eork.i(fcva.aq(arrayList2));
    }
}
