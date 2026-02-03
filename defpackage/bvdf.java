package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvdf {
    public static final bvdg a(String str) {
        if (str == null) {
            return new bvdg(-1);
        }
        Integer numG = fdgn.g(str);
        return numG != null ? new bvdg(numG.intValue()) : new bvdg(str);
    }

    public static final String b(bvdg bvdgVar) {
        bvdgVar.getClass();
        String str = bvdgVar.a;
        return str == null ? String.valueOf(bvdgVar.b) : str;
    }
}
