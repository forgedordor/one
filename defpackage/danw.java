package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class danw {
    public static final void a(String str, String[] strArr, fgvo fgvoVar) {
        fgvoVar.a(str, damm.e(strArr));
    }

    public static final void b(String str, Collection collection, fgvo fgvoVar) {
        fgvm fgvmVar = (fgvm) fgvn.a.createBuilder();
        fgvr fgvrVar = (fgvr) fgvs.a.createBuilder();
        fgvrVar.copyOnWrite();
        fgvs fgvsVar = (fgvs) fgvrVar.instance;
        evsw evswVar = fgvsVar.b;
        if (!evswVar.c()) {
            fgvsVar.b = evsn.mutableCopy(evswVar);
        }
        evpz.addAll(collection, fgvsVar.b);
        fgvs fgvsVar2 = (fgvs) fgvrVar.build();
        fgvmVar.copyOnWrite();
        fgvn fgvnVar = (fgvn) fgvmVar.instance;
        fgvsVar2.getClass();
        fgvnVar.c = fgvsVar2;
        fgvnVar.b = 2;
        fgvoVar.a(str, (fgvn) fgvmVar.build());
    }

    public static final void c(String str, long j, fgvo fgvoVar) {
        fgvoVar.a(str, damm.a(j));
    }

    public static final void d(String str, Collection collection, fgvo fgvoVar) {
        fgvoVar.a(str, damm.b(collection));
    }
}
