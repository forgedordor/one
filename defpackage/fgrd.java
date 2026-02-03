package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgrd {
    final String b;
    StringBuilder a = fgre.e();
    boolean c = true;

    public fgrd(String str) {
        this.b = str;
    }

    public final void a(Object obj) {
        fgqz.g(this.a);
        if (!this.c) {
            this.a.append(this.b);
        }
        this.a.append(obj);
        this.c = false;
    }
}
