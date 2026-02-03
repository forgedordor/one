package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebpx extends ebmm {
    protected final ebml f(String str) {
        String str2 = this.a.f + ":" + str;
        int i = this.a.g;
        return new ebml(str2);
    }

    protected final String g() throws ebml {
        ebmq ebmqVar = (ebmq) this.a.g(1).elementAt(0);
        int i = ebmqVar.b;
        if (i != 2053 && i != 2054 && i != 2056 && i != 2055 && i != 2052 && i != 2057 && i != 2101 && i != 2102 && i != 4095) {
            throw f("Invalid Method");
        }
        ebmi ebmiVar = this.a;
        ebmiVar.g = ebmiVar.h;
        return ebmqVar.a;
    }

    protected final void h() throws ebml {
        if (!this.a.a(2051).a.equals("SIP")) {
            f("Expecting SIP");
        }
        this.a.a(47);
        if (this.a.a(4095).a.equals("2.0")) {
            return;
        }
        f("Expecting SIP/2.0");
    }
}
