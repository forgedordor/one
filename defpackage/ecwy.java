package defpackage;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecwy implements Callable {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Map map = etdt.a;
        ArrayList arrayList = new ArrayList();
        for (Integer num : map.keySet()) {
            int iIntValue = num.intValue();
            Iterator it = ((List) map.get(num)).iterator();
            while (it.hasNext()) {
                String str = ((etdn) it.next()).eW;
                Locale localeBuild = new Locale.Builder().setRegion(str).build();
                ecwv ecwvVar = (ecwv) ecww.a.createBuilder();
                String displayCountry = localeBuild.getDisplayCountry();
                ecwvVar.copyOnWrite();
                ecww ecwwVar = (ecww) ecwvVar.instance;
                displayCountry.getClass();
                ecwwVar.b = displayCountry;
                ecwvVar.copyOnWrite();
                ecww ecwwVar2 = (ecww) ecwvVar.instance;
                str.getClass();
                ecwwVar2.c = str;
                ecwvVar.copyOnWrite();
                ((ecww) ecwvVar.instance).d = iIntValue;
                arrayList.add((ecww) ecwvVar.build());
            }
        }
        final Collator collator = Collator.getInstance();
        Collections.sort(arrayList, new Comparator() { // from class: ecwx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return collator.compare(((ecww) obj).b, ((ecww) obj2).b);
            }
        });
        return arrayList;
    }
}
