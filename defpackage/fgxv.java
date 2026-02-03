package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxv extends IllegalArgumentException {
    public fgxv(int i) {
        StringBuffer stringBuffer = new StringBuffer("Invalid DNS type: ");
        stringBuffer.append(i);
        super(stringBuffer.toString());
    }
}
