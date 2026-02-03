package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlr extends drlq {
    private final String a;
    private final long c;

    public drlr(String str, String str2, int i, long j, long j2) {
        super(str2, i, j);
        this.a = str;
        this.c = j2;
    }

    public final String toString() {
        ejwf ejwfVar = new ejwf("Start");
        a(ejwfVar);
        ejwfVar.a(this.a);
        ejwfVar.e("durationSinceEnqueue", this.c / 1000000.0f);
        return ejwfVar.toString();
    }
}
