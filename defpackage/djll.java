package defpackage;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djll {
    final /* synthetic */ djml a;

    public djll(djml djmlVar) {
        this.a = djmlVar;
    }

    public final boolean a(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(ZoneOffset.UTC).toLocalDate();
        localDate.getClass();
        return ((Boolean) this.a.e.invoke(localDate)).booleanValue();
    }

    public final boolean b(int i) {
        return ((Boolean) this.a.d.invoke(Integer.valueOf(i))).booleanValue();
    }
}
