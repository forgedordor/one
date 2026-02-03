package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elhq {
    public final elqw a;

    public elhq(elqw elqwVar) {
        this.a = elqwVar;
    }

    public final /* synthetic */ elqz a() {
        evsn evsnVarBuild = this.a.build();
        evsnVarBuild.getClass();
        return (elqz) evsnVarBuild;
    }

    public final void b(int i) {
        elqw elqwVar = this.a;
        elqwVar.copyOnWrite();
        elqz elqzVar = (elqz) elqwVar.instance;
        elqz elqzVar2 = elqz.a;
        elqzVar.c = i - 1;
        elqzVar.b |= 1;
    }
}
