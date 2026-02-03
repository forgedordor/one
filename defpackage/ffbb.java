package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbb extends fezk {
    private final String a;
    private final long b;
    private final fffb c;

    public ffbb(String str, long j, fffb fffbVar) {
        this.a = str;
        this.b = j;
        this.c = fffbVar;
    }

    @Override // defpackage.fezk
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fezk
    public final feyt b() {
        String str = this.a;
        if (str != null) {
            Pattern pattern = feyt.a;
            try {
                return feys.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.fezk
    public final fffb c() {
        return this.c;
    }
}
