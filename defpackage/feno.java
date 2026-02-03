package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feno extends fenc {
    private static final long serialVersionUID = -2058497904769713528L;
    public final String a;

    public feno(String str) {
        this.a = str;
    }

    protected boolean b() {
        return fexb.a.matcher(fexb.f(a())).find();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feno)) {
            return super.equals(obj);
        }
        feno fenoVar = (feno) obj;
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.a, fenoVar.a);
        ffhfVar.c(a(), fenoVar.a());
        return ffhfVar.a;
    }

    public final int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a.toUpperCase());
        ffhgVar.c(a());
        return ffhgVar.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        stringBuffer.append('=');
        if (b()) {
            stringBuffer.append(fexb.c(fexb.f(a())));
        } else {
            stringBuffer.append(fexb.f(a()));
        }
        return stringBuffer.toString();
    }
}
