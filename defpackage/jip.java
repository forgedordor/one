package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jip extends fdbr implements fdap {
    public static final jip a = new jip();

    public jip() {
        super(1);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jsc jscVarY = ((jcr) obj).y();
        boolean z = false;
        if (jscVarY != null && jscVarY.b) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
