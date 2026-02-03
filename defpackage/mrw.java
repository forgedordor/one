package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrw {
    public boolean a;
    public mta b;
    public int c;
    public boolean d;
    public int e;

    public mrw(mta mtaVar) {
        this.b = mtaVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }
}
