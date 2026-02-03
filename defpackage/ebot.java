package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebot extends ebob implements Cloneable {
    public ebou a;

    public ebot() {
        super("X-Google-Event-Id");
    }

    @Override // defpackage.ebob
    public final String a() {
        ebou ebouVar = this.a;
        return ebouVar == null ? "" : ebouVar.a;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final String c() {
        return this.c + ": " + this.a.a + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebot ebotVar = new ebot();
        ebou ebouVar = this.a;
        if (ebouVar != null) {
            ebotVar.a = (ebou) ebouVar.clone();
        }
        return ebotVar;
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }

    @Override // defpackage.ebob
    public final boolean equals(Object obj) {
        if (obj instanceof ebot) {
            return this.a.equals(((ebot) obj).a);
        }
        return false;
    }

    @Override // defpackage.ebob
    public final int hashCode() {
        String str;
        ebou ebouVar = this.a;
        if (ebouVar == null || (str = ebouVar.a) == null) {
            return 11127650;
        }
        return str.hashCode();
    }
}
