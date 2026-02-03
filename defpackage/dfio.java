package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfio {
    public final dhgz a;
    public final dgfu b;
    public final Object c = new Object();
    public final dhme d;

    public dfio(dhgz dhgzVar, dgfu dgfuVar, dhme dhmeVar) {
        this.a = dhgzVar;
        this.b = dgfuVar;
        this.d = dhmeVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.a.m();
            this.b.a.deleteFile("capabilities-pidf.xml");
        }
    }
}
