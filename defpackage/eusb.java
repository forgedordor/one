package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eusb {
    /* JADX WARN: Multi-variable type inference failed */
    public static String a(exbe exbeVar) {
        exbe exbeVar2 = (exbe) ((exbd) exbeVar.toBuilder()).build();
        if ((exbeVar.b & 4) != 0) {
            exbd exbdVar = (exbd) exbe.a.createBuilder();
            exbc exbcVar = exbeVar.e;
            if (exbcVar == null) {
                exbcVar = exbc.a;
            }
            int i = exbcVar.b;
            if ((i & 1) == 0 || (i & 2) == 0) {
                throw new IllegalArgumentException("Could not parse place id into a proto");
            }
            qmz qmzVarA = new qna(exbcVar.c, exbcVar.d).a();
            exbb exbbVar = (exbb) exbc.a.createBuilder();
            double dA = qmzVarA.a();
            exbbVar.copyOnWrite();
            exbc exbcVar2 = (exbc) exbbVar.instance;
            exbcVar2.b |= 1;
            exbcVar2.c = dA;
            double dB = qmzVarA.b();
            exbbVar.copyOnWrite();
            exbc exbcVar3 = (exbc) exbbVar.instance;
            exbcVar3.b |= 2;
            exbcVar3.d = dB;
            exbc exbcVar4 = (exbc) exbbVar.build();
            exbdVar.copyOnWrite();
            exbe exbeVar3 = (exbe) exbdVar.instance;
            exbcVar4.getClass();
            exbeVar3.e = exbcVar4;
            exbeVar3.b |= 4;
            exbeVar2 = (exbe) exbdVar.build();
        }
        byte[] byteArray = exbeVar2.toByteArray();
        if (c(exbeVar2) && b(exbeVar2, byteArray)) {
            return eldz.f.g().j(byteArray);
        }
        throw new IllegalArgumentException("The place id is not normalized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(exbe exbeVar, byte[] bArr) {
        exbd exbdVar = (exbd) exbe.a.createBuilder();
        if ((exbeVar.b & 1) != 0) {
            esxk esxkVar = exbeVar.c;
            if (esxkVar == null) {
                esxkVar = esxk.a;
            }
            exbdVar.copyOnWrite();
            exbe exbeVar2 = (exbe) exbdVar.instance;
            esxkVar.getClass();
            exbeVar2.c = esxkVar;
            exbeVar2.b |= 1;
        }
        if (!exbeVar.d.isEmpty()) {
            String str = exbeVar.d;
            exbdVar.copyOnWrite();
            exbe exbeVar3 = (exbe) exbdVar.instance;
            str.getClass();
            exbeVar3.b |= 2;
            exbeVar3.d = str;
        }
        if ((exbeVar.b & 8) != 0) {
            euvi euviVar = exbeVar.f;
            if (euviVar == null) {
                euviVar = euvi.a;
            }
            exbdVar.copyOnWrite();
            exbe exbeVar4 = (exbe) exbdVar.instance;
            euviVar.getClass();
            exbeVar4.f = euviVar;
            exbeVar4.b |= 8;
        }
        if (!exbeVar.g.isEmpty()) {
            String str2 = exbeVar.g;
            exbdVar.copyOnWrite();
            exbe exbeVar5 = (exbe) exbdVar.instance;
            str2.getClass();
            exbeVar5.b |= 16;
            exbeVar5.g = str2;
        }
        if ((exbeVar.b & 4) != 0) {
            exbc exbcVar = exbeVar.e;
            if (exbcVar == null) {
                exbcVar = exbc.a;
            }
            exbdVar.copyOnWrite();
            exbe exbeVar6 = (exbe) exbdVar.instance;
            exbcVar.getClass();
            exbeVar6.e = exbcVar;
            exbeVar6.b |= 4;
        }
        return Arrays.equals(((exbe) exbdVar.build()).toByteArray(), bArr);
    }

    public static boolean c(exbe exbeVar) {
        int i = exbeVar.b;
        if ((i & 4) != 0) {
            if ((i & 1) == 0 && (i & 2) == 0 && (i & 8) == 0 && (i & 16) == 0) {
                exbc exbcVar = exbeVar.e;
                if (exbcVar == null) {
                    exbcVar = exbc.a;
                }
                if ((exbcVar.b & 1) != 0) {
                    exbc exbcVar2 = exbeVar.e;
                    if (exbcVar2 == null) {
                        exbcVar2 = exbc.a;
                    }
                    if ((exbcVar2.b & 2) != 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        if ((i & 2) == 0) {
            if ((i & 8) == 0) {
                if ((i & 1) != 0) {
                    esxk esxkVar = exbeVar.c;
                    if (esxkVar == null) {
                        esxkVar = esxk.a;
                    }
                    if (esxkVar.isInitialized()) {
                        return true;
                    }
                }
                return false;
            }
            euvi euviVar = exbeVar.f;
            if (euviVar == null) {
                euviVar = euvi.a;
            }
            int i2 = euviVar.b;
            if (euvh.a(i2) == 2 || euvh.a(i2) == 1) {
                return false;
            }
        }
        return true;
    }
}
