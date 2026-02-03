package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqtc {
    public static final egyj a = new egyb("IMAGE_COMPRESSION_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    public final egzh b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private cmfo f;

    public cqtc(fcsu fcsuVar, egzh egzhVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.e = fcsuVar;
        this.b = egzhVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public static boolean d(long j) {
        return j > ((Long) bxmw.m.e()).longValue();
    }

    public final int a(long j) throws evtj {
        try {
            if (!((arls) this.d.b()).a()) {
                return ((cqsz) b().l()).c;
            }
            if (c()) {
                return (d(j) ? (Integer) cqtd.e.e() : (Integer) cqtd.a.e()).intValue();
            }
            return (d(j) ? (Integer) cqtd.g.e() : (Integer) cqtd.c.e()).intValue();
        } catch (evtj e) {
            ((ains) this.c.b()).c("Bugle.Media.FastImageSending.FailToGetLongDimension.Count");
            throw e;
        }
    }

    public final cmfo b() {
        if (this.f == null) {
            cmgk cmgkVar = (cmgk) this.e.b();
            cmgg cmggVarC = cmgh.c();
            cmggVarC.d(cmfn.IMAGE_COMPRESSION);
            cmggVarC.f(cqsz.a);
            this.f = cmgkVar.a(cmggVarC.a());
        }
        return this.f;
    }

    public final boolean c() {
        return ((cqsz) b().l()).e;
    }
}
