package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsj {
    public static final ahrv a(String str, Uri uri) {
        if (uri != null) {
            ahru ahruVar = (ahru) ahrv.a.createBuilder();
            ahruVar.getClass();
            ahrl ahrlVar = (ahrl) ahrm.a.createBuilder();
            ahrlVar.getClass();
            ahrlVar.copyOnWrite();
            ((ahrm) ahrlVar.instance).d = str;
            String string = uri.toString();
            string.getClass();
            ahrn.b(string, ahrlVar);
            ahrw.b(ahrn.a(ahrlVar), ahruVar);
            return ahrw.a(ahruVar);
        }
        ahru ahruVar2 = (ahru) ahrv.a.createBuilder();
        ahruVar2.getClass();
        ahrr ahrrVar = (ahrr) ahrs.a.createBuilder();
        ahrrVar.getClass();
        ahrt.b(4, ahrrVar);
        ahrp ahrpVar = (ahrp) ahrq.a.createBuilder();
        ahrpVar.getClass();
        ahrpVar.copyOnWrite();
        ((ahrq) ahrpVar.instance).b = str;
        evsn evsnVarBuild = ahrpVar.build();
        evsnVarBuild.getClass();
        ahrrVar.copyOnWrite();
        ahrs ahrsVar = (ahrs) ahrrVar.instance;
        ahrsVar.c = (ahrq) evsnVarBuild;
        ahrsVar.b = 11;
        ahrw.c(ahrt.a(ahrrVar), ahruVar2);
        return ahrw.a(ahruVar2);
    }
}
