package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsk {
    public static final ahrg a(ahqo ahqoVar) {
        ahrj ahrjVarA;
        ahsh ahshVarA = ahsi.a(ahqoVar);
        if (ahshVarA != ahsh.g && ahshVarA != ahsh.h && ahshVarA != ahsh.a) {
            Objects.toString(ahshVarA);
            throw new IllegalArgumentException("Using FileContentExtractor on snippet type ".concat(String.valueOf(ahshVarA)));
        }
        ahrf ahrfVar = (ahrf) ahrg.a.createBuilder();
        ahrfVar.getClass();
        ahrh.c(ahqoVar.b(), ahrfVar);
        String str = ahqoVar.d.d;
        if (str != null) {
            ahri ahriVar = (ahri) ahrj.a.createBuilder();
            ahriVar.getClass();
            ahrk.b(str, ahriVar);
            ahrjVarA = ahrk.a(ahriVar);
        } else {
            ahri ahriVar2 = (ahri) ahrj.a.createBuilder();
            ahriVar2.getClass();
            ahrk.c(9, ahriVar2);
            ahrjVarA = ahrk.a(ahriVar2);
        }
        ahrh.b(ahrjVarA, ahrfVar);
        String strC = ahqoVar.c();
        if (strC == null) {
            strC = "application/octet-stream";
        }
        ahrh.d(ahsj.a(strC, null), ahrfVar);
        return ahrh.a(ahrfVar);
    }
}
