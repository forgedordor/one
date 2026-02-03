package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlp extends drlq {
    final Throwable a;
    private final String c;
    private final long d;

    public drlp(String str, String str2, int i, long j, long j2, Throwable th) {
        super(str2, i, j);
        this.a = th;
        this.c = str;
        this.d = j2;
    }

    public final String toString() {
        ejwf ejwfVar = new ejwf("Finish");
        a(ejwfVar);
        ejwfVar.a(this.c);
        ejwfVar.e("durationSinceStart", this.d / 1000000.0f);
        ejwfVar.a(this.a);
        ejwfVar.c();
        return ejwfVar.toString();
    }
}
