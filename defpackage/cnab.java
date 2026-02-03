package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cnab implements ejvr {
    @Override // defpackage.ejvr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aubl apply(eqcs eqcsVar) {
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        b(eqcsVar, aubgVar);
        Object objApply = cnbn.a.apply(eqcsVar.b);
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.d = ((aubi) objApply).v;
        aublVar.b |= 2;
        Object objApply2 = cnbn.b.apply(eqcsVar.c);
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.e = ((auga) objApply2).g;
        aublVar2.b |= 4;
        return (aubl) aubgVar.build();
    }

    public abstract void b(eqcs eqcsVar, aubg aubgVar);
}
