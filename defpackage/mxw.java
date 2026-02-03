package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxw extends Exception {
    public final int a;
    public final boolean b;

    public mxw(int i, int i2, int i3, int i4, int i5, mau mauVar, boolean z, Exception exc) {
        String strValueOf = String.valueOf(mauVar);
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i);
        sb.append(" Config(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.a = i;
        this.b = z;
    }
}
