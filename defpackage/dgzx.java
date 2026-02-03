package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgzx {
    public abstract int a();

    public abstract int b();

    public final ekgb c(boolean z) {
        if (e()) {
            return ekgb.p(dhjv.D(null, null, ekgb.r(f() ? z ? "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg" : "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg" : "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session")));
        }
        return ekgb.r("+g.oma.sip-im");
    }

    public final ekgb d() {
        return c(false);
    }

    public final boolean e() {
        return a() == 1;
    }

    public final boolean f() {
        return dfog.E() && b() == 2;
    }
}
