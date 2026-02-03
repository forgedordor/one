package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class M2 extends E2 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void end() {
        List.EL.sort(this.d, this.b);
        InterfaceC0128p2 interfaceC0128p2 = (InterfaceC0128p2) this.a;
        interfaceC0128p2.k(this.d.size());
        if (this.c) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (interfaceC0128p2.q()) {
                    break;
                } else {
                    interfaceC0128p2.z((InterfaceC0128p2) obj);
                }
            }
        } else {
            Collection.EL.a(this.d, new j$.desugar.sun.nio.fs.h(17, interfaceC0128p2));
        }
        interfaceC0128p2.end();
        this.d = null;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
