package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdr {
    public final erdq a;
    final long[] b;

    public erdr(erdq erdqVar, long[] jArr) {
        this.a = erdqVar;
        this.b = jArr;
    }

    public static void a(erdr erdrVar, erdp erdpVar) {
        erdq erdqVar = erdpVar.a;
        erdq erdqVar2 = erdrVar.a;
        long[] jArr = erdqVar2.a;
        long[] jArr2 = erdqVar.a;
        long[] jArr3 = erdpVar.b;
        erdz.b(jArr, jArr2, jArr3);
        long[] jArr4 = erdqVar2.b;
        long[] jArr5 = erdqVar.b;
        long[] jArr6 = erdqVar.c;
        erdz.b(jArr4, jArr5, jArr6);
        erdz.b(erdqVar2.c, jArr6, jArr3);
        erdz.b(erdrVar.b, jArr2, jArr5);
    }

    public erdr() {
        this(new erdq(), new long[10]);
    }

    public erdr(erdp erdpVar) {
        this();
        a(this, erdpVar);
    }
}
