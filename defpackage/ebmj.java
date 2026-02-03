package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmj extends ebmd implements Cloneable {
    protected boolean a;
    protected String b;
    protected String c;
    public String d;
    public Object e;

    public ebmj() {
        this.d = null;
        this.e = null;
        this.b = "=";
        this.c = "";
    }

    public final String a() {
        return ejwk.b(this.d);
    }

    public final void b() {
        this.a = true;
        this.c = "\"";
    }

    @Override // defpackage.ebmd
    public final String c() {
        Object obj = this.e;
        if (obj != null && obj.toString().isEmpty() && !this.a) {
            obj = null;
        }
        String str = this.d;
        if (str == null || obj == null) {
            if (str != null || obj == null) {
                return str != null ? str : "";
            }
            return this.c + obj.toString() + this.c;
        }
        return str + this.b + this.c + obj.toString() + this.c;
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        ebmj ebmjVar = new ebmj();
        ebmjVar.b = this.b;
        ebmjVar.a = this.a;
        ebmjVar.c = this.c;
        ebmjVar.d = this.d;
        Object obj = this.e;
        if (obj == null || !(obj instanceof ebmd)) {
            ebmjVar.e = obj;
            return ebmjVar;
        }
        ebmjVar.e = ((ebmd) obj).clone();
        return ebmjVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj.getClass().equals(getClass())) {
                ebmj ebmjVar = (ebmj) obj;
                if (this == ebmjVar) {
                    return true;
                }
                String str = this.d;
                if ((str == null && ebmjVar.d != null) || (str != null && ebmjVar.d == null)) {
                    return false;
                }
                if (str != null && ebmjVar.d != null && str.toLowerCase(Locale.US).compareTo(ebmjVar.d.toLowerCase(Locale.US)) != 0) {
                    return false;
                }
                Object obj2 = this.e;
                if ((obj2 != null && ebmjVar.e == null) || (obj2 == null && ebmjVar.e != null)) {
                    return false;
                }
                Object obj3 = ebmjVar.e;
                if (obj2 == obj3) {
                    return true;
                }
                if (!(obj2 instanceof String)) {
                    obj2.getClass();
                    return obj2.equals(obj3);
                }
                if (this.a) {
                    return obj2.equals(obj3);
                }
                String str2 = (String) obj3;
                String lowerCase = ((String) obj2).toLowerCase(Locale.US);
                str2.getClass();
                return lowerCase.equals(str2.toLowerCase(Locale.US));
            }
        }
        return false;
    }

    public final int hashCode() {
        return 9876587;
    }

    public final String toString() {
        return c();
    }

    public ebmj(String str, Object obj) {
        this.d = str;
        this.e = obj;
        this.b = "=";
        this.c = "";
    }
}
