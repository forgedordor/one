package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqu implements Comparator {
    final /* synthetic */ ayqw a;

    public ayqu(ayqw ayqwVar) {
        this.a = ayqwVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ayqw ayqwVar = this.a;
        return fcxl.a(Boolean.valueOf(ayqwVar.b((bojh) obj)), Boolean.valueOf(ayqwVar.b((bojh) obj2)));
    }
}
