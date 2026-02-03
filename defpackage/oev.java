package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oev {
    public int a;
    private int b;
    private int c;

    public oev() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public final oew a() {
        return new oew(this.a, this.b, this.c);
    }

    public final void b(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public oev(oew oewVar) {
        this.a = oewVar.b;
        this.b = oewVar.d;
        this.c = oewVar.e;
    }
}
