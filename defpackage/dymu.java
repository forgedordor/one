package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dymu {
    public static Object a(dxxk dxxkVar, Object obj, ekgp ekgpVar, Object obj2) {
        if (obj == null || !dxxkVar.g(obj)) {
            return null;
        }
        Object obj3 = ekgpVar.get(b(dxxkVar, obj));
        return obj3 != null ? obj3 : obj2;
    }

    public static String b(dxxk dxxkVar, Object obj) {
        return dxxkVar.c(obj);
    }
}
