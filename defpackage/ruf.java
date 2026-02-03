package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ruf implements rul {
    private final boolean a;
    private rug b;

    protected ruf(boolean z) {
        this.a = z;
    }

    @Override // defpackage.rul
    public final ruk a(reb rebVar) {
        if (rebVar == reb.MEMORY_CACHE) {
            return rui.a;
        }
        if (this.b == null) {
            this.b = new rug(this.a);
        }
        return this.b;
    }
}
