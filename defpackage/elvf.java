package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elvf implements evsv {
    public static final evsv a = new elvf();

    private elvf() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elvg elvgVar;
        switch (i) {
            case 0:
                elvgVar = elvg.NOT_SET_LEGACY_BUILD;
                break;
            case 1:
                elvgVar = elvg.ROBOLECTRIC_BUILD;
                break;
            case 2:
                elvgVar = elvg.ARIGATO_BUILD;
                break;
            case 3:
                elvgVar = elvg.DOMO_BUILD;
                break;
            case 4:
                elvgVar = elvg.STABILITY_BUILD;
                break;
            case 5:
                elvgVar = elvg.PERFORMANCE_BUILD;
                break;
            case 6:
                elvgVar = elvg.ARTIK_BUILD;
                break;
            case 7:
                elvgVar = elvg.STABILITY_GO_BUILD;
                break;
            case 8:
                elvgVar = elvg.STABILITY_PLATFORM_BUILD;
                break;
            default:
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        elvgVar = elvg.ENG_BUILD;
                        break;
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        elvgVar = elvg.WEAR_BUILD;
                        break;
                    case 102:
                        elvgVar = elvg.FISH_FOOD_BUILD;
                        break;
                    case 103:
                        elvgVar = elvg.DOG_FOOD_BUILD;
                        break;
                    case 104:
                        elvgVar = elvg.OPEN_BETA_BUILD;
                        break;
                    case 105:
                        elvgVar = elvg.RELEASE_BUILD;
                        break;
                    case 106:
                        elvgVar = elvg.PLATFORM_BUILD;
                        break;
                    case 107:
                        elvgVar = elvg.GO_BUILD;
                        break;
                    case 108:
                        elvgVar = elvg.DITTO_SATELLITE_BUILD;
                        break;
                    case 109:
                        elvgVar = elvg.WEAR_ENG_BUILD;
                        break;
                    case 110:
                        elvgVar = elvg.WEAR_FISH_FOOD_BUILD;
                        break;
                    case 111:
                        elvgVar = elvg.WEAR_DOG_FOOD_BUILD;
                        break;
                    case 112:
                        elvgVar = elvg.WEAR_OPEN_BETA_BUILD;
                        break;
                    case 113:
                        elvgVar = elvg.WEAR_RELEASE_BUILD;
                        break;
                    default:
                        elvgVar = null;
                        break;
                }
        }
        return elvgVar != null;
    }
}
