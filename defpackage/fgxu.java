package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxu extends IllegalArgumentException {
    public fgxu(long j) {
        StringBuffer stringBuffer = new StringBuffer("Invalid DNS TTL: ");
        stringBuffer.append(j);
        super(stringBuffer.toString());
    }
}
