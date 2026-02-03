package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgh extends eooi {
    Object a;

    public drgh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.eooi
    public final String gu() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.eooi
    protected final void gv() {
        this.a = null;
    }
}
