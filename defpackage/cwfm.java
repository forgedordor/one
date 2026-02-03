package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfm implements Comparator {
    final /* synthetic */ chpq a;

    public cwfm(chpq chpqVar) {
        this.a = chpqVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        chpq chpqVar = ((cwhd) obj).b;
        chpq chpqVar2 = this.a;
        return fcxl.a(Integer.valueOf(chpqVar == chpqVar2 ? 0 : 1), Integer.valueOf(((cwhd) obj2).b != chpqVar2 ? 1 : 0));
    }
}
