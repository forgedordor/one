package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ack {
    public final fdap a;
    private final int b;
    private final int c;

    public ack(int i, int i2, fdap fdapVar) {
        this.b = i;
        this.c = i2;
        this.a = fdapVar;
    }

    public final int a(boolean z) {
        return z ? this.c : this.b;
    }
}
