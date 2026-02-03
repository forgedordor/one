package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jis extends fdbr implements fdap {
    public static final jis a = new jis();

    public jis() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jsc jscVarY = ((jcr) obj).y();
        boolean z = false;
        if (jscVarY != null && jscVarY.b && jscVarY.f(jte.E)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
