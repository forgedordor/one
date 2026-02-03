package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdni {
    private final cdmo a;
    private final cdnb b;

    public cdni(cdmo cdmoVar, cdnb cdnbVar) {
        cdmoVar.getClass();
        cdnbVar.getClass();
        this.a = cdmoVar;
        this.b = cdnbVar;
    }

    public final Object a(fcxy fcxyVar) {
        cdmo cdmoVar = this.a;
        return cdmoVar.c() ? Boolean.valueOf(cdmoVar.e()) : this.b.b(fcxyVar);
    }

    public final boolean b() {
        cdmo cdmoVar = this.a;
        if (cdmoVar.c()) {
            return cdmoVar.e();
        }
        cdne cdneVar = (cdne) this.b.b.l();
        if ((cdneVar.b & 1) == 0) {
            return false;
        }
        cdmq cdmqVar = cdneVar.c;
        if (cdmqVar == null) {
            cdmqVar = cdmq.a;
        }
        cdmqVar.getClass();
        return cdnb.c(cdmqVar);
    }
}
