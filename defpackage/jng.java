package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jng extends fdbr implements fdap {
    final /* synthetic */ jnh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jng(jnh jnhVar) {
        super(1);
        this.a = jnhVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kef kefVar = (kef) obj;
        kefVar.b();
        jnh jnhVar = this.a;
        hum humVar = jnhVar.d;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (fdbq.f((jgj) objArr[i2], kefVar)) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            humVar.c(i2);
        }
        if (humVar.b == 0) {
            jnhVar.b.invoke();
        }
        return fctx.a;
    }
}
