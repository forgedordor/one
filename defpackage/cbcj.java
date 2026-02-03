package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbcj {
    public static final /* synthetic */ cbcl a(cbck cbckVar) {
        evsn evsnVarBuild = cbckVar.build();
        evsnVarBuild.getClass();
        return (cbcl) evsnVarBuild;
    }

    public static final /* synthetic */ void b(String str, cbck cbckVar) {
        str.getClass();
        cbckVar.copyOnWrite();
        cbcl cbclVar = (cbcl) cbckVar.instance;
        cbcl cbclVar2 = cbcl.a;
        evtg evtgVar = cbclVar.b;
        if (!evtgVar.c()) {
            cbclVar.b = evsn.mutableCopy(evtgVar);
        }
        cbclVar.b.add(str);
    }

    public static final void c(cbck cbckVar) {
        DesugarCollections.unmodifiableList(((cbcl) cbckVar.instance).b).getClass();
    }
}
