package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekez extends ekfc {
    final /* synthetic */ ekfd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekez(ekfd ekfdVar) {
        super(ekfdVar);
        this.a = ekfdVar;
    }

    @Override // defpackage.ekfc
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ekfd ekfdVar = this.a;
        int iB = ekfh.b(obj);
        int iC = ekfdVar.c(obj, iB);
        if (iC == -1) {
            return false;
        }
        ekfdVar.g(iC, iB);
        return true;
    }
}
