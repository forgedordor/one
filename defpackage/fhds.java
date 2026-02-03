package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhds {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern b = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String c;
    public final feyq d;
    public String e;
    public feyo f;
    public final feza g = new feza();
    public final feyl h;
    public feyt i;
    public final boolean j;
    public feyu k;
    public feyf l;
    public fezf m;

    public fhds(String str, feyq feyqVar, String str2, feyn feynVar, feyt feytVar, boolean z, boolean z2, boolean z3) {
        this.c = str;
        this.d = feyqVar;
        this.e = str2;
        this.i = feytVar;
        this.j = z;
        if (feynVar != null) {
            this.h = feynVar.e();
        } else {
            this.h = new feyl();
        }
        if (z2) {
            this.l = new feyf();
            return;
        }
        if (z3) {
            feyu feyuVar = new feyu();
            this.k = feyuVar;
            feyt feytVar2 = feyw.b;
            feytVar2.getClass();
            if (fdbq.f(feytVar2.d, "multipart")) {
                feyuVar.b = feytVar2;
            } else {
                Objects.toString(feytVar2);
                throw new IllegalArgumentException("multipart != ".concat(feytVar2.c));
            }
        }
    }

    final void a(String str, String str2, boolean z) {
        if (z) {
            feyf feyfVar = this.l;
            List list = feyfVar.a;
            char[] cArr = feyq.a;
            list.add(feyp.e(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            feyfVar.b.add(feyp.e(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, 83));
            return;
        }
        feyf feyfVar2 = this.l;
        List list2 = feyfVar2.a;
        char[] cArr2 = feyq.a;
        list2.add(feyp.e(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
        feyfVar2.b.add(feyp.e(str2, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, 91));
    }

    final void b(String str, String str2) {
        if (!ffho.a.equalsIgnoreCase(str)) {
            this.h.e(str, str2);
            return;
        }
        try {
            Pattern pattern = feyt.a;
            this.i = feys.a(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Malformed content type: ".concat(String.valueOf(str2)), e);
        }
    }

    final void c(feyn feynVar, fezf fezfVar) {
        feyu feyuVar = this.k;
        fezfVar.getClass();
        if (feynVar.b(ffho.a) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (feynVar.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        feyuVar.a(new feyv(feynVar, fezfVar));
    }

    final void d(String str, String str2, boolean z) {
        String str3 = this.e;
        if (str3 != null) {
            feyq feyqVar = this.d;
            feyo feyoVarI = feyqVar.i(str3);
            this.f = feyoVarI;
            if (feyoVarI == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + String.valueOf(feyqVar) + ", Relative: " + this.e);
            }
            this.e = null;
        }
        if (z) {
            feyo feyoVar = this.f;
            str.getClass();
            if (feyoVar.g == null) {
                feyoVar.g = new ArrayList();
            }
            List list = feyoVar.g;
            list.getClass();
            char[] cArr = feyq.a;
            list.add(feyp.e(str, 0, 0, " \"'<>#&=", true, false, true, false, 211));
            List list2 = feyoVar.g;
            list2.getClass();
            list2.add(str2 != null ? feyp.e(str2, 0, 0, " \"'<>#&=", true, false, true, false, 211) : null);
            return;
        }
        feyo feyoVar2 = this.f;
        str.getClass();
        if (feyoVar2.g == null) {
            feyoVar2.g = new ArrayList();
        }
        List list3 = feyoVar2.g;
        list3.getClass();
        char[] cArr2 = feyq.a;
        list3.add(feyp.e(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        List list4 = feyoVar2.g;
        list4.getClass();
        list4.add(str2 != null ? feyp.e(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }
}
