package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnn extends ebob implements Cloneable {
    protected Integer a;
    protected String b;

    public ebnn() {
        super("CSeq");
    }

    @Override // defpackage.ebob
    public final String a() {
        return this.a + " " + this.b.toUpperCase(Locale.US);
    }

    public final int b() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebnn ebnnVar = new ebnn();
        Integer num = this.a;
        if (num != null) {
            num.intValue();
            ebnnVar.a = num;
        }
        ebnnVar.b = this.b;
        return ebnnVar;
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }

    public final String e() {
        return this.b.toUpperCase(Locale.US);
    }

    @Override // defpackage.ebob
    public final boolean equals(Object obj) {
        if (!(obj instanceof ebnn)) {
            return false;
        }
        ebnn ebnnVar = (ebnn) obj;
        return this.a.equals(ebnnVar.a) && this.b.equalsIgnoreCase(ebnnVar.b);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("parameter is null");
        }
        this.b = str;
    }

    public final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("the sequence number parameter is < 0");
        }
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.ebob
    public final int hashCode() {
        return 27650;
    }
}
