package defpackage;

import android.util.Pair;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhe {
    public static efgw a(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            final efgv efgvVarF = efgw.f();
            c(byteArrayInputStream, new Consumer() { // from class: efhc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Pair pair = (Pair) obj;
                    boolean zEquals = "NS".equals(pair.first);
                    efgv efgvVar = efgvVarF;
                    if (zEquals) {
                        String str = (String) pair.second;
                        if (ejwk.c(str)) {
                            return;
                        }
                        List listI = ejxk.b(' ').f().i(str);
                        if (listI.size() == 1) {
                            efgvVar.g("", str);
                            return;
                        }
                        if (listI.size() == 2) {
                            String str2 = (String) listI.get(0);
                            String str3 = (String) listI.get(1);
                            if (str3.length() >= 3) {
                                efgvVar.g(str2, str3.substring(1, str3.length() - 1));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    String str4 = (String) pair.first;
                    int iIndexOf = str4.indexOf(46);
                    if (iIndexOf <= 0) {
                        efha efhaVarD = efhb.d();
                        efhaVarD.b(str4);
                        efhaVarD.d((String) pair.second);
                        efgvVar.d(efhaVarD.a());
                        return;
                    }
                    String str5 = (String) efgvVar.b().c().get(str4.substring(0, iIndexOf));
                    if (str5 == null) {
                        str5 = "urn:ietf:params:cpim-headers:";
                    }
                    String strSubstring = str4.substring(iIndexOf + 1);
                    efha efhaVarD2 = efhb.d();
                    efhaVarD2.c(str5);
                    efhaVarD2.b(strSubstring);
                    efhaVarD2.d((String) pair.second);
                    efgvVar.d(efhaVarD2.a());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final efgy efgyVarD = efgz.d();
            c(byteArrayInputStream, new Consumer() { // from class: efhd
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Pair pair = (Pair) obj;
                    boolean zEquals = ((String) pair.first).equals("Content-Length");
                    efgy efgyVar = efgyVarD;
                    if (zEquals) {
                        efgyVar.a = Integer.parseInt((String) pair.second);
                    }
                    efgyVar.f((String) pair.first, (String) pair.second);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            int i = efgyVarD.a;
            if (i > 0) {
                byte[] bArr2 = new byte[i];
                elec.d(byteArrayInputStream, bArr2, i);
                efgyVarD.c(evqs.x(bArr2));
            } else {
                efgyVarD.c(evqs.B(byteArrayInputStream));
            }
            ((efgm) efgvVarF).a = efgyVarD.e();
            return efgvVarF.a();
        } finally {
            byteArrayInputStream.close();
        }
    }

    private static String b(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        int i = inputStream.read();
        do {
            if (i == 13) {
                i = inputStream.read();
            } else {
                if (i == 10) {
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    byteArrayOutputStream.reset();
                    return str;
                }
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
        } while (i > 0);
        throw new IOException("No data read from socket. EOF.");
    }

    private static void c(InputStream inputStream, Consumer consumer) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String strB = b(inputStream, byteArrayOutputStream);
        while (!ejwk.c(strB)) {
            Pair pairCreate = null;
            if (!ejwk.c(strB)) {
                List listI = ejxk.d(": ").i(strB);
                if (listI.size() == 2) {
                    pairCreate = Pair.create((String) listI.get(0), (String) listI.get(1));
                }
            }
            if (!Objects.isNull(pairCreate)) {
                consumer.z(pairCreate);
            }
            strB = b(inputStream, byteArrayOutputStream);
        }
    }
}
