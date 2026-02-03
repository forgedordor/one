package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgnd extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    public String a;

    public fgnd(fgmu fgmuVar, Number number, Number number2, Number number3) {
        super(a(fgmuVar.y, number, number2, number3, null));
        this.a = super.getMessage();
    }

    private static String a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder sb = new StringBuilder("Value ");
        sb.append(number);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(number3);
            }
        } else if (number3 == null) {
            sb.append("must not be smaller than ");
            sb.append(number2);
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            sb.append(',');
            sb.append(number3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public fgnd(fgmu fgmuVar, Number number, String str) {
        super(a(fgmuVar.y, number, null, null, str));
        this.a = super.getMessage();
    }

    public fgnd(fgmu fgmuVar, String str) {
        String str2 = fgmuVar.y;
        StringBuffer stringBuffer = new StringBuffer("Value \"");
        stringBuffer.append(str);
        stringBuffer.append("\" for ");
        stringBuffer.append(str2);
        stringBuffer.append(" is not supported");
        super(stringBuffer.toString());
        this.a = super.getMessage();
    }
}
