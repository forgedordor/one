package defpackage;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ata extends asm {
    private final List a;

    public ata(List list) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
    }

    @Override // defpackage.asm
    public final void a(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).a(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void b(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).b(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void c(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).c(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void d(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).d(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void f(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).f(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void g(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).g(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void h(asn asnVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).h(asnVar);
        }
    }

    @Override // defpackage.asm
    public final void i(asn asnVar, Surface surface) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((asm) it.next()).i(asnVar, surface);
        }
    }
}
