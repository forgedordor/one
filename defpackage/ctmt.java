package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmt implements Comparator {
    final /* synthetic */ fdap a;

    public ctmt(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ajpk ajpkVar = (ajpk) obj2;
        ajpkVar.getClass();
        fdap fdapVar = this.a;
        Boolean boolValueOf = Boolean.valueOf(fdbq.f(fdapVar.invoke(ajpkVar), true));
        ajpk ajpkVar2 = (ajpk) obj;
        ajpkVar2.getClass();
        return fcxl.a(boolValueOf, Boolean.valueOf(fdbq.f(fdapVar.invoke(ajpkVar2), true)));
    }
}
