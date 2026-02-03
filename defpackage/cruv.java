package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cruv {
    public static final /* synthetic */ void a(crvi crviVar, crut crutVar) {
        crutVar.copyOnWrite();
        cruu cruuVar = (cruu) crutVar.instance;
        cruu cruuVar2 = cruu.a;
        evtg evtgVar = cruuVar.c;
        if (!evtgVar.c()) {
            cruuVar.c = evsn.mutableCopy(evtgVar);
        }
        cruuVar.c.add(crviVar);
    }
}
