package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awik implements awhe {
    private final Map a;

    public awik(cmuh cmuhVar, int i, boolean z) {
        HashMap map = new HashMap();
        this.a = map;
        int iF = cmuhVar.f();
        map.put("SMS_TO_MMS_TEXT_LENGTH_THRESHOLD", String.valueOf(iF == -1 ? Integer.MAX_VALUE : iF));
        map.put("SMS_MAX_TEXT_PARTS", String.valueOf(i == -1 ? Integer.MAX_VALUE : i));
        map.put("SIMPLE_CHARACTERS_ONLY", String.valueOf(z));
    }

    @Override // defpackage.awhe
    public final String a(String str) {
        return (String) this.a.get(str);
    }
}
