package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpy {
    public static final cpy a = new cpy(new cpx());
    public static final cpy b;
    public static final cpy c;
    public static final cpy d;
    public static final cpy e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final cpv k;

    static {
        cpx cpxVar = new cpx();
        cpxVar.d = 0;
        cpxVar.e = false;
        cpxVar.c = 1;
        cpxVar.a = true;
        cpxVar.b = false;
        b = new cpy(cpxVar);
        cpx cpxVar2 = new cpx();
        cpxVar2.d = 2;
        cpxVar2.e = true;
        cpxVar2.c = 2;
        cpxVar2.b = true;
        cpxVar2.a = false;
        c = new cpy(cpxVar2);
        cpx cpxVar3 = new cpx();
        cpxVar3.d = 0;
        cpxVar3.e = true;
        cpxVar3.c = 2;
        cpxVar3.b = true;
        cpxVar3.a = true;
        cpy cpyVar = new cpy(cpxVar3);
        d = cpyVar;
        cpx cpxVar4 = new cpx(cpyVar);
        cpxVar4.b = true;
        e = new cpy(cpxVar4);
    }

    public cpy(cpx cpxVar) {
        this.j = cpxVar.a;
        this.f = cpxVar.c;
        this.g = cpxVar.d;
        this.i = cpxVar.b;
        this.h = cpxVar.e;
        this.k = cpxVar.f;
    }
}
