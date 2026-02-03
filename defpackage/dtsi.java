package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtsi extends evsf implements evui {
    public dtsi() {
        super(dtsk.a);
    }

    public final void a(String str, dtsh dtshVar) {
        str.getClass();
        dtshVar.getClass();
        copyOnWrite();
        dtsk dtskVar = (dtsk) this.instance;
        dtsk dtskVar2 = dtsk.a;
        dtskVar.a().put(str, dtshVar);
    }

    public final void b(String str) {
        str.getClass();
        copyOnWrite();
        dtsk dtskVar = (dtsk) this.instance;
        dtsk dtskVar2 = dtsk.a;
        dtskVar.a().remove(str);
    }
}
