package defpackage;

import java.util.AbstractMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekid extends ekgb {
    final /* synthetic */ ekie a;

    public ekid(ekie ekieVar) {
        this.a = ekieVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ekih ekihVar = this.a.a;
        return new AbstractMap.SimpleImmutableEntry(ekihVar.c.d.get(i), ekihVar.d.get(i));
    }

    @Override // defpackage.ekfn
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.a.size();
    }

    @Override // defpackage.ekgb, defpackage.ekfn
    public Object writeReplace() {
        return super.writeReplace();
    }
}
