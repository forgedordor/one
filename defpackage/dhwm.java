package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwm implements Closeable, dhwe {
    private static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor");
    private final fdht b;
    private final dhwb c;

    public dhwm(fdht fdhtVar, dhwb dhwbVar) {
        dhwbVar.getClass();
        this.b = fdhtVar;
        this.c = dhwbVar;
    }

    @Override // defpackage.dhwe
    public final dhwj a(dhuu dhuuVar) {
        fdhu fdhuVar;
        dhvp dhvpVar;
        dhyq dhyqVar;
        dhyq dhyqVar2;
        dhyq dhyqVar3;
        dhyq dhyqVar4;
        dhwb dhwbVar = this.c;
        List<dhpe> list = dhwbVar.a;
        fdht fdhtVar = this.b;
        fdhr fdhrVarA = fdhtVar.a();
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (dhpe dhpeVar : list) {
            arrayList.add(new dhwg(new fdhu(dhpeVar.a(dhuuVar), fdhtVar.a().a()), dhpeVar.a));
        }
        List list2 = dhwbVar.c;
        ArrayList arrayList2 = new ArrayList(fcva.p(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new fdhu(((dhty) it.next()).a(dhuuVar), fdhtVar.a().a()));
        }
        dhyr dhyrVar = dhwbVar.b;
        if (dhyrVar != null) {
            fdhr fdhrVarA2 = fdhtVar.a();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                dhtu dhtuVar = (dhtu) ((fdhu) it2.next()).a;
                if (dhtuVar != null) {
                    arrayList3.add(dhtuVar);
                }
            }
            fdhuVar = new fdhu(dhyrVar.b(dhuuVar, arrayList, arrayList3), fdhrVarA2.a());
        } else {
            fdhuVar = null;
        }
        if (fdhuVar == null || (dhyqVar4 = (dhyq) fdhuVar.a) == null || (dhvpVar = dhyqVar4.a) == null) {
            dhvpVar = new dhvp("NOT_AVAILABLE", dhun.e, 4);
        }
        fdhu fdhuVar2 = new fdhu(new dhwi(dhvpVar, fcva.ah(fcva.ah(arrayList, (fdhuVar == null || (dhyqVar3 = (dhyq) fdhuVar.a) == null) ? fcvo.a : fcva.b(new dhwg(new dhpa(null), fdhuVar.b, new dhpd("tartarus", "v0"), dhyqVar3.b))), (fdhuVar == null || (dhyqVar2 = (dhyq) fdhuVar.a) == null) ? fcvo.a : dhyqVar2.d), (fdhuVar == null || (dhyqVar = (dhyq) fdhuVar.a) == null) ? fcvo.a : dhyqVar.c), fdhrVarA.a());
        dhwi dhwiVar = (dhwi) fdhuVar2.a;
        dhwj dhwjVar = new dhwj(dhwiVar.a, fdhuVar2.b, dhwiVar.b, dhwiVar.c, dhwbVar.d, dhuo.b);
        ekrg ekrgVar = a;
        ((ekrd) ekrgVar.h().h("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor", "classify", 106, "MoiraiExecutor.kt")).q("Classification performed");
        ((ekrd) ekrgVar.e().h("com/google/android/libraries/abuse/hades/moirai/service/MoiraiExecutor", "classify", 110, "MoiraiExecutor.kt")).D("Protection token is %s, classification verdict is %s", eldz.h.f().j(dhwjVar.e.I()), dhwjVar.a);
        return dhwjVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }
}
