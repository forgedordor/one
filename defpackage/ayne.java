package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayne implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aynl aynlVar = (aynl) obj;
        aynl aynlVar2 = (aynl) obj2;
        aymr aymrVar = aynlVar.d;
        if (aymrVar.c() && !aynlVar2.d.c()) {
            return -1;
        }
        if (aymrVar.c() || !aynlVar2.d.c()) {
            return Integer.compare(aynlVar.h, aynlVar2.h);
        }
        return 1;
    }
}
