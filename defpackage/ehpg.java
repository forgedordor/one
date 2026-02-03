package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpg {
    private final ehoy a;

    private ehpg(ehoy ehoyVar) {
        this.a = ehoyVar;
    }

    public static ehpg a(lvj lvjVar, lxq lxqVar) {
        ehoy ehoyVar = (ehoy) new lxo(lxqVar.S(), new ehpf()).a(ehoy.class);
        ejwl.m(ehoyVar.a.put(lvjVar, new css()) == null, "A single instance of a LifecycleOwner was observed twice. Please report this occurrence using go/tiktok-bug.");
        lvjVar.P().c(ehoyVar);
        if (!ehoyVar.b) {
            ehoyVar.b = true;
            ehoyVar.c = lvjVar;
        }
        return new ehpg(ehoyVar);
    }

    public final Object b(int i, lvj lvjVar, ehow ehowVar) {
        return this.a.k(i, lvjVar, ehowVar, new ehov() { // from class: ehpe
            @Override // defpackage.ehov
            public final void a(Object obj) {
            }
        });
    }

    public final Object c(int i, lvj lvjVar, ehow ehowVar, ehov ehovVar) {
        return this.a.k(i, lvjVar, ehowVar, ehovVar);
    }
}
