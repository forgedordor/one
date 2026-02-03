package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extw {
    public static final extv a(InputStream inputStream, exty extyVar) {
        boolean z;
        try {
            extv extvVarB = b(inputStream, extyVar);
            if (z) {
                try {
                    extyVar.close();
                } catch (IOException unused) {
                }
            }
            return extvVarB;
        } finally {
            if (inputStream instanceof ByteArrayInputStream) {
                try {
                    extyVar.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    private static final extv b(InputStream inputStream, exty extyVar) throws extp, extl {
        byte b;
        byte b2;
        boolean z;
        int i;
        boolean z2;
        try {
            extx extxVarB = extyVar.b();
            if (extxVarB == null) {
                throw new extp("Parser being asked to parse an empty input stream");
            }
            try {
                b = extxVarB.b;
                b2 = extxVarB.a;
                z = true;
                i = 0;
            } catch (IOException | RuntimeException e) {
                e = e;
            }
            try {
                if (b2 == -128) {
                    extyVar.d((byte) -128);
                    extyVar.c();
                    long jA = extyVar.a();
                    if (jA < 0) {
                        throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
                    }
                    if (jA > 0) {
                        extyVar.b.d(jA);
                    }
                    if (jA > 1000) {
                        throw new extp("Parser being asked to read a large CBOR array");
                    }
                    c(b, jA);
                    extv[] extvVarArr = new extv[(int) jA];
                    while (i < jA) {
                        extvVarArr[i] = b(inputStream, extyVar);
                        i++;
                    }
                    return new extm(ekgb.p(extvVarArr));
                }
                if (b2 == -96) {
                    extyVar.d((byte) -96);
                    extyVar.c();
                    long jA2 = extyVar.a();
                    if (jA2 < 0 || jA2 > 4611686018427387903L) {
                        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
                    }
                    if (jA2 > 0) {
                        extyVar.b.d(jA2 + jA2);
                    }
                    if (jA2 > 1000) {
                        throw new extp("Parser being asked to read a large CBOR map");
                    }
                    c(b, jA2);
                    int i2 = (int) jA2;
                    extr[] extrVarArr = new extr[i2];
                    extv extvVar = null;
                    int i3 = 0;
                    while (i3 < jA2) {
                        extv extvVarB = b(inputStream, extyVar);
                        if (extvVar != null && extvVarB.compareTo(extvVar) <= 0) {
                            throw new extl(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", extvVar.toString(), extvVarB.toString()));
                        }
                        extrVarArr[i3] = new extr(extvVarB, b(inputStream, extyVar));
                        i3++;
                        extvVar = extvVarB;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i < i2) {
                        extr extrVar = extrVarArr[i];
                        extv extvVar2 = extrVar.a;
                        if (treeMap.containsKey(extvVar2)) {
                            throw new extl("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put(extvVar2, extrVar.b);
                        i++;
                    }
                    return new exts(ekih.a(treeMap, ekih.a));
                }
                if (b2 == -64) {
                    throw new extp("Tags are currently unsupported");
                }
                if (b2 == -32) {
                    extyVar.d((byte) -32);
                    if (extyVar.a.b > 24) {
                        throw new IllegalStateException("expected simple value");
                    }
                    int iA = (int) extyVar.a();
                    if (iA == 20) {
                        z = false;
                    } else if (iA != 21) {
                        throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
                    }
                    return new extn(z);
                }
                if (b2 != 0 && b2 != 32) {
                    if (b2 == 64) {
                        extyVar.d((byte) 64);
                        byte[] bArrE = extyVar.e();
                        c(b, bArrE.length);
                        return new exto(evqs.x(bArrE));
                    }
                    if (b2 == 96) {
                        extyVar.d((byte) 96);
                        String str = new String(extyVar.e(), StandardCharsets.UTF_8);
                        c(b, str.length());
                        return new extt(str);
                    }
                    throw new extp("Unidentifiable major type: " + extxVarB.a());
                }
                extyVar.b();
                extx extxVar = extyVar.a;
                byte b3 = extxVar.a;
                if (b3 == 0) {
                    z2 = true;
                } else {
                    if (b3 != 32) {
                        throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", Integer.valueOf(extxVar.a())));
                    }
                    z2 = false;
                }
                long jA3 = extyVar.a();
                if (jA3 < 0) {
                    throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
                }
                if (!z2) {
                    jA3 = ~jA3;
                }
                c(b, jA3 > 0 ? jA3 : ~jA3);
                return new extq(jA3);
            } catch (RuntimeException e2) {
                e = e2;
                throw new extp(e);
            }
        } catch (IOException e3) {
            throw new extp(e3);
        }
    }

    private static final void c(byte b, long j) throws extl {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new extl(a.A(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new extl(a.A(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < 65536) {
                    throw new extl(a.A(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new extl(a.A(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
