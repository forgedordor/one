package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eksb extends ekse {
    final /* synthetic */ ekse a;
    final /* synthetic */ ekse b;

    public eksb(ekse ekseVar, ekse ekseVar2) {
        this.a = ekseVar;
        this.b = ekseVar2;
    }

    @Override // defpackage.ekse
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
