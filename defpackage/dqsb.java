package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqsb {
    public static final dqsb a = new dqsb(null);
    public static final dqsb b = new dqsb("$EXEMPT_FOR_TEST$");
    public static final dqsb c = new dqsb("$EXEMPT_INTERNAL$");
    private final String d;
    private final dqsb e;
    private final String f;

    public dqsb(dqsb dqsbVar, String str) {
        this.d = "";
        this.e = dqsbVar;
        this.f = str;
    }

    public final dzis a() {
        dqsb dqsbVar = this.e;
        return dqsbVar != null ? dqsbVar.a() : new dziu(this.d);
    }

    public final Object b(dqsa dqsaVar) {
        return dqsaVar.a(this.d);
    }

    public final boolean c() {
        String str = this.d;
        if (str != null && str.length() != 0) {
            return false;
        }
        dqsb dqsbVar = this.e;
        return dqsbVar == null || dqsbVar.c();
    }

    public final String toString() {
        dqsb dqsbVar = this.e;
        return String.valueOf(dqsbVar != null ? dqsbVar.toString() : this.d).concat(ejwk.b(this.f));
    }

    public dqsb(String str, String str2) {
        this.d = str;
        this.e = null;
        this.f = str2;
    }

    public dqsb(String str) {
        this(str, (String) null);
    }
}
