package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebpw extends ebpt {
    protected final void c(ebog ebogVar) throws ebml {
        this.a.h();
        while (this.a.o(0) == ';') {
            this.a.q(1);
            this.a.h();
            ebmj ebmjVarA = a();
            if (this.a.o(0) == '/') {
                ebmjVarA.e = String.valueOf(String.valueOf(ebmjVarA.e)).concat(this.a.p(';'));
            }
            ebogVar.j(ebmjVarA);
            this.a.h();
        }
    }
}
