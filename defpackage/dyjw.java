package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjw extends dyjz {
    public final ejwi a;
    public ekgb b;
    public final ejwi c;

    public dyjw() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.c = ejudVar;
    }

    @Override // defpackage.dyjz
    public final void a(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null flavorCustomActions");
        }
        this.b = ekgbVar;
    }
}
