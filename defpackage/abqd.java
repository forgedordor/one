package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqd implements abqh {
    private final cqtp a;
    private final eosc b;
    private final abre c;

    public abqd(cqtp cqtpVar, eosc eoscVar, abre abreVar) {
        this.a = cqtpVar;
        this.b = eoscVar;
        this.c = abreVar;
    }

    @Override // defpackage.abqh
    public final abqi a(abto abtoVar, String str, abpy abpyVar) {
        abre abreVar = this.c;
        ((abty) abreVar.a.b()).getClass();
        eosc eoscVar = (eosc) abreVar.b.b();
        eoscVar.getClass();
        return new abqe(this.a, this.b, new abrd(eoscVar, abtoVar, str, abpyVar));
    }
}
