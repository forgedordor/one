package defpackage;

import android.content.Context;
import android.telephony.ServiceState;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class devs extends devr {
    private static final dhip d = new dhip("MobileNetworkAccess");
    private static final dfny e = dfod.a(184659928);
    private static final dfny f = dfod.a(184656641);
    private static final dfny g = dfod.a(340231737);
    final dhkv c;

    public devs(Context context) {
        this.c = dhkv.g(context);
    }

    private static final String h(int i) {
        String upperCase = Integer.toHexString(i).toUpperCase(Locale.US);
        int length = 4 - upperCase.length();
        if (length < 0) {
            dhja.r(d, "incorrect expected bits %d for number: %d", 16, Integer.valueOf(i));
            return upperCase;
        }
        if (length <= 0) {
            return upperCase;
        }
        StringBuilder sb = new StringBuilder(upperCase);
        for (int i2 = 0; i2 < length; i2++) {
            sb.insert(0, 0);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    @Override // defpackage.devr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() throws defpackage.dhkf {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.devs.a():java.lang.String");
    }

    @Override // defpackage.devr
    public final String b() {
        dhkv dhkvVar = this.c;
        int iC = dhkvVar.c();
        ServiceState serviceState = null;
        switch (iC) {
            case 1:
            case 2:
                break;
            case 3:
            case 8:
            case 9:
            case 10:
            case 15:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 12:
                break;
            case 11:
            case 16:
            case 18:
            case 19:
            default:
                dhja.r(d, "Unknown mobile access. Type=%d", Integer.valueOf(iC));
                break;
            case 13:
                if (!((Boolean) e.a()).booleanValue()) {
                    if (craf.b) {
                        try {
                            serviceState = dhkvVar.a.getServiceState();
                        } catch (SecurityException unused) {
                        }
                        if (serviceState == null || serviceState.getDuplexMode() != 1) {
                        }
                    }
                }
                break;
            case 14:
                break;
            case 17:
                break;
            case 20:
                if (!((Boolean) g.a()).booleanValue()) {
                    dhja.r(d, "5G NR mobile access type disabled. Type=%d", Integer.valueOf(iC));
                    break;
                }
                break;
        }
        return null;
    }
}
