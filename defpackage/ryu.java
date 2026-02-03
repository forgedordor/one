package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryu extends ryt {
    public float a = 0.0f;
    final /* synthetic */ ryv b;

    public ryu(ryv ryvVar) {
        this.b = ryvVar;
    }

    @Override // defpackage.ryt
    public final void a(String str) {
        this.a += this.b.d.d.measureText(str);
    }
}
