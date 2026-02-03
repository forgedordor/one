package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxg implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ ejxk b;

    public ejxg(ejxk ejxkVar, CharSequence charSequence) {
        this.a = charSequence;
        this.b = ejxkVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.b.h(this.a);
    }

    public final String toString() {
        ejwc ejwcVar = new ejwc(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ejwcVar.i(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
