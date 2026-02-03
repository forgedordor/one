package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoh extends dwja {
    private volatile transient boolean b;
    private volatile transient boolean c;

    public dwoh(int i, int i2, ekgb ekgbVar) {
        super(i, i2, ekgbVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwrn
    public final boolean d() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    ekgb ekgbVar = this.a;
                    int i = ((ekoe) ekgbVar).c;
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        boolean zEquals = ((dwrv) ekgbVar.get(i2)).b().equals(dwrx.UNKNOWN);
                        i2++;
                        if (zEquals) {
                            z = true;
                            break;
                        }
                    }
                    this.b = z;
                    this.c = true;
                }
            }
        }
        return this.b;
    }
}
