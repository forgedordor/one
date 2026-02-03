package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbsz implements Comparator {
    final /* synthetic */ fbta a;

    public fbsz(fbta fbtaVar) {
        this.a = fbtaVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fbta fbtaVar = this.a;
        int iA = fbtaVar.a(obj) - fbtaVar.a(obj2);
        return iA != 0 ? iA : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
