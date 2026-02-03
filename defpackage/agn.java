package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agn {
    public agp a;
    public agp b;
    public agp c;
    private final String d;

    public agn(ago agoVar) {
        this.a = new agp(0, 0);
        this.b = new agp(-1, -1);
        this.c = new agp(0, 0);
        lcg.i(agoVar);
        this.d = agoVar.a;
        this.a = agoVar.d.a;
        this.b = new agp(agoVar.b, agoVar.c);
        this.c = agoVar.d.b;
    }

    public final ago a() {
        agq agqVar = new agq(this.a, this.c);
        agp agpVar = this.a;
        int i = agpVar.a;
        int i2 = agpVar.b;
        agp agpVar2 = this.b;
        int i3 = agpVar2.a;
        int i4 = agpVar2.b;
        agp agpVar3 = this.c;
        int i5 = agpVar3.a;
        int i6 = agpVar3.b;
        return new ago(this.d, i3, i4, agqVar);
    }

    public agn(String str) {
        this.a = new agp(0, 0);
        this.b = new agp(-1, -1);
        this.c = new agp(0, 0);
        lcg.i(str);
        this.d = str;
    }
}
