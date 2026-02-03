package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqpt {
    public abstract Integer a();

    public abstract String b();

    public abstract String c();

    public abstract List d();

    public final Integer e() {
        List listD = d();
        if (listD != null) {
            return (Integer) listD.get(1);
        }
        return null;
    }

    public final Integer f() {
        List listD = d();
        if (listD != null) {
            return (Integer) listD.get(0);
        }
        return null;
    }
}
