package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqpv extends dqyq {
    public final String d;
    public final String e;
    public final String f;

    protected dqpv(String str) {
        String strSubstring;
        this.d = str;
        int iIndexOf = str.indexOf(".");
        if (iIndexOf >= 0) {
            this.f = str.substring(iIndexOf + 1);
            strSubstring = str.substring(0, iIndexOf);
        } else {
            this.f = str;
            strSubstring = null;
        }
        this.e = strSubstring;
    }

    @Override // defpackage.dqyq
    public void e(dqpu dqpuVar) {
        dqpuVar.b(this.d, null);
    }

    public final String f(dqwj dqwjVar) {
        String str = this.e;
        if (str == null) {
            return this.f;
        }
        Object objApply = dqwjVar.apply(str);
        return ((String) objApply) + "." + this.f;
    }
}
