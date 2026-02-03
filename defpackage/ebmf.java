package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmf {
    public static final ebmg a(ebmm ebmmVar) throws ebml {
        StringBuilder sb = new StringBuilder();
        if (ebmmVar.a.o(0) == '[') {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                if (!ebmmVar.a.r()) {
                    break;
                }
                char cO = ebmmVar.a.o(0);
                if (ebmo.u(cO)) {
                    ebmmVar.a.q(1);
                    sb2.append(cO);
                } else if (cO == '.' || cO == ':' || cO == '[') {
                    ebmmVar.a.q(1);
                    sb2.append(cO);
                } else if (cO == ']') {
                    ebmmVar.a.q(1);
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
            }
            ebmi ebmiVar = ebmmVar.a;
            String strValueOf = String.valueOf(ebmiVar.f);
            int i = ebmiVar.g;
            throw new ebml(strValueOf.concat(": Illegal Host name "));
        }
        sb.append(b(ebmmVar));
        while (ebmmVar.a.r() && ebmmVar.a.o(0) == '.') {
            ebmmVar.a.q(1);
            String strB = b(ebmmVar);
            sb.append(".");
            sb.append(strB);
        }
        String string = sb.toString();
        if (string.equals("")) {
            ebmi ebmiVar2 = ebmmVar.a;
            String strValueOf2 = String.valueOf(ebmiVar2.f);
            int i2 = ebmiVar2.g;
            throw new ebml(strValueOf2.concat(": Illegal Host name "));
        }
        ebme ebmeVar = new ebme(string);
        ebmg ebmgVar = new ebmg();
        ebmgVar.a = ebmeVar;
        if (!ebmmVar.a.r() || ebmmVar.a.o(0) != ':') {
            return ebmgVar;
        }
        ebmmVar.a.q(1);
        try {
            ebmgVar.b = Integer.parseInt(ebmmVar.a.d());
            return ebmgVar;
        } catch (NumberFormatException unused) {
            ebmi ebmiVar3 = ebmmVar.a;
            String strValueOf3 = String.valueOf(ebmiVar3.f);
            int i3 = ebmiVar3.g;
            throw new ebml(strValueOf3.concat(" :Error parsing port "));
        }
    }

    protected static final String b(ebmm ebmmVar) {
        StringBuilder sb = new StringBuilder();
        while (ebmmVar.a.r()) {
            char cO = ebmmVar.a.o(0);
            if (!ebmo.s(cO)) {
                if (!Character.isDigit(cO)) {
                    if (cO != '-') {
                        break;
                    }
                    ebmmVar.a.q(1);
                    sb.append('-');
                } else {
                    ebmmVar.a.q(1);
                    sb.append(cO);
                }
            } else {
                ebmmVar.a.q(1);
                sb.append(cO);
            }
        }
        return sb.toString();
    }
}
