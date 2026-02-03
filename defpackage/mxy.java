package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxy extends Exception {
    public final int a;
    public final boolean b;
    public final mau c;

    public mxy(int i, mau mauVar, boolean z) {
        super(a.g(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = mauVar;
    }
}
