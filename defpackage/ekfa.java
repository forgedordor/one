package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekfa extends ekfc {
    final /* synthetic */ ekfd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekfa(ekfd ekfdVar) {
        super(ekfdVar);
        this.a = ekfdVar;
    }

    @Override // defpackage.ekfc
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ekfd ekfdVar = this.a;
        int iB = ekfh.b(obj);
        int iE = ekfdVar.e(obj, iB);
        if (iE == -1) {
            return false;
        }
        ekfdVar.h(iE, iB);
        return true;
    }
}
