package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebow extends eboc {
    public ebow() {
        super("Via");
    }

    @Override // defpackage.eboc, defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebow ebowVar = new ebow();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return ebowVar;
            }
            ebowVar.g((ebob) ((ebov) list.get(i)).clone());
            i++;
        }
    }

    public ebow(ebov... ebovVarArr) {
        super(ebovVarArr);
    }
}
