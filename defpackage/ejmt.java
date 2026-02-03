package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmt implements ejkz {
    final /* synthetic */ euob a;

    public ejmt(euob euobVar) {
        this.a = euobVar;
    }

    @Override // defpackage.ejkz
    public final ejky a() {
        return new ejms(this.a);
    }

    @Override // defpackage.ejkz
    public final void b() {
        this.a.onTrimMemory();
    }
}
