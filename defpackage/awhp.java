package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class awhp implements awhe {
    public static awho d() {
        awhm awhmVar = new awhm();
        awhmVar.c(false);
        return awhmVar;
    }

    public static awhp e() {
        return d().d();
    }

    @Override // defpackage.awhe
    public final String a(String str) {
        return (String) b().get(str);
    }

    public abstract ekgp b();

    public abstract boolean c();

    public final boolean f(String str) {
        return b().containsKey(str);
    }

    public final boolean g() {
        return f("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im") || f("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }

    public final boolean h() {
        return f("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im");
    }

    public final boolean i() {
        return f("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
    }
}
