package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfy extends evsf implements evui {
    public eyfy() {
        super(eyga.a);
    }

    public final void a(String str, eyge eygeVar) {
        str.getClass();
        eygeVar.getClass();
        copyOnWrite();
        eyga eygaVar = (eyga) this.instance;
        eyga eygaVar2 = eyga.a;
        eygaVar.a().put(str, eygeVar);
    }

    public final void b(String str) {
        str.getClass();
        copyOnWrite();
        eyga eygaVar = (eyga) this.instance;
        eyga eygaVar2 = eyga.a;
        eygaVar.a().remove(str);
    }
}
