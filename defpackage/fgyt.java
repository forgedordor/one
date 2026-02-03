package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyt extends fgzh {
    private static final long serialVersionUID = -8851454400765507520L;
    private fgyu a;
    private BitSet b;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        int length = this.b.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.b.get(s)) {
                stringBuffer.append(" ");
                stringBuffer.append(fhag.a(s));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyt();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        this.a = new fgyu(fgxcVar);
        this.b = new BitSet();
        int iD = fgxcVar.d();
        for (int i = 0; i < iD; i++) {
            int iC = fgxcVar.c();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << (7 - i2)) & iC) != 0) {
                    this.b.set((i * 8) + i2);
                }
            }
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        this.a.h(fgxeVar, null, z);
        int length = this.b.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= this.b.get(i2) ? 1 << (7 - (i2 % 8)) : 0;
            if (i2 % 8 == 7 || i2 == length - 1) {
                fgxeVar.g(i);
                i = 0;
            }
        }
    }
}
