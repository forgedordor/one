package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class croe {
    public static final cqce a = cqce.g("Bugle", "SubscriptionNameHelper");
    public final Context b;
    public final crma c;

    public croe(Context context, crma crmaVar) {
        this.b = context;
        this.c = crmaVar;
    }

    public static String a(String str) throws NoSuchAlgorithmException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder(bArrDigest.length);
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                    sb.append(hexString);
                } else {
                    sb.append(hexString);
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            a.n("Error while encoding subscription id");
            return null;
        }
    }

    public static String b(TelephonyManager telephonyManager, int i) {
        TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(i);
        String simOperatorName = telephonyManagerCreateForSubscriptionId.getSimOperatorName();
        cqce cqceVar = a;
        cqbd cqbdVarD = cqceVar.d();
        cqbdVarD.I("Fell back to SIM operator name:");
        cqbdVarD.I(simOperatorName);
        cqbdVarD.r();
        if (!c(simOperatorName)) {
            return simOperatorName;
        }
        String networkOperatorName = telephonyManagerCreateForSubscriptionId.getNetworkOperatorName();
        cqbd cqbdVarD2 = cqceVar.d();
        cqbdVarD2.I("Fell back to network operator name:");
        cqbdVarD2.I(networkOperatorName);
        cqbdVarD2.r();
        return networkOperatorName;
    }

    public static boolean c(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence) || charSequence.toString().matches("CARD(\\s*)[0-9]");
    }
}
