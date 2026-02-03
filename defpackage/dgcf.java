package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgcf {
    public final dgcg a;

    public dgcf(dgcg dgcgVar) {
        this.a = dgcgVar;
    }

    public final synchronized String a() {
        String string;
        string = UUID.randomUUID().toString();
        this.a.d.e(string);
        return string;
    }
}
