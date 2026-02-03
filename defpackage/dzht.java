package defpackage;

import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzht implements dzhw {
    private final fegm a;
    private final boolean b;
    private final Instant c;

    private dzht(fegm fegmVar, boolean z, Instant instant) {
        this.a = fegmVar;
        this.b = z;
        this.c = instant;
    }

    public static dzht b(fegm fegmVar) {
        Instant instant = Instant.EPOCH;
        evvp evvpVar = fegmVar.g;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        Instant instantD = evwz.d(evvpVar);
        HashSet hashSet = new HashSet();
        for (fegx fegxVar : fegmVar.k) {
            evrj evrjVar = fegxVar.f;
            if (evrjVar == null) {
                evrjVar = evrj.a;
            }
            Instant instantPlus = instantD.plus(evwz.c(evrjVar));
            if (true == instantPlus.isAfter(instant)) {
                instant = instantPlus;
            }
            int i = fegxVar.c;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(fegxVar.e));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(fegxVar.e));
            }
        }
        return new dzht(fegmVar, !hashSet.isEmpty(), instant);
    }

    @Override // defpackage.dzhw
    public final long a() {
        return this.a.getSerializedSize();
    }

    @Override // defpackage.dzhw
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dzht dzhtVar = (dzht) obj;
        boolean z = dzhtVar.b;
        boolean z2 = this.b;
        return z2 != z ? !z2 ? 1 : -1 : dzhtVar.c.compareTo(this.c);
    }
}
