package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxt extends IllegalArgumentException {
    public fgxt(int i) {
        StringBuffer stringBuffer = new StringBuffer("Invalid DNS class: ");
        stringBuffer.append(i);
        super(stringBuffer.toString());
    }
}
