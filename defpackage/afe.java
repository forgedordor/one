package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afe {
    private final String c;
    private final String d;
    private int e = 2;
    public boolean a = false;
    public final Set b = new css();

    public afe(String str, String str2) {
        lcg.i(str);
        this.c = str;
        lcg.i(str2);
        this.d = str2;
    }

    public final aff a() {
        boolean z = this.a;
        if (!z || this.b.isEmpty()) {
            return new aff(new ajy(this.c, 6, this.e, this.d, null, new ajt(z, new ArrayList(this.b)), null, null, null));
        }
        throw new IllegalArgumentException("DocumentIndexingConfig#shouldIndexNestedProperties is required to be false when one or more indexableNestedProperties are provided.");
    }

    public final void b(int i) {
        lcg.f(i, 1, 3, "cardinality");
        this.e = i;
    }
}
