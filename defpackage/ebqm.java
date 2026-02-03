package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqm {
    public static String a(ebqq ebqqVar) {
        int iIndexOf;
        String strJ = ebqqVar.j("CSeq");
        if (strJ == null || (iIndexOf = strJ.indexOf(32)) == -1) {
            return null;
        }
        return strJ.substring(iIndexOf + 1);
    }

    public static void b(ebpc ebpcVar, String str) {
        try {
            ebpt ebptVarA = ebpy.a(str.trim() + "\n");
            if (ebptVarA == null) {
                dhja.g("Unable to create parser", new Object[0]);
            } else {
                ebpcVar.k(ebptVarA.b());
            }
        } catch (ebml e) {
            dhja.i(e, "Unable to add header", new Object[0]);
        }
    }
}
