package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dziq extends dzit {
    public final ejxr a;
    private final ejxr b;

    public dziq(final long j) {
        if (j <= -100 || j >= 100) {
            this.a = ejxx.a(new ejxr() { // from class: dzio
                @Override // defpackage.ejxr
                public final Object get() {
                    return String.format(Locale.US, "%.1e", Double.valueOf(j));
                }
            });
            this.b = ejxx.a(new ejxr() { // from class: dzip
                @Override // defpackage.ejxr
                public final Object get() {
                    return Long.valueOf(Double.valueOf((String) this.a.a.get()).longValue());
                }
            });
        } else {
            this.b = ejxx.a(new ejxr() { // from class: dzim
                @Override // defpackage.ejxr
                public final Object get() {
                    return Long.valueOf(j);
                }
            });
            this.a = ejxx.a(new ejxr() { // from class: dzin
                @Override // defpackage.ejxr
                public final Object get() {
                    return String.valueOf(j);
                }
            });
        }
    }

    @Override // defpackage.dzit
    public final /* bridge */ /* synthetic */ Object a() {
        return (Long) this.b.get();
    }

    @Override // defpackage.dzit
    public final String b() {
        return (String) this.a.get();
    }
}
