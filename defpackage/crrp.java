package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class crrp {
    public static final cqce a = cqce.g("BugleRcs", "BasePhenotypeHelper");
    static final String[] b = {"ANDROID_MESSAGING", "ANDROID_MESSAGING_PRIMES", "BUGLE_COUNTERS", "CARRIER_SERVICES", "EXPRESSION", "EXPRESSION_COUNTERS", "BUGLE_SPAM", "MESSAGES"};
    public final cqbm c;
    private final Executor d;

    public crrp(cczn ccznVar, cqbm cqbmVar, Executor executor) {
        this.c = cqbmVar;
        this.d = executor;
        ccznVar.a();
    }

    public final void a(String str, ddzs ddzsVar) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.A("Committing for package", str);
        cqbdVarA.r();
        new crro((ddzn) this.c.a(), str).c(this.d, ddzsVar);
    }
}
