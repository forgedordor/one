package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccev extends dqpg {
    public String a;
    public String b;
    public byte[] c;

    public ccev() {
        super(ccfu.a().M());
    }

    public final ccet a() {
        cceu cceuVar = new cceu();
        cceuVar.aD(aB());
        cceuVar.a = this.a;
        cceuVar.b = this.b;
        cceuVar.c = this.c;
        cceuVar.cM = aC();
        return cceuVar;
    }

    public final void b(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }

    public final void c(String str) {
        aE(1);
        this.b = str;
    }

    public final void d(String str) {
        aE(0);
        this.a = str;
    }
}
