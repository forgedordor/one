package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iqz extends fdbr implements fdap {
    final /* synthetic */ fdci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqz(fdci fdciVar) {
        super(1);
        this.a = fdciVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        jgg jggVar = (jgg) obj;
        if (jggVar.D().C) {
            this.a.a = jggVar;
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
