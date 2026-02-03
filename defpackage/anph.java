package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anph {
    private final cqtp a;
    private final eosc b;

    public anph(cqtp cqtpVar, eosc eoscVar) {
        this.a = cqtpVar;
        this.b = eoscVar;
    }

    public final anpg a(anpj anpjVar) {
        return anpjVar instanceof anpg ? (anpg) anpjVar : new anpg(this.a, this.b, anpjVar);
    }
}
