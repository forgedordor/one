package defpackage;

import android.content.ContentValues;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvux {
    public static ContentValues a(dwje dwjeVar, dwju dwjuVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tachyon_app_name", dwjeVar.f());
        dwim dwimVar = (dwim) dwjeVar;
        contentValues.put("server_registration_id", dwimVar.c.I());
        contentValues.put("server_registration_status", Integer.valueOf(dwimVar.d.c));
        dwmm dwmmVar = (dwmm) dwjuVar;
        contentValues.put("tachyon_auth_token", eomt.c(dwmmVar.a));
        contentValues.put("auth_token_expire_at_timestamp_ms", Long.valueOf(eonw.a(dwmmVar.b)));
        contentValues.put("auth_token_refreshed_at_timestamp_ms", Long.valueOf(dwmmVar.c.toEpochMilli()));
        dwpj dwpjVar = dwpj.UNKNOWN;
        if (dwjuVar.g() - 1 != 1) {
            contentValues.put("identity_key_type", (Integer) 0);
            return contentValues;
        }
        contentValues.put("identity_key_type", (Integer) 1);
        contentValues.put("identity_key_private", dwjuVar.f().getPrivate().getEncoded());
        contentValues.put("identity_key_public", dwjuVar.f().getPublic().getEncoded());
        return contentValues;
    }

    public static ejwi b(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        if (bArr != null && bArr2 != null) {
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                return ejwi.j(new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArr)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2))));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            }
        }
        return ejud.a;
    }

    public static ejwi c(byte[] bArr) {
        try {
            HashMap mapG = dvhy.g(bArr);
            dwnx dwnxVar = new dwnx();
            if (mapG.containsKey("last_reported_capabilities")) {
                dwnxVar.c(ekgb.n((ArrayList) mapG.get("last_reported_capabilities")));
            }
            if (mapG.containsKey("last_reported_capabilities_time_ms")) {
                dwnxVar.b(((Long) mapG.get("last_reported_capabilities_time_ms")).longValue());
            }
            return ejwi.j(dwnxVar.a());
        } catch (Exception unused) {
            dvhv.c("RegCursors", "Failed to de-serialize registration properties");
            return ejud.a;
        }
    }
}
