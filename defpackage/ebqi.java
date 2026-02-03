package defpackage;

import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqi extends ebpx {
    public ebqi(ebpu ebpuVar) {
        this.a = ebpuVar;
        this.a.j("sip_urlLexer");
    }

    private final ebmk j() throws ebml {
        ebmj ebmjVar;
        String strConcat;
        ebmk ebmkVar = new ebmk();
        while (true) {
            String strL = l();
            if (strL.equalsIgnoreCase("phone-context")) {
                this.a.a(61);
                char cO = this.a.o(0);
                if (cO == '+') {
                    this.a.q(1);
                    strConcat = "+".concat(k());
                } else {
                    if (!ebmo.t(cO)) {
                        throw new ebml("Invalid phone-context:" + cO);
                    }
                    strConcat = this.a.a(4095).a;
                }
                ebmjVar = new ebmj("phone-context", strConcat);
            } else if (this.a.o(0) == '=') {
                this.a.q(1);
                ebmjVar = new ebmj(strL, l());
            } else {
                ebmjVar = new ebmj(strL, "");
            }
            ebmkVar.g(ebmjVar);
            if (this.a.o(0) != ';') {
                return ebmkVar;
            }
            this.a.q(1);
        }
    }

    private final String k() throws ebml {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            if (!this.a.r()) {
                break;
            }
            char cO = this.a.o(0);
            if (Character.isDigit(cO) || cO == '-' || cO == '.' || cO == '(' || cO == ')') {
                this.a.q(1);
                stringBuffer.append(cO);
                i++;
            } else if (i <= 0) {
                throw f("unexpected " + cO);
            }
        }
        return stringBuffer.toString();
    }

    private final String l() {
        StringBuffer stringBuffer = new StringBuffer();
        while (this.a.r()) {
            char cO = this.a.o(0);
            if (cO != '[' && cO != ']' && cO != '/' && cO != ':' && cO != '&' && cO != '+' && cO != '$' && !o(cO)) {
                if (!n()) {
                    break;
                }
                String strM = this.a.m();
                this.a.q(3);
                stringBuffer.append(strM);
            } else {
                stringBuffer.append(cO);
                this.a.q(1);
            }
        }
        return stringBuffer.toString();
    }

    private final String m() {
        StringBuffer stringBuffer = new StringBuffer();
        while (this.a.r()) {
            char cO = this.a.o(0);
            if (!o(cO) && cO != '&' && cO != '?' && cO != '+' && cO != '$' && cO != '#' && cO != '/' && cO != ',' && cO != ';' && cO != '=') {
                if (!n()) {
                    break;
                }
                String strM = this.a.m();
                this.a.q(3);
                stringBuffer.append(strM);
            } else {
                stringBuffer.append(cO);
                this.a.q(1);
            }
        }
        return stringBuffer.toString();
    }

    private final boolean n() {
        try {
            char cO = this.a.o(0);
            char cO2 = this.a.o(1);
            char cO3 = this.a.o(2);
            if (cO == '%' && ebmo.u(cO2)) {
                if (ebmo.u(cO3)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean o(char c) {
        return ebmo.s(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.' || c == '!' || c == '~' || c == '*' || c == '\'' || c == '(' || c == ')';
    }

    public final eblx b() {
        return c(true);
    }

    public final eblx c(boolean z) throws ebml {
        String strL;
        eblx eblxVar = new eblx();
        this.a.a(2051);
        char c = ':';
        this.a.a(58);
        eblxVar.e = "SIP".toLowerCase(Locale.US);
        int i = this.a.g;
        char c2 = '$';
        char c3 = '&';
        try {
            try {
                String strM = m();
                this.a.o(0);
                this.a.a(58);
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    char cO = this.a.o(0);
                    if (!o(cO) && cO != c3 && cO != '=' && cO != '+' && cO != '$' && cO != ',') {
                        if (!n()) {
                            break;
                        }
                        stringBuffer.append(this.a.m());
                        this.a.q(3);
                    } else {
                        stringBuffer.append(cO);
                        this.a.q(1);
                    }
                    c3 = '&';
                }
                String string = stringBuffer.toString();
                this.a.a(64);
                ebmi ebmiVar = this.a;
                ebmm ebmmVar = new ebmm();
                ebmmVar.a = ebmiVar;
                ebmiVar.j("charLexer");
                ebmg ebmgVarA = ebmf.a(ebmmVar);
                eblxVar.k(strM);
                if (eblxVar.a == null) {
                    eblxVar.a = new eblw();
                }
                eblw eblwVar = eblxVar.a;
                if (eblwVar.b == null) {
                    eblwVar.b = new ebmb();
                }
                eblwVar.b.b = string;
                eblxVar.g(ebmgVarA);
            } catch (ebml unused) {
                this.a.g = i;
                ebmi ebmiVar2 = this.a;
                ebmm ebmmVar2 = new ebmm();
                ebmmVar2.a = ebmiVar2;
                ebmiVar2.j("charLexer");
                eblxVar.g(ebmf.a(ebmmVar2));
            }
        } catch (ebml unused2) {
            this.a.g = i;
            String strM2 = m();
            this.a.a(64);
            ebmi ebmiVar3 = this.a;
            ebmm ebmmVar3 = new ebmm();
            ebmmVar3.a = ebmiVar3;
            ebmiVar3.j("charLexer");
            ebmg ebmgVarA2 = ebmf.a(ebmmVar3);
            eblxVar.k(strM2);
            eblxVar.g(ebmgVarA2);
        }
        if (z) {
            this.a.j("charLexer");
            while (this.a.r() && this.a.o(0) == ';') {
                this.a.q(1);
                String strL2 = l();
                if (this.a.o(0) == '=') {
                    this.a.q(1);
                    strL = l();
                } else {
                    strL = null;
                }
                eblxVar.b.g(new ebmj(strL2, strL));
            }
            if (this.a.r()) {
                char c4 = '?';
                if (this.a.o(0) == '?') {
                    this.a.q(1);
                    while (this.a.r()) {
                        String strP = this.a.p('=');
                        this.a.q(1);
                        StringBuffer stringBuffer2 = new StringBuffer();
                        while (this.a.r()) {
                            char cO2 = this.a.o(0);
                            if (cO2 != '+' && cO2 != c4 && cO2 != c && cO2 != '@' && cO2 != '[' && cO2 != ']' && cO2 != '/' && cO2 != c2 && cO2 != '_' && cO2 != '-' && cO2 != '\"' && cO2 != '!' && cO2 != '~' && cO2 != '*' && cO2 != '.' && cO2 != '(' && cO2 != ')' && !ebmo.s(cO2) && !Character.isDigit(cO2)) {
                                if (cO2 != '%') {
                                    break;
                                }
                                StringBuffer stringBuffer3 = new StringBuffer();
                                char cO3 = this.a.o(0);
                                char cO4 = this.a.o(1);
                                char cO5 = this.a.o(2);
                                if (cO3 != '%' || !ebmo.u(cO4) || !ebmo.u(cO5)) {
                                    throw f("escaped");
                                }
                                this.a.q(3);
                                stringBuffer3.append('%');
                                stringBuffer3.append(cO4);
                                stringBuffer3.append(cO5);
                                stringBuffer2.append(stringBuffer3.toString());
                            } else {
                                this.a.q(1);
                                stringBuffer2.append(cO2);
                            }
                            c4 = '?';
                            c = ':';
                            c2 = '$';
                        }
                        eblxVar.c.g(new ebmj(strP, stringBuffer2.toString()));
                        if (this.a.r() && this.a.o(0) != '&') {
                            break;
                        }
                        this.a.q(1);
                        c4 = '?';
                        c = ':';
                        c2 = '$';
                    }
                }
            }
        }
        return eblxVar;
    }

    public final ebly d() throws ebml {
        eblz eblzVar;
        this.a.a(2105);
        this.a.a(58);
        this.a.j("charLexer");
        char cO = this.a.o(0);
        if (cO == '+') {
            eblzVar = new eblz();
            eblzVar.a = true;
            this.a.a(43);
            eblzVar.b = k();
            if (this.a.r() && this.a.o(0) == ';') {
                this.a.q(1);
                eblzVar.c = j();
            }
        } else {
            if (!ebmo.s(cO) && !Character.isDigit(cO) && cO != '-' && cO != '*' && cO != '.' && cO != '(' && cO != ')' && cO != '#') {
                throw f("unexpected char " + cO);
            }
            eblzVar = new eblz();
            eblzVar.a = false;
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            while (true) {
                if (!this.a.r()) {
                    break;
                }
                char cO2 = this.a.o(0);
                if (cO2 != '*' && cO2 != '#' && cO2 != '-' && cO2 != '.' && cO2 != '(') {
                    if (cO2 == ')') {
                        cO2 = ')';
                    } else if (!Character.isDigit(cO2)) {
                        if (i <= 0) {
                            throw f("unexepcted " + cO2);
                        }
                    }
                }
                this.a.q(1);
                stringBuffer.append(cO2);
                i++;
            }
            eblzVar.b = stringBuffer.toString();
            if (this.a.r() && ((ebmq) this.a.g(1).elementAt(0)).b == 59) {
                this.a.q(1);
                eblzVar.c = j();
            }
        }
        ebly eblyVar = new ebly();
        eblyVar.a = eblzVar;
        return eblyVar;
    }

    public final ebma e() {
        return i(true);
    }

    public final ebma i(boolean z) {
        Vector vectorG = this.a.g(2);
        ebmq ebmqVar = (ebmq) vectorG.elementAt(0);
        ebmq ebmqVar2 = (ebmq) vectorG.elementAt(1);
        int i = ebmqVar.b;
        if (i == 2051) {
            if (ebmqVar2.b == 58) {
                return c(z);
            }
            throw f("Expecting ':'");
        }
        if (i == 2105) {
            if (ebmqVar2.b == 58) {
                return d();
            }
            throw f("Expecting ':'");
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String strB = null;
            try {
                char cO = this.a.o(0);
                if (o(cO) || cO == ';' || cO == '/' || cO == '?' || cO == ':' || cO == '@' || cO == '&' || cO == '+' || cO == '$' || cO == '=' || cO == ',') {
                    this.a.q(1);
                    strB = ebmi.b(cO);
                } else if (n()) {
                    String strM = this.a.m();
                    this.a.q(3);
                    strB = strM;
                }
            } catch (Exception unused) {
            }
            if (strB == null) {
                try {
                    return new ebma(stringBuffer.toString());
                } catch (ebml e) {
                    throw f(e.getMessage());
                }
            }
            stringBuffer.append(strB);
        }
    }

    public ebqi(String str) {
        this.a = new ebpu("sip_urlLexer", str);
    }
}
