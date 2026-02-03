package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnq extends ebob implements Cloneable {
    public final String a;

    public ebnq(String str) {
        super("X-Pidgey-Conference-Params");
        this.a = str;
    }

    @Override // defpackage.ebob
    public final String a() {
        String str = this.a;
        return str == null ? "" : str;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final String c() {
        return this.c + ": " + this.a + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        return new ebnq(this.a);
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }

    @Override // defpackage.ebob
    public final boolean equals(Object obj) {
        if (obj instanceof ebnq) {
            return this.a.equals(((ebnq) obj).a);
        }
        return false;
    }

    @Override // defpackage.ebob
    public final int hashCode() {
        return 22227650;
    }
}
