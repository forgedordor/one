package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class y implements InterfaceC0008e, u {
    public final /* synthetic */ PosixFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ void a(w wVar, w wVar2, w wVar3) throws IOException {
        this.a.setTimes(j$.desugar.sun.nio.fs.g.E(wVar), j$.desugar.sun.nio.fs.g.E(wVar2), j$.desugar.sun.nio.fs.g.E(wVar3));
    }

    @Override // j$.nio.file.attribute.u
    public final /* synthetic */ void b(E e) throws IOException {
        this.a.setOwner(D.a(e));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.u
    public final /* synthetic */ E getOwner() {
        return C.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ h readAttributes() {
        return C0009f.a(this.a.readAttributes());
    }
}
