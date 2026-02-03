package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjy extends fdbr implements fdap {
    final /* synthetic */ jnv a;
    final /* synthetic */ jkb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjy(jnv jnvVar, jkb jkbVar) {
        super(1);
        this.a = jnvVar;
        this.b = jkbVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new jnh(this.a, new jjx(this.b));
    }
}
