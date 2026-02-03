package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgzi extends IllegalArgumentException {
    public fgzi(fgyu fgyuVar) {
        StringBuffer stringBuffer = new StringBuffer("'");
        stringBuffer.append(fgyuVar);
        stringBuffer.append("' is not an absolute name");
        super(stringBuffer.toString());
    }
}
