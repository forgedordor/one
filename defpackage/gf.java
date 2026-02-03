package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gf {
    int a;
    ea b;
    boolean c;
    int d;
    int e;
    int f;
    int g;
    lvb h;
    lvb i;

    public gf() {
    }

    public gf(int i, ea eaVar) {
        this.a = i;
        this.b = eaVar;
        this.c = false;
        lvb lvbVar = lvb.e;
        this.h = lvbVar;
        this.i = lvbVar;
    }

    public gf(int i, ea eaVar, byte[] bArr) {
        this.a = i;
        this.b = eaVar;
        this.c = true;
        lvb lvbVar = lvb.e;
        this.h = lvbVar;
        this.i = lvbVar;
    }

    public gf(ea eaVar, lvb lvbVar) {
        this.a = 10;
        this.b = eaVar;
        this.c = false;
        this.h = eaVar.Y;
        this.i = lvbVar;
    }

    public gf(gf gfVar) {
        this.a = gfVar.a;
        this.b = gfVar.b;
        this.c = gfVar.c;
        this.d = gfVar.d;
        this.e = gfVar.e;
        this.f = gfVar.f;
        this.g = gfVar.g;
        this.h = gfVar.h;
        this.i = gfVar.i;
    }
}
