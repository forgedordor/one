package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmk extends ebmd implements Cloneable, Iterable {
    public final Vector a = new Vector();
    public String b = ";";

    public ebmk() {
    }

    public final ebmj a(String str) {
        if (str == null) {
            throw new NullPointerException("null arg!");
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i = 0;
        while (true) {
            Vector vector = this.a;
            if (i >= vector.size()) {
                return null;
            }
            ebmj ebmjVar = (ebmj) vector.elementAt(i);
            ebmjVar.a();
            if (ebmjVar.a().toLowerCase(Locale.US).equals(lowerCase)) {
                return ebmjVar;
            }
            i++;
        }
    }

    public final Object b(String str) {
        ebmj ebmjVarA = a(str);
        if (ebmjVarA != null) {
            return ebmjVarA.e;
        }
        return null;
    }

    @Override // defpackage.ebmd
    public final String c() {
        Vector vector = this.a;
        if (vector.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vector.size(); i++) {
            Object objElementAt = vector.elementAt(i);
            if (objElementAt instanceof ebmd) {
                sb.append(((ebmd) objElementAt).c());
            } else {
                sb.append(objElementAt.toString());
            }
            if (i >= vector.size() - 1) {
                break;
            }
            sb.append(this.b);
        }
        return sb.toString();
    }

    @Override // defpackage.ebmd
    public final Object clone() {
        ebmk ebmkVar = new ebmk();
        ebmkVar.b = this.b;
        int i = 0;
        while (true) {
            Vector vector = this.a;
            if (i >= vector.size()) {
                return ebmkVar;
            }
            ebmkVar.e((ebmj) ((ebmj) vector.elementAt(i)).clone());
            i++;
        }
    }

    public final String d(String str) {
        Object objB = b(str);
        if (objB == null) {
            return null;
        }
        return objB instanceof ebmd ? ((ebmd) objB).c() : objB.toString();
    }

    public final void e(ebmj ebmjVar) {
        this.a.addElement(ebmjVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ebmk)) {
            return false;
        }
        ebmk ebmkVar = (ebmk) obj;
        Vector vector = this.a;
        if (vector.size() != ebmkVar.a.size()) {
            return false;
        }
        for (int i = 0; i < vector.size(); i++) {
            ebmj ebmjVar = (ebmj) vector.elementAt(i);
            String str = ebmjVar.d;
            ebmj ebmjVarA = str == null ? null : ebmkVar.a(str);
            if (ebmjVarA == null || !ebmjVarA.equals(ebmjVar)) {
                return false;
            }
        }
        return true;
    }

    public final void f(String str, Object obj) {
        e(new ebmj(str, obj));
    }

    public final void g(ebmj ebmjVar) {
        String str = ebmjVar.d;
        if (str != null) {
            i(str);
        }
        e(ebmjVar);
    }

    public final boolean h() {
        return this.a.size() == 0;
    }

    public final int hashCode() {
        return 187654;
    }

    public final void i(String str) {
        Vector vector;
        String lowerCase = str.toLowerCase(Locale.US);
        int i = 0;
        while (true) {
            vector = this.a;
            if (i >= vector.size()) {
                break;
            }
            ebmj ebmjVar = (ebmj) vector.elementAt(i);
            ebmjVar.a();
            if (ebmjVar.a().toLowerCase(Locale.US).equals(lowerCase)) {
                break;
            } else {
                i++;
            }
        }
        if (i < vector.size()) {
            vector.removeElementAt(i);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<ebmj> iterator() {
        return this.a.iterator();
    }

    public final String toString() {
        return c();
    }

    public ebmk(byte[] bArr) {
    }
}
