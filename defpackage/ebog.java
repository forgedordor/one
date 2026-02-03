package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebog extends ebob {
    public ebmk e;

    protected ebog() {
        this.e = new ebmk();
    }

    @Override // defpackage.ebob
    public ebmk d() {
        return this.e;
    }

    @Override // defpackage.ebob
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ebog) && this.e.equals(((ebog) obj).e)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ebob
    public int hashCode() {
        return (super.hashCode() * 37) + 187654;
    }

    public final String i(String str) {
        return this.e.d(str);
    }

    public final void j(ebmj ebmjVar) {
        this.e.g(ebmjVar);
    }

    public final void k(String str, String str2) {
        ebmj ebmjVarA = this.e.a(str);
        if (ebmjVarA != null) {
            ebmjVarA.e = str2;
        } else {
            this.e.g(new ebmj(str, str2));
        }
    }

    public final boolean l(String str) {
        return this.e.a(str) != null;
    }

    public final boolean m() {
        ebmk ebmkVar = this.e;
        return (ebmkVar == null || ebmkVar.h()) ? false : true;
    }

    public final void n(String str) {
        ebmj ebmjVarA = this.e.a("boundary");
        if (ebmjVarA != null) {
            ebmjVarA.e = str;
            ebmjVarA.b();
        } else {
            ebmj ebmjVar = new ebmj("boundary", str);
            ebmjVar.b();
            this.e.g(ebmjVar);
        }
    }

    protected ebog(String str) {
        super(str);
        this.e = new ebmk();
    }
}
