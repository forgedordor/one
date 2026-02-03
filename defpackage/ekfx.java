package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfx extends ekan {
    private final ekgb a;

    public ekfx(ekgb ekgbVar, int i) {
        super(ekgbVar.size(), i);
        this.a = ekgbVar;
    }

    @Override // defpackage.ekan
    protected final Object a(int i) {
        return this.a.get(i);
    }
}
