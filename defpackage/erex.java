package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erex {
    public static final erex a = new erex();
    private final Map b = new HashMap();

    public final synchronized void a(String str, eqst eqstVar) {
        Map map = this.b;
        if (!map.containsKey(str)) {
            map.put(str, eqstVar);
            return;
        }
        if (((eqst) map.get(str)).equals(eqstVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(map.get(str)) + "), cannot insert " + String.valueOf(eqstVar));
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (eqst) entry.getValue());
        }
    }

    public final synchronized eqst c() {
        Map map;
        map = this.b;
        if (!map.containsKey("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM")) {
            throw new GeneralSecurityException("Name ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM does not exist");
        }
        return (eqst) map.get("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM");
    }
}
