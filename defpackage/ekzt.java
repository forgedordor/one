package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekzt extends ekzu {
    private final elat[] a;

    public ekzt(elat[] elatVarArr) {
        this.a = elatVarArr;
    }

    @Override // defpackage.ekzu
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.ekzu
    public final elat b(int i) {
        return this.a[i];
    }
}
