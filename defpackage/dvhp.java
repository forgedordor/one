package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvhp {
    public static dvhp a;
    private final Map b;

    public dvhp(Map map) {
        this.b = map;
    }

    public static dvhp a() {
        dvhp dvhpVar = a;
        if (dvhpVar != null) {
            return dvhpVar;
        }
        dvhv.c("IntentHelper", "No instance available, call initialize first.");
        throw new IllegalArgumentException("No instance available, please call initialize first.");
    }

    public final String b(int i) {
        return (String) this.b.get(Integer.valueOf(i));
    }
}
