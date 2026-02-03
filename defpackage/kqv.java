package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqv extends kqp {
    public kqv(char[] cArr) {
        super(cArr);
    }

    public static kqv a(String str) {
        kqv kqvVar = new kqv(str.toCharArray());
        kqvVar.z();
        kqvVar.x(str.length() - 1);
        return kqvVar;
    }

    @Override // defpackage.kqp
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kqv) && v().equals(((kqv) obj).v())) {
            return true;
        }
        return super.equals(obj);
    }
}
