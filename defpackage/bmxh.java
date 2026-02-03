package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmxh extends dqpg {
    public long a;
    public long b;
    public String c;
    public String d;
    public epjl e;
    public byte[] f;
    public long g;

    public bmxh() {
        super(bmyr.e());
        this.e = epjl.CMS_DATA_PROVIDER_UNSPECIFIED;
    }

    public final bmxf a() {
        bmxg bmxgVar = new bmxg();
        bmxgVar.aD(aB());
        bmxgVar.a = this.a;
        bmxgVar.b = this.b;
        bmxgVar.c = this.c;
        bmxgVar.d = this.d;
        bmxgVar.e = this.e;
        bmxgVar.f = this.f;
        bmxgVar.g = this.g;
        bmxgVar.cM = aC();
        return bmxgVar;
    }

    public final void b(epjl epjlVar) {
        int i = this.aB;
        if (i < 59660) {
            dqru.x("cms_data_provider_type", i);
        }
        aE(4);
        this.e = epjlVar;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(long j) {
        aE(1);
        this.b = j;
    }

    public final void f(long j) {
        aE(6);
        this.g = j;
    }

    public final void g(byte[] bArr) {
        aE(5);
        this.f = bArr;
    }
}
