package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aagh implements fdat {
    private final dtic a;

    public aagh(dtic dticVar) {
        this.a = dticVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Boolean) obj2).booleanValue();
        ((Context) obj).getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aagh) && fdbq.f(this.a, ((aagh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IdentityTonalPaletteProvider(tonalPalette=" + this.a + ")";
    }
}
