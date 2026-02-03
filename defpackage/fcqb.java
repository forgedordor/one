package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqb {
    public static final fcqb a;
    private static final fcpz[] f;
    final boolean b = true;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        fcpz[] fcpzVarArr = {fcpz.TLS_AES_128_GCM_SHA256, fcpz.TLS_AES_256_GCM_SHA384, fcpz.TLS_CHACHA20_POLY1305_SHA256, fcpz.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fcpz.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fcpz.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fcpz.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fcpz.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, fcpz.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, fcpz.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, fcpz.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, fcpz.TLS_RSA_WITH_AES_128_GCM_SHA256, fcpz.TLS_RSA_WITH_AES_256_GCM_SHA384, fcpz.TLS_RSA_WITH_AES_128_CBC_SHA, fcpz.TLS_RSA_WITH_AES_256_CBC_SHA, fcpz.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = fcpzVarArr;
        fcqa fcqaVar = new fcqa();
        fcqaVar.a(fcpzVarArr);
        fcqaVar.c(fcqn.TLS_1_3, fcqn.TLS_1_2);
        fcqaVar.b();
        fcqb fcqbVar = new fcqb(fcqaVar);
        a = fcqbVar;
        fcqa fcqaVar2 = new fcqa(fcqbVar);
        fcqaVar2.c(fcqn.TLS_1_3, fcqn.TLS_1_2, fcqn.TLS_1_1, fcqn.TLS_1_0);
        fcqaVar2.b();
    }

    public fcqb(fcqa fcqaVar) {
        this.c = fcqaVar.a;
        this.d = fcqaVar.b;
        this.e = fcqaVar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fcqb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        fcqb fcqbVar = (fcqb) obj;
        boolean z = fcqbVar.b;
        return Arrays.equals(this.c, fcqbVar.c) && Arrays.equals(this.d, fcqbVar.d) && this.e == fcqbVar.e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List listA;
        fcqn fcqnVar;
        String[] strArr = this.c;
        if (strArr == null) {
            listA = null;
        } else {
            fcpz[] fcpzVarArr = new fcpz[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                fcpz fcpzVar = fcpz.TLS_RSA_WITH_NULL_MD5;
                fcpzVarArr[i] = str.startsWith("SSL_") ? fcpz.a("TLS_".concat(String.valueOf(str.substring(4)))) : fcpz.a(str);
            }
            listA = fcqo.a(fcpzVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        String[] strArr2 = this.d;
        fcqn[] fcqnVarArr = new fcqn[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            String str2 = strArr2[i2];
            fcqn fcqnVar2 = fcqn.TLS_1_3;
            if ("TLSv1.3".equals(str2)) {
                fcqnVar = fcqn.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                fcqnVar = fcqn.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                fcqnVar = fcqn.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                fcqnVar = fcqn.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                fcqnVar = fcqn.SSL_3_0;
            }
            fcqnVarArr[i2] = fcqnVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + String.valueOf(fcqo.a(fcqnVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
    }
}
