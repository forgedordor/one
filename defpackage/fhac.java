package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fhac extends fgzh {
    private static final long serialVersionUID = -4319510507246305931L;
    protected List a;

    protected fhac() {
    }

    @Override // defpackage.fgzh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(h((byte[]) it.next(), true));
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fgzh
    public final void c(fgxc fgxcVar) {
        this.a = new ArrayList(2);
        while (fgxcVar.d() > 0) {
            this.a.add(fgxcVar.j());
        }
    }

    @Override // defpackage.fgzh
    public final void d(fgxe fgxeVar, fgww fgwwVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fgxeVar.c((byte[]) it.next());
        }
    }
}
