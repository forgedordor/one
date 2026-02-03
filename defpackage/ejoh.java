package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejoh {
    public static List a(ezcy ezcyVar, long j) {
        int iIntValue;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        HashMap map = new HashMap();
        map.put(ezcyVar.g, 0);
        ezdx ezdxVar = ezcyVar.f;
        if (ezdxVar == null) {
            ezdxVar = ezdx.a;
        }
        for (ezdv ezdvVar : ezdxVar.b) {
            String str = ezdvVar.d;
            if (map.containsKey(str)) {
                iIntValue = ((Integer) map.get(str)).intValue();
            } else {
                int size = map.size();
                map.put(str, Integer.valueOf(size));
                iIntValue = size;
            }
            ekfwVar.h(new euod(ezdvVar.b == 30 ? (String) ezdvVar.c : "", iIntValue, (j / 1000.0f) - ((ezdvVar.e / 1000.0f) / 1000.0f)));
        }
        return ekfwVar.g();
    }
}
