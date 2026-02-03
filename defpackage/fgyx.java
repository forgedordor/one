package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyx extends fgzh {
    private static final long serialVersionUID = -6254521894809367938L;
    private List a;

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        List list = this.a;
        if (list != null) {
            stringBuffer.append(list);
            stringBuffer.append(" ");
        }
        stringBuffer.append(" ; payload ");
        stringBuffer.append(this.h);
        stringBuffer.append(", xrcode ");
        stringBuffer.append(f());
        stringBuffer.append(", version ");
        stringBuffer.append((int) ((this.i >>> 16) & 255));
        stringBuffer.append(", flags ");
        stringBuffer.append((int) (this.i & 65535));
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final fgzh b() {
        return new fgyx();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) throws fhao {
        if (fgxcVar.d() > 0) {
            this.a = new ArrayList();
        }
        while (fgxcVar.d() > 0) {
            int iB = fgxcVar.b();
            int iB2 = fgxcVar.b();
            if (fgxcVar.d() < iB2) {
                throw new fhao("truncated option");
            }
            ByteBuffer byteBuffer = fgxcVar.a;
            int iLimit = byteBuffer.limit();
            fgxcVar.g(iB2);
            fgxh fgxoVar = iB != 3 ? iB != 8 ? iB != 20732 ? new fgxo(iB) : new fgwu() : new fgwt() : new fgyq();
            fgxoVar.b(fgxcVar);
            if (iLimit > byteBuffer.capacity()) {
                throw new IllegalArgumentException("cannot set active region past end of input");
            }
            byteBuffer.limit(byteBuffer.position());
            this.a.add(fgxoVar);
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        List<fgxh> list = this.a;
        if (list == null) {
            return;
        }
        for (fgxh fgxhVar : list) {
            fgxeVar.d(fgxhVar.e);
            int i = fgxeVar.a;
            fgxeVar.d(0);
            fgxhVar.c(fgxeVar);
            fgxeVar.e((fgxeVar.a - i) - 2, i);
        }
    }

    @Override // defpackage.fgzh
    public final boolean equals(Object obj) {
        return super.equals(obj) && this.i == ((fgyx) obj).i;
    }

    public final int f() {
        return (int) (this.i >>> 24);
    }
}
