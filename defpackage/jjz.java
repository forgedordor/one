package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjz extends fdbr implements fdap {
    final /* synthetic */ jnh a;
    final /* synthetic */ jkb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjz(jnh jnhVar, jkb jkbVar) {
        super(1);
        this.a = jnhVar;
        this.b = jkbVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jnh jnhVar = this.a;
        synchronized (jnhVar.c) {
            jnhVar.e = true;
            hum humVar = jnhVar.d;
            Object[] objArr = humVar.a;
            int i = humVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                kef kefVar = (kef) ((jgj) objArr[i2]).get();
                if (kefVar != null) {
                    kefVar.b();
                }
            }
            humVar.g();
        }
        key keyVar = this.b.b;
        keyVar.b.set(null);
        keyVar.a.f();
        return fctx.a;
    }
}
