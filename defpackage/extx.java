package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extx {
    public final byte a;
    public final byte b;

    public extx(int i) {
        this.a = (byte) (i & 224);
        this.b = (byte) (i & 31);
    }

    public final int a() {
        return (this.a >> 5) & 7;
    }
}
