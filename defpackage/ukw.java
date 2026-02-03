package defpackage;

import android.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukw {
    public final Optional a;
    public final aidr b;
    private final fctc c;

    public ukw(Optional optional, aidr aidrVar) {
        optional.getClass();
        aidrVar.getClass();
        this.a = optional;
        this.b = aidrVar;
        this.c = fctd.a(new fdae() { // from class: uko
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.b.a());
            }
        });
    }

    public final dpxd a(int i) {
        return b() ? new dpxa(R.attr.colorBackground) : new dpxb(i);
    }

    public final boolean b() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
