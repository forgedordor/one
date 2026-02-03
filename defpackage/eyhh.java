package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyhh implements eyhx {
    private volatile Object a;
    private final Object b = new Object();
    private final ahoy c;

    public eyhh(ahoy ahoyVar) {
        this.c = ahoyVar;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = this.c.a();
                }
            }
        }
        return this.a;
    }
}
