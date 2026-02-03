package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehmy extends lug {
    final /* synthetic */ ehmx a;
    private final efwo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehmy(ehmx ehmxVar, efwo efwoVar) {
        super(ehmxVar.b);
        this.a = ehmxVar;
        this.b = efwoVar;
    }

    @Override // defpackage.lug
    public final lxd e(Class cls, lwn lwnVar) {
        ejwl.l(cls.equals(ehmz.class));
        return new ehmz(lwnVar, this.a.a, this.b);
    }
}
