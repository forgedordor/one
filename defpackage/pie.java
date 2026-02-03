package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class pie {
    public static final int a(pjl pjlVar, String str) {
        int iA = pid.a(pjlVar, str);
        if (iA >= 0) {
            return iA;
        }
        int iA2 = pid.a(pjlVar, "`" + str + '`');
        if (iA2 >= 0) {
            return iA2;
        }
        return -1;
    }
}
