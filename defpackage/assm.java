package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class assm extends Exception {
    public final boolean a;
    public int b;

    public assm(String str) {
        super(str);
        this.b = -1;
        this.a = false;
    }

    public assm(String str, int i, boolean z) {
        super(str);
        this.a = z;
        this.b = i;
    }

    public assm(String str, Throwable th) {
        this(str, th, false);
    }

    public assm(String str, Throwable th, boolean z) {
        super(str, th);
        this.b = -1;
        this.a = z;
    }
}
