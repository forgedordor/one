package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebvu implements ebvg {
    private final ebvr a;

    public ebvu(ebvr ebvrVar) {
        this.a = ebvrVar;
    }

    @Override // defpackage.ebvg
    public final void a(String str, boolean z) {
        int i = 0;
        while (true) {
            ebvr ebvrVar = this.a;
            List list = ebvrVar.e;
            if (i >= list.size()) {
                return;
            }
            etyu etyuVar = (etyu) list.get(i);
            int iA = etyt.a(etyuVar.c);
            if (iA != 0 && iA == 3 && etyuVar.b.equals(str)) {
                ebvrVar.q(i);
                return;
            }
            i++;
        }
    }

    @Override // defpackage.ebvg
    public final void b() {
    }
}
