package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmu implements Comparator {
    final /* synthetic */ fdap a;

    public ctmu(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fdap fdapVar = this.a;
        return fcxl.a(Boolean.valueOf(fdbq.f(fdapVar.invoke((ajpk) obj2), true)), Boolean.valueOf(fdbq.f(fdapVar.invoke((ajpk) obj), true)));
    }
}
