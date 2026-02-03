package defpackage;

import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebmi extends ebmo {
    protected static final Hashtable a = new Hashtable();
    protected static final Object b = new Object();
    protected static final Hashtable c = new Hashtable();
    protected Hashtable d;
    public ebmq e;

    public ebmi(String str) {
        j(str);
    }

    public static String b(char c2) {
        return Character.valueOf(c2).toString();
    }

    public static final boolean k(char c2) {
        return t(c2) || c2 == '!' || c2 == '%' || c2 == '\'' || c2 == '~' || c2 == '*' || c2 == '+' || c2 == '-' || c2 == '.' || c2 == '_' || c2 == '`';
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ebmq a(int r14) throws defpackage.ebml {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebmi.a(int):ebmq");
    }

    public final String c() {
        if (this.g >= this.f.length()) {
            return null;
        }
        return this.f.substring(this.g);
    }

    public final String d() throws ebml {
        StringBuilder sb = new StringBuilder();
        try {
            if (!Character.isDigit(o(0))) {
                throw new ebml(this.f + ": Unexpected token at " + o(0));
            }
            sb.append(o(0));
            q(1);
            while (true) {
                char cO = o(0);
                if (!Character.isDigit(cO)) {
                    return sb.toString();
                }
                sb.append(cO);
                q(1);
            }
        } catch (ebml unused) {
            return sb.toString();
        }
    }

    public final String e() throws ebml {
        StringBuilder sb = new StringBuilder();
        if (o(0) != '\"') {
            return null;
        }
        q(1);
        while (true) {
            char cN = n();
            if (cN == '\"') {
                return sb.toString();
            }
            if (cN == '\\') {
                sb.append('\\');
                sb.append(n());
            } else {
                sb.append(cN);
            }
        }
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        while (r()) {
            try {
                char cO = o(0);
                if (!k(cO)) {
                    break;
                }
                q(1);
                sb.append(cO);
            } catch (ebml unused) {
                return sb.toString();
            }
        }
        return sb.toString();
    }

    public final Vector g(int i) throws ebml {
        int i2 = this.g;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i; i3++) {
            ebmq ebmqVar = new ebmq();
            if (l()) {
                String strF = f();
                ebmqVar.a = strF;
                Integer num = (Integer) this.d.get(strF.toUpperCase(Locale.US));
                if (num == null || !this.d.containsKey(strF.toUpperCase(Locale.US))) {
                    ebmqVar.b = 4095;
                } else {
                    ebmqVar.b = num.intValue();
                }
            } else {
                char cN = n();
                StringBuilder sb = new StringBuilder();
                sb.append(cN);
                ebmqVar.a = sb.toString();
                if (s(cN)) {
                    ebmqVar.b = 4099;
                } else {
                    if (Character.isDigit(cN)) {
                        cN = 4098;
                    }
                    ebmqVar.b = cN;
                }
            }
            vector.addElement(ebmqVar);
        }
        this.h = this.g;
        this.g = i2;
        return vector;
    }

    public final void h() {
        while (true) {
            try {
                if (o(0) != ' ' && o(0) != '\t') {
                    return;
                } else {
                    q(1);
                }
            } catch (ebml unused) {
                return;
            }
        }
    }

    protected final void i(String str, int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.d.put(str, numValueOf);
        Hashtable hashtable = a;
        if (hashtable.containsKey(numValueOf)) {
            return;
        }
        hashtable.put(numValueOf, str);
    }

    public abstract void j(String str);

    public final boolean l() {
        try {
            return k(o(0));
        } catch (ebml unused) {
            return false;
        }
    }

    public final String m() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            try {
                sb.append(o(i));
            } catch (ebml unused) {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
