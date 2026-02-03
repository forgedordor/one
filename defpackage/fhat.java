package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.net.SocketAddress;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhat {
    public SocketAddress a;
    public SocketAddress b;
    public fgzx c;
    public long d = 900000;
    public fhar e;
    private fgyu f;
    private int g;
    private int h;
    private int i;
    private long j;
    private long k;
    private fgzh l;

    private fhat() {
    }

    public static long a(fgzh fgzhVar) {
        return ((fgzo) fgzhVar).a;
    }

    private final void d() throws fhaq {
        g("server doesn't support IXFR");
        e("falling back to AXFR");
        this.g = 252;
        this.i = 0;
    }

    private final void e(String str) {
        if (fgyz.a("verbose")) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f);
            stringBuffer.append(": ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    private final void f(fgzh fgzhVar) throws fhaq {
        int i = fgzhVar.g;
        switch (this.i) {
            case 0:
                if (i != 6) {
                    g("missing initial SOA");
                }
                this.l = fgzhVar;
                long jA = a(fgzhVar);
                this.j = jA;
                if (this.g == 251) {
                    if (jA >= 4294967295L) {
                        jA = -1;
                    }
                    if (((int) jA) <= 0) {
                        e("up to date");
                        this.i = 7;
                        break;
                    }
                }
                this.i = 1;
                break;
            case 1:
                if (this.g == 251 && i == 6 && a(fgzhVar) == 0) {
                    this.e.b = new ArrayList();
                    e("got incremental response");
                    this.i = 2;
                } else {
                    this.e.a = new ArrayList();
                    this.e.a(this.l);
                    e("got nonincremental response");
                    this.i = 6;
                }
                f(fgzhVar);
                break;
            case 2:
                fhar fharVar = this.e;
                fhas fhasVar = new fhas();
                fhasVar.c.add(fgzhVar);
                a(fgzhVar);
                fharVar.b.add(fhasVar);
                this.i = 3;
                break;
            case 3:
                if (i != 6) {
                    this.e.a(fgzhVar);
                    break;
                } else {
                    this.k = a(fgzhVar);
                    this.i = 4;
                    f(fgzhVar);
                    break;
                }
            case 4:
                fhas fhasVar2 = (fhas) this.e.b.get(r0.size() - 1);
                fhasVar2.b.add(fgzhVar);
                fhasVar2.a = a(fgzhVar);
                this.i = 5;
                break;
            case 5:
                if (i == 6) {
                    long jA2 = a(fgzhVar);
                    if (jA2 != this.j) {
                        if (jA2 == this.k) {
                            this.i = 2;
                            f(fgzhVar);
                            break;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer("IXFR out of sync: expected serial ");
                            stringBuffer.append(this.k);
                            stringBuffer.append(" , got ");
                            stringBuffer.append(jA2);
                            g(stringBuffer.toString());
                        }
                    } else {
                        this.i = 7;
                        break;
                    }
                }
                this.e.a(fgzhVar);
                break;
            case 6:
                if (i == 1) {
                    if (fgzhVar.h == this.h) {
                        i = 1;
                    }
                }
                this.e.a(fgzhVar);
                if (i == 6) {
                    this.i = 7;
                    break;
                }
                break;
            default:
                g("extra data");
                break;
        }
    }

    private static final void g(String str) throws fhaq {
        throw new fhaq(str);
    }

    public final void b() {
        try {
            fgzx fgzxVar = this.c;
            if (fgzxVar != null) {
                fgzxVar.b();
            }
        } catch (IOException unused) {
        }
    }

    public final void c() throws fhaq, fhao {
        fgzh fgzhVarL = fgzh.l(this.f, this.g, this.h);
        fgyi fgyiVar = new fgyi();
        fgyiVar.a.i();
        fgyiVar.d(fgzhVarL, 0);
        if (this.g == 251) {
            fgyu fgyuVar = this.f;
            int i = this.h;
            fgyu fgyuVar2 = fgyu.a;
            fgyiVar.d(new fgzo(fgyuVar, i, fgyuVar2, fgyuVar2), 2);
        }
        this.c.f(fgyiVar.g());
        while (this.i != 7) {
            try {
                fgyi fgyiVar2 = new fgyi(this.c.g());
                fgyiVar2.a.d();
                fgzh[] fgzhVarArrF = fgyiVar2.f(1);
                if (this.i == 0) {
                    int iA = fgyiVar2.a();
                    if (iA != 0) {
                        if (this.g == 251 && iA == 4) {
                            d();
                            c();
                            return;
                        }
                        g(fgzg.b(iA));
                    }
                    fgzh fgzhVarC = fgyiVar2.c();
                    if (fgzhVarC != null && fgzhVarC.g != this.g) {
                        g("invalid question section");
                    }
                    if (fgzhVarArrF.length == 0 && this.g == 251) {
                        d();
                        c();
                        return;
                    }
                }
                for (fgzh fgzhVar : fgzhVarArrF) {
                    f(fgzhVar);
                }
            } catch (IOException e) {
                if (!(e instanceof fhao)) {
                    throw new fhao("Error parsing message");
                }
                throw ((fhao) e);
            }
        }
    }

    public fhat(fgyu fgyuVar, SocketAddress socketAddress) {
        this.b = socketAddress;
        if (fgyuVar.j()) {
            this.f = fgyuVar;
        } else {
            try {
                this.f = fgyu.c(fgyuVar, fgyu.a);
            } catch (fgyv unused) {
                throw new IllegalArgumentException("ZoneTransferIn: name too long");
            }
        }
        this.g = 252;
        this.h = 1;
        this.i = 0;
    }
}
