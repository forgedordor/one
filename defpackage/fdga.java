package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdga implements fdev {
    public final CharSequence a;
    public final int b;
    public final fdat c;

    public fdga(CharSequence charSequence, int i, fdat fdatVar) {
        this.a = charSequence;
        this.b = i;
        this.c = fdatVar;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdfz(this);
    }
}
