package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uie {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation/draft/model/BugleMessageAttachmentSourceToAttachmentSourceKt");

    public static final dltc a(elha elhaVar) {
        elhaVar.getClass();
        int iOrdinal = elhaVar.ordinal();
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return dmbp.a;
            }
            if (iOrdinal == 5) {
                return dmbr.a;
            }
            if (iOrdinal == 12) {
                return new dlsx(null, 2);
            }
            if (iOrdinal == 33 || iOrdinal == 35) {
                return new dlsx(null, 3);
            }
            if (iOrdinal == 25) {
                return doar.a;
            }
            if (iOrdinal == 26) {
                return doys.a;
            }
            switch (iOrdinal) {
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    return dmbz.a;
                case 40:
                    return new dlsx(null, 4);
                case 41:
                    return new dlsx(null, 5);
                case 42:
                    return new dmbx(dmbu.a, 1, 1, false, null, null, 48);
                case 43:
                    break;
                case 44:
                    return dnvr.a;
                case 45:
                    return dnvr.b;
                case 46:
                    return new dmbx(dmbu.c, 1, 1, false, null, null, 48);
                default:
                    if (elhaVar != elha.UNKNOWN && elhaVar != elha.NOT_AVAILABLE) {
                        ekrd ekrdVar = (ekrd) a.i();
                        Objects.toString(elhaVar);
                        ((ekrd) ekrdVar.g(new IllegalStateException("Unhandled attachment source ".concat(elhaVar.toString()))).h("com/google/android/apps/messaging/conversation/draft/model/BugleMessageAttachmentSourceToAttachmentSourceKt", "toAttachmentSource", 57, "BugleMessageAttachmentSourceToAttachmentSource.kt")).q("Falling back to Unknown");
                    }
                    return dltb.a;
            }
        }
        return new dmbx(dmbu.b, 1, 1, false, null, null, 48);
    }
}
