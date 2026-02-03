package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejic extends evsf implements evui {
    public ejic() {
        super(ejih.a);
    }

    public final void a(ejid ejidVar) {
        copyOnWrite();
        ejih ejihVar = (ejih) this.instance;
        ejie ejieVar = (ejie) ejidVar.build();
        ejih ejihVar2 = ejih.a;
        ejieVar.getClass();
        evtg evtgVar = ejihVar.d;
        if (!evtgVar.c()) {
            ejihVar.d = evsn.mutableCopy(evtgVar);
        }
        ejihVar.d.add(ejieVar);
    }

    public final void b(ejif ejifVar) {
        copyOnWrite();
        ejih ejihVar = (ejih) this.instance;
        ejig ejigVar = (ejig) ejifVar.build();
        ejih ejihVar2 = ejih.a;
        ejigVar.getClass();
        ejihVar.a();
        ejihVar.e.add(ejigVar);
    }
}
