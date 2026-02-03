package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cswo {
    public static eiju a(String str) {
        ezhi ezhiVar;
        String strA = csss.a(str);
        if (strA == null) {
            ezhiVar = null;
        } else {
            ezhh ezhhVar = (ezhh) ezhi.a.createBuilder();
            ezhhVar.copyOnWrite();
            ezhi ezhiVar2 = (ezhi) ezhhVar.instance;
            str.getClass();
            ezhiVar2.b = str;
            ezhhVar.copyOnWrite();
            ((ezhi) ezhhVar.instance).c = strA;
            ezhiVar = (ezhi) ezhhVar.build();
        }
        return eijx.e(ezhiVar);
    }
}
