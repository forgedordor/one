package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class md extends mo {
    final /* synthetic */ mf a;

    public md(mf mfVar) {
        this.a = mfVar;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.a.b.size();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.a.size();
    }

    @Override // defpackage.mo
    public final Object c(int i, int i2) {
        mf mfVar = this.a;
        List list = mfVar.b;
        Object obj = mfVar.a.get(i);
        Object obj2 = list.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return mfVar.d.b.b.a(obj, obj2);
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        mf mfVar = this.a;
        List list = mfVar.b;
        Object obj = mfVar.a.get(i);
        Object obj2 = list.get(i2);
        if (obj != null && obj2 != null) {
            return mfVar.d.b.b.b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        mf mfVar = this.a;
        List list = mfVar.b;
        Object obj = mfVar.a.get(i);
        Object obj2 = list.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : mfVar.d.b.b.c(obj, obj2);
    }
}
