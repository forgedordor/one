package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmv {
    public static List a(ezdx ezdxVar) {
        evtg evtgVar = ezdxVar.b;
        ezdv ezdvVar = (ezdv) ekis.j(evtgVar);
        return b(evtgVar, ezdvVar.d, c(ezdvVar.e));
    }

    public static List b(List list, String str, float f) {
        int iIntValue;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        HashMap map = new HashMap();
        map.put(str, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ezdv ezdvVar = (ezdv) it.next();
            String str2 = ezdvVar.d;
            if (map.containsKey(str2)) {
                iIntValue = ((Integer) map.get(str2)).intValue();
            } else {
                int size = map.size();
                map.put(str2, Integer.valueOf(size));
                iIntValue = size;
            }
            ekfwVar.h(new euod(ezdvVar.b == 30 ? (String) ezdvVar.c : "", iIntValue, f - c(ezdvVar.e), ezdvVar.f));
        }
        return ekfwVar.g();
    }

    private static float c(long j) {
        return (j / 1000.0f) / 1000.0f;
    }
}
