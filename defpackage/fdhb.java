package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhb implements fdev {
    final /* synthetic */ CharSequence a;

    public fdhb(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.fdev
    public final Iterator a() {
        return new fdgb(this.a);
    }
}
