package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akjz implements Comparator {
    final /* synthetic */ fdap a;

    public akjz(fdap fdapVar) {
        this.a = fdapVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fdap fdapVar = this.a;
        return fcxl.a(fdapVar.invoke(obj), fdapVar.invoke(obj2));
    }
}
