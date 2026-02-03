package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrg {
    public static final Logger a = Logger.getLogger(fbrg.class.getName());
    public static final fbqz b = new fbqu();
    public static final fbqx c = new fbqv();
    static final eldz d = eldz.e.g();
    public int e;
    private Object[] f;

    public fbrg() {
    }

    public static byte[] l(InputStream inputStream) {
        try {
            return elec.b(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int o() {
        Object[] objArr = this.f;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void p(int i) {
        Object[] objArr = new Object[i];
        if (!j()) {
            System.arraycopy(this.f, 0, objArr, 0, a());
        }
        this.f = objArr;
    }

    private final void q(int i, byte[] bArr) {
        this.f[i + i] = bArr;
    }

    private final void r(int i, Object obj) {
        if (this.f instanceof byte[][]) {
            p(o());
        }
        this.f[i + i + 1] = obj;
    }

    private final void s(int i, byte[] bArr) {
        this.f[i + i + 1] = bArr;
    }

    private final byte[] t(int i) {
        Object objD = d(i);
        return objD instanceof byte[] ? (byte[]) objD : ((fbrd) objD).c();
    }

    public final int a() {
        int i = this.e;
        return i + i;
    }

    public final Iterable b(fbrb fbrbVar) {
        if (j()) {
            return null;
        }
        int i = 0;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (Arrays.equals(fbrbVar.b, k(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e(i2, fbrbVar));
            } else {
                q(i, k(i2));
                r(i, d(i2));
                i++;
            }
        }
        Arrays.fill(this.f, i + i, a(), (Object) null);
        this.e = i;
        return arrayList;
    }

    public final Object c(fbrb fbrbVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(fbrbVar.b, k(i)));
        return e(i, fbrbVar);
    }

    public final Object d(int i) {
        return this.f[i + i + 1];
    }

    public final Object e(int i, fbrb fbrbVar) {
        fbra fbraVarA;
        Object objD = d(i);
        if (objD instanceof byte[]) {
            return fbrbVar.a((byte[]) objD);
        }
        fbrd fbrdVar = (fbrd) objD;
        return (!fbrbVar.c() || (fbraVarA = fbrd.a(fbrbVar)) == null) ? fbrbVar.a(fbrdVar.c()) : fbraVarA.b(fbrdVar.b());
    }

    public final void f(fbrb fbrbVar) {
        if (j()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!Arrays.equals(fbrbVar.b, k(i2))) {
                q(i, k(i2));
                r(i, d(i2));
                i++;
            }
        }
        Arrays.fill(this.f, i + i, a(), (Object) null);
        this.e = i;
    }

    public final void g(fbrg fbrgVar) {
        if (fbrgVar.j()) {
            return;
        }
        int iO = o() - a();
        if (j() || iO < fbrgVar.a()) {
            p(a() + fbrgVar.a());
        }
        System.arraycopy(fbrgVar.f, 0, this.f, a(), fbrgVar.a());
        this.e += fbrgVar.e;
    }

    public final void h(fbrb fbrbVar, Object obj) {
        fbrbVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == o()) {
            int iA = a();
            p(Math.max(iA + iA, 8));
        }
        q(this.e, fbrbVar.b);
        if (fbrbVar.c()) {
            int i = this.e;
            fbra fbraVarA = fbrd.a(fbrbVar);
            fbraVarA.getClass();
            r(i, new fbrd(fbraVarA, obj));
        } else {
            s(this.e, fbrbVar.b(obj));
        }
        this.e++;
    }

    public final boolean i(fbrb fbrbVar) {
        for (int i = 0; i < this.e; i++) {
            if (Arrays.equals(fbrbVar.b, k(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return this.e == 0;
    }

    public final byte[] k(int i) {
        return (byte[]) this.f[i + i];
    }

    public final byte[][] m() {
        byte[][] bArr = new byte[a()][];
        Object[] objArr = this.f;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, a());
            return bArr;
        }
        for (int i = 0; i < this.e; i++) {
            int i2 = i + i;
            bArr[i2] = k(i);
            bArr[i2 + 1] = t(i);
        }
        return bArr;
    }

    public final void n(fbrb fbrbVar, Object obj) {
        fbrbVar.getClass();
        obj.getClass();
        int i = 0;
        while (i < this.e) {
            int i2 = i + 1;
            if (Arrays.equals(fbrbVar.b, k(i)) && obj.equals(e(i, fbrbVar))) {
                int i3 = i2 + i2;
                int iA = a() - i3;
                Object[] objArr = this.f;
                System.arraycopy(objArr, i3, objArr, i + i, iA);
                int i4 = this.e - 1;
                this.e = i4;
                q(i4, null);
                s(this.e, null);
                return;
            }
            i = i2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(k(i), StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(d.j(t(i)));
            } else {
                sb.append(new String(t(i), StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public fbrg(int i, Object[] objArr) {
        this.e = i;
        this.f = objArr;
    }

    public fbrg(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
