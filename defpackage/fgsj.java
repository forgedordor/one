package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsj {
    public static final fgsj a = new fgsj(false, false);
    public static final fgsj b = new fgsj(true, true);
    public final boolean c;
    public final boolean d;

    public fgsj(boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
    }

    static String a(String str) {
        return fgrb.a(str.trim());
    }

    public final String b(String str) {
        boolean z = this.c;
        String strTrim = str.trim();
        return !z ? fgrb.a(strTrim) : strTrim;
    }

    final void c(fgrh fgrhVar) {
        if (fgrhVar == null || this.d) {
            return;
        }
        for (int i = 0; i < fgrhVar.a; i++) {
            String[] strArr = fgrhVar.b;
            strArr[i] = fgrb.a(strArr[i]);
        }
    }
}
