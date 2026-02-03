package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebno extends ebob implements Cloneable {
    protected ebnp a;

    public ebno() {
        super("Call-Id");
    }

    @Override // defpackage.ebob
    public final String a() {
        ebnp ebnpVar = this.a;
        return ebnpVar == null ? "" : ebnpVar.c();
    }

    public final void b(String str) {
        this.a = new ebnp(str);
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final String c() {
        return this.c + ": " + this.a.c() + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebno ebnoVar = new ebno();
        ebnp ebnpVar = this.a;
        if (ebnpVar != null) {
            ebnoVar.a = (ebnp) ebnpVar.clone();
        }
        return ebnoVar;
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }

    @Override // defpackage.ebob
    public final boolean equals(Object obj) {
        if (obj instanceof ebno) {
            return this.a.equals(((ebno) obj).a);
        }
        return false;
    }

    @Override // defpackage.ebob
    public final int hashCode() {
        return 11127650;
    }
}
