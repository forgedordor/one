package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdo extends erdn {
    private final long[] d;

    erdo() {
        super(new long[10], new long[10], new long[10]);
        this.d = new long[10];
    }

    @Override // defpackage.erdn
    public final void b(long[] jArr, long[] jArr2) {
        erdz.b(jArr, jArr2, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erdo(erdr erdrVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        erdq erdqVar = erdrVar.a;
        erdz.j(jArr2, erdqVar.b, erdqVar.a);
        long[] jArr3 = this.b;
        erdq erdqVar2 = erdrVar.a;
        erdz.i(jArr3, erdqVar2.b, erdqVar2.a);
        System.arraycopy(erdrVar.a.c, 0, jArr, 0, 10);
        erdz.b(this.c, erdrVar.b, erdu.b);
    }
}
