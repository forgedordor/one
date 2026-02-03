package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebmm {
    public ebmi a;

    protected final ebmj a() throws ebml {
        String strE;
        this.a.a(4095);
        ebmi ebmiVar = this.a;
        ebmq ebmqVar = ebmiVar.e;
        ebmiVar.h();
        try {
            boolean z = false;
            if (this.a.o(0) != '=') {
                return new ebmj(ebmqVar.a, null);
            }
            this.a.q(1);
            this.a.h();
            if (this.a.o(0) == '\"') {
                strE = this.a.e();
                z = true;
            } else {
                this.a.a(4095);
                strE = this.a.e.a;
            }
            ebmj ebmjVar = new ebmj(ebmqVar.a, strE);
            if (z) {
                ebmjVar.b();
            }
            return ebmjVar;
        } catch (ebml unused) {
            return new ebmj(ebmqVar.a, null);
        }
    }
}
