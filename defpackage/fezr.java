package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezr {
    public static final byte[] a;
    public static final feyn b = feym.c(new String[0]);
    public static final fezk c;
    public static final TimeZone d;
    public static final String e;
    private static final fffn f;
    private static final fdgl g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ffez ffezVar = new ffez();
        ffezVar.aa(bArr);
        c = new fezj(null, 0L, ffezVar);
        feze.a(bArr);
        fffm fffmVar = fffn.a;
        fffd fffdVar = fffd.a;
        f = fffmVar.a(fffc.a("efbbbf"), fffc.a("feff"), fffc.a("fffe"), fffc.a("0000ffff"), fffc.a("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        d = timeZone;
        g = new fdgl("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = feyy.class.getName();
        name.getClass();
        e = fdgn.B(fdgn.A(name, "okhttp3."), "Client");
    }

    public static final int A(byte b2) {
        return b2 & 255;
    }

    public static final int B(long j, TimeUnit timeUnit) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalStateException("timeout < 0");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0) {
            j2 = millis;
        } else if (j > 0) {
            throw new IllegalArgumentException("timeout too small.");
        }
        return (int) j2;
    }

    public static final void C(long j, long j2) {
        if (j < 0 || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static /* synthetic */ int D(String str, char c2, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c2, 0, i);
    }

    public static final boolean E(ffgb ffgbVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return y(ffgbVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void F(Exception exc, List list) {
        exc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fcsw.a(exc, (Exception) it.next());
        }
    }

    public static final int a(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (fdgn.J(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (fdbq.a(cCharAt, 31) <= 0 || fdbq.a(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int g(fffb fffbVar) {
        return A(fffbVar.d()) | (A(fffbVar.d()) << 16) | (A(fffbVar.d()) << 8);
    }

    public static final int h(String str, int i) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Alert.DURATION_SHOW_INDEFINITELY;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final long i(fezh fezhVar) {
        String strB = fezhVar.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Object j(Object obj, Class cls, String str) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Object objCast;
        Object objJ;
        Class<?> superclass = obj.getClass();
        while (true) {
            objCast = null;
            if (fdbq.f(superclass, Object.class)) {
                if (fdbq.f(str, "delegate") || (objJ = j(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return j(objJ, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                objCast = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                superclass.getClass();
            }
        }
        return objCast;
    }

    public static final String k(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static final String l(feyq feyqVar, boolean z) {
        String strA = feyqVar.c;
        if (fdgn.G(strA, ":", false)) {
            strA = a.a(strA, "[", "]");
        }
        if (!z && feyqVar.d == feyp.a(feyqVar.b)) {
            return strA;
        }
        return strA + ":" + feyqVar.d;
    }

    public static final String m(String str, int i, int i2) {
        int iD = d(str, i, i2);
        String strSubstring = str.substring(iD, e(str, iD, i2));
        strSubstring.getClass();
        return strSubstring;
    }

    public static final Charset n(fffb fffbVar, Charset charset) {
        fffbVar.getClass();
        charset.getClass();
        int iG = fffbVar.g(f);
        if (iG == -1) {
            return charset;
        }
        if (iG == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (iG == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (iG == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (iG == 3) {
            Charset charset5 = fdfy.a;
            Charset charset6 = fdfy.d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            fdfy.d = charsetForName;
            return charsetForName;
        }
        if (iG != 4) {
            throw new AssertionError();
        }
        Charset charset7 = fdfy.a;
        Charset charset8 = fdfy.c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        fdfy.c = charsetForName2;
        return charsetForName2;
    }

    @SafeVarargs
    public static final List o(Object... objArr) {
        objArr.getClass();
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(fcva.g(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List p(List list) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(fcva.aq(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final feyn q(List list) {
        feyl feylVar = new feyl();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffbr ffbrVar = (ffbr) it.next();
            feylVar.c(ffbrVar.g.e(), ffbrVar.h.e());
        }
        return feylVar.b();
    }

    public static final void r(Closeable closeable) throws IOException {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void s(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!fdbq.f(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean t(String str) {
        return g.e(str);
    }

    public static final boolean u(feyq feyqVar, feyq feyqVar2) {
        return fdbq.f(feyqVar.c, feyqVar2.c) && feyqVar.d == feyqVar2.d && fdbq.f(feyqVar.b, feyqVar2.b);
    }

    public static final boolean v(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = fdbd.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean w(Socket socket, fffb fffbVar) throws SocketException {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !fffbVar.E();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean x(String str) {
        str.getClass();
        return fdgn.j(str, "Authorization", true) || fdgn.j(str, "Cookie", true) || fdgn.j(str, "Proxy-Authorization", true) || fdgn.j(str, "Set-Cookie", true);
    }

    public static final boolean y(ffgb ffgbVar, int i, TimeUnit timeUnit) {
        boolean z;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long j = ffgbVar.a().h() ? ffgbVar.a().j() - jNanoTime : Long.MAX_VALUE;
        ffgbVar.a().m(Math.min(j, timeUnit.toNanos(i)) + jNanoTime);
        try {
            ffez ffezVar = new ffez();
            while (ffgbVar.b(ffezVar, 8192L) != -1) {
                ffezVar.B();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            ffgd ffgdVarA = ffgbVar.a();
            if (j == Long.MAX_VALUE) {
                ffgdVarA.k();
            } else {
                ffgdVarA.m(jNanoTime + j);
            }
            throw th;
        }
        if (j == Long.MAX_VALUE) {
            ffgbVar.a().k();
        } else {
            ffgbVar.a().m(jNanoTime + j);
        }
        return z;
    }

    public static final String[] z(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= strArr2.length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
