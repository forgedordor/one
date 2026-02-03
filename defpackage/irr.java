package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class irr {
    public final hum d = new hum(new irq[16]);
    public final cuu e = new cuu(10);

    public boolean c(ctz ctzVar, ivy ivyVar, irn irnVar, boolean z) {
        hum humVar = this.d;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((irq) objArr[i2]).c(ctzVar, ivyVar, irnVar, z) || z2;
        }
        return z2;
    }

    public final void f() {
        hum humVar = this.d;
        int i = humVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (((irq) humVar.a[i]).b.a == 0) {
                humVar.c(i);
            }
        }
    }
}
