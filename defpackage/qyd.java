package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyd implements qyo {
    public final String a;
    public int b = 100;
    private final int c;

    public qyd(String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // defpackage.qyo
    public final int getAppearanceOrder() {
        return this.c;
    }

    @Override // defpackage.qyo
    public final int getPref() {
        return this.b;
    }

    @Override // defpackage.qyo
    public final void setPref(int i) {
        this.b = i;
    }

    @Override // defpackage.qyo
    public final void setIsPrimary(boolean z) {
    }
}
