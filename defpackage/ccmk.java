package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccmk extends dqpg {
    public String a;
    public String b;
    public byte[] c;

    public ccmk() {
        super(ccni.a().M());
    }

    public final ccmi a() {
        ccmj ccmjVar = new ccmj();
        ccmjVar.aD(aB());
        ccmjVar.a = this.a;
        ccmjVar.b = this.b;
        ccmjVar.c = this.c;
        ccmjVar.cM = aC();
        return ccmjVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }
}
