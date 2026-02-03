package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcej extends fbpc {
    private final Map a;

    public fcej(Map map) {
        this.a = map;
    }

    @Override // defpackage.fbpc
    public final fbsr a(String str) {
        return (fbsr) this.a.get(str);
    }
}
