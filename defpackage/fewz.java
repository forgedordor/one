package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fewz {
    public static int a(String str) {
        return (str == null || str.charAt(0) != '+') ? Integer.parseInt(str) : Integer.parseInt(str.substring(1));
    }
}
