package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjn implements pjv {
    private final String a;
    private final Object[] b;

    public pjn(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // defpackage.pjv
    public final String b() {
        return this.a;
    }

    @Override // defpackage.pjv
    public final void h(pju pjuVar) {
        pjm.a(pjuVar, this.b);
    }

    public pjn(String str) {
        this(str, null);
    }
}
