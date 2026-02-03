package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxp {
    public final dqtm a;
    public int b;
    public dqwv c;
    public final boolean d;
    public final boolean e;

    public dqxp(dqtm dqtmVar, dqwv dqwvVar, boolean z) {
        this.b = 0;
        this.a = dqtmVar;
        this.c = dqwvVar;
        this.d = z;
        this.e = false;
    }

    public static dqxp b() {
        return new dqxp(null, dqwv.B().a());
    }

    public final dqwj a() {
        return ((dqoy) this.c).v != null ? new dqwj() { // from class: dqxo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((dqoy) this.a.c).v;
            }
        } : dqtm.a(this.b);
    }

    public final void c() {
        this.b++;
    }

    public dqxp(dqtm dqtmVar, dqwv dqwvVar, boolean z, byte[] bArr) {
        this.b = 0;
        this.a = dqtmVar;
        this.c = dqwvVar;
        this.d = false;
        this.e = z;
    }

    public dqxp(dqtm dqtmVar, dqwv dqwvVar) {
        this(dqtmVar, dqwvVar, false, null);
    }
}
