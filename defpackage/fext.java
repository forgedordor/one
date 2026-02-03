package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fext {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public fext(fexu fexuVar) {
        this.a = fexuVar.c;
        this.b = fexuVar.e;
        this.c = fexuVar.f;
        this.d = fexuVar.d;
    }

    public final fexu a() {
        return new fexu(this.a, this.d, this.b, this.c);
    }

    public final void b(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.b = (String[]) strArr.clone();
    }

    @fcsv
    public final void c() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void d(String... strArr) {
        strArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public final void e(fexq... fexqVarArr) {
        fexqVarArr.getClass();
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fexqVarArr.length);
        for (fexq fexqVar : fexqVarArr) {
            arrayList.add(fexqVar.t);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(fezn... feznVarArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(feznVarArr.length);
        for (fezn feznVar : feznVarArr) {
            arrayList.add(feznVar.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public fext(boolean z) {
        this.a = z;
    }
}
