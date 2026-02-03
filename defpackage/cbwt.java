package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwt implements ccuq {
    public final fdhz a;

    public cbwt(fdhz fdhzVar) {
        this.a = fdhzVar;
    }

    @Override // defpackage.ccuq
    public final Object a(String str, fdap fdapVar) {
        fdhz fdhzVar = this.a;
        if (fdhzVar.a == null) {
            throw new IllegalArgumentException("MlsClient was not initialized before it was called. methodName=".concat(str));
        }
        Object obj = fdhzVar.a;
        obj.getClass();
        return fdapVar.invoke(obj);
    }

    public final boolean b() {
        return this.a.a != null;
    }
}
