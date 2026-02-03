package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caqa {
    public static final /* synthetic */ capz a(capy capyVar) {
        evsn evsnVarBuild = capyVar.build();
        evsnVarBuild.getClass();
        return (capz) evsnVarBuild;
    }

    public static final void b(int i, capy capyVar) {
        capyVar.copyOnWrite();
        capz capzVar = (capz) capyVar.instance;
        capz capzVar2 = capz.a;
        capzVar.b = i;
    }

    public static final void c(String str, capy capyVar) {
        capyVar.copyOnWrite();
        capz capzVar = (capz) capyVar.instance;
        capz capzVar2 = capz.a;
        capzVar.c = str;
    }

    public static final void d(long j, capy capyVar) {
        capyVar.copyOnWrite();
        capz capzVar = (capz) capyVar.instance;
        capz capzVar2 = capz.a;
        capzVar.d = j;
    }

    public static final /* synthetic */ void e(Iterable iterable, capy capyVar) {
        capyVar.copyOnWrite();
        capz capzVar = (capz) capyVar.instance;
        capz capzVar2 = capz.a;
        evtg evtgVar = capzVar.e;
        if (!evtgVar.c()) {
            capzVar.e = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, capzVar.e);
    }

    public static final void f(capy capyVar) {
        DesugarCollections.unmodifiableList(((capz) capyVar.instance).e).getClass();
    }
}
