package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jso {
    public final jcr a;
    public final ctj b;
    public final cuu c = new cuu(2);
    private final jrs d;

    public jso(jcr jcrVar, jrs jrsVar, ctj ctjVar) {
        this.a = jcrVar;
        this.d = jrsVar;
        this.b = ctjVar;
    }

    public final jsl a() {
        jsc jscVar = new jsc();
        return new jsl(this.d, false, this.a, jscVar);
    }

    public final void b(jse jseVar, jsc jscVar) {
        cuu cuuVar = this.c;
        Object[] objArr = cuuVar.b;
        int i = cuuVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((jsf) objArr[i2]).b(jseVar, jscVar);
        }
    }
}
