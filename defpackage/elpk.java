package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpk extends evsf implements evui {
    public elpk() {
        super(elpl.a);
    }

    public final void a(elhd elhdVar) {
        copyOnWrite();
        elpl elplVar = (elpl) this.instance;
        elhe elheVar = (elhe) elhdVar.build();
        elpl elplVar2 = elpl.a;
        elheVar.getClass();
        elplVar.a();
        elplVar.b.add(elheVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final elhe b() {
        return (elhe) ((elpl) this.instance).b.get(0);
    }

    public final void c(elhd elhdVar) {
        copyOnWrite();
        elpl elplVar = (elpl) this.instance;
        elhe elheVar = (elhe) elhdVar.build();
        elpl elplVar2 = elpl.a;
        elheVar.getClass();
        elplVar.a();
        elplVar.b.set(0, elheVar);
    }
}
