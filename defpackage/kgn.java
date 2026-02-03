package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kgn {
    public final Object a;
    private final hsf b;
    private final kgn c;

    public kgn(hsf hsfVar, kgn kgnVar) {
        this.b = hsfVar;
        this.c = kgnVar;
        this.a = hsfVar.a();
    }

    public final boolean a() {
        if (this.b.a() != this.a) {
            return true;
        }
        kgn kgnVar = this.c;
        return kgnVar != null && kgnVar.a();
    }
}
