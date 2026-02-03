package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqn extends ekqj {
    /* JADX WARN: Illegal instructions before constructor call */
    public ekqn(Map map) {
        char[][] cArr;
        if (map.isEmpty()) {
            cArr = ekqk.a;
        } else {
            char[][] cArr2 = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
            for (Character ch : map.keySet()) {
                cArr2[ch.charValue()] = ((String) map.get(ch)).toCharArray();
            }
            cArr = cArr2;
        }
        super(new ekqk(cArr));
    }
}
