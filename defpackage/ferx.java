package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferx extends fero {
    private static final long serialVersionUID = -3001603309266267258L;
    public final fenb c;

    public ferx() {
        super("VAVAILABILITY");
        this.c = new fenb();
        this.b.add(new feut());
    }

    @Override // defpackage.femz
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append(this.c);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    public ferx(ferc fercVar) {
        super("VAVAILABILITY", fercVar);
        this.c = new fenb();
    }
}
