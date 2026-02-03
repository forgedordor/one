package defpackage;

import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/backup/analytics/D2DEventLogger");
    public final fdjx b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public tcd(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fdjxVar.getClass();
        fcsuVar3.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.b = fdjxVar;
        this.e = fcsuVar3;
    }

    public static final evqs b(UUID uuid) {
        return evqs.x(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    public static final enoi c(int i, int i2, int i3) {
        enoh enohVar = (enoh) enoi.a.createBuilder();
        enohVar.getClass();
        int iA = cnma.a(i);
        enohVar.copyOnWrite();
        enoi enoiVar = (enoi) enohVar.instance;
        enoiVar.c = iA - 1;
        enoiVar.b |= 1;
        int iA2 = cnma.a(i2);
        enohVar.copyOnWrite();
        enoi enoiVar2 = (enoi) enohVar.instance;
        enoiVar2.d = iA2 - 1;
        enoiVar2.b |= 2;
        int iA3 = cnma.a(i3);
        enohVar.copyOnWrite();
        enoi enoiVar3 = (enoi) enohVar.instance;
        enoiVar3.e = iA3 - 1;
        enoiVar3.b |= 4;
        evsn evsnVarBuild = enohVar.build();
        evsnVarBuild.getClass();
        return (enoi) evsnVarBuild;
    }

    public static /* synthetic */ void d(tcd tcdVar, int i, enoq enoqVar, UUID uuid, dbxl dbxlVar, int i2) {
        enoqVar.getClass();
        auvw.k(tcdVar.b, null, null, new tca(tcdVar, i, enoqVar, uuid, (i2 & 64) != 0 ? null : dbxlVar, (i2 & 128) != 0, null), 3);
    }

    public static /* synthetic */ void e(tcd tcdVar, int i, Duration duration, int i2, int i3, int i4, UUID uuid, dbxl dbxlVar, int i5) {
        boolean z = (i5 & 128) != 0;
        dbxl dbxlVar2 = (i5 & 64) != 0 ? null : dbxlVar;
        int i6 = (i5 & 16) != 0 ? 0 : i4;
        auvw.k(tcdVar.b, null, null, new tcc(tcdVar, i, duration, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, i6, uuid, dbxlVar2, z, null), 3);
    }

    public final fcsu a(boolean z) {
        return (z || !((arjc) this.e.b()).a()) ? this.c : this.d;
    }
}
