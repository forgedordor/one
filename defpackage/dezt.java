package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezt {
    public static final ejxk a = ejxk.b(';');

    public static String a(String str) {
        String[] strArrSplit = str.split("=");
        if (strArrSplit == null || strArrSplit.length < 2) {
            throw new IllegalStateException(String.format("%s does not follow reason format.", str));
        }
        return strArrSplit[1].trim();
    }
}
