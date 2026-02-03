package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpg {
    public static final eblv a(ebpx ebpxVar) {
        return b(false, ebpxVar);
    }

    public static final eblv b(boolean z, ebpx ebpxVar) throws ebml {
        int i = 0;
        while (ebpxVar.a.r() && ebpxVar.a.o(i) != '<' && ebpxVar.a.o(i) != '\"' && ebpxVar.a.o(i) != ':' && ebpxVar.a.o(i) != '/') {
            if (ebpxVar.a.o(i) == 0) {
                throw ebpxVar.f("unexpected EOL");
            }
            i++;
        }
        if (ebpxVar.a.o(i) != '<' && ebpxVar.a.o(i) != '\"') {
            if (ebpxVar.a.o(i) != ':' && ebpxVar.a.o(i) != '/') {
                throw ebpxVar.f("Bad address spec");
            }
            eblv eblvVar = new eblv();
            ebma ebmaVarI = new ebqi((ebpu) ebpxVar.a).i(z);
            eblvVar.c = 2;
            eblvVar.b = ebmaVarI;
            return eblvVar;
        }
        eblv eblvVar2 = new eblv();
        if (ebpxVar.a.o(0) == '\"') {
            String strE = ebpxVar.a.e();
            if (strE == null) {
                throw new ebml("Name is null");
            }
            eblvVar2.d(strE.trim());
            ebpxVar.a.h();
        }
        if (ebpxVar.a.o(0) == '<') {
            c(eblvVar2, ebpxVar);
            return eblvVar2;
        }
        if (eblvVar2.a != null) {
            ebpxVar.a.j("sip_urlLexer");
            ebpxVar.a.h();
            ebma ebmaVarI2 = new ebqi((ebpu) ebpxVar.a).i(false);
            eblvVar2.c = 1;
            eblvVar2.b = ebmaVarI2;
            ebpxVar.a.h();
            return eblvVar2;
        }
        ebmi ebmiVar = ebpxVar.a;
        int i2 = ebmiVar.g;
        StringBuilder sb = new StringBuilder();
        while (true) {
            char cO = ebmiVar.o(0);
            if (cO == 0) {
                String strValueOf = String.valueOf(ebmiVar.f);
                int i3 = ebmiVar.g;
                ebml ebmlVar = new ebml(strValueOf.concat("unexpected EOL"));
                ebmiVar.g = i2;
                throw ebmlVar;
            }
            if (cO == ' ') {
                ebmiVar.q(1);
                String string = sb.toString();
                ebpxVar.a.h();
                if (ebpxVar.a.o(0) != '<') {
                    throw ebpxVar.f("Bad address spec");
                }
                eblvVar2.d(string);
                c(eblvVar2, ebpxVar);
                return eblvVar2;
            }
            if (cO == '\\') {
                ebmiVar.q(1);
                char cO2 = ebmiVar.o(0);
                if (cO2 == 0) {
                    String strValueOf2 = String.valueOf(ebmiVar.f);
                    int i4 = ebmiVar.g;
                    ebml ebmlVar2 = new ebml(strValueOf2.concat("unexpected EOL"));
                    ebmiVar.g = i2;
                    throw ebmlVar2;
                }
                ebmiVar.q(1);
                sb.append(cO2);
            } else {
                ebmiVar.q(1);
                sb.append(cO);
            }
        }
    }

    private static final void c(eblv eblvVar, ebpx ebpxVar) throws ebml {
        ebpxVar.a.a(60);
        ebpxVar.a.j("sip_urlLexer");
        ebpxVar.a.h();
        ebma ebmaVarE = new ebqi((ebpu) ebpxVar.a).e();
        eblvVar.c = 1;
        eblvVar.b = ebmaVarE;
        ebpxVar.a.h();
        ebpxVar.a.a(62);
    }
}
