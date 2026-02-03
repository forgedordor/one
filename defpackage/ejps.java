package defpackage;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.temporal.TemporalAdjusters;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejps {
    public static final Integer b(Integer num, Integer num2, fdat fdatVar) {
        return (num == null || num2 == null || fdbq.f(num, num2)) ? num2 : (Integer) fdatVar.a(num, num2);
    }

    public static /* synthetic */ Integer c(ejps ejpsVar, Integer num, Integer num2) {
        return b(num, num2, new ejph(ejpsVar));
    }

    public static final int d(int i) throws ejpc {
        if (i > 24 || i < 0) {
            throw new ejpc("Number can not be interpreted as an hour");
        }
        return i < 10 ? i + 12 : i;
    }

    private static final Integer e(ezcl ezclVar, LocalDateTime localDateTime, fdap fdapVar, fdap fdapVar2, fdap fdapVar3) throws ejpc {
        Integer num = ((Boolean) fdapVar.invoke(ezclVar)).booleanValue() ? (Integer) fdapVar2.invoke(ezclVar) : null;
        if ((ezclVar.b & 128) != 0) {
            ezbz ezbzVar = ezclVar.k;
            if (ezbzVar == null) {
                ezbzVar = ezbz.a;
            }
            Integer num2 = (Integer) fdapVar3.invoke(localDateTime.plusDays(ezbzVar.b));
            if (num != null && !fdbq.f(num, num2)) {
                throw new ejpc("Found multiple units");
            }
            num = num2;
        }
        if ((ezclVar.b & 64) == 0) {
            return num;
        }
        ezbz ezbzVar2 = ezclVar.j;
        if (ezbzVar2 == null) {
            ezbzVar2 = ezbz.a;
        }
        DayOfWeek dayOfWeekOf = DayOfWeek.of(ezbzVar2.b);
        dayOfWeekOf.getClass();
        LocalDateTime localDateTimeF = localDateTime.f(TemporalAdjusters.next(dayOfWeekOf));
        Integer num3 = (Integer) fdapVar3.invoke(localDateTimeF != null ? localDateTimeF.minusDays(1L) : null);
        if (num == null || fdbq.f(num, num3)) {
            return num3;
        }
        throw new ejpc("Found multiple units");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional a(defpackage.ejqg r17, j$.time.LocalDateTime r18) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejps.a(ejqg, j$.time.LocalDateTime):j$.util.Optional");
    }
}
