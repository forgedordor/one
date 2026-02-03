package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqj extends ebpt {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        ebmj ebmjVar;
        String strE;
        ebow ebowVar = new ebow();
        this.a.a(2064);
        this.a.h();
        this.a.a(58);
        this.a.h();
        do {
            ebov ebovVar = new ebov();
            this.a.a(4095);
            ebmi ebmiVar = this.a;
            ebmq ebmqVar = ebmiVar.e;
            ebmiVar.h();
            this.a.a(47);
            this.a.h();
            this.a.a(4095);
            this.a.h();
            ebmi ebmiVar2 = this.a;
            ebmq ebmqVar2 = ebmiVar2.e;
            ebmiVar2.h();
            this.a.a(47);
            this.a.h();
            this.a.a(4095);
            this.a.h();
            ebmi ebmiVar3 = this.a;
            ebmq ebmqVar3 = ebmiVar3.e;
            ebmiVar3.h();
            eboh ebohVar = new eboh();
            ebohVar.a = ebmqVar.a;
            ebohVar.b = ebmqVar2.a;
            ebohVar.c = ebmqVar3.a;
            ebovVar.a = ebohVar;
            ebmi ebmiVar4 = this.a;
            ebmm ebmmVar = new ebmm();
            ebmmVar.a = ebmiVar4;
            ebmiVar4.j("charLexer");
            ebovVar.b = ebmf.a(ebmmVar);
            this.a.h();
            while (true) {
                boolean z = false;
                if (this.a.o(0) != ';') {
                    break;
                }
                this.a.a(59);
                this.a.h();
                this.a.a(4095);
                ebmi ebmiVar5 = this.a;
                ebmq ebmqVar4 = ebmiVar5.e;
                ebmiVar5.h();
                try {
                    if (this.a.o(0) == '=') {
                        this.a.q(1);
                        this.a.h();
                        if (ebmqVar4.a.compareToIgnoreCase("received") == 0) {
                            ebmi ebmiVar6 = this.a;
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                try {
                                    char cO = ebmiVar6.o(0);
                                    if (cO == '\n' || cO == ';') {
                                        break;
                                    }
                                    ebmiVar6.q(1);
                                    sb.append(cO);
                                } catch (ebml unused) {
                                    strE = sb.toString();
                                }
                            }
                            strE = sb.toString();
                        } else if (this.a.o(0) == '\"') {
                            strE = this.a.e();
                            z = true;
                        } else {
                            this.a.a(4095);
                            strE = this.a.e.a;
                        }
                        ebmjVar = new ebmj(ebmqVar4.a.toLowerCase(), strE);
                        if (z) {
                            ebmjVar.b();
                        }
                    } else {
                        ebmjVar = new ebmj(ebmqVar4.a.toLowerCase(), null);
                    }
                } catch (ebml unused2) {
                    ebmjVar = new ebmj(ebmqVar4.a, null);
                }
                ebmjVar.d = ebmjVar.a().toLowerCase(Locale.US);
                ebovVar.j(ebmjVar);
                this.a.h();
            }
            if (this.a.o(0) == '(') {
                this.a.j("charLexer");
                this.a.q(1);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char cO2 = this.a.o(0);
                    if (cO2 != ')') {
                        if (cO2 != '\\') {
                            if (cO2 == '\n') {
                                break;
                            }
                            stringBuffer.append(cO2);
                            this.a.q(1);
                        } else {
                            stringBuffer.append(this.a.e.a);
                            this.a.q(1);
                            stringBuffer.append(this.a.e.a);
                            this.a.q(1);
                        }
                    } else {
                        this.a.q(1);
                        break;
                    }
                }
                ebovVar.f = stringBuffer.toString();
            }
            ebowVar.g(ebovVar);
            this.a.h();
            if (this.a.o(0) == ',') {
                this.a.q(1);
                this.a.h();
            }
        } while (this.a.o(0) != '\n');
        this.a.a(10);
        return ebowVar;
    }
}
