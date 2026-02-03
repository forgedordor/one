package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class pol extends pok {
    protected kze[] m;
    String n;
    int o;
    int p;

    public pol() {
        this.m = null;
        this.o = 0;
    }

    public boolean a() {
        return false;
    }

    public kze[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(kze[] kzeVarArr) {
        kze[] kzeVarArr2 = this.m;
        if (kzeVarArr2 != null && kzeVarArr != null) {
            if (kzeVarArr2.length == kzeVarArr.length) {
                for (int i = 0; i < kzeVarArr2.length; i++) {
                    kze kzeVar = kzeVarArr2[i];
                    char c = kzeVar.a;
                    kze kzeVar2 = kzeVarArr[i];
                    if (c == kzeVar2.a && kzeVar.b.length == kzeVar2.b.length) {
                    }
                }
                kze[] kzeVarArr3 = this.m;
                for (int i2 = 0; i2 < kzeVarArr.length; i2++) {
                    kzeVarArr3[i2].a = kzeVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = kzeVarArr[i2].b;
                        if (i3 < fArr.length) {
                            kzeVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = kzf.c(kzeVarArr);
    }

    public pol(pol polVar) {
        this.m = null;
        this.o = 0;
        this.n = polVar.n;
        int i = polVar.p;
        this.p = 0;
        this.m = kzf.c(polVar.m);
    }
}
