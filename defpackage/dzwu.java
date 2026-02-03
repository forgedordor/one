package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwu extends evsf implements evui {
    public dzwu() {
        super(dzwv.a);
    }

    public final void a(String str) {
        copyOnWrite();
        dzwv dzwvVar = (dzwv) this.instance;
        dzwv dzwvVar2 = dzwv.a;
        evtg evtgVar = dzwvVar.j;
        if (!evtgVar.c()) {
            dzwvVar.j = evsn.mutableCopy(evtgVar);
        }
        dzwvVar.j.add(str);
    }
}
