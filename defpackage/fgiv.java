package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgiv extends fgmf {
    private final fgkz a = new fgkz();
    private final List b = new ArrayList();

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        fgin fginVar = (fgin) fgmlVar;
        if (fginVar.g >= 4) {
            return new fgid(-1, fginVar.e + 4, false);
        }
        if (fginVar.h) {
            return new fgid(fginVar.f, -1, false);
        }
        return null;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void d(fgly fglyVar) {
        this.b.add(fglyVar.a);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void l() {
        int i;
        CharSequence charSequence;
        List list = this.b;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                break;
            } else {
                charSequence = (CharSequence) list.get(size);
            }
        } while (fgmp.c(charSequence, 0, charSequence.length()) == charSequence.length());
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < size + 1; i++) {
            sb.append((CharSequence) list.get(i));
        }
    }
}
