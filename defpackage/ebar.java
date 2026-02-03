package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebar {
    private final ahmt a;
    private final ahmu b;

    public ebar(ahmt ahmtVar, ahmu ahmuVar) {
        this.a = ahmtVar;
        this.b = ahmuVar;
    }

    public final eayv a(int i, int i2, ejrp ejrpVar, ejsi ejsiVar) {
        String str;
        int i3 = ejsiVar.g;
        int iA = ejsf.a(i3);
        if (iA == 0) {
            iA = 1;
        }
        int i4 = iA - 2;
        if (i4 == 11) {
            ahkn ahknVar = this.b.a.a;
            eyik eyikVar = ahknVar.pO;
            return new ebaq(ahknVar.dX(), ahknVar.dW(), (ebat) ahknVar.fr(), (SecureRandom) eyikVar.b(), i, i2, ejrpVar, ejsiVar);
        }
        if (i4 == 12) {
            ahkn ahknVar2 = this.a.a.a;
            eyik eyikVar2 = ahknVar2.pO;
            return new eban(ahknVar2.dX(), ahknVar2.dW(), (ebat) ahknVar2.fr(), (SecureRandom) eyikVar2.b(), i, i2, ejrpVar, ejsiVar);
        }
        int iA2 = ejsf.a(i3);
        if (iA2 == 0 || iA2 == 1) {
            str = "UNRECOGNIZED";
        } else if (iA2 != 2) {
            switch (iA2) {
                case 13:
                    str = "FLEETWIDE_OCCURRENCE_COUNTS";
                    break;
                case 14:
                    str = "UNIQUE_DEVICE_COUNTS";
                    break;
                case 15:
                    str = "UNIQUE_DEVICE_HISTOGRAMS";
                    break;
                case 16:
                    str = "HOURLY_VALUE_HISTOGRAMS";
                    break;
                case 17:
                    str = "FLEETWIDE_HISTOGRAMS";
                    break;
                case 18:
                    str = "FLEETWIDE_MEANS";
                    break;
                case 19:
                    str = "UNIQUE_DEVICE_NUMERIC_STATS";
                    break;
                case 20:
                    str = "HOURLY_VALUE_NUMERIC_STATS";
                    break;
                default:
                    switch (iA2) {
                        case 22:
                            str = "STRING_COUNTS";
                            break;
                        case 23:
                            str = "UNIQUE_DEVICE_STRING_COUNTS";
                            break;
                        case 24:
                            str = "STRUCT";
                            break;
                        default:
                            str = "null";
                            break;
                    }
            }
        } else {
            str = "REPORT_TYPE_UNSET";
        }
        throw new IllegalArgumentException("Unknown generator for report type: ".concat(str));
    }
}
