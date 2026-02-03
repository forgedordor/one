package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshd implements ejvr {
    public abstract void a(evip evipVar, etki etkiVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evip evipVar = (evip) obj;
        etki etkiVar = (etki) etkj.a.createBuilder();
        if ((evipVar.b & 1) != 0) {
            String str = evipVar.c;
            etkiVar.copyOnWrite();
            etkj etkjVar = (etkj) etkiVar.instance;
            str.getClass();
            etkjVar.b |= 1;
            etkjVar.e = str;
        }
        a(evipVar, etkiVar);
        return (etkj) etkiVar.build();
    }
}
