package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jec {
    public icr a;
    public int b;
    public hum c;
    public hum d;
    public boolean e;
    final /* synthetic */ jee f;

    public jec(jee jeeVar, icr icrVar, int i, hum humVar, hum humVar2, boolean z) {
        this.f = jeeVar;
        this.a = icrVar;
        this.b = i;
        this.c = humVar;
        this.d = humVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        hum humVar = this.c;
        int i3 = this.b;
        return jeg.a((icq) humVar.a[i + i3], (icq) this.d.a[i3 + i2]) != 0;
    }
}
