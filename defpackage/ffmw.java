package defpackage;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffmw extends ffxh {
    public final Map a;

    public ffmw(Reader reader) {
        super(reader);
        HashMap map = new HashMap();
        this.a = map;
        map.put("CERTIFICATE REQUEST", new ffmm());
        map.put("NEW CERTIFICATE REQUEST", new ffmm());
        map.put("CERTIFICATE", new ffmu());
        map.put("TRUSTED CERTIFICATE", new ffmv());
        map.put("X509 CERTIFICATE", new ffmu());
        map.put("X509 CRL", new ffmt());
        map.put("PKCS7", new ffmn());
        map.put("CMS", new ffmn());
        map.put("ATTRIBUTE CERTIFICATE", new ffms());
        map.put("EC PARAMETERS", new ffmi());
        map.put("PUBLIC KEY", new ffmp());
        map.put("RSA PUBLIC KEY", new ffmr());
        map.put("RSA PRIVATE KEY", new ffml(new ffmq()));
        map.put("DSA PRIVATE KEY", new ffml(new ffmh()));
        map.put("EC PRIVATE KEY", new ffml(new ffmj()));
        map.put("ENCRYPTED PRIVATE KEY", new ffmk());
        map.put("PRIVATE KEY", new ffmo());
    }
}
