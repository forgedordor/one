package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulo {
    public eukf a;
    public Bundle b;
    private final CharSequence c;

    public eulo(CharSequence charSequence) {
        charSequence.getClass();
        this.c = charSequence;
    }

    public final eulp a() {
        eukf eukfVar = this.a;
        Bundle bundle = this.b;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new eulp(this.c, eukfVar, bundle);
    }
}
