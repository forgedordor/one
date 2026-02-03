package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agkm implements ejop {
    private final cogw a;
    private final List b;
    private final List c;
    private final int d;
    private final int e;

    public agkm(cogw cogwVar, List list, List list2, int i, int i2) {
        this.a = cogwVar;
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.ejop
    public final ArrayList a(ezcy ezcyVar, Locale locale) {
        locale.getClass();
        ArrayList arrayList = new ArrayList();
        ezgm ezgmVar = ezcyVar.o;
        if (ezgmVar == null) {
            ezgmVar = ezgm.a;
        }
        if (ezgmVar.b > 0) {
            ezgm ezgmVar2 = ezcyVar.o;
            if (ezgmVar2 == null) {
                ezgmVar2 = ezgm.a;
            }
            Instant instantOfEpochMilli = Instant.ofEpochMilli(ezgmVar2.b);
            instantOfEpochMilli.getClass();
            cogw cogwVar = this.a;
            ZonedDateTime zonedDateTimeE = tep.e(instantOfEpochMilli);
            Instant instantB = tep.b(cogwVar);
            Instant instantPlus = instantB.plus(Duration.ofDays(1L));
            ZonedDateTime zonedDateTimeE2 = tep.e(instantB);
            instantPlus.getClass();
            if (fdbq.f(zonedDateTimeE, tep.e(instantPlus))) {
                ezgm ezgmVar3 = ezcyVar.o;
                if (ezgmVar3 == null) {
                    ezgmVar3 = ezgm.a;
                }
                arrayList.add(agkl.a(ezgmVar3.b));
                return arrayList;
            }
            if (fdbq.f(zonedDateTimeE, zonedDateTimeE2)) {
                List list = this.c;
                List listAm = fcva.am(fcva.ah(fcva.am(fcva.c(list), this.e), fcva.c(this.b)), this.d);
                ArrayList arrayList2 = new ArrayList(fcva.p(listAm, 10));
                Iterator it = listAm.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ejor) it.next()).b(instantPlus, ezar.SUGGESTION_TAG_BIRTHDAY));
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ejop
    public final /* synthetic */ void b() {
    }
}
