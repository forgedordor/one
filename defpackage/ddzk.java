package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddzk implements dcia {
    final /* synthetic */ byte[] a;

    public ddzk(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.dcia
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        eaeb eaebVar = (eaeb) obj;
        try {
            byte[] bArr = this.a;
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            eadi eadiVar = (eadi) evsn.parseFrom(eadi.a, bArr, evrr.a);
            Iterator it = eaebVar.b.b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((eaea) it.next()).a(eadiVar.b) && !z) {
                    eaebVar.a.a();
                    z = true;
                }
            }
        } catch (evtj unused) {
        }
    }

    @Override // defpackage.dcia
    public final void b() {
    }
}
