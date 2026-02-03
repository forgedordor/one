package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzt {
    public static final fgzt a = new fgzt(0);
    public static final fgzt b = new fgzt(1);
    public static final fgzt c = new fgzt(2);
    public int d;
    public Object e;

    private fgzt() {
    }

    final void a(fgze fgzeVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        ((List) this.e).add(fgzeVar);
    }

    public final String toString() {
        int i = this.d;
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "NXDOMAIN";
        }
        if (i == 2) {
            return "NXRRSET";
        }
        if (i == 3) {
            StringBuffer stringBuffer = new StringBuffer("delegation: ");
            stringBuffer.append(this.e);
            return stringBuffer.toString();
        }
        if (i == 4) {
            StringBuffer stringBuffer2 = new StringBuffer("CNAME: ");
            stringBuffer2.append(this.e);
            return stringBuffer2.toString();
        }
        if (i != 5) {
            return "successful";
        }
        StringBuffer stringBuffer3 = new StringBuffer("DNAME: ");
        stringBuffer3.append(this.e);
        return stringBuffer3.toString();
    }

    public fgzt(int i) {
        this.d = i;
        this.e = null;
    }

    public fgzt(int i, fgze fgzeVar) {
        this.d = i;
        this.e = fgzeVar;
    }
}
