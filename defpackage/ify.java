package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ify {
    public final fdae a;
    public final fdae b;
    public final cva c;
    public final cva d;
    public boolean e;
    private final fdap f;

    public ify(fdap fdapVar, fdae fdaeVar, fdae fdaeVar2) {
        this.f = fdapVar;
        this.a = fdaeVar;
        this.b = fdaeVar2;
        int i = cvs.a;
        this.c = new cva((byte[]) null);
        this.d = new cva((byte[]) null);
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public final void a(cva cvaVar, Object obj) {
        if (cvaVar.g(obj)) {
            b();
        }
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.f.invoke(new ifx(this));
        this.e = true;
    }
}
