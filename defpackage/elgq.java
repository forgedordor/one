package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elgq {
    public final eljo a;

    public elgq(eljo eljoVar) {
        this.a = eljoVar;
    }

    public final void a(int i) {
        eljo eljoVar = this.a;
        eljoVar.copyOnWrite();
        eljp eljpVar = (eljp) eljoVar.instance;
        eljp eljpVar2 = eljp.a;
        eljpVar.d = i - 1;
        eljpVar.b |= 2;
    }

    public final void b(int i) {
        eljo eljoVar = this.a;
        eljoVar.copyOnWrite();
        eljp eljpVar = (eljp) eljoVar.instance;
        eljp eljpVar2 = eljp.a;
        eljpVar.c = i - 1;
        eljpVar.b |= 1;
    }
}
