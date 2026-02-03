package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qub implements qto {
    public final qtf a;
    public final boolean b;
    private final String c;
    private final int d;

    public qub(String str, int i, qtf qtfVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = qtfVar;
        this.b = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpn(qofVar, quhVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
