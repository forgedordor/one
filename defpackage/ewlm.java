package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewlm extends evsf implements evui {
    public ewlm() {
        super(ewln.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ewln ewlnVar = (ewln) this.instance;
        ewln ewlnVar2 = ewln.a;
        str.getClass();
        evtg evtgVar = ewlnVar.b;
        if (!evtgVar.c()) {
            ewlnVar.b = evsn.mutableCopy(evtgVar);
        }
        ewlnVar.b.add(str);
    }
}
