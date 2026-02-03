package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnx extends ebog {
    public String a;

    public ebnx() {
        super("Event");
    }

    @Override // defpackage.ebob
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.a;
        if (str != null) {
            stringBuffer.append(str);
        }
        if (!this.e.h()) {
            stringBuffer.append(";".concat(this.e.c()));
        }
        return stringBuffer.toString();
    }
}
