package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feos extends fenf implements Comparable {
    private static final long serialVersionUID = 7321090422911676490L;
    private fenj c;

    public feos(String str) {
        super(c(str), b(str, true));
        try {
            b(str, false);
        } catch (ParseException unused) {
            this.c = d(str);
        }
        if (((fenh) this.a).c()) {
            ((fenh) this.b).b(true);
            return;
        }
        ((fenh) this.b).a(((fenh) this.a).a);
    }

    private static fenh b(String str, boolean z) throws ParseException {
        try {
            return new fenh(str.substring(str.indexOf(47) + 1));
        } catch (ParseException e) {
            if (z) {
                return new fenh(d(str).b(c(str)));
            }
            throw e;
        }
    }

    private static fenh c(String str) {
        return new fenh(str.substring(0, str.indexOf(47)));
    }

    private static fenj d(String str) {
        return new fenj(str.substring(str.indexOf(47) + 1));
    }

    public final fenj a() {
        fenj fenjVar = this.c;
        return fenjVar == null ? new fenj(this.a, this.b) : fenjVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        feos feosVar = (feos) obj;
        if (feosVar == null) {
            throw new ClassCastException("Cannot compare this object to null");
        }
        int iCompareTo = ((fenh) this.a).compareTo(feosVar.a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (this.c == null) {
            int iCompareTo2 = ((fenh) this.b).compareTo(feosVar.b);
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return a().a(feosVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof feos)) {
            return false;
        }
        feos feosVar = (feos) obj;
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.a, feosVar.a);
        ffhfVar.c(this.b, feosVar.b);
        return ffhfVar.a;
    }

    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a);
        Object obj = this.c;
        if (obj == null) {
            obj = this.b;
        }
        ffhgVar.c(obj);
        return ffhgVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append('/');
        fenj fenjVar = this.c;
        if (fenjVar == null) {
            stringBuffer.append(this.b);
        } else {
            stringBuffer.append(fenjVar);
        }
        return stringBuffer.toString();
    }
}
