package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwg {
    final Map a;

    public dqwg(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        String str2 = (String) this.a.get(str);
        return str2 != null ? str2 : str;
    }
}
