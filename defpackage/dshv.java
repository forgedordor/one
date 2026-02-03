package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshv implements ejvr {
    public abstract void a(evnk evnkVar, etod etodVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evnk evnkVar = (evnk) obj;
        etod etodVar = (etod) etoh.a.createBuilder();
        d(evnkVar, etodVar);
        e(evnkVar, etodVar);
        j(evnkVar, etodVar);
        b(evnkVar, etodVar);
        i(evnkVar, etodVar);
        f(evnkVar, etodVar);
        c(evnkVar, etodVar);
        g(evnkVar, etodVar);
        a(evnkVar, etodVar);
        if ((evnkVar.b & 2) != 0) {
            ejvj ejvjVar = dsjw.b;
            evnj evnjVarB = evnj.b(evnkVar.d);
            if (evnjVarB == null) {
                evnjVarB = evnj.PLACEMENT_UNSPECIFIED;
            }
            etof etofVar = (etof) ejvjVar.fM(evnjVarB);
            etodVar.copyOnWrite();
            etoh etohVar = (etoh) etodVar.instance;
            etohVar.k = etofVar.d;
            etohVar.b |= 32;
        }
        h(evnkVar, etodVar);
        return (etoh) etodVar.build();
    }

    public abstract void b(evnk evnkVar, etod etodVar);

    public abstract void c(evnk evnkVar, etod etodVar);

    public abstract void d(evnk evnkVar, etod etodVar);

    public abstract void e(evnk evnkVar, etod etodVar);

    public abstract void f(evnk evnkVar, etod etodVar);

    public abstract void g(evnk evnkVar, etod etodVar);

    public abstract void h(evnk evnkVar, etod etodVar);

    public abstract void i(evnk evnkVar, etod etodVar);

    public abstract void j(evnk evnkVar, etod etodVar);
}
