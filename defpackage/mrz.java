package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrz extends RuntimeException {
    public final int a;

    public mrz(int i) {
        super(i != 1 ? i != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.a = i;
    }
}
