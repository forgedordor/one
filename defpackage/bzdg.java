package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdg extends cpyr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzdg(String str, String str2) {
        super(15, cpyz.NO_RETRY, str + " row " + str2 + " could not be saved to CMS because it already exists");
        str2.getClass();
    }

    public final boolean equals(Object obj) {
        bzdg bzdgVar = obj instanceof bzdg ? (bzdg) obj : null;
        if (bzdgVar == null) {
            return false;
        }
        return fdbq.f(getMessage(), bzdgVar.getMessage());
    }
}
