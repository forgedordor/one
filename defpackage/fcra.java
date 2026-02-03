package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcra {
    public final fcra[] a;
    public final int b;
    public final int c;

    public fcra() {
        this.a = new fcra[256];
        this.b = 0;
        this.c = 0;
    }

    public fcra(int i, int i2) {
        this.a = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }
}
