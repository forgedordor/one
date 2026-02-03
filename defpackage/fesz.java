package defpackage;

import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fesz extends fero {
    private static final long serialVersionUID = 4502423035501438515L;

    public fesz() {
        super("VVENUE");
    }

    @Override // defpackage.femz
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    public fesz(ferc fercVar) {
        super("VVENUE", fercVar);
    }
}
